package wallpaperphptos.macospace.com.ninetta.FullScreen_Content;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;
import wallpaperphptos.macospace.com.ninetta.R;

import static wallpaperphptos.macospace.com.ninetta.SplashScreen_Content.SplashScreenActivity.stopPosition;

public class FullScreenActivity extends AppCompatActivity {

    private VideoView videoView= null ;
    private MediaController mController;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_full_screen);


        videoView = (VideoView) findViewById(R.id.videoView) ;
        mController = new MediaController(FullScreenActivity.this);
        videoView.setVideoPath("android.resource://"+getPackageName()+"/"+R.raw.mv);
        mController = new FullScreenMediaController(FullScreenActivity.this, 2);
        mController.setAnchorView(videoView);
        videoView.setMediaController(mController);
        videoView.seekTo(stopPosition);
        videoView.start(); //Or use resume() if it doesn't work. I'm not sure
    }

    @Override
    protected void onResume() {
        super.onResume();
    }

    @Override
    protected void onPause() {
        super.onPause();
        if(videoView!= null) {
            stopPosition = videoView.getCurrentPosition(); //stopPosition is an int
            videoView.pause();
        }
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }

    @Override
    protected void onStop() {
        super.onStop();
    }
}
