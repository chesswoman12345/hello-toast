package com.example.hellotoast1;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private int count = 0;
    private TextView textCount;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Reference vers le composant TextView
        textCount = findViewById(R.id.text_count);

        // Update the initial count display
        if (textCount != null) {
            textCount.setText(String.valueOf(count));
        }
    }

    // Method called when the "Show Toast" button is clicked
    public void showToast(View view) {
        Toast.makeText(this, "Hello Toast!", Toast.LENGTH_SHORT).show();
    }

    // Method called when the "Count" button is clicked
    public void countUp(View view) {
        count++;
        if (textCount != null) {
            textCount.setText(String.valueOf(count));
        }
    }
}