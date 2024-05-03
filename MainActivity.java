package com.example.armstrongnum;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

   private EditText number;

    private TextView textView;

   private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        number=findViewById(R.id.number);
        button=findViewById(R.id.button);
        textView=findViewById(R.id.textView);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s=number.getText().toString();
                int num=Integer.parseInt(s);
                int temp=num;
                int r,sum=0;
               while(num>0)
               {
                   r=num%10;
                   num=num/10;
                   sum=sum+r*r*r;
               }
                if(temp==sum){
                    textView.setText("This  number is Armstrong");
                }
                else {
                    textView.setText("This  number is not Armstrong");
                }
            }
        });

    }
}