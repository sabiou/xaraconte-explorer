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
}

// video list state
external interface VideoListState: RState {
    var selectedVideo: Video?
}

class VideoList: RComponent<VideoListProps, VideoListState>() {
    override fun RBuilder.render() {
        for (video in props.videos) {
            p {
                key = video.id.toString()
                attrs {
                    onClickFunction = {
                        setState {
                            selectedVideo = video
                        }
                    }
                }
                if (video == state.selectedVideo) {
                    +"▶"
                }
                +video.title
            }
        }
    }
}