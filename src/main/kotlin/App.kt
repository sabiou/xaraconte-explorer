import kotlinx.css.*
import react.*
import react.dom.*
import styled.css
import styled.styledDiv

/**
 * Created by Farouk on 05/12/2020.
 */

class App : RComponent<RProps, RState>() {
    override fun RBuilder.render() {
        // Type safe HTML goes here
        h1 {
            +"Xaraconte webserie explorer"
        }

        div {
            h3 {
                +"Videos to watch"
            }
            // render video to watch
            videoList { videos = videosToWatch }
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
                // render watched videos list
                videoList { videos = watchedVideos }
            }
            img {
                attrs {
                    src = "https://via.placeholder.com/640x360.png?text=Video+Player+Placeholder"
                }
            }
        }
    }
}

fun RBuilder.videoList(handler: VideoListProps.() -> Unit): ReactElement {
    return child(VideoList::class) {
        this.attrs(handler)
    }
}