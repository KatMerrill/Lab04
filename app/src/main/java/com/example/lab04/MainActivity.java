package com.example.lab04;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    int[] layouts;
    ConstraintLayout layout;
    int x;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_ext);
        layout = findViewById(R.id.layout);
        x = 0;

        layouts = new int[]
        {R.layout.layout_1, R.layout.layout_2, R.layout.layout_3, R.layout.layout_4, R.layout.layout_5, R.layout.layout_6, R.layout.layout_7, R.layout.layout_ext};

        layout.setOnClickListener(onClickListener);
    }


     View.OnClickListener onClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            setContentView(layouts[x]);
            layout = findViewById(R.id.layout);
            layout.setOnClickListener(this);
            x++;
            if(x > layouts.length - 1) {
                x = 0;
            }
        }
    };
}