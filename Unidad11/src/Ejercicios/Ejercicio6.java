package Ejercicios;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.ImageIcon;
import javax.swing.JButton;

public class Ejercicio6 extends JFrame implements ActionListener{

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JButton btnD4, btnD6, btnD8, btnD12, btnD20;
	private int aleatorio;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ejercicio6 frame = new Ejercicio6();
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
	public Ejercicio6() {
		setTitle("LANZADOR DE DADOS");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 873, 564);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		btnD8 = new JButton("1D8");
		ImageIcon iconoD8 = new ImageIcon("/home/gusferser/eclipse-workspace/Unidad11/src/Ejercicios/1d8.png");
		btnD8.setIcon(iconoD8);
		btnD8.setBounds(107, 225, 189, 144);
		btnD8.addActionListener(this);
		contentPane.add(btnD8);
		
		btnD12 = new JButton("1D12");
		ImageIcon iconoD12 = new ImageIcon("/home/gusferser/eclipse-workspace/Unidad11/src/Ejercicios/1d12.png");
		btnD12.setIcon(iconoD12);
		btnD12.setBounds(588, 225, 189, 144);
		btnD12.addActionListener(this);
		contentPane.add(btnD12);
		
		btnD20 = new JButton("1D20");
		ImageIcon iconoD20 = new ImageIcon("/home/gusferser/eclipse-workspace/Unidad11/src/Ejercicios/1d20.png");
		btnD20.setIcon(iconoD20);
		btnD20.setBounds(353, 375, 189, 144);
		btnD20.addActionListener(this);
		contentPane.add(btnD20);
		
		btnD4 = new JButton("1D4");
		ImageIcon iconoD4 = new ImageIcon("/home/gusferser/eclipse-workspace/Unidad11/src/Ejercicios/1d4.png");
		btnD4.setIcon(iconoD4);
		btnD4.setBounds(207, 54, 189, 144);
		btnD4.addActionListener(this);
		contentPane.add(btnD4);
		
		btnD6 = new JButton("1D6");
		ImageIcon iconoD6 = new ImageIcon("/home/gusferser/eclipse-workspace/Unidad11/src/Ejercicios/1d6.png");
		btnD6.setIcon(iconoD6);
		btnD6.setBounds(497, 54, 189, 144);
		btnD6.addActionListener(this);
		contentPane.add(btnD6);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
	
		if(e.getSource()==btnD4) {
			
			aleatorio=numAleatorio(4);
			
			JOptionPane.showMessageDialog(null, aleatorio);
			
		}
		
		if(e.getSource()==btnD6) {
			
			aleatorio = numAleatorio(6);
			
			JOptionPane.showMessageDialog(null, aleatorio);
			
		}
		
		if(e.getSource()==btnD8) {
			
			aleatorio = numAleatorio(8);
			
			JOptionPane.showMessageDialog(null, aleatorio);
		}
		
		if(e.getSource()==btnD12) {
			
			aleatorio = numAleatorio(12);
			
			JOptionPane.showMessageDialog(null, aleatorio);
		}
		
		if(e.getSource()==btnD20) {
			
			aleatorio = numAleatorio(20);
			
			JOptionPane.showMessageDialog(null, aleatorio);
		}
		
	}
	
	public int numAleatorio(int max) {
		
		return (int) (Math.random()*(max)+1);
	}

}
