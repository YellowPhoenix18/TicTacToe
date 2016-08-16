package de.yellowphoenix18.tictactoe.frame;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import de.yellowphoenix18.tictactoe.ki.KI;

public class FrameListener implements ActionListener {
	
	
	FrameListener() {
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		FrameToSee.info.setForeground(Color.BLACK);
		if(e.getSource() == FrameToSee.FeldA) {
			if(KI.Wait == 0) {
				if(KI.FeldA == 0) {
			FrameToSee.info.setText("YellowPhoenix18 ist an der Reihe.");
			FrameToSee.FeldA.setText("X");
			KI.Round ++;
			KI.Wait = 1;
			FrameToSee.FeldA.setForeground(Color.BLUE);
			KI.FeldA = 1;
			KI.checkWinner();
			KI.getKI();
				} else {
					FrameToSee.info.setForeground(Color.RED);
					FrameToSee.info.setText("Das Feld ist besetzt...");
				}
			} else {
				FrameToSee.info.setForeground(Color.RED);
				FrameToSee.info.setText("Du bist nicht dran...");
			}
		} else if(e.getSource() == FrameToSee.FeldB) {
			if(KI.Wait == 0) {
				if(KI.FeldB == 0) {
			FrameToSee.info.setText("YellowPhoenix18 ist an der Reihe.");
			FrameToSee.FeldB.setText("X");
			KI.Round ++;
			KI.Wait = 1;
			FrameToSee.FeldB.setForeground(Color.BLUE);
			KI.FeldB = 1;
			KI.checkWinner();
			KI.getKI();
				} else {
					FrameToSee.info.setForeground(Color.RED);
					FrameToSee.info.setText("Das Feld ist besetzt...");
				}
			} else {
				FrameToSee.info.setForeground(Color.RED);
				FrameToSee.info.setText("Du bist nicht dran...");	
			}
		} else if(e.getSource() == FrameToSee.FeldC) {
			if(KI.Wait == 0) {
				if(KI.FeldC == 0) {
					FrameToSee.info.setText("YellowPhoenix18 ist an der Reihe.");
			FrameToSee.FeldC.setText("X");
			KI.Round ++;
			KI.Wait = 1;
			FrameToSee.FeldC.setForeground(Color.BLUE);
			KI.FeldC = 1;
			KI.checkWinner();
			KI.getKI();
				} else {
					FrameToSee.info.setForeground(Color.RED);
					FrameToSee.info.setText("Das Feld ist besetzt...");
				}
			} else {
				FrameToSee.info.setForeground(Color.RED);
				FrameToSee.info.setText("Du bist nicht dran...");
			}
		} else if(e.getSource() == FrameToSee.FeldD) {
			if(KI.Wait == 0) {
				if(KI.FeldD == 0) {
					FrameToSee.info.setText("YellowPhoenix18 ist an der Reihe.");
			FrameToSee.FeldD.setText("X");
			KI.Round ++;
			KI.Wait = 1;
			FrameToSee.FeldD.setForeground(Color.BLUE);
			KI.FeldD = 1;
			KI.checkWinner();
			KI.getKI();
				} else {
					FrameToSee.info.setForeground(Color.RED);
					FrameToSee.info.setText("Das Feld ist besetzt...");
				}
			} else {
				FrameToSee.info.setForeground(Color.RED);
				FrameToSee.info.setText("Du bist nicht dran...");
			}
		} else if(e.getSource() == FrameToSee.FeldE) {
			if(KI.Wait == 0) {
				if(KI.FeldE == 0) {
					FrameToSee.info.setText("YellowPhoenix18 ist an der Reihe.");
			FrameToSee.FeldE.setText("X");
			KI.Round ++;
			KI.Wait = 1;
			FrameToSee.FeldE.setForeground(Color.BLUE);
			KI.FeldE = 1;
			KI.checkWinner();
			KI.getKI();
				} else {
					FrameToSee.info.setForeground(Color.RED);
					FrameToSee.info.setText("Das Feld ist besetzt...");
				}
			} else {
				FrameToSee.info.setForeground(Color.RED);
				FrameToSee.info.setText("Du bist nicht dran...");
			}
		} else if(e.getSource() == FrameToSee.FeldF) {
			if(KI.Wait == 0) {
				if(KI.FeldF == 0) {
					FrameToSee.info.setText("YellowPhoenix18 ist an der Reihe.");
			FrameToSee.FeldF.setText("X");
			KI.Round ++;
			KI.Wait = 1;
			FrameToSee.FeldF.setForeground(Color.BLUE);
			KI.FeldF = 1;
			KI.checkWinner();
			KI.getKI();
				} else {
					FrameToSee.info.setForeground(Color.RED);
					FrameToSee.info.setText("Das Feld ist besetzt...");
				}
			} else {
				FrameToSee.info.setForeground(Color.RED);
				FrameToSee.info.setText("Du bist nicht dran...");
			}
		} else if(e.getSource() == FrameToSee.FeldG) {
			if(KI.Wait == 0) {
				if(KI.FeldG == 0) {
					FrameToSee.info.setText("YellowPhoenix18 ist an der Reihe.");
			FrameToSee.FeldG.setText("X");
			KI.Round ++;
			KI.Wait = 1;
			FrameToSee.FeldG.setForeground(Color.BLUE);
			KI.FeldG = 1;
			KI.checkWinner();
			KI.getKI();
				} else {
					FrameToSee.info.setForeground(Color.RED);
					FrameToSee.info.setText("Das Feld ist besetzt...");
				}
			} else {
				FrameToSee.info.setForeground(Color.RED);
				FrameToSee.info.setText("Du bist nicht dran...");
			}
		} else if(e.getSource() == FrameToSee.FeldH) {
			if(KI.Wait == 0) {
				if(KI.FeldH == 0) {
					FrameToSee.info.setText("YellowPhoenix18 ist an der Reihe.");
			FrameToSee.FeldH.setText("X");
			KI.Round ++;
			KI.Wait = 1;
			FrameToSee.FeldH.setForeground(Color.BLUE);
			KI.FeldH = 1;
			KI.checkWinner();
			KI.getKI();
				} else {
					FrameToSee.info.setForeground(Color.RED);
					FrameToSee.info.setText("Das Feld ist besetzt...");
				}
			} else {
				FrameToSee.info.setForeground(Color.RED);
				FrameToSee.info.setText("Du bist nicht dran...");
			}
		} else if(e.getSource() == FrameToSee.FeldI) {
			if(KI.Wait == 0) {
				if(KI.FeldI == 0) {
					FrameToSee.info.setText("YellowPhoenix18 ist an der Reihe.");
			FrameToSee.FeldI.setText("X");
			KI.Round ++;
			KI.Wait = 1;
			FrameToSee.FeldI.setForeground(Color.BLUE);
			KI.FeldI = 1;
			KI.checkWinner();
			KI.getKI();
				} else {
					FrameToSee.info.setForeground(Color.RED);
					FrameToSee.info.setText("Das Feld ist besetzt...");
				}
			} else {
				FrameToSee.info.setForeground(Color.RED);
				FrameToSee.info.setText("Du bist nicht dran...");
			}
		} else if(e.getSource() == FrameToSee.newGame) {
			FrameToSee.info.setText("Neues Spiel...");
			KI.newGame();
		} else if(e.getSource() == FrameToSee.absenden) {
			if(FrameToSee.eingabe.getText().length() <= 16) {
				KI.name = FrameToSee.eingabe.getText();
				FrameToSee.info.setText("Du heißt nun: " + KI.name);
			} else {
				FrameToSee.info.setText("Name zu lang...(maximal 16Zeichen)");
			}
		}
	}
}
