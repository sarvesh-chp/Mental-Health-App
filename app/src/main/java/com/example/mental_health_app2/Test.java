package com.example.mental_health_app2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import com.example.mental_health_app2.R;


public class Test extends AppCompatActivity {
    RadioGroup r1,r2,r3,r4,r5,r6,r7,r8,r9,r10;
    RadioButton b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12,b13,b14,b15,b16,b17,b18,b19,b20,b21,b22,b23,b24,b25,b26,b27,b28,b29,b30;
    Button button;
    double result=0.0;
    double ans1=0,ans2=0,ans3=0,ans4=0,ans5=0,ans6=0,ans7=0,ans8=0,ans9=0,ans10=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);

        r1 = findViewById(R.id.r1);
        r2 = findViewById(R.id.r2);
        r3 = findViewById(R.id.r3);
        r4 = findViewById(R.id.r4);
        r5 = findViewById(R.id.r5);
        r6 = findViewById(R.id.r6);
        r7 = findViewById(R.id.r7);
        r8 = findViewById(R.id.r8);
        r9 = findViewById(R.id.r9);
        r10 = findViewById(R.id.r10);

        b1 = findViewById(R.id.b1);
        b2 = findViewById(R.id.b2);
        b3 = findViewById(R.id.b3);
        b4 = findViewById(R.id.b4);
        b5 = findViewById(R.id.b5);
        b6 = findViewById(R.id.b6);
        b7 = findViewById(R.id.b7);
        b8 = findViewById(R.id.b8);
        b9 = findViewById(R.id.b9);
        b10 = findViewById(R.id.b10);
        b11 = findViewById(R.id.b11);
        b12 = findViewById(R.id.b12);
        b13 = findViewById(R.id.b13);
        b14 = findViewById(R.id.b14);
        b15 = findViewById(R.id.b15);
        b16 = findViewById(R.id.b16);
        b17 = findViewById(R.id.b17);
        b18 = findViewById(R.id.b18);
        b19 = findViewById(R.id.b19);
        b20 = findViewById(R.id.b20);
        b21 = findViewById(R.id.b21);
        b22 = findViewById(R.id.b22);
        b23 = findViewById(R.id.b23);
        b24 = findViewById(R.id.b24);
        b25 = findViewById(R.id.b25);
        b26 = findViewById(R.id.b26);
        b27 = findViewById(R.id.b27);
        b28 = findViewById(R.id.b28);
        b29 = findViewById(R.id.b29);
        b30 = findViewById(R.id.b30);

        button = findViewById(R.id.result);
        button.setOnClickListener(this::onClick);

        b1.setOnClickListener(this::onRadioButtonClicked1);
        b2.setOnClickListener(this::onRadioButtonClicked1);
        b3.setOnClickListener(this::onRadioButtonClicked1);
        b4.setOnClickListener(this::onRadioButtonClicked2);
        b5.setOnClickListener(this::onRadioButtonClicked2);
        b6.setOnClickListener(this::onRadioButtonClicked2);
        b7.setOnClickListener(this::onRadioButtonClicked3);
        b8.setOnClickListener(this::onRadioButtonClicked3);
        b9.setOnClickListener(this::onRadioButtonClicked3);
        b10.setOnClickListener(this::onRadioButtonClicked4);
        b11.setOnClickListener(this::onRadioButtonClicked4);
        b12.setOnClickListener(this::onRadioButtonClicked4);
        b13.setOnClickListener(this::onRadioButtonClicked5);
        b14.setOnClickListener(this::onRadioButtonClicked5);
        b15.setOnClickListener(this::onRadioButtonClicked5);
        b16.setOnClickListener(this::onRadioButtonClicked6);
        b17.setOnClickListener(this::onRadioButtonClicked6);
        b18.setOnClickListener(this::onRadioButtonClicked6);
        b19.setOnClickListener(this::onRadioButtonClicked7);
        b20.setOnClickListener(this::onRadioButtonClicked7);
        b21.setOnClickListener(this::onRadioButtonClicked7);
        b22.setOnClickListener(this::onRadioButtonClicked8);
        b23.setOnClickListener(this::onRadioButtonClicked8);
        b24.setOnClickListener(this::onRadioButtonClicked8);
        b25.setOnClickListener(this::onRadioButtonClicked9);
        b26.setOnClickListener(this::onRadioButtonClicked9);
        b27.setOnClickListener(this::onRadioButtonClicked9);
        b28.setOnClickListener(this::onRadioButtonClicked10);
        b29.setOnClickListener(this::onRadioButtonClicked10);
        b30.setOnClickListener(this::onRadioButtonClicked10);
    }

    public void onRadioButtonClicked1(View view) {
        boolean checked = ((RadioButton) view).isChecked();
        switch (view.getId()) {
            case R.id.b1:
                if (checked) {
                    ans1 = 1;
                    break;
                }
            case R.id.b2:
                if (checked) {
                    ans1 = 0.5;
                    break;
                }
            case R.id.b3:
                if (checked) {
                    ans1 = 0;
                    break;
                }
        }

    }
    public void onRadioButtonClicked2(View view) {
        boolean checked = ((RadioButton) view).isChecked();
        switch (view.getId()) {
            case R.id.b4:
                if (checked) {
                    ans2 = 1;
                    break;
                }
            case R.id.b5:
                if (checked) {
                    ans2 = 0.5;
                    break;
                }
            case R.id.b6:
                if (checked) {
                    ans2 = 0;
                    break;
                }
        }

    }
    public void onRadioButtonClicked3(View view) {
        boolean checked = ((RadioButton) view).isChecked();
        switch (view.getId()) {
            case R.id.b7:
                if (checked) {
                    ans3 = 1;
                    break;
                }
            case R.id.b8:
                if (checked) {
                    ans3 = 0.5;
                    break;
                }
            case R.id.b9:
                if (checked) {
                    ans3 = 0;
                    break;
                }
        }

    }
    public void onRadioButtonClicked4(View view) {
        boolean checked = ((RadioButton) view).isChecked();
        switch (view.getId()) {
            case R.id.b10:
                if (checked) {
                    ans4 = 1;
                    break;
                }
            case R.id.b11:
                if (checked) {
                    ans4 = 0.5;
                    break;
                }
            case R.id.b12:
                if (checked) {
                    ans4 = 0;
                    break;
                }
        }

    }
    public void onRadioButtonClicked5(View view) {
        boolean checked = ((RadioButton) view).isChecked();
        switch (view.getId()) {
            case R.id.b13:
                if (checked) {
                    ans5 = 1;
                    break;
                }
            case R.id.b14:
                if (checked) {
                    ans5= 0.5;
                    break;
                }
            case R.id.b15:
                if (checked) {
                    ans5 = 0;
                    break;
                }
        }

    }
    public void onRadioButtonClicked6(View view) {
        boolean checked = ((RadioButton) view).isChecked();
        switch (view.getId()) {
            case R.id.b16:
                if (checked) {
                    ans6 = 1;
                    break;
                }
            case R.id.b17:
                if (checked) {
                    ans6 = 0.5;
                    break;
                }
            case R.id.b18:
                if (checked) {
                    ans6 = 0;
                    break;
                }
        }

    }
    public void onRadioButtonClicked7(View view) {
        boolean checked = ((RadioButton) view).isChecked();
        switch (view.getId()) {
            case R.id.b19:
                if (checked) {
                    ans7 = 1;
                    break;
                }
            case R.id.b20:
                if (checked) {
                    ans7 = 0.5;
                    break;
                }
            case R.id.b21:
                if (checked) {
                    ans7 = 0;
                    break;
                }
        }

    }
    public void onRadioButtonClicked8(View view) {
        boolean checked = ((RadioButton) view).isChecked();
        switch (view.getId()) {
            case R.id.b22:
                if (checked) {
                    ans8 = 1;
                    break;
                }
            case R.id.b23:
                if (checked) {
                    ans8 = 0.5;
                    break;
                }
            case R.id.b24:
                if (checked) {
                    ans8 = 0;
                    break;
                }
        }

    }

    public void onRadioButtonClicked9(View view) {
        boolean checked = ((RadioButton) view).isChecked();
        switch (view.getId()) {
            case R.id.b25:
                if (checked) {
                    ans9 = 1;
                    break;
                }
            case R.id.b26:
                if (checked) {
                    ans9 = 0.5;
                    break;
                }
            case R.id.b27:
                if (checked) {
                    ans9 = 0;
                    break;
                }
        }

    }

    public void onRadioButtonClicked10(View view) {
        boolean checked = ((RadioButton) view).isChecked();
        switch (view.getId()) {
            case R.id.b28:
                if (checked) {
                    ans10 = 1;
                    break;
                }
            case R.id.b29:
                if (checked) {
                    ans10 = 0.5;
                    break;
                }
            case R.id.b30:
                if (checked) {
                    ans10 = 0;
                    break;
                }
        }

    }

    public void onClick(View view){
        //Toast.makeText(getApplicationContext(),"Result:"+result, Toast.LENGTH_SHORT).show();
        result=ans1+ans2+ans3+ans4+ans5+ans6+ans7+ans8+ans9+ans10;
        Intent intent = new Intent(Test.this,Result_page.class);
        Bundle b=new Bundle();
        b.putDouble("res",result);
        intent.putExtras(b);
        startActivity(intent);
        result=0.0;
    }

}