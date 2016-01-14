package gui;



import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Window {

	// erstellen von Frame (_frame) und Panel (_haupt) 
	private JFrame _frame;
	
	
	private Dimension _size = new Dimension(Toolkit.getDefaultToolkit().getScreenSize().width, Toolkit.getDefaultToolkit().getScreenSize().height);		//erstellen von _size zur leichteren Einstellung

	Menu _menu = new Menu();	//erstellen des _object (benötigt für Zugriff auf Klasse Object)
	
	data.test test = new data.test();
	private JPanel _day = new Day(test.day[0], test.date[0] , 35);

	public void init(String name) {
		_frame = new JFrame(name);
		
		_frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		_frame.setSize(_size);
		_frame.setPreferredSize(_size);
		
		_frame.setResizable(true);
		_frame.setLayout(null);
		
		
		_menu.init();
		_menu.show(_frame);
		
		_frame.add(_day);
	
		_frame.pack();
		_frame.setVisible(true);
	}
	
	public void update()
	{
		_frame.repaint();
	}
	
}
