package Ejercicios;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;

public class Ejercicio1 extends JFrame implements ActionListener{

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtValor;
	private JButton btnComprobar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ejercicio1 frame = new Ejercicio1();
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
	public Ejercicio1() {
		setResizable(false);
		setTitle("¿PAR O IMPAR?");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(650, 350, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txtValor = new JTextField();
		txtValor.setBounds(150, 61, 131, 38);
		contentPane.add(txtValor);
		txtValor.setColumns(10);
		
		btnComprobar = new JButton("COMPROBAR");
		btnComprobar.setBounds(150, 121, 131, 27);
		btnComprobar.addActionListener(this);
		contentPane.add(btnComprobar);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource()==btnComprobar) {
			
			try {
				
				int compruebaNum = Integer.parseInt(txtValor.getText());
				
				if(compruebaNum%2==0) {
					JOptionPane.showMessageDialog(null, "PAR");
				} else {
					JOptionPane.showMessageDialog(null, "IMPAR");
				}
				
				
				
			} catch (IllegalArgumentException iae) {
				JOptionPane.showMessageDialog(null, "No ha introducido un número, vuelva a probar");
			}
			
			
		}
		
	}
	
	
}
