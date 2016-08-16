package de.yellowphoenix18.tictactoe.stats;

import de.yellowphoenix18.tictactoe.frame.FrameToSee;

public class Stats {
	
	public static int Losts = 0;
	public static int Wins = 0;
	public static int fastest = 9;
	
	public static void updateStats(int Lost, int Win, int fast) {
		if(fast < fastest) {
			fastest = fast;
		}
		Wins = Wins + Win;
		Losts = Losts + Lost;		
		FrameToSee.Fastest.setText("Fastest: " + fastest);
		FrameToSee.Wins.setText("Wins: " + Wins);
		FrameToSee.Losts.setText("Losts: " + Losts);
	}
	
	
	
	
	
	

}
