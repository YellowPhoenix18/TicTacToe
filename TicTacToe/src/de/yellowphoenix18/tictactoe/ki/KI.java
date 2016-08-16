package de.yellowphoenix18.tictactoe.ki;

import java.awt.Color;
import java.util.Random;

import de.yellowphoenix18.tictactoe.frame.FrameToSee;
import de.yellowphoenix18.tictactoe.stats.Stats;

public class KI {
	
	public static int FeldA = 0;
	public static int FeldB = 0;
	public static int FeldC = 0;
	public static int FeldD = 0;
	public static int FeldE = 0;
	public static int FeldF = 0;
	public static int FeldG = 0;
	public static int FeldH = 0;
	public static int FeldI = 0;
	public static int Wait = 0;
	
	public static String name = "Du";
	
	public static int Round = 0;
	
	public static void getKI() {
		
		//A | B | C
		//D | E | F
		//G | H | I
		
		
		FrameToSee.info.setForeground(Color.BLACK);
		if(Round != 0) {		
		if(FeldA == 1 && FeldB == 1 && FeldC == 0) {
			FeldC = 2;
			FrameToSee.FeldC.setText("0");
			FrameToSee.FeldC.setForeground(Color.ORANGE);
			FrameToSee.info.setText("YellowPhoenix18 wählt Feld C");
		} else if(FeldB == 1 && FeldC == 1 && FeldA == 0) {
			FeldA = 2;
			FrameToSee.FeldA.setText("0");
			FrameToSee.FeldA.setForeground(Color.ORANGE);
			FrameToSee.info.setText("YellowPhoenix18 wählt Feld A");
		} else if(FeldA == 1 && FeldC == 1 && FeldB == 0) {
			FeldB = 2;
			FrameToSee.FeldB.setText("0");
			FrameToSee.FeldB.setForeground(Color.ORANGE);
			FrameToSee.info.setText("YellowPhoenix18 wählt Feld B");
		} else if(FeldD == 1 && FeldE == 1 && FeldF == 0) {
			FeldF = 2;
			FrameToSee.FeldF.setText("0");
			FrameToSee.FeldF.setForeground(Color.ORANGE);
			FrameToSee.info.setText("YellowPhoenix18 wählt Feld F");
		} else if(FeldE == 1 && FeldF == 1 && FeldD == 0) {
			FeldD = 2;
			FrameToSee.FeldD.setText("0");
			FrameToSee.FeldD.setForeground(Color.ORANGE);
			FrameToSee.info.setText("YellowPhoenix18 wählt Feld D");
		} else if(FeldD == 1 && FeldF == 1 && FeldE == 0) {
			FeldE = 2;
			FrameToSee.FeldE.setText("0");
			FrameToSee.FeldE.setForeground(Color.ORANGE);
			FrameToSee.info.setText("YellowPhoenix18 wählt Feld E");
		} else if(FeldG == 1 && FeldH == 1 && FeldI == 0) {
			FeldI = 2;
			FrameToSee.FeldI.setText("0");
			FrameToSee.FeldI.setForeground(Color.ORANGE);
			FrameToSee.info.setText("YellowPhoenix18 wählt Feld I");
		} else if(FeldH == 1 && FeldI == 1 && FeldG == 0) {
			FeldG = 2;
			FrameToSee.FeldG.setText("0");
			FrameToSee.FeldG.setForeground(Color.ORANGE);
			FrameToSee.info.setText("YellowPhoenix18 wählt Feld G");
		} else if(FeldG == 1 && FeldI == 1 && FeldH == 0) {
			FeldH = 2;
			FrameToSee.FeldH.setText("0");
			FrameToSee.FeldH.setForeground(Color.ORANGE);
			FrameToSee.info.setText("YellowPhoenix18 wählt Feld H");
		} else if(FeldA == 1 && FeldD == 1 && FeldG == 0) {
			FeldG = 2;
			FrameToSee.FeldG.setText("0");
			FrameToSee.FeldG.setForeground(Color.ORANGE);
			FrameToSee.info.setText("YellowPhoenix18 wählt Feld G");
		} else if(FeldD == 1 && FeldG == 1 && FeldA == 0) {
			FeldA = 2;
			FrameToSee.FeldA.setText("0");
			FrameToSee.FeldA.setForeground(Color.ORANGE);
			FrameToSee.info.setText("YellowPhoenix18 wählt Feld A");
		} else if(FeldA == 1 && FeldG == 1 && FeldD == 0) {
			FeldD = 2;	
			FrameToSee.FeldD.setText("0");
			FrameToSee.FeldD.setForeground(Color.ORANGE);
			FrameToSee.info.setText("YellowPhoenix18 wählt Feld D");
		} else if(FeldB == 1 && FeldE == 1 && FeldH == 0) {
			FeldH = 2;
			FrameToSee.FeldH.setText("0");
			FrameToSee.FeldH.setForeground(Color.ORANGE);
			FrameToSee.info.setText("YellowPhoenix18 wählt Feld H");
		} else if(FeldE == 1 && FeldH == 1 && FeldB == 0) {
			FeldB = 2;
			FrameToSee.FeldB.setText("0");
			FrameToSee.FeldB.setForeground(Color.ORANGE);
			FrameToSee.info.setText("YellowPhoenix18 wählt Feld B");
		} else if(FeldB == 1 && FeldH == 1 && FeldE == 0) {
			FeldE = 2;	
			FrameToSee.FeldE.setText("0");
			FrameToSee.FeldE.setForeground(Color.ORANGE);
			FrameToSee.info.setText("YellowPhoenix18 wählt Feld E");
		} else if(FeldC == 1 && FeldF == 1 && FeldI == 0) {
			FeldI = 2;
			FrameToSee.FeldI.setText("0");
			FrameToSee.FeldI.setForeground(Color.ORANGE);
			FrameToSee.info.setText("YellowPhoenix18 wählt Feld I");
		} else if(FeldF == 1 && FeldI == 1 && FeldC == 0) {
			FeldC = 2;
			FrameToSee.FeldC.setText("0");
			FrameToSee.FeldC.setForeground(Color.ORANGE);
			FrameToSee.info.setText("YellowPhoenix18 wählt Feld C");
		} else if(FeldC == 1 && FeldI == 1 && FeldF == 0) {
			FeldF = 2;
			FrameToSee.FeldF.setText("0");
			FrameToSee.FeldF.setForeground(Color.ORANGE);
			FrameToSee.info.setText("YellowPhoenix18 wählt Feld F");
		} else if(FeldA == 1 && FeldE == 1 && FeldI == 0) {
			FeldI = 2;
			FrameToSee.FeldI.setText("0");
			FrameToSee.FeldI.setForeground(Color.ORANGE);
			FrameToSee.info.setText("YellowPhoenix18 wählt Feld I");
		} else if(FeldA == 1 && FeldI == 1 && FeldE == 0) {
			FeldE = 2;
			FrameToSee.FeldE.setText("0");
			FrameToSee.FeldE.setForeground(Color.ORANGE);
			FrameToSee.info.setText("YellowPhoenix18 wählt Feld E");
		} else if(FeldE == 1 && FeldI == 1 && FeldA == 0) {
			FeldA = 2;	
			FrameToSee.FeldA.setText("0");
			FrameToSee.FeldA.setForeground(Color.ORANGE);
			FrameToSee.info.setText("YellowPhoenix18 wählt Feld A");
		} else if(FeldC == 1 && FeldE == 1 && FeldG == 0) {
			FeldG = 2;
			FrameToSee.FeldG.setText("0");
			FrameToSee.FeldG.setForeground(Color.ORANGE);
			FrameToSee.info.setText("YellowPhoenix18 wählt Feld G");
		} else if(FeldE == 1 && FeldG == 1 && FeldC == 0) {
			FeldC = 2;
			FrameToSee.FeldC.setText("0");
			FrameToSee.FeldC.setForeground(Color.ORANGE);
			FrameToSee.info.setText("YellowPhoenix18 wählt Feld C");
		} else if(FeldG == 1 && FeldC == 1 && FeldE == 0) {
			FeldE = 2;
			FrameToSee.FeldE.setText("0");
			FrameToSee.FeldE.setForeground(Color.ORANGE);
			FrameToSee.info.setText("YellowPhoenix18 wählt Feld E");
		} else {
			int i = 1;
			int z = 0;
			while(i != 0) {
			z ++;
			if(z > 100) {
				i = 0;
			}
			Random r1 = new Random();
			int x = r1.nextInt(9);
			if(x == 0 && FeldA == 0) {
				FeldA = 2;
				FrameToSee.FeldA.setText("0");
				FrameToSee.FeldA.setForeground(Color.ORANGE);
				FrameToSee.info.setText("YellowPhoenix18 wählt Feld A");
				i = 0;
			} else if(x == 1 && FeldD == 0) {
				FeldD = 2;
				FrameToSee.FeldD.setText("0");
				FrameToSee.FeldD.setForeground(Color.ORANGE);
				FrameToSee.info.setText("YellowPhoenix18 wählt Feld D");
				i = 0;
			} else if(x == 2 && FeldB == 0) {
				FeldB = 2;
				FrameToSee.FeldB.setText("0");
				FrameToSee.FeldB.setForeground(Color.ORANGE);
				FrameToSee.info.setText("YellowPhoenix18 wählt Feld B");
				i = 0;
			} else if(x == 3 && FeldI == 0) {
				FeldI = 2;
				FrameToSee.FeldI.setText("0");
				FrameToSee.FeldI.setForeground(Color.ORANGE);
				FrameToSee.info.setText("YellowPhoenix18 wählt Feld I");
				i = 0;
			} else if(x == 4 && FeldH == 0) {
				FeldH = 2;
				FrameToSee.FeldH.setText("0");
				FrameToSee.FeldH.setForeground(Color.ORANGE);
				FrameToSee.info.setText("YellowPhoenix18 wählt Feld H");
				i = 0;
			} else if(x == 5 && FeldC == 0) {
				FeldC = 2;
				FrameToSee.FeldC.setForeground(Color.ORANGE);
				FrameToSee.FeldC.setText("0");
				FrameToSee.info.setText("YellowPhoenix18 wählt Feld C");
				i = 0;
			} else if(x == 6 && FeldE == 0) {
				FeldE = 2;
				FrameToSee.FeldE.setText("0");
				FrameToSee.FeldE.setForeground(Color.ORANGE);
				FrameToSee.info.setText("YellowPhoenix18 wählt Feld E");
				i = 0;
			} else if(x == 7 && FeldG == 0) {
				FeldG = 2;
				FrameToSee.FeldG.setText("0");
				FrameToSee.FeldG.setForeground(Color.ORANGE);
				FrameToSee.info.setText("YellowPhoenix18 wählt Feld G");
				i = 0;
			} else if(x == 8 && FeldF == 0) {
				FeldF = 2;
				FrameToSee.FeldF.setText("0");
				FrameToSee.FeldF.setForeground(Color.ORANGE);
				FrameToSee.info.setText("YellowPhoenix18 wählt Feld F");
				i = 0;
			}
			}
		}
		
		Round ++;
		if(Round >= 9) {
			FrameToSee.info.setText("Spiel zu Ende... unentschieden.");
			Stats.updateStats(0, 0, 9);
		} else {
			Wait = 0;
			String x = FrameToSee.info.getText();
			if(name.equalsIgnoreCase("Du")) {
				FrameToSee.info.setText(x + ". " + name + " bist dran...");	
			} else {
				FrameToSee.info.setText(x + ". " + name + " ist dran...");	
			}
		}
		
		
		checkWinner();
		}
	}
	
	public static void checkWinner() {
		if(FeldA == 2 && FeldB == 2 && FeldC == 2 || FeldD == 2 && FeldE == 2 && FeldF == 2 || FeldG == 2 && FeldH == 2 && FeldI == 2 ||
		   FeldI == 2 && FeldF == 2 && FeldC == 2 || FeldB == 2 && FeldE == 2 && FeldH == 2 || FeldG == 2 && FeldD == 2 && FeldA == 2 ||
		   FeldG == 2 && FeldE == 2 && FeldC == 2 || FeldI == 2 && FeldE == 2 && FeldA == 2) {
			FrameToSee.info.setText("Spiel zu Ende...neues Game startet.Gewinner: YellowPhoenix18");	
			Stats.updateStats(1, 0, 9);
			newGame();
		}else if(FeldA == 1 && FeldB == 1 && FeldC == 1 || FeldD == 1 && FeldE == 1 && FeldF == 1 || FeldG == 1 && FeldH == 1 && FeldI == 1 ||
		   FeldI == 1 && FeldF == 1 && FeldC == 1 || FeldB == 1 && FeldE == 1 && FeldH == 1 || FeldG == 1 && FeldD == 1 && FeldA == 1 ||
		   FeldG == 1 && FeldE == 1 && FeldC == 1 || FeldI == 1 && FeldE == 1 && FeldA == 1) {
			FrameToSee.info.setText("Spiel zu Ende...neues Game startet.Gewinner: " + name);
			Stats.updateStats(0, 1, Round);
			newGame();		
		}
		
	}
	
	public static void newGame() {
		FeldA = 0;
		FeldB = 0;
		FeldC = 0;
		FeldD = 0;
		FeldE = 0;
		FeldF = 0;
		FeldG = 0;
		FeldH = 0;
		FeldI = 0;
		Wait = 0;
		Round = 0;
		FrameToSee.FeldA.setText("A");
		FrameToSee.FeldB.setText("B");
		FrameToSee.FeldC.setText("C");
		FrameToSee.FeldD.setText("D");
		FrameToSee.FeldE.setText("E");
		FrameToSee.FeldF.setText("F");
		FrameToSee.FeldG.setText("G");
		FrameToSee.FeldH.setText("H");
		FrameToSee.FeldI.setText("I");
		FrameToSee.FeldA.setForeground(Color.BLACK);
		FrameToSee.FeldB.setForeground(Color.BLACK);
		FrameToSee.FeldC.setForeground(Color.BLACK);
		FrameToSee.FeldD.setForeground(Color.BLACK);
		FrameToSee.FeldE.setForeground(Color.BLACK);
		FrameToSee.FeldF.setForeground(Color.BLACK);
		FrameToSee.FeldG.setForeground(Color.BLACK);
		FrameToSee.FeldH.setForeground(Color.BLACK);
		FrameToSee.FeldI.setForeground(Color.BLACK);
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	

}
