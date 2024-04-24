package edu.mu.Game;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

import javax.swing.JFrame;

import org.jfree.data.json.impl.*;





public class HangmanGame extends JFrame {
    private static final List<String> WORDS = Arrays.asList("apple", "banana", "cherry", "date", "elderberry", "fig", "grape");
    private static final Random RANDOM = new Random();
	

	
	public static boolean[] checkArrayForMatches(String currentWord, char charToTest)//generates a boolean array in response to the user's guess against the current word
	{
		String upperCaseCurretWord = currentWord.toUpperCase();
		char[] currentWordArray = upperCaseCurretWord.toCharArray();
		boolean[] returnArray = new boolean[currentWordArray.length];
		
		for(int x = 0; x < returnArray.length; x++)
		{
			char characterInArray = currentWordArray[x];
			if(characterInArray == charToTest)
			{
				returnArray[x] = true;
			}
			else 
			{
				returnArray[x] = false;
			}		
		}
 		return returnArray;
	}
	
	public static boolean doesArrayContainATrue(boolean[] someBoolArray)
	{
		for (boolean x : someBoolArray)
		{
			if(x == true) 
			{
				return true;
			}
		}
		return false;
	}
	
	public static boolean doesArrayContainUnderscores(char[] someCharArray)
	{
		for(char x : someCharArray)
		{
			if(x == '_')
			{
				return true;
			}	
		}
		return false;
	}
    public static String getRandomWord() {
        return WORDS.get(RANDOM.nextInt(WORDS.size()));
    }

    public static boolean[] checkArrayForMatches(char[] array, char letter) {
        boolean[] result = new boolean[array.length];
        for (int i = 0; i < array.length; i++) {
            if (array[i] == letter) {
                result[i] = true;
            }
        }
        return result;
    }
}