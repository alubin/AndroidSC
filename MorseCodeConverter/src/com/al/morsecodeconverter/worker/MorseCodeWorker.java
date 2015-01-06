package com.al.morsecodeconverter.worker;

import java.util.HashMap;

import android.util.Log;

public class MorseCodeWorker {
    //This string is used for any TAG displays.
    String classname = getClass().getSimpleName();
    
    HashMap <Character, String> charMap = new HashMap<Character, String>();
    HashMap <String, Character> morseMap = new HashMap<String, Character>();
    public MorseCodeWorker()
    {
	buildMaps();
    }

    /**
     * Builds the maps needed to convert the morse code to/from english characters.
     */
    private void buildMaps()
    {
	charMap.put('a', ". _");
	charMap.put('b', "_ . . .");
	charMap.put('c', "_ . _ .");
	charMap.put('d', "_ . .");
	charMap.put('e', ".");
	charMap.put('f', ". . _ .");
	charMap.put('g', "_ _ .");
	charMap.put('h', ". . . .");
	charMap.put('i', ". .");
	charMap.put('j', ". _ _ _");
	charMap.put('k', "_ . _");
	charMap.put('l', ". _ . .");
	charMap.put('m', "_ _");
	charMap.put('n', "_ .");
	charMap.put('o', "_ _ _");
	charMap.put('p', ". _ _ .");
	charMap.put('q', "_ _ . _");
	charMap.put('r', ". _ .");
	charMap.put('s', ". . .");
	charMap.put('t', "_");
	charMap.put('u', ". . _");
	charMap.put('v', ". . . _");
	charMap.put('w', ". _ _");
	charMap.put('x', "_ . . _");
	charMap.put('y', "_ . _ _");
	charMap.put('z', "_ _ . .");
	charMap.put('1', ". _ _ _ _");
	charMap.put('2', ". . _ _ _");
	charMap.put('3', ". . . _ _");
	charMap.put('4', ". . . . _");
	charMap.put('5', ". . . . .");
	charMap.put('6', "_ . . . .");
	charMap.put('7', "_ _ . . .");
	charMap.put('8', "_ _ _ . .");
	charMap.put('9', "_ _ _ _ .");
	charMap.put('0', "_ _ _ _ _");
	charMap.put('.', ". _ . _ . _");
	charMap.put(',', "_ _ . . _ _");
	charMap.put(' ', "   ");

	morseMap.put("._",'a');
	morseMap.put("_...", 'b');
	morseMap.put("_._.", 'c');
	morseMap.put("_..", 'd');
	morseMap.put(".", 'e');
	morseMap.put(".._.", 'f');
	morseMap.put("__.", 'g');
	morseMap.put("....", 'h');
	morseMap.put("..", 'i');
	morseMap.put(".___", 'j');
	morseMap.put( "_._", 'k');
	morseMap.put("._..", 'l');
	morseMap.put("__", 'm');
	morseMap.put("_.",'n');
	morseMap.put("___",'o');
	morseMap.put(".__.",'p');
	morseMap.put("__._",'q');
	morseMap.put("._.",'r');
	morseMap.put("...",'s');
	morseMap.put("_", 't');
	morseMap.put(".._",'u');
	morseMap.put("..._",'v');
	morseMap.put(".__",'w');
	morseMap.put("_.._",'x');
	morseMap.put("_.__",'y');
	morseMap.put("__..",'z');
	morseMap.put(".____",'1');
	morseMap.put("..___",'2');
	morseMap.put("...__",'3');
	morseMap.put("...._",'4');
	morseMap.put(".....",'5');
	morseMap.put("_....",'6');
	morseMap.put("__...",'7');
	morseMap.put("___..",'8');
	morseMap.put("____.",'9');
	morseMap.put("_____",'0');
	morseMap.put("._._._",'.');
	morseMap.put("__..__",',');
	morseMap.put("   ", ' ');


    }

    /**
     * This function takes an English character and outputs the Morse code string equivalent.
     * @param inputChar The character to be converted to morse code.
     * @return
     */
    public String toMorse(Character inputChar)
    {
	return charMap.get(Character.toLowerCase(inputChar));

    }
    
    public String toText(String... inputString)
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
    
    public String toText(String inputMorseString)
    {
	StringBuilder output = new StringBuilder();
	String[] inputArray = inputMorseString.split("  ");
	for(String morseCode: inputArray)
	{
	    output.append(morseMap.get(morseCode));
	}
	return output.toString();
    }

    public String toMorse(String input) throws Exception
    {
	StringBuffer encodeString = new StringBuffer();	
	for(char character: input.toCharArray())
	{
	    String searchResult = charMap.get(Character.toLowerCase(character));
	    if(searchResult != null)
	    {
		encodeString.append(searchResult + "  ");
	    }
	    else
	    {
		throw new Exception(  "String contained invalid character. Valid Chars:\"A-Z:0-9:,:.\""); 
	    }
	    
	}
	
	Log.d("Morse Code Worker", "Encode String =" + encodeString);
	return encodeString.toString();
    }

}
