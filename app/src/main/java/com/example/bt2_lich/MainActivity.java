package com.example.bt2_lich;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

EditText duong;
Button button;
TextView am;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        duong = findViewById(R.id.namduong);
        am = findViewById(R.id.namam);
        button = findViewById(R.id.button);
        setContentView(R.layout.activity_main);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String can[] = {"Canh","Tân","Nhâm","Quý","Giáp","Ất","Bỉnh","Đinh","Mậu","Kỷ"};
                String chi[] = {"Thân","Dậu","Tuất","Hợi","Tý","Sửu","Dần","Mẹo","Thìn","Tỵ","Ngọ","Mùi"};
                String chuyen = duong.getText().toString();
                int doi = Integer.parseInt(chuyen);
                String amlich = can[doi%10] +" "+ chi[doi%12];
                am.setText(amlich);
            }
        }

        );

    }



}