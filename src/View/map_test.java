package View;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class map_test extends JFrame{
	
	private backPanel background = new backPanel();
	ImageIcon cha_icon = new ImageIcon("./image/character.jpg");
	JLabel lbl = new JLabel();
	
	map_test(){
		//배경화면 설정
		this.setTitle("test background");
		this.setLayout(null);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setContentPane(background);
		this.setSize(640,480);
		this.setVisible(true);
		
		lbl.setLayout(null);
		lbl.setIcon(cha_icon);
		lbl.setLocation(0,0);
		lbl.setSize(100,100);
		
		this.add(lbl);
		
		this.addKeyListener(new KeyAdapter() {
			public void keyPressed(KeyEvent e){
			    switch(e.getKeyCode()){
			     case KeyEvent.VK_UP:
			    	 lbl.setLocation(lbl.getX(), lbl.getY()-100);
			    	 break;
			     case KeyEvent.VK_DOWN:
			    	 lbl.setLocation(lbl.getX(), lbl.getY()+100);
			    	 break;
			     case KeyEvent.VK_LEFT:
			    	 lbl.setLocation(lbl.getX()-100,lbl.getY());
			    	 break;
			     case KeyEvent.VK_RIGHT:
			    	 lbl.setLocation(lbl.getX()+100, lbl.getY());
			    	 break;
			    }
			} 
		});
		this.setVisible(true);
	}
	
	class backPanel extends JPanel{
		private ImageIcon icon = new ImageIcon("./image/background.jpg");
		private Image img = icon.getImage();
		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.drawImage(img, 0, 0, getWidth(), getHeight(), this);
		}
	}
	
	
	public static void main(String[] args) {
		new map_test();
		
	}

}
