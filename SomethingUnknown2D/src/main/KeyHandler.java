package main;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class KeyHandler implements KeyListener{
	
	public boolean upPressed, downPressed, leftPressed, rightPressed;

	@Override
	public void keyTyped(KeyEvent e) {	
	}

	@Override
	public void keyPressed(KeyEvent e) {
		
		int code = e.getKeyCode();
		
		if(code == e.VK_W) {
			upPressed = true;
			
		}
		
		if(code == e.VK_S) {
			downPressed = true;
			
		}
		
		if(code == e.VK_A) {
			leftPressed = true;
			
		}
		
		if(code == e.VK_D) {
			rightPressed = true;
			
		}
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		
		int code = e.getKeyCode();
		
		if(code == e.VK_W) {
			upPressed = false;
			
		}
		
		if(code == e.VK_S) {
			downPressed = false;
			
		}
		
		if(code == e.VK_A) {
			leftPressed = false;
			
		}
		
		if(code == e.VK_D) {
			rightPressed = false;
			
		}
		
	}

}
