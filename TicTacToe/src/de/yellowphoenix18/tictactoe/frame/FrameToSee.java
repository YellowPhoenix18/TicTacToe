package de.yellowphoenix18.tictactoe.frame;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;

public class FrameToSee extends JFrame {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	JLabel label;
	JLabel copyright;
	public static JLabel info;
	public static JButton FeldA;
	public static JButton FeldB;
	public static JButton FeldC;
	public static JButton FeldD;
	public static JButton FeldE;
	public static JButton FeldF;
	public static JButton FeldG;
	public static JButton FeldH;
	public static JButton FeldI;
	
	public static JTextArea eingabe;
	
	static JButton newGame;
	static JButton absenden;
	
	public static JLabel Losts;
	public static JLabel Wins;
	public static JLabel Fastest;
	
	public FrameToSee() {
		setVisible(true);
		setSize(630, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setTitle("TicTacToe");
		setResizable(false);
		setLayout(null);
		
		label = new JLabel("Software by YellowPhoenix18");
		label.setBounds(524, 400, 200, 15);
		add(label);
		
		copyright = new JLabel("©YellowPhoenix18");
		copyright.setBounds(5, 400, 200, 15);
		add(copyright);
		
		info = new JLabel("");
		info.setBounds(262, 10 , 375 , 30);
		add(info);
		
		Losts = new JLabel("");
		Losts.setBounds(262, 200 , 100 , 15);
		add(Losts);
		
		Wins = new JLabel("");
		Wins.setBounds(262, 215 , 100 , 15);
		add(Wins);
		
		Fastest = new JLabel("");
		Fastest.setBounds(262, 230 , 100 , 15);
		add(Fastest);
		
		FeldA = new JButton("A");
		FeldA.setBounds(10, 10, 80, 80);
		FeldA.addActionListener(new FrameListener());
		add(FeldA);
		
		FeldB = new JButton("B");
		FeldB.setBounds(95, 10, 80, 80);
		FeldB.addActionListener(new FrameListener());
		add(FeldB);
		
		FeldC = new JButton("C");
		FeldC.setBounds(180, 10, 80, 80);
		FeldC.addActionListener(new FrameListener());
		add(FeldC);
		
		FeldD = new JButton("D");
		FeldD.setBounds(10, 95, 80, 80);
		FeldD.addActionListener(new FrameListener());
		add(FeldD);
		
		FeldE = new JButton("E");
		FeldE.setBounds(95, 95, 80, 80);
		FeldE.addActionListener(new FrameListener());
		add(FeldE);
		
		FeldF = new JButton("F");
		FeldF.setBounds(180, 95, 80, 80);
		FeldF.addActionListener(new FrameListener());
		add(FeldF);
		
		FeldG = new JButton("G");
		FeldG.setBounds(10, 180, 80, 80);
		FeldG.addActionListener(new FrameListener());
		add(FeldG);
		
		FeldH = new JButton("H");
		FeldH.setBounds(95, 180, 80, 80);
		FeldH.addActionListener(new FrameListener());
		add(FeldH);
		
		FeldI = new JButton("I");
		FeldI.setBounds(180, 180, 80, 80);
		FeldI.addActionListener(new FrameListener());
		add(FeldI);
		
		newGame = new JButton("new Game");
		newGame.setBounds(280, 40, 150, 50);
		newGame.addActionListener(new FrameListener());
		add(newGame);
		
		absenden = new JButton("absenden");
		absenden.setBounds(350, 130, 200, 25);
		absenden.addActionListener(new FrameListener());
		add(absenden);
		
		eingabe = new JTextArea(1,20);
		eingabe.setText("Bitte gebe deinen Namen ein.");
		eingabe.setBounds(350, 100, 200, 25);
		eingabe.setLineWrap(true);
		eingabe.setWrapStyleWord(true);
		eingabe.setBackground(Color.WHITE);
		add(eingabe);
		repaint();
	}


}
