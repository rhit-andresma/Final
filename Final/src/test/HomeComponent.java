package test;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JComponent;

public class HomeComponent extends JComponent {
	@Override
	protected void paintComponent(Graphics g) {
	super.paintComponent(g);
	Graphics2D graphics2 = (Graphics2D) g;
	background(graphics2);
	}
	
	public void background(Graphics2D graphics2) {
		Color og = graphics2.getBackground();
		graphics2.setColor(new Color(237,201,175));
		//graphics2.setColor(og);
	}
}
