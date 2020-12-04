import kotlinx.browser.document
import kotlinx.css.*
import react.dom.*
import styled.css
import styled.styledDiv

val videosToWatch = listOf(
    Video(1,"S1 Ep01", "https://youtu.be/2QL1zHb5xTc"),
    Video(2,"S1 Ep02", "https://youtu.be/2QL1zHb5xTc"),
    Video(3,"S1 Ep03", "https://youtu.be/2QL1zHb5xTc"),
)

val watchedVideos = listOf(Video(4,"S1 Ep04", "https://youtu.be/2QL1zHb5xTc"))

fun main() {
    render(document.getElementById("root")) {
        h1 {
            +"Xaraconte webserie explorer"
        }

        div {
            h3 {
                +"Videos to watch"
            }
            for (video in videosToWatch) {
                p {
                    +video.title
                }
            }
        }
        styledDiv {
            css {
                position = Position.absolute
                top = 10.px
                right = 10.px
            }
            h3 {
                +"Watched videos"
            }
            p {
                for (video in watchedVideos) {
                    p { +video.title }
                }
            }
            img {
                attrs {
                    src = "https://via.placeholder.com/640x360.png?text=Video+Player+Placeholder"
                }
            }
        }
    }
}