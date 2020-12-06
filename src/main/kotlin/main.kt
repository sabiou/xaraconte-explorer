import kotlinx.browser.document
import react.dom.render

val videosToWatch = listOf(
    Video(1,"S1 Ep01", "https://youtu.be/2QL1zHb5xTc"),
    Video(2,"S1 Ep02", "https://youtu.be/2QL1zHb5xTc"),
    Video(3,"S1 Ep03", "https://youtu.be/2QL1zHb5xTc"),
)

val watchedVideos = listOf(Video(4,"S1 Ep04", "https://youtu.be/2QL1zHb5xTc"))

fun main() {
    render(document.getElementById("root")) {
        // Tell React to render the child of our root object (our App Component)
        child(App::class){}
    }
}