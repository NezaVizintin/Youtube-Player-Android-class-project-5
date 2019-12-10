package nezavizintin.learning.youtubeplayer

import android.os.Bundle
import android.view.ViewGroup
import android.widget.Button
import androidx.constraintlayout.widget.ConstraintLayout
import com.google.android.youtube.player.YouTubeBaseActivity
import com.google.android.youtube.player.YouTubeInitializationResult
import com.google.android.youtube.player.YouTubePlayer
import com.google.android.youtube.player.YouTubePlayerView

/*to use the Youtube Player API this activity needs to be a subclass of Youtube base activity
and needs to implement an interface defined by Google for any activity, that wants to use the API.

So we have to change the default:
class YoutubeActivity : AppCompatActivity()*/

const val YOUTUBE_VIDEO_ID = "IyuUWOnS9BY"
const val YOUTUBE_PLAYLIST = "PLc5z3xejLEJL-Tmh2FWHRpGko3q43ZKMR"

class YoutubeActivity : YouTubeBaseActivity(), YouTubePlayer.OnInitializedListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
/*ONE WAY: setContentView(R.layout.activity_youtube)
        val layout = findViewById<ConstraintLayout>(R.id.activity_youtube)
        OTHER WAY:*/
        val layout = layoutInflater.inflate(R.layout.activity_youtube, null) as ConstraintLayout
        setContentView(layout)

        /*
    THIS IS HOW YOU WOULD ADD A BUTTON WITH CODE INSTEAD OF USING LAYOUT DESIGN:
    val button1 = Button(this)
    button1.layoutParams = ConstraintLayout.LayoutParams(600, 180)
    button1.text = "Button added"
    layout.addView(button1)
    }
    AND YOU DO THE SAME TO ADD HE YOUTUBE WIDGET BUT INSTEAD IT WILL FILL THE ENTIRE SCREEN:
    */

        val playerView = YouTubePlayerView(this)
        playerView.layoutParams = ConstraintLayout.LayoutParams(
            ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT
        )
        layout.addView(playerView)

        //initialise the YT player
    }

    override fun onInitializationSuccess(
        p0: YouTubePlayer.Provider?,
        p1: YouTubePlayer?,
        p2: Boolean
    ) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun onInitializationFailure(
        p0: YouTubePlayer.Provider?,
        p1: YouTubeInitializationResult?
    ) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}
