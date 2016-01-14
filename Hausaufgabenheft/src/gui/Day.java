package gui;

import java.awt.Color;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Day extends JPanel {

	private int high = 30;
	private int y;
	private boolean status = true;
	

	private JLabel ac_day;
	private JButton add;
	
	public Day(String day_name, String day_date, int y) {
		
			this.y = y;

			setLayout(null);
			setBounds(0, y, Toolkit.getDefaultToolkit().getScreenSize().width, high);
			setBackground(Color.GRAY);
			
			ac_day = new JLabel(day_name + " " + day_date);
			ac_day.setForeground(Color.BLUE);
			ac_day.setBounds(10, 5, 120, 20);

			add = new JButton("Hausaufgabe hinzufügen");
			add.setBackground(Color.GRAY);
			add.setForeground(Color.BLUE);
			add.setBounds(140, 5, 200, 20);
			add.addActionListener(new ActionListener() {
				
				public void actionPerformed(ActionEvent event) {
					if(status == true){
						addWork1();
						status = false;
					}else{
						addWork2();
					}
					
					
				}	
			});

			add(ac_day);
			add(add);

			setVisible(true);
	};
	
	private JLabel subject;
	private JLabel work;
	
	private void addWork1(){
		high += 30;
		setSize(Toolkit.getDefaultToolkit().getScreenSize().width, high);
		
		subject = new JLabel("Fach");
		subject.setBounds(10, 30, 80, 20);
		add(subject);
		
		work = new JLabel("Hausaufgabe");
		work.setBounds(100, 30, 120, 20);
		add(work);
	}
	
	private JTextField sub_text;
	private JTextField work_text;
	
	private void addWork2(){
		high += 30;
		setSize(Toolkit.getDefaultToolkit().getScreenSize().width, high);
		
		sub_text = new JTextField();
		
	}

}
