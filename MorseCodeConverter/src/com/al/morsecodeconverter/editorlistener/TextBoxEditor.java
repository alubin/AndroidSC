package com.al.morsecodeconverter.editorlistener;

import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.widget.TextView;

import com.al.morsecodeconverter.worker.MorseCodeWorker;

public class TextBoxEditor implements TextWatcher
{
    String className = getClass().getSimpleName();
    private TextView text;
    MorseCodeWorker workerClass = new MorseCodeWorker();
    private char type;
    private int oldStart = 0;

    public TextBoxEditor()
    {
    }

    public TextBoxEditor(TextView textBox)
    {
	this();
	text = textBox;
    }

    public TextBoxEditor(TextView textBox, char type)
    {
	this(textBox);
	this.type = type;
    }

    @Override
    public void beforeTextChanged(CharSequence s, int start, int count,
	    int after)
    {

    }

    @Override
    public void onTextChanged(CharSequence s, int start, int before, int count)
    {
	String word = null;

	if (s.charAt(start + count - 1) == ' ')
	{
	    CharSequence wholeWord = s.subSequence(oldStart, start);	    
	    Log.d(className, "New Word = \"" + wholeWord + "\"");
	    oldStart = start;	    
	   word =  wholeWord.toString();
	}
	
	if(type == 'm')
	{
	    String output = workerClass.mCodeDecodeString(word.toString());
	    text.setText(output);
	}

    }

    @Override
    public void afterTextChanged(Editable s)
    {
	//	Log.d(className, "Resulting Text = " + s.toString());
	String output = "empty";
	switch (type)
	{
	case 'm':
	    try
	    {
		output = workerClass.toMorse(s.toString());
	    } catch (Exception e)
	    {
		//TODO: Figure out what needs to be done.
	    }
	    break;
	case 't':
	    //	    output = workerClass.morsecodechardecode(s.toString());
	    output = " ";
	    break;
	}
	text.setText(output);

    }

}
