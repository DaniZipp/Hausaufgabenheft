package gui;



import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JFrame;

public class Window {

	// erstellen von Frame (_frame) und Panel (_haupt) 
	private JFrame _frame;
	
	
	private Dimension _size = new Dimension(Toolkit.getDefaultToolkit().getScreenSize().width, Toolkit.getDefaultToolkit().getScreenSize().height);		//erstellen von _size zur leichteren Einstellung

	Menu _menu = new Menu();	//erstellen des _object (ben�tigt f�r Zugriff auf Klasse Object)
	Day _day = new Day();


	public void init(String name) {
		_frame = new JFrame(name);
		_frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		_frame.setSize(_size);
		_frame.setResizable(true);
		_frame.setVisible(true);
		_frame.setLayout(null);
		_frame.pack();
		
		_menu.init();
		_menu.show(_frame);
		
		_day.init();
		_day.show(_frame);
		
		
		

			
		
		
		
		
		
		
		
		
		

	}
	
}
