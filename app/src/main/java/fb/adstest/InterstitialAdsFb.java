package fb.adstest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;

import com.valentine.stickers.R;


public class InterstitialAdsFb extends AppCompatActivity {


    private Button bShowAd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_interstitial_ads_fb);
        bShowAd = findViewById(R.id.b_fb_interstitial);

    }
}
