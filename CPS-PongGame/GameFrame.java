package Javapong;
import java.awt.*;
import javax.swing.JPanel;

import java.awt.event.*;
import java.util.*;
import javax.swing.*;

public class GameFrame extends JFrame{
	
	GamePanel panel;
	
	GameFrame(){
		panel = new GamePanel(); 
			this.add(panel);
			this.setTitle("Pong Game");
			this.setResizable(false);
			this.setBackground(Color.green);
			this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			this.pack();
			this.setVisible(true);
			this.setLocationRelativeTo(null);
			
		
	}
	

}

