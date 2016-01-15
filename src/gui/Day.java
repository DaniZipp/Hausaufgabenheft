package gui;

import java.awt.Color;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Day extends JPanel implements ActionListener {
	private static final long serialVersionUID = 1L;
	
	private int [] high =  {30,30,30,30,30};
	private int nummer;
	private int [] yCord = {30,60,90,120,150};
	private boolean status = true;

	private JLabel ac_day;
	private JButton []add = new JButton [5];
	

	public Day(String day_name, String day_date,int nr) {
		
		this.nummer = nr;
		

		setLayout(null);
		setBounds(0, yCord[nummer], Toolkit.getDefaultToolkit().getScreenSize().width, high[nummer]);
		setBackground(Color.GRAY);

		ac_day = new JLabel(day_name + " " + day_date);
		ac_day.setForeground(Color.BLUE);
		ac_day.setBounds(10, 5, 120, 20);

		add[nummer] = new JButton("Hausaufgabe hinzufügen");
		add[nummer].setBackground(Color.GRAY);
		add[nummer].setForeground(Color.BLUE);
		add[nummer].setBounds(140, 5, 200, 20);
		add[nummer].addActionListener(this);

		add(ac_day);
		add(add[nummer]);

		setVisible(true);
	};

	private JLabel subject;
	private JLabel work;

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource() == add[0] && status == true) {
			
			yCord[1] = 90;
			
			status = false;
		}else{
			yCord[1] += 30;
		}
		
	}
		
	
	private void addWork1() {
		
		high[0] += 30;
		
		setSize(Toolkit.getDefaultToolkit().getScreenSize().width, high[0]);

		subject = new JLabel("Fach");
		subject.setBounds(10, 30, 80, 20);
		add(subject);

		work = new JLabel("Hausaufgabe");
		work.setBounds(100, 30, 120, 20);
		add(work);
		
		yCord[1] += 30;
	}

	private JTextField sub_text;
	private JTextField work_text;

	private void addWork2() {
		
		for(int ac = 0; ac <= nummer ;ac++){
			yCord[ac] += 30;	
		}
		high[nummer] += 30;
		setSize(Toolkit.getDefaultToolkit().getScreenSize().width, high[nummer]);

		sub_text = new JTextField();
		sub_text.setBounds(10, high[nummer] - 30, 60, 20);
		sub_text.setBackground(Color.GRAY);
		sub_text.setForeground(Color.WHITE);
		add(sub_text);
		
		work_text = new JTextField();
		work_text.setBounds(100, high[nummer] - 30, 200 , 20);
		work_text.setBackground(Color.GRAY);
		work_text.setForeground(Color.WHITE);
		add(work_text);
		
		

	}

}
