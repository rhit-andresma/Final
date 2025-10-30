package test;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.Timer;

//import game.GameAdvanceListener;
//import game.GameComponent;
//import game.Main;

public class Main {

	public static final int DELAY=10;
	
	public static void main(String[] args) {
		new Main();
	}

	public Main() {
		JFrame frame = new JFrame("Home");
		frame.setSize(500, 500);
		
		
		HomeComponent component = new HomeComponent();
		frame.add(component);
	
		JButton button = new JButton("Click me");
		frame.add(button, BorderLayout.SOUTH);
		//GameAdvanceListener advanceListener = new GameAdvanceListener(component);
		
		//Timer timer = new Timer(DELAY, advanceListener);
		//timer.start();

		button.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
			//	component.toggleBoxDirection();
			}
		});
		
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
}