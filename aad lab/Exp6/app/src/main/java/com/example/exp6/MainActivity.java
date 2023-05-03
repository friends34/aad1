package com.example.exp6;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import java.util.Scanner;
public class MainActivity extends AppCompatActivity {
    Button sendsms;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        sendsms = findViewById(R.id.button);
        sendsms.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View view) {

                Intent it = new Intent(Intent.ACTION_VIEW,
                        Uri.fromParts("sms","0123456789",null));
                it.putExtra("Message","Hello..!, How are you ?");
                startActivity(it);
            }
        });
    }
}