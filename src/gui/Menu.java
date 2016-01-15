package gui;

import java.awt.Color;
import java.awt.Toolkit;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.KeyStroke;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.ImageIcon;

public class Menu {

	private JPanel pop;

	private ImageIcon icon_exit;

	private JMenuBar bar;

	private JMenu start;
	private JMenuItem save;
	private JMenuItem exit;

	private JMenu week;
	private JMenuItem next;
	private JMenuItem last;

	public void init() { // erstellen der Methode init()

		pop = new JPanel();

		bar = new JMenuBar();
		bar.setSize(Toolkit.getDefaultToolkit().getScreenSize().width, 30);
		bar.setBackground(Color.GRAY);

		start = new JMenu("Start");
		start.setMnemonic(KeyEvent.VK_F);

		save = new JMenuItem("speichern");
		save.setToolTipText("Speicher hier dein Hausaufgabenheft");
		save.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, ActionEvent.CTRL_MASK));
		save.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent event) {
				JOptionPane.showMessageDialog(pop, "Gespeichert.", "Information", JOptionPane.INFORMATION_MESSAGE);
			}
		});

		icon_exit = new ImageIcon("exit.png");
		exit = new JMenuItem("schlieﬂen", icon_exit);
		exit.setMnemonic(KeyEvent.VK_E);
		exit.setToolTipText("Hausaufgabenheft schlieﬂen");
		exit.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent event) {
				System.exit(0);
			}
		});

		start.add(save);
		start.add(exit);

		week = new JMenu("Woche wechseln");

		next = new JMenuItem("n‰chste Woche");
		next.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_D, ActionEvent.CTRL_MASK));
		next.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent event) {
				JOptionPane.showMessageDialog(pop, "Gewechselt zu n‰chste Woche.", "Information",
						JOptionPane.INFORMATION_MESSAGE);
			}
		});

		last = new JMenuItem("letzte Woche");
		last.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_A, ActionEvent.CTRL_MASK));
		last.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent event) {
				JOptionPane.showMessageDialog(pop, "Gewechselt zu letzte Woche.", "Information",
						JOptionPane.INFORMATION_MESSAGE);
			}
		});

		week.add(next);
		week.add(last);

		bar.add(start);
		bar.add(week);

	}

	public void show(JFrame frame) {

		frame.add(bar);

	}

}
