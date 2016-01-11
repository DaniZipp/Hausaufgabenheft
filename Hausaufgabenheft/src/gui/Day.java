package gui;

import java.awt.Color;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Day {

	data.test test = new data.test();

	private JLabel[] ac_day = new JLabel[5];
	private JPanel[] day = new JPanel[5];
	private JButton[] add = new JButton[5];

	int y = 35;
	int[] h = { 30, 30, 30, 30, 30 };

	public void init() {

		for (int d = 0; d <= 4; d++) {

			day[d] = new JPanel();
			day[d].setLayout(null);
			day[d].setBounds(0, y, Toolkit.getDefaultToolkit().getScreenSize().width, h[d]);
			day[d].setBackground(Color.GRAY);
			day[d].setVisible(true);

			ac_day[d] = new JLabel(test.day[d] + " " + test.date[d]);
			ac_day[d].setForeground(Color.BLUE);
			ac_day[d].setBounds(10, 5, 120, 20);

			add[d] = new JButton("Hausaufgabe hinzufügen");
			add[d].setBackground(Color.GRAY);
			add[d].setForeground(Color.BLUE);
			add[d].setBounds(140, 5, 200, 20);
			add[d].addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent event) {
					
					
				}
			});

			day[d].add(ac_day[d]);
			day[d].add(add[d]);

			y = y + h[d] + 5;
		}

	};

	public void show(JFrame frame) {
		for (int d = 0; d <= 4; d++) {
			frame.add(day[d]);
		}
	};
	
}
