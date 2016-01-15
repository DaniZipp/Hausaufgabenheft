package gui;

import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Window {
	
	Menu _menu = new Menu(); 
	data.test test = new data.test();
	
	private JFrame _frame;
	private Dimension _size = new Dimension(Toolkit.getDefaultToolkit().getScreenSize().width, Toolkit.getDefaultToolkit().getScreenSize().height); 
	
	
	private JPanel _day0 = new Day(test.day[0], test.date[0], 0);
	private JPanel _day1 = new Day(test.day[1],test.date[1],1);

	public void init(String name) {
		_frame = new JFrame(name);

		_frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		_frame.setSize(_size);
		_frame.setPreferredSize(_size);

		_frame.setResizable(true);
		_frame.setLayout(null);

		_menu.init();
		_menu.show(_frame);

		_frame.add(_day0);
		_frame.add(_day1);

		_frame.pack();
		_frame.setVisible(true);
	}

	public void update() {
		_frame.repaint();
	}

}
