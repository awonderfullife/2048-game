package com.example.awonderfullife.our_game;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.view.View.OnClickListener;

public class NextActivity extends Activity{

    private Button my_button2 = null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        // TODO Auto-generated method stub
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_next);

        my_button2 = (Button)findViewById(R.id.top_button);
        my_button2.setOnClickListener(new MyButtonListener());
    }

    class MyButtonListener implements OnClickListener{
        public void onClick(View v) {
            // TODO Auto-generated method stub
            Intent intent = new Intent();
            intent.setClass(NextActivity.this, MainActivity.class);
            NextActivity.this.startActivity(intent);
        }
    }
}

