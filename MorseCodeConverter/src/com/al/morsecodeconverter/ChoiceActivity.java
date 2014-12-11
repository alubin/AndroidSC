package com.al.morsecodeconverter;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/** This activity represents the choice that the user makes. **/
public class ChoiceActivity extends Activity
{
    //This string is used for any TAG displays.
    String classname = getClass().getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
	super.onCreate(savedInstanceState);
	setContentView(R.layout.activity_choice);
	
	//This is the button to access the morse code converter.
	Button morseBtn = (Button) findViewById(R.id.morseCodeBtn);
	morseBtn.setOnClickListener(new View.OnClickListener()
	{
	    
	    @Override
	    public void onClick(View v)
	    {
		//Accesses the Morse Code Window.
		openMorseCodeWindow(v);
		
	    }
	});
	
	//This button allows access to text converter.
	Button textBtn = (Button) findViewById(R.id.textBtn);
	textBtn.setOnClickListener(new View.OnClickListener()
	{
	    
	    @Override
	    public void onClick(View v)
	    {
		openTextWindow(v);
		
	    }
	});
	
    }
    
    /**
     * Opens the activity for the morse converter.
     * @param view
     */
    private void openMorseCodeWindow(final View view)
    {
	Intent intent = new Intent(this, MorseActivity.class);
	startActivity(intent);
	
    }
    
    /**
     * Access the activity that converts the text converter.
     * @param view
     */
    private void openTextWindow(final View view)
    {
	startActivity(new Intent(this, TextActivity.class));
    }
}
