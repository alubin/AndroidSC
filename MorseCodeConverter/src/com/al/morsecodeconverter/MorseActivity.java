package com.al.morsecodeconverter;

import android.app.Activity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

import com.al.morsecodeconverter.editorlistener.TextBoxEditor;

/**
 * This class takes in Morse Code and converts that into English Text.
 * @author AL
 *
 */
public class MorseActivity extends Activity
{
    
    String className = getClass().getSimpleName();
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
	super.onCreate(savedInstanceState);
	setContentView(R.layout.activity_morse);
	
	EditText morseInputView = (EditText) findViewById(R.id.inputMorse);
//	morseInput.addTextChangedListener(new TextBoxEditor((TextView) findViewById(R.id.morseCodeDisplay), 'm'));
    }
}
