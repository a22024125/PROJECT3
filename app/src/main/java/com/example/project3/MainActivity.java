package com.example.project3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private RadioGroup mradGrpleft, mradGrpright;
    private RadioButton mradBtnleft1, mradBtnleft2, mradBtnleft3, mradBtnleft4, mradBtnleft5,mradBtnleft6, mradBtnleft7, mradBtnleft8, mradBtnleft9;
    private RadioButton mradBtnright1, mradBtnright2, mradBtnright3, mradBtnright4, mradBtnright5,mradBtnright6, mradBtnright7, mradBtnright8, mradBtnright9;
    private TextView mtextView;
    int  r = 6, l = 6;
    String Str = "";
    String Final = "";
    private void updateResult() {
        for (int f = 1;f <= r; f++) {
            for (int m = 1; m < l+1; m++) {
                Str = "";
                Str += f;
                Str += " * ";
                Str += m;
                Str += " = ";
                Str += f * m;
                Str += '\n';
                Final += Str;
            }
        }
        mtextView.setText(String.valueOf(Final));
        Final = "";
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mtextView = findViewById(R.id.textView);

        mradGrpleft = findViewById(R.id.radGrpleft);
        mradGrpright = findViewById(R.id.radGrpright);

        mradBtnleft1 = findViewById(R.id.radBtnleft1);
        mradBtnleft2 = findViewById(R.id.radBtnleft2);
        mradBtnleft3 = findViewById(R.id.radBtnleft3);
        mradBtnleft4 = findViewById(R.id.radBtnleft4);
        mradBtnleft5 = findViewById(R.id.radBtnleft5);
        mradBtnleft6 = findViewById(R.id.radBtnleft6);
        mradBtnleft7 = findViewById(R.id.radBtnleft7);
        mradBtnleft8 = findViewById(R.id.radBtnleft8);
        mradBtnleft9 = findViewById(R.id.radBtnleft9);

        mradBtnright1 = findViewById(R.id.radBtnright1);
        mradBtnright2 = findViewById(R.id.radBtnright2);
        mradBtnright3 = findViewById(R.id.radBtnright3);
        mradBtnright4 = findViewById(R.id.radBtnright4);
        mradBtnright5 = findViewById(R.id.radBtnright5);
        mradBtnright6 = findViewById(R.id.radBtnright6);
        mradBtnright7 = findViewById(R.id.radBtnright7);
        mradBtnright8 = findViewById(R.id.radBtnright8);
        mradBtnright9 = findViewById(R.id.radBtnright9);

        mradGrpleft.setOnCheckedChangeListener(radGrpleftOnCheckedChange);
        mradGrpright.setOnCheckedChangeListener(radGrprightOnCheckedChange);

    }
    private RadioGroup.OnCheckedChangeListener radGrpleftOnCheckedChange = new RadioGroup.OnCheckedChangeListener() {
        @Override
        public void onCheckedChanged(RadioGroup radioGroup, int i) {
            switch (mradGrpleft.getCheckedRadioButtonId()) {
                case R.id.radBtnleft1:
                    l = 1;
                    break;
                case R.id.radBtnleft2:
                    l = 2;
                    break;
                case R.id.radBtnleft3:
                    l = 3;
                    break;
                case R.id.radBtnleft4:
                    l = 4;
                    break;
                case R.id.radBtnleft5:
                    l = 5;
                    break;
                case R.id.radBtnleft6:
                    l = 6;
                    break;
                case R.id.radBtnleft7:
                    l = 7;
                    break;
                case R.id.radBtnleft8:
                    l = 8;
                    break;
                case R.id.radBtnleft9:
                    l = 9;
                    break;
            }
            updateResult();
            //for (int f = 1; f <= r; f++) {
            // for (int m = 1; m < l+1; m++) {
            //Str = "";
            //Str += f;
            // Str += " * ";
            // Str += m;
            // Str += " = ";
            // Str += f * m;
            //  Str += '\n';
            // Final += Str;
            // }
            // }
            // mtextView.setText(String.valueOf(Final));
            //Final = "";
            //mtextView.setText(String.valueOf(fun(l,r)));

            //}
        }
    };
    private RadioGroup.OnCheckedChangeListener radGrprightOnCheckedChange = new RadioGroup.OnCheckedChangeListener() {
        @Override
        public void onCheckedChanged(RadioGroup radioGroup, int i) {
            switch (mradGrpright.getCheckedRadioButtonId()) {
                case R.id.radBtnright1:
                    r = 1;
                    break;
                case R.id.radBtnright2:
                    r = 2;
                    break;
                case R.id.radBtnright3:
                    r = 3;
                    break;
                case R.id.radBtnright4:
                    r = 4;
                    break;
                case R.id.radBtnright5:
                    r = 5;
                    break;
                case R.id.radBtnright6:
                    r = 6;
                    break;
                case R.id.radBtnright7:
                    r = 7;
                    break;
                case R.id.radBtnright8:
                    r = 8;
                    break;
                case R.id.radBtnright9:
                    r = 9;
                    break;

            }
            updateResult();
            // for (int f = 1; f <= r; f++) {
            // for (int m = 1; m <= l; m++) {
            //Str = "";
            //Str += f;
            //Str += " * ";
            //Str += m;
            //Str += " = ";
            //Str += f * m;
            //Str += '\n';
            //Final += Str;
            // }
            // }
            //mtextView.setText(String.valueOf(Final));
            //Final = "";
            // mtextView.setText(String.valueOf(fun(l,r)));

            // }

        }
    };
       // public static char fun(int l, int r) {
            //char Final;
            //String Str = "";
            //for(int f = 1; f < l; f++) {
               //for(int m = 1; m < r; m++) {
                //Str = "";
                //Str += f;
                //Str += " x ";
                //Str += m;
                //Str += " = ";
                //Str += f*m;
                //Str += '\n';
                 //}

           //}
            //Final = Str.charAt(11);
            //return Final;
        //}

}