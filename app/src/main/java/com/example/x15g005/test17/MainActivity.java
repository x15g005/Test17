package com.example.x15g005.test17;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        View view=findViewById(R.id.include);
//        TextView textView= (TextView) view.findViewById(R.id.textView);
//        textView.setText("テキスト設定");

        LinearLayout layout = (LinearLayout) findViewById(R.id.output);
        LinearLayout layout1;
        layout = (LinearLayout) getLayoutInflater().inflate(R.layout.layout1,null);
        output.addView(layout);

    }
}
