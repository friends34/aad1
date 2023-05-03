package com.example.exp5;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.widget.TextView;
public class SecondActivity extends Activity
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        TextView tv=(TextView)findViewById(R.id.textView1);
        TextView tv1=(TextView)findViewById(R.id.textView2);
        tv.setText("User Name : "+getIntent().getExtras().getString("uname"));
        tv1.setText("Password : "+getIntent().getExtras().getString("pwd"));
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu)
    {
        getMenuInflater().inflate(R.menu.menu_main , menu);
        return true;
    }
}