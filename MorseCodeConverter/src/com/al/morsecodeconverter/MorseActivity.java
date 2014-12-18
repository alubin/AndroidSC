package com.al.morsecodeconverter;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.al.morsecodeconverter.editorlistener.TextBoxEditor;
import com.al.morsecodeconverter.worker.MorseCodeWorker;

/**
 * This class takes in Morse Code and converts that into English Text.
 * @author AL
 *
 */
public class MorseActivity extends Activity
{

    String className = getClass().getSimpleName();

    MorseCodeWorker workerClass = new MorseCodeWorker();

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
	super.onCreate(savedInstanceState);
	setContentView(R.layout.activity_morse);

	final TextView morseInputView = (TextView) findViewById(R.id.inputMorse);

	Button convertBtn = (Button) findViewById(R.id.convertMorse);

	convertBtn.setOnClickListener(new View.OnClickListener()
	{

	    @Override
	    public void onClick(View v)
	    {
		TextView textDisplay = (TextView) findViewById(R.id.morseCodeDisplay);;
		String morseText = morseInputView.getText().toString();
		if(morseText != null)
		{
		    textDisplay.setText(workerClass.toText(morseText));
//		    textDisplay.setText("Fun");
		}

	    }
	});
    }
}
