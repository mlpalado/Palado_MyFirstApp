package mcm.edu.ph.palado_myfisrtapp;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaParser;
import android.media.MediaPlayer;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    MediaPlayer player;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        player = new MediaPlayer();
        player = MediaPlayer.create(this, R.raw.silhouette);

        player.start();


    }
}