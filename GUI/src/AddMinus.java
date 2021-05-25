import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class AddMinus {

	private JFrame frame;
	private JTextField AddField;
	private JTextField MinusField;
	private JTextField AnswerField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AddMinus window = new AddMinus();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public AddMinus() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(216, 191, 216));
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton AddButton = new JButton("ADD");
		AddButton.setBackground(new Color(147, 112, 219));
		AddButton.setForeground(new Color(0, 0, 0));
		AddButton.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 20));
		AddButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent argO) {
				int num1, num2, ans;
				try {
					num1=Integer.parseInt(AddField.getText());
					num2=Integer.parseInt(MinusField.getText());
					
				ans=num1+num2;
				AnswerField.setText(Integer.toString(ans));
				}catch(Exception e) {
					
					JOptionPane.showMessageDialog(null, "Error! Please enter valid number.");
				}
			}
		});
		AddButton.setBounds(161, 66, 94, 39);
		frame.getContentPane().add(AddButton);
		
		JButton MinusButton = new JButton("MINUS");
		MinusButton.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 20));
		MinusButton.setBackground(new Color(147, 112, 219));
		MinusButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			int num1, num2, ans;
			try {
				num1=Integer.parseInt(AddField.getText());
				num2=Integer.parseInt(MinusField.getText());
				
			ans=num1-num2;
			AnswerField.setText(Integer.toString(ans));
			}catch(Exception e1) {
				
				JOptionPane.showMessageDialog(null, "Error! Please enter valid number.");
			}
		  }
		});
		MinusButton.setBounds(161, 116, 94, 39);
		frame.getContentPane().add(MinusButton);
		
		AddField = new JTextField();
		AddField.setBackground(new Color(221, 160, 221));
		AddField.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
		AddField.setHorizontalAlignment(SwingConstants.CENTER);
		AddField.setBounds(24, 22, 136, 34);
		frame.getContentPane().add(AddField);
		AddField.setColumns(10);
		
		MinusField = new JTextField();
		MinusField.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
		MinusField.setHorizontalAlignment(SwingConstants.CENTER);
		MinusField.setBackground(new Color(221, 160, 221));
		MinusField.setBounds(253, 23, 136, 32);
		frame.getContentPane().add(MinusField);
		MinusField.setColumns(10);
		
		JLabel AnswerLabel = new JLabel("Answer : ");
		AnswerLabel.setHorizontalAlignment(SwingConstants.CENTER);
		AnswerLabel.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 20));
		AnswerLabel.setBounds(44, 206, 166, 33);
		frame.getContentPane().add(AnswerLabel);
		
		AnswerField = new JTextField();
		AnswerField.setFont(new Font("Comic Sans MS", Font.BOLD, 21));
		AnswerField.setHorizontalAlignment(SwingConstants.CENTER);
		AnswerField.setBackground(new Color(211, 211, 211));
		AnswerField.setBounds(171, 206, 136, 29);
		frame.getContentPane().add(AnswerField);
		AnswerField.setColumns(10);
	}
}
