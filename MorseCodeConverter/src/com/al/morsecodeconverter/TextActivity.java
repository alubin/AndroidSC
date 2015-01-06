package com.al.morsecodeconverter;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.al.morsecodeconverter.worker.MorseCodeWorker;

/**
 * This class represents the activity that takes in Text Character. 
 * These Character are then converted to Morse Code.
 * @author AL
 *
 */
public class TextActivity extends Activity
{
    //This string is used for any TAG displays.
    String classname = getClass().getSimpleName();

    MorseCodeWorker workerClass = new MorseCodeWorker();
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
	super.onCreate(savedInstanceState);
	setContentView(R.layout.activity_text);

	final TextView textInput = (TextView) findViewById(R.id.textInputBox);

	Button convertBtn = (Button) findViewById(R.id.convertText);
	//This button is used to convert the text.
	convertBtn.setOnClickListener(new View.OnClickListener()
	{
	    /* This listener takes in the user text and convert it to morse code when the convert button is pressed.*/

	    @Override
	    public void onClick(View v)
	    {
		TextView textToMorseDisplay = (TextView) findViewById(R.id.textMorseDisplay);
		String text = textInput.getText().toString();
		if(text != null)
		{
		    try
		    {
			textToMorseDisplay.setText(workerClass.toMorse(text));
		    } catch (Exception e)
		    {
			textToMorseDisplay.setText("Invalid Input was given.");
		    }
		}
	    }
	});

    }
}
