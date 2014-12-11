package com.al.morsecodeconverter;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

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

	EditText textInput = (EditText) findViewById(R.id.textInputBox);

	Button convertBtn = (Button) findViewById(R.id.convertText);
	convertBtn.setOnClickListener(new View.OnClickListener()
	{
	    
	    @Override
	    public void onClick(View v)
	    {
//		String input = textInput.getText().toString();
//		    Log.d(classname, "Cool = " + inputString);
//		    mWorker.textToMorse(inputString);
		
	    }
	});
//	if(input != null)
//	{
//	    convertBtn.setOnClickListener(new morseConverter(input, null));
//	}

    }

    private class morseConverter implements View.OnClickListener{
	private String inputString;
	private MorseCodeWorker mWorker;

	public morseConverter(String input, View v)
	{
	    mWorker = new MorseCodeWorker();
	    this.inputString = input;
	    onClick(v);
	}

	@Override
	public void onClick(View v)
	{
//	    String strResult = mWorker.mCodeEncode(inputString);
	    Log.d(classname, "Cool = " + inputString);
	    mWorker.textToMorse(inputString);

	}

    }
}
