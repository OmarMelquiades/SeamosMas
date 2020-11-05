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

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Button btn2 = findViewById(R.id.btn2);

        btn2.setOnClickListener( new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent irA2 = new Intent(MainActivity2.this,MainActivity.class);
                startActivity(irA2);

                Context context = getApplicationContext();
                CharSequence text = "Volviendo al Main Activity";
                int duration = Toast.LENGTH_SHORT;

                Toast toast = Toast.makeText(context, text, duration);
                toast.show();

            }
        });

    }
}