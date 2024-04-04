package com.example.samplebio;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText editText;
    private TextView textView2;
    private TextView bioTextView;
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Initialize views
        editText = findViewById(R.id.editText);
        textView2 = findViewById(R.id.textView2);
        bioTextView = findViewById(R.id.bioTextView);
        button = findViewById(R.id.button);

        // Set OnClickListener for the button
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Get text from EditText
                String newText = editText.getText().toString().trim();
                if (!newText.isEmpty()) {
                    // Set text to textView2 and make it visible
                    textView2.setText(newText);
                   // textView2.setVisibility(View.VISIBLE);

                    // Add colored text to bioTextView
                    String currentText = bioTextView.getText().toString();
                    if (!currentText.isEmpty()) {
                        currentText += "\n"; // Add a new line before appending new text
                    }
                    currentText += newText;
                    bioTextView.setText(currentText);
                    bioTextView.setTextColor(Color.BLUE); // Change text color
                }
            }
        });
    }
}
