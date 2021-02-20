package cn.campusapp.rtmprecorder;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private static final String STREAM_URL = "rtmp://10.10.5.119/live/livestream";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button record_btn = (Button) findViewById(R.id.record_btn);
        record_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("byWh", "record_btn");
                startActivity(RecordActivity.makeIntent(STREAM_URL));
            }
        });
    }


    protected String getUrl(){
        return STREAM_URL;
    }
}
