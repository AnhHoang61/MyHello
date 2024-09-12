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

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private TextView text_hello_world;
    private Button btn_click_me;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        //B1
        text_hello_world = (TextView) findViewById(R.id.txt_hello_world);
        btn_click_me = (Button) findViewById(R.id.btn_click_me);

        //B2
        btn_click_me.setOnClickListener(this);
    }

    public void onClick(View v){
        Toast.makeText(this, btn_click_me.getText(), Toast.LENGTH_LONG).show();

        Intent myIntent = new Intent(MainActivity.this, SecondActivity2.class);
        startActivity(myIntent);
    }

    @Override
    public void onPointerCaptureChanged(boolean hasCapture) {
        super.onPointerCaptureChanged(hasCapture);
    }
}