package fb.adstest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.valentine.stickers.R;

import java.util.ArrayList;
import java.util.List;

public class NativeBannerAdFb extends AppCompatActivity {

    private final String TAG = NativeBannerAdFb.class.getSimpleName();

    private LinearLayout adView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_native_banner_ad_fb);
       }
}
