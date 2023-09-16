package com.example.projectanime.Activity;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.projectanime.R;

public class artist_detail extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intro);

        Intent intent = getIntent();
        String fruitName = intent.getStringExtra("artistName");
        String fruitImg = intent.getStringExtra("artistImg");


        ImageView imageView = (ImageView) findViewById(R.id.imageView);
        switch (fruitImg) {
            case "clover":
                imageView.setImageResource(R.drawable.clover);
                break;
            case "tokyo":
                imageView.setImageResource(R.drawable.tokyo);
                break;
            case "stone":
                imageView.setImageResource(R.drawable.stone);
                break;
            case "nisekoi":
                imageView.setImageResource(R.drawable.nisekoi);
                break;
            case "kokoro":
                imageView.setImageResource(R.drawable.kokoro);
                break;
            case "clannad":
                imageView.setImageResource(R.drawable.clannad);
                break;
        }

        TextView textView = (TextView) findViewById(R.id.textView);
        textView.setText(fruitName);
    }
}
