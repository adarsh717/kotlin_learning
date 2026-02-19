package sealedExample

sealed class DownloadStatus{

    object NotStarted : DownloadStatus()
    data class Downloading(val progress : Int) : DownloadStatus()
    object Completed : DownloadStatus()
    data class Failed(val error: String): DownloadStatus()
}

fun checkDownload(status: DownloadStatus): String {

    return when(status) {
        is DownloadStatus.NotStarted -> "Not Started"
        is DownloadStatus.Downloading -> "Downloading ${status.progress}%"
        is DownloadStatus.Completed -> "Download completed successfully ✅"
        is DownloadStatus.Failed -> "Failed: ${status.error}"
    }
}


fun main(){
    val down= DownloadStatus.Downloading(54)
    println(checkDownload(down))
    val down1= DownloadStatus.Failed("Network error")
    println(checkDownload(down1))

}