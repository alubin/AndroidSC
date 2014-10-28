package com.al.morsecodeconverter;

import android.app.Activity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

import com.al.morsecodeconverter.editorlistener.TextBoxEditor;

public class MorseActivity extends Activity
{
    
    String className = getClass().getSimpleName();
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
	super.onCreate(savedInstanceState);
	setContentView(R.layout.activity_morse);
	
	EditText morseInput = (EditText) findViewById(R.id.inputMorse);
	morseInput.addTextChangedListener(new TextBoxEditor((TextView) findViewById(R.id.morseCodeDisplay), 'm'));
    }
}
