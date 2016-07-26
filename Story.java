package com.tiy.adventurestory;

import java.util.Scanner;

public class Story {
	
	private String[] storyLine = new String[20];
	private int intro = 0;
	private int optionA = 1;
	private int optionB = 2;
	private int optionC = 3;
	private int optionA_Y = 4;
	private int optionA_N = 5;
	private int optionB_Y = 6;
	private int optionB_N = 7;
	private int optionC_House = 8;
	private int optionC_Sleep = 9;
	private int optionC_Bar = 10;
	private int optionC_Bar_Y = 11;
	private int optionC_Bar_N = 12;

		
	private static Scanner sl = new Scanner(System.in);
	
	public Story()
	{
		storyLine[intro] = "You are currently standing on a pier. "
			+ "You have three options on how to proceed\n"
			+ "Option A: Water is in front of you; jump in the water.\n"
			+ "Option B: A boat is docked next to the pier; step on to the boat.\n"
			+ "Option C: Land is behind you; turn around and head to land.\n"
			+ "Select A, B, or C \n"
			+ "At any time, type 'r' to restart the story";
		storyLine[optionA] = "You just jumped into the water.\n"
				+ "The water is freezing and you cannot see or touch the bottom. "
				+ "Can you swim?\n"
				+ "Select Y for yes or N for no";
		storyLine[optionA_Y] = "Luckily, you're able to swim.\n"
				+ "There is nothing but open water in front of you and\n"
				+ "there is no way to get back onto land. \n"
				+ "Would you like to,\n"
				+ "Option A: Drown in the freezing water? \n"
				+ "Option B: Climb a ladder attached to boat?";
		storyLine[optionA_N] = "You drown.";
		storyLine[optionB] = "You step onto boat.\n"
				+ "Unfortunately, this boat is already owned by pirates.\n"
				+ "Do you want to fight them? \n"
				+ "Select Y for yes or N for no";
		storyLine[optionB_Y] = "You are terrible at fighting and die.";
		storyLine[optionB_N] = "You run back on to the pier.\n (hit [enter] to continue)";
		storyLine[optionC] = "You turn around and head towards Land.\n"
				+ "Ahead of you are some buildings.\n"
				+ "Would you like to\n"
				+ "Option A: Go to your house?\n"
				+ "Option B: Go into the bar?";
		storyLine[optionC_House] = "You are poor and own absolutely nothing. \n"
				+ "There is literally nothing in your house except a bed.\n"
				+ "Would you like to \n"
				+ "Option A: Go to sleep, because I can't even remember why I was on the pier? \n"
				+ "Option B: Head back to the pier and continue the adventure?";
		storyLine[optionC_Sleep] = "You go to sleep and live for another day.";
		storyLine[optionC_Bar] = "You head to the bar. \n"
				+ "The bartender inside asks if you'd like a drink? \n"
				+ "Select Y for yes or N for no";
		storyLine[optionC_Bar_Y] = "You drink too much.\n"
				+ "You turn into a super creeper, drawing the attention of the bouncers. \n"
				+ "You are thrown out and end up back on the pier."
				+ "(hit [enter] to continue)";
		storyLine[optionC_Bar_N] = "A group of sailors make fun of you for not drinking.\n"
				+ "You start a fight and someone pulls a knife on you.\n"
				+ "You get stabbed and die.";
		 
	} 
	
	public void startStory()
	{	
		boolean dontRestart = true;
		while (dontRestart)
		{
			System.out.println(storyLine[0]);
			String firstStep = sl.nextLine();
			dontRestart = !firstStep.equalsIgnoreCase("r");
			if (dontRestart)
			{
				switch (firstStep)
				{
					case "A": optionA();
						break;
					case "B": optionB();
						break;
					case "C": optionC();
						break;
				}
			}
		}
	}
	
	private void optionA()
	{
		boolean dontRestart = true;
		while (dontRestart)
		{
			System.out.println(storyLine[1]);
			String stepA = sl.nextLine();
			dontRestart = !stepA.equalsIgnoreCase("r");
			if (dontRestart)
			{
				switch (stepA)
				{
				case "Y": optionA_Y();
					break;
				case "N": optionA_N();
					break;
				}
			}
		}
	}
	
	private void optionA_Y()
	{
		boolean dontRestart = true;
		while (dontRestart)
		{
			System.out.println(storyLine[4]);
			String stepA_Y = sl.nextLine();
			dontRestart = !stepA_Y.equalsIgnoreCase("r");
			if (dontRestart)
			{
				switch (stepA_Y)
				{
				case "A": optionA_N();
					break;
				case "B": optionB();
					break;
				}
			}
		}
	}
	
	private void optionA_N()
	{
		boolean dontRestart = true;
		while (dontRestart)
		{
			System.out.println(storyLine[5]);
			System.exit(0);
		}
	}
	
	private void optionB()
	{
		boolean dontRestart = true;
		while (dontRestart)
		{
			System.out.println(storyLine[2]);
			String stepB = sl.nextLine();
			dontRestart = !stepB.equalsIgnoreCase("r");
			if (dontRestart)
			{
				switch (stepB)
				{
				case "Y": optionB_Y();
					break;
				case "N": optionB_N();
					break;
				}
			}
		}
	}
	
	private void optionB_Y()
	{
		boolean dontRestart = true;
		while (dontRestart)
		{
			System.out.println(storyLine[6]);
			System.exit(0);
		}
	}
	private void optionB_N()
	{
		boolean dontRestart = true;
		while (dontRestart)
		{
			System.out.println(storyLine[7]);
			String stepB_N = sl.nextLine();
			dontRestart = !stepB_N.equalsIgnoreCase("r");
			if (dontRestart)
			{
				startStory();
			}
		}
	}
	
	private void optionC()
	{
		boolean dontRestart = true;
		while (dontRestart)
		{
			System.out.println(storyLine[3]);
			String stepC = sl.nextLine();
			dontRestart = !stepC.equalsIgnoreCase("r");
			if (dontRestart)
			{
				switch (stepC)
				{
				case "A": optionC_House();
					break;
				case "B": optionC_Bar();
					break;
				}
			}
		}
	}
	
	private void optionC_House()
	{
		boolean dontRestart = true;
		while (dontRestart)
		{
			System.out.println(storyLine[8]);
			String stepC_House = sl.nextLine();
			dontRestart = !stepC_House.equalsIgnoreCase("r");
			if (dontRestart)
			{
				switch (stepC_House)
				{
				case "A": optionC_Sleep();
					break;
				case "B": startStory();
					break;
				}
			}
		}
	}
	
	private void optionC_Sleep()
	{
		System.out.println(storyLine[9]);
		System.exit(0);
	}
	
	private void optionC_Bar()
	{
		boolean dontRestart = true;
		while (dontRestart)
		{
			System.out.println(storyLine[10]);
			String stepC_Bar = sl.nextLine();
			dontRestart = !stepC_Bar.equalsIgnoreCase("r");
			if (dontRestart)
			{
				switch (stepC_Bar)
				{
					case "Y": optionC_Bar_Y();
						break;
					case "N": optionC_Bar_N();
						break;
				}
			}
		}
	}
	
	private void optionC_Bar_Y()
	{
		boolean dontRestart = true;
		while (dontRestart)
		{
			System.out.println(storyLine[11]);
			String stepC_Bar_Y = sl.nextLine();
			dontRestart = !stepC_Bar_Y.equalsIgnoreCase("r");
			if (dontRestart)
			{
				startStory();
			}
		}
	}
	
	private void optionC_Bar_N()
	{
		System.out.println(storyLine[12]);
		System.exit(0);
	}
	
	public static void main(String[] args)
	{
		Story adventureStory = new Story();
		adventureStory.startStory();
	}

}
