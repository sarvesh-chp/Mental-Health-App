package com.example.mental_health_app2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class Result_page extends AppCompatActivity {

    TextView final_score,rating;
    Button takeTheTestAgain,vids;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result_page);

        Bundle b=getIntent().getExtras();
        double result=b.getDouble("res");
        final_score=findViewById(R.id.score);
        final_score.setText(Double.toString(result));

        if(result>=8.0 && result<=10.0)
        {
            rating=findViewById(R.id.rate);
            rating.setText("Excellent");
        }
        else if(result>=5.0 && result<8.0)
        {
            rating=findViewById(R.id.rate);
            rating.setText("Average");
        }
        else
        {
            rating=findViewById(R.id.rate);
            rating.setText("Poor");
        }
        vids=findViewById(R.id.videos);
        vids.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=NQcYZplTXnQ&list=PLvg_HubfHvhEMCjYh4dI7Lt6PXPwaq5CA")));
            }
        });

        takeTheTestAgain=findViewById(R.id.test_again);
        takeTheTestAgain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Result_page.this,MainActivity.class);
                startActivity(intent);
            }
        });

    }
}