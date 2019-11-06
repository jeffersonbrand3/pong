import java.awt.Color;

import javax.swing.JFrame;

public class Pong extends JFrame{
	private final static int PLAYING_AREA_WIDTH = 700, PLAYING_AREA_HEIGHT = 450;
	private PongPanel panel;
	private Pong game;
	
	public Pong() {
		setSize(PLAYING_AREA_WIDTH, PLAYING_AREA_HEIGHT);
		setTitle("Pong");
		setBackground(Color.BLACK);
		setResizable(false);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		game = new Pong();
		game.start();
		panel = new PongPanel(this);
		add(panel);
	}
	
	private Pong start() {
		// TODO Auto-generated method stub
		return game;
		
	}

	public PongPanel getPanel() {
		return panel;
	}
	
	public static void main(String[] args) {
		new Pong();
	}

}
