package wallpaperphptos.macospace.com.ninetta.FullScreen_Content;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;
import wallpaperphptos.macospace.com.ninetta.R;

import static wallpaperphptos.macospace.com.ninetta.SplashScreen_Content.SplashScreenActivity.stopPosition;

public class FullScreenActivity extends AppCompatActivity {

    
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
