package com.al.morsecodeconverter;

import android.app.Activity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

import com.al.morsecodeconverter.editorlistener.TextBoxEditor;
import com.al.morsecodeconverter.worker.MorseCodeWorker;

/**
 * This class represents the activity that takes in Text Character. 
 * These Character are then converted to Morse Code.
 * @author AL
 *
 */
public class TextActivity extends Activity
{
    MorseCodeWorker workerClass = new MorseCodeWorker();
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
	super.onCreate(savedInstanceState);
	setContentView(R.layout.activity_text);
	
	EditText textInput = (EditText) findViewById(R.id.textInputBox);
	
	textInput.addTextChangedListener(new TextBoxEditor((TextView) findViewById(R.id.textMorseDisplay),'t'));
    }
}
