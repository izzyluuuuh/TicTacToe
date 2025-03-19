package com.example.tictactoe;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
//import androidx.core.graphics.Insets;
//import androidx.core.view.ViewCompat;
//import androidx.core.view.WindowInsetsCompat;

public class AddPlayer extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_add_player);

//        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
//            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
//            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
//            return insets;

            EditText playerOne = findViewById(R.id.playerOne);
            EditText playerTwo = findViewById(R.id.playerTwo);
            Button startGameBtn = findViewById(R.id.startGameBtn);

            startGameBtn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                    String getPlayerOneName = playerOne.getText().toString();
                    String getPlayerTwoName = playerTwo.getText().toString();

                    if (getPlayerOneName.isEmpty() || getPlayerTwoName.isEmpty()) {
                        Toast.makeText(AddPlayer.this, "Please enter player names", Toast.LENGTH_SHORT).show();
                    } else {
                        Intent intent = new Intent(AddPlayer.this, MainActivity.class);
                        intent.putExtra("playerOne", getPlayerOneName);
                        intent.putExtra("playerTwo", getPlayerTwoName);
                        startActivity(intent);
                }
            }
        });
    }
}