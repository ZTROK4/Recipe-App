package com.example.recipeapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class AddRecipe extends AppCompatActivity {

    EditText ed1,ed2,ed3;
    AppCompatButton b1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_add_recipe);
        ed1=(EditText) findViewById(R.id.addtitle);
        ed2=(EditText) findViewById(R.id.descrip);
        ed3=(EditText) findViewById(R.id.preparedby);
        b1=(AppCompatButton) findViewById(R.id.submitbtn);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String getRecipeTitle=ed1.getText().toString();
                String getRecipeDescrip=ed2.getText().toString();
                String getPreparedBy=ed3.getText().toString();

                Toast.makeText(getApplicationContext(),getRecipeTitle +" successfully added to recipe list",Toast.LENGTH_SHORT).show();
                Intent i=new Intent(getApplicationContext(), MainActivity.class);
                startActivity(i);
            }
        });
    }
}