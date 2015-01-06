package com.al.morsecodeconverter;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

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

	//This represents the morse code input of the user.
	final TextView morseInputView = (TextView) findViewById(R.id.inputMorse);

	//This converts the morse code into english text.
	Button convertBtn = (Button) findViewById(R.id.convertMorse);

	//Performs the action for the coversion button. 
	convertBtn.setOnClickListener(new View.OnClickListener()
	{
	    /*This listener takes in the values from the input field and converts the code. */
	    @Override
	    public void onClick(View v)
	    {
		TextView textDisplay = (TextView) findViewById(R.id.morseCodeDisplay);;
		String morseText = morseInputView.getText().toString();
		if(morseText != null)
		{
		    textDisplay.setText(workerClass.toText(morseText));
		}

	    }
	});
    }
}
