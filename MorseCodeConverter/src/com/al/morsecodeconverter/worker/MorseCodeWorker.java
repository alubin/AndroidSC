package com.al.morsecodeconverter.worker;

import java.util.HashMap;

import android.util.Log;

public class MorseCodeWorker {
    //This string is used for any TAG displays.
    String classname = getClass().getSimpleName();
    
    HashMap <Character, String> mCodeCharMap = new HashMap<Character, String>();
    HashMap <String, Character> mCodeMap = new HashMap<String, Character>();
    public MorseCodeWorker()
    {
	buildMaps();
    }

    private void buildMaps()
    {
	mCodeCharMap.put('a', ". _");
	mCodeCharMap.put('b', "_ . . .");
	mCodeCharMap.put('c', "_ . _ .");
	mCodeCharMap.put('d', "_ . .");
	mCodeCharMap.put('e', ".");
	mCodeCharMap.put('f', ". . _ .");
	mCodeCharMap.put('g', "_ _ .");
	mCodeCharMap.put('h', ". . . .");
	mCodeCharMap.put('i', ". .");
	mCodeCharMap.put('j', ". _ _ _");
	mCodeCharMap.put('k', "_ . _");
	mCodeCharMap.put('l', ". _ . .");
	mCodeCharMap.put('m', "_ _");
	mCodeCharMap.put('n', "_ .");
	mCodeCharMap.put('o', "_ _ _");
	mCodeCharMap.put('p', ". _ _ .");
	mCodeCharMap.put('q', "_ _ . _");
	mCodeCharMap.put('r', ". _ .");
	mCodeCharMap.put('s', ". . .");
	mCodeCharMap.put('t', "_");
	mCodeCharMap.put('u', ". . _");
	mCodeCharMap.put('v', ". . . _");
	mCodeCharMap.put('w', ". _ _");
	mCodeCharMap.put('x', "_ . . _");
	mCodeCharMap.put('y', "_ . _ _");
	mCodeCharMap.put('z', "_ _ . .");
	mCodeCharMap.put('1', ". _ _ _ _");
	mCodeCharMap.put('2', ". . _ _ _");
	mCodeCharMap.put('3', ". . . _ _");
	mCodeCharMap.put('4', ". . . . _");
	mCodeCharMap.put('5', ". . . . .");
	mCodeCharMap.put('6', "_ . . . .");
	mCodeCharMap.put('7', "_ _ . . .");
	mCodeCharMap.put('8', "_ _ _ . .");
	mCodeCharMap.put('9', "_ _ _ _ .");
	mCodeCharMap.put('0', "_ _ _ _ _");
	mCodeCharMap.put('.', ". _ . _ . _");
	mCodeCharMap.put(',', "_ _ . . _ _");
	mCodeCharMap.put(' ', "   ");

	mCodeMap.put("._",'a');
	mCodeMap.put("_...", 'b');
	mCodeMap.put("_._.", 'c');
	mCodeMap.put("_..", 'd');
	mCodeMap.put(".", 'e');
	mCodeMap.put(".._.", 'f');
	mCodeMap.put("__.", 'g');
	mCodeMap.put("....", 'h');
	mCodeMap.put("..", 'i');
	mCodeMap.put(".___", 'j');
	mCodeMap.put( "_._", 'k');
	mCodeMap.put("._..", 'l');
	mCodeMap.put("__", 'm');
	mCodeMap.put("_.",'n');
	mCodeMap.put("___",'o');
	mCodeMap.put(".__.",'p');
	mCodeMap.put("__._",'q');
	mCodeMap.put("._.",'r');
	mCodeMap.put("...",'s');
	mCodeMap.put("_", 't');
	mCodeMap.put(".._",'u');
	mCodeMap.put("..._",'v');
	mCodeMap.put(".__",'w');
	mCodeMap.put("_.._",'x');
	mCodeMap.put("_.__",'y');
	mCodeMap.put("__..",'z');
	mCodeMap.put(".____",'1');
	mCodeMap.put("..___",'2');
	mCodeMap.put("...__",'3');
	mCodeMap.put("...._",'4');
	mCodeMap.put(".....",'5');
	mCodeMap.put("_....",'6');
	mCodeMap.put("__...",'7');
	mCodeMap.put("___..",'8');
	mCodeMap.put("____.",'9');
	mCodeMap.put("_____",'0');
	mCodeMap.put("._._._",'.');
	mCodeMap.put("__..__",',');
	mCodeMap.put("   ", ' ');


    }

    public String mCodeEncode(Character inputChar)
    {
	return mCodeCharMap.get(Character.toLowerCase(inputChar));

    }

    public String mCodeEncode(String inputString)
    {
	StringBuffer encodeString = new StringBuffer();
	for(int index = 0; index < inputString.length(); index++)
	{
	    String searchResult = mCodeCharMap.get(Character.toLowerCase(inputString.charAt(index)));
	    if(searchResult != null)
	    {
		encodeString.append(searchResult + "  ");
	    }
	    else
	    {
		encodeString.insert(0, "String contained invalid character. Valid Chars:\"A-Z:0-9:,:.\""); 
	    }
	}

	Log.d("Morse Code Worker", "Encode String =" + encodeString);

	return encodeString.toString();

    }
    
    public String mCodeDecodeArray(String... inputString)
    {
	StringBuilder outputString = new StringBuilder();
	String result =	null;
	for(String letter: inputString)
	{
	    char charLetter = letter.charAt(0);
	    outputString.append(charLetter);

	}
	return result;
    }

    public String mCodeDecodeSequence(String inputString)
    {
	StringBuilder outputString = new StringBuilder();
	
	for(int i = 0; i < inputString.length(); i++)
	{
	    Character morseLetter = mCodeMap.get(inputString.charAt(i));
	    System.out.println(morseLetter);
	    if(morseLetter != null)
	    {
		outputString.append( morseLetter);
	    }
	}
	return outputString.toString();

    }
    
    public String mCodeDecodeString(String inputString)
    {
	StringBuilder outputString = new StringBuilder();
	    outputString.append(mCodeMap.get(inputString));
	return outputString.toString();

    }
    
    public Character mCodeDecodeChar(String morseChar)
    {
	return mCodeMap.get(morseChar) == null ? '?' : mCodeMap.get(morseChar); 
    }
    
    public String textToMorse(String input)
    {
	StringBuffer encodeString = new StringBuffer();
	for(int i = 0; i < input.length(); i++)
	{
	    String searchResult = mCodeCharMap.get(Character.toLowerCase(input.charAt(i)));
//	    Log.d(classname, searchResult);
	    if(searchResult != null)
	    {
		encodeString.append(searchResult + "  ");
	    }
	}
	return encodeString.toString();
    }

}
