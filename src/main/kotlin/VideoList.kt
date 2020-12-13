import kotlinx.browser.window
import kotlinx.html.js.onClickFunction
import react.*
import react.dom.p

/**
 * Created by Farouk on 05/12/2020.
 */

// videos list props
external interface VideoListProps: RProps {
    var videos: List<Video>
    var selectedVideo: Video?
    var onSelectedVideo: (Video) -> Unit
}

class VideoList: RComponent<VideoListProps, RState>() {
    override fun RBuilder.render() {
        for (video in props.videos) {
            p {
                key = video.id.toString()
                attrs {
                    onClickFunction = {
                        props.onSelectedVideo(video)
                    }
                }
                if (video == props.selectedVideo) {
                    +"▶"
                }
                +video.title
            }
        }
    }
}