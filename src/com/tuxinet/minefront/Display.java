package com.tuxinet.minefront;

import java.awt.Canvas;
import javax.swing.JFrame;

public class Display extends Canvas {

	private static final long serialVersionUID = 1L;
	public static final int WIDTH = 800;
	public static final int HEIGHT = 600;
	public static final String TITLE = "Minefront Pre-Alpha 0.01";
	
	private Thread thread;
	private boolean running = false;
	
	private void start() {
		if (running) return;
	}
	
	public static void main(String[] args) {
		Display game = new Display();
		JFrame frame = new JFrame();
		frame.add(game);
		frame.pack();
		frame.setSize(WIDTH, HEIGHT);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		frame.setTitle(TITLE);
		frame.setResizable(false);
		frame.setVisible(true);
	}
	
}
