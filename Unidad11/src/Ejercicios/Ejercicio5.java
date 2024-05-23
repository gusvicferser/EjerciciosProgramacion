package Ejercicios;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JSlider;
import javax.swing.JButton;

public class Ejercicio5 extends JFrame implements ActionListener{

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JSlider slider;
	private JButton btnNumRandom;

	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ejercicio5 frame = new Ejercicio5();
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
	public Ejercicio5() {
		setTitle("NUMERO ALEATORIO");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(650, 350, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblRango = new JLabel("Seleccione el rango máximo para el número aleatorio");
		lblRango.setFont(new Font("Dialog", Font.BOLD, 14));
		lblRango.setBounds(35, 26, 375, 35);
		contentPane.add(lblRango);
		
		slider = new JSlider();
		slider.setMinimum(1);
		slider.setMinorTickSpacing(5);
		slider.setMajorTickSpacing(11);
		slider.setSnapToTicks(true);
		slider.setPaintLabels(true);
		slider.setBounds(35, 73, 375, 37);
		contentPane.add(slider);
		
		btnNumRandom = new JButton("NUMERO ALEATORIO");
		btnNumRandom.setBounds(132, 137, 188, 71);
		btnNumRandom.addActionListener(this);
		contentPane.add(btnNumRandom);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource()==btnNumRandom) {
			
			int numMax = slider.getValue();
			
			int aleatorio = (int) (Math.random()*(numMax+1));
			
			JOptionPane.showMessageDialog(null, aleatorio);
		}
		
		
	}
}
