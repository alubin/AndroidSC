package com.al.morsecodeconverter;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/** This activity represents the choice that the user makes. **/
public class ChoiceActivity extends Activity
{
    String classname = getClass().getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
	super.onCreate(savedInstanceState);
	setContentView(R.layout.activity_choice);
	
	Button morseBtn = (Button) findViewById(R.id.morseCodeBtn);
	morseBtn.setOnClickListener(new View.OnClickListener()
	{
	    
	    @Override
	    public void onClick(View v)
	    {
		openMorseCodeWindow(v);
		
	    }
	});
	
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
    
    private void openMorseCodeWindow(final View view)
    {
	Intent intent = new Intent(this, MorseActivity.class);
	startActivity(intent);
	
    }
    
    private void openTextWindow(final View view)
    {
	startActivity(new Intent(this, TextActivity.class));
    }
}
