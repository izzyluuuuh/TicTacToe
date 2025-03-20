package com.example.tictactoe;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import androidx.annotation.NonNull;

public class ResultsDialog extends Dialog {

    private final String message;
    private final MainActivity mainActivity;
    public ResultsDialog(@NonNull Context context, String message, MainActivity mainActivity) {
        super(context);
        this.message = message;
        this.mainActivity = mainActivity;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

            TextView messageText = findViewById(R.id.messageText);
            Button startAgainButton = findViewById(R.id.startAgainBtn);
            messageText.setText(message);
            startAgainButton.setOnClickListener(view -> {
                mainActivity.restartMatch();
                dismiss();
            });
    }
}