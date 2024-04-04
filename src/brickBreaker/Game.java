package brickBreaker;

import javax.swing.JFrame;


public class Game {
	
//	Game() {
//		JFrame obj = new JFrame();
//		GamePlay gameplay = new GamePlay();
//		obj.setBounds(10, 10, 700, 600);
//		obj.setTitle("Breakout Ball");
//		obj.setResizable(false);
//		obj.setVisible(true);
//		obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//		obj.add(gameplay);
//		
//	}

	public static void main(String[] args) {
//		new Game();
		JFrame obj = new JFrame();
		GamePlay gameplay = new GamePlay();
		obj.setBounds(10, 10, 700, 600);
		obj.setTitle("Breakout Ball");
		obj.setResizable(false);
		obj.setVisible(true);
		obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		obj.add(gameplay);
	}
	
}
