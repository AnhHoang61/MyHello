package com.example.myhello;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class SecondActivity2 extends AppCompatActivity {
    private Button btn_return;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_second2);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        btn_return = (Button) findViewById(R.id.btn_return);
        //txt_get_Data = (TextView) findViewById(R.id.txt_get_data);
        btn_return.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                //Intent myIntent = new Intent(SecondActivity2.this, MainActivity.class);
                //startActivities(myIntent);
                Intent myGetIntent = getIntent();
                Bundle myGetBundle = myGetIntent.getBundleExtra("myobj");
                String myGetString = myGetBundle.getString("data");
               // txt_Get_Data.setText(myGetString);
                Toast.makeText(SecondActivity2.this, myGetString, Toast.LENGTH_LONG).show();
            }

        });
    }
}