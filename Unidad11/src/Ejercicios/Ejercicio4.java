package Ejercicios;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class Ejercicio4 extends JFrame implements ActionListener{

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtDNI;
	JButton btnCalcular;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ejercicio4 frame = new Ejercicio4();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Ejercicio4() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(650, 350, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txtDNI = new JTextField();
		txtDNI.setBounds(134, 83, 171, 21);
		contentPane.add(txtDNI);
		txtDNI.setColumns(10);
		
		JLabel lblCalculeSuLetra = new JLabel("CALCULE SU LETRA DEL DNI");
		lblCalculeSuLetra.setFont(new Font("Dialog", Font.BOLD, 20));
		lblCalculeSuLetra.setBounds(82, 12, 277, 59);
		contentPane.add(lblCalculeSuLetra);
		
		btnCalcular = new JButton("Calcular");
		btnCalcular.setBounds(167, 133, 105, 27);
		btnCalcular.addActionListener(this);
		contentPane.add(btnCalcular);
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		if(e.getSource()==btnCalcular) {
			
			try {
				
			char letra = ' ';	
			int calculoLetra = (Integer.parseInt(txtDNI.getText()))%23;
			
			switch(calculoLetra) {
			case 0:
				letra='T';
				break;
			case 1:
				letra='R';
				break;
			case 2:
				letra='W';
				break;
			case 3:
				letra='A';
				break;
			case 4:
				letra='G';
				break;
			case 5:
				letra='M';
				break;
			case 6:
				letra='Y';
				break;
			case 7:
				letra='F';
				break;
			case 8:
				letra='P';
				break;
			case 9:
				letra='D';
				break;
			case 10:
				letra='X';
				break;
			case 11:
				letra='B';
				break;
			case 12:
				letra='N';
				break;
			case 13:
				letra='J';
				break;
			case 14:
				letra='Z';
				break;
			case 15:
				letra='S';
				break;
			case 16:
				letra='Q';
				break;
			case 17:
				letra='V';
				break;
			case 18:
				letra='H';
				break;
			case 19:
				letra='L';
				break;
			case 20:
				letra='C';
				break;
			case 21:
				letra='K';
				break;
			case 22:
				letra='E';
				break;
			}
			
			String dni = txtDNI.getText() + letra;
			
			JOptionPane.showMessageDialog(null, "Su dni con letra es: " + dni);
			
			
			} catch (IllegalArgumentException iae) {
				JOptionPane.showMessageDialog(null, "No ha introducido un número");
			}
			
			
		}
	}
}
