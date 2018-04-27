package com.test.oleg.testandroidproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView mHelloTextView;
    private EditText mNameEditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mHelloTextView = findViewById(R.id.textView);
        mNameEditText = findViewById(R.id.editText);
    }

    public void onClick(View view) {
        if (mNameEditText.getText().length() > 0) {
            mNameEditText.setVisibility(View.INVISIBLE);
            mHelloTextView.setText("Hello " + mNameEditText.getText() + "!");
        } else{
            mNameEditText.setVisibility(View.INVISIBLE);
            mHelloTextView.setText("Hello Kitty!");
        }
    }
}
