package com.fayne.android.broadcastbestpractive;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button forceoffline = findViewById(R.id.force_offline);
        forceoffline.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent("com.fayne.android.broadcastbestpractive.FORCE_OFFLINE");
                sendBroadcast(intent);
            }
        });
    }
}
