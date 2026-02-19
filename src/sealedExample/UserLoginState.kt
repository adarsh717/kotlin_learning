package sealedExample

sealed class LoginState{
    object LoggedOut: LoginState()
    object Loading: LoginState()
    data class LoggedIn(val username: String): LoginState()
    data class Error(val message: String): LoginState()
}

fun handleLogin(state: LoginState): String{
    return when(state){
        is LoginState.LoggedOut ->"User LoggedOut!"
        is LoginState.Loading -> "Checking credential..."
        is LoginState.LoggedIn -> "Welcome ${state.username}"
        is LoginState.Error -> "Login Failed ${state.message}"
    }
}

fun main(){
    val a= LoginState.Loading
    println(handleLogin(a))
    val b= LoginState.LoggedIn("Adarsh")
    println(handleLogin(b))
    val c= LoginState.LoggedOut
    println(handleLogin(c))
    val d= LoginState.Error("Wrong Password")
    println(handleLogin(d))
}