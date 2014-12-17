package com.al.morsecodeconverter.tester;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.al.morsecodeconverter.worker.MorseCodeWorker;

public class ConvertToMorse
{
    MorseCodeWorker mWorker = new MorseCodeWorker();
    char[] alphabet = "abcdefghijklmnopqrstuvwxyz".toCharArray();

//    @Before
//    public void setUp() throws Exception
//    {
//	mWorker = new MorseCodeWorker();
//    }

    @Test
    public void testMCodeEncodeCharacter()
    {
	//	fail("Not yet implemented");
	for(char alphaChar: alphabet)
	{
	    System.out.println(mWorker.toMorse(alphaChar));
	}
    }

}
