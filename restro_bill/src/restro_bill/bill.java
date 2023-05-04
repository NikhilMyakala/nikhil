package restro_bill;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Color;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class bill {

	private JFrame frame;
	private JTextField t1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					bill window = new bill();
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
	public bill() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.PINK);
		frame.setBounds(100, 100, 403, 445);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Resto bill");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblNewLabel.setBounds(192, 11, 164, 44);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Menu :");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_1.setBounds(42, 137, 155, 51);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Quantity :");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_2.setBounds(41, 199, 121, 60);
		frame.getContentPane().add(lblNewLabel_2);
		
		JComboBox c1 = new JComboBox();
		c1.setModel(new DefaultComboBoxModel(new String[] {"select", "biryani-Rs.150", "chicken rice-Rs.70", "noodles -Rs.50"}));
		c1.setBounds(171, 155, 164, 22);
		frame.getContentPane().add(c1);
		
		t1 = new JTextField();
		t1.setBounds(171, 223, 165, 20);
		frame.getContentPane().add(t1);
		t1.setColumns(10);
		
		JButton btnNewButton = new JButton("order");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
			
			String item=(String)c1.getSelectedItem();
			String qnty=t1.getText();
			int q=Integer.parseInt(qnty);
			int bill=0;
			if (item.equals("biryani-Rs.150"))
			{
				bill=q*150;
				JOptionPane.showMessageDialog(btnNewButton, "Hello sir \n Selected item:"+item+"\nqnty"+q+"\nyourbill:"+bill);
			}
			else if(item.equals("chicken rice-Rs.70"))
			{
				bill=q*70;
				JOptionPane.showMessageDialog(btnNewButton, "Hello sir \n Selected item:"+item+"\nqnty"+q+"\nyourbill:"+bill);
			}
			else if(item.equals("noodles -Rs.50"))
			{
				bill=q*149;
				JOptionPane.showMessageDialog(btnNewButton, "Hello sir \n Selected item:"+item+"\nqnty"+q+"\nyourbill:"+bill);
			}
			
			
		}
			
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 20));
	btnNewButton.setBounds(121, 299, 110, 33);
		frame.getContentPane().add(btnNewButton);
	}
}
