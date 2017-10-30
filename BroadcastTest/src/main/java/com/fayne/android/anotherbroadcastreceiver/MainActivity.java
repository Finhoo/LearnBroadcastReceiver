package com.fayne.android.anotherbroadcastreceiver;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnSendCast = findViewById(R.id.btnSendCast);
        btnSendCast.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent("com.fayne.android.learnbroadcastreceiver.MY_BROADCAST");
                sendOrderedBroadcast(intent, null);
            }
        });
    }
}
