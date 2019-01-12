package com.example.kankan_ol.myapplication;

import android.app.Activity;
import android.os.Bundle;
import android.text.Html;
import android.text.method.LinkMovementMethod;
import android.util.Log;
import android.widget.TextView;


public class MainActivity extends Activity {

    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        TextView t1 = findViewById(R.id.text1);
        String s1 = "<font color='blue'><b>代码如诗你如画</b></font><br>";
        s1 += "<a href = 'https://kankan.fun'>kankan's 主页</a>";
        t1.setText(Html.fromHtml(s1));
        t1.setMovementMethod(LinkMovementMethod.getInstance());

        Log.v("Fanny", String.valueOf(t1.getText()));
    }
}
