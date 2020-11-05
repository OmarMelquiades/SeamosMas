package com.example.seamosmas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnma = findViewById(R.id.btnma);
        btnma.setOnClickListener( new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent irA2 = new Intent(MainActivity.this,MainActivity2.class);
                startActivity(irA2);

                Context context = getApplicationContext();
                CharSequence text = "Vamos al Activity 2";
                int duration = Toast.LENGTH_SHORT;

                Toast toast = Toast.makeText(context, text, duration);
                toast.show();

            }
        });

    }
}