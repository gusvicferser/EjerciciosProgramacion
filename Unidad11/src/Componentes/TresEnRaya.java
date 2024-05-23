package Componentes;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TresEnRaya extends JFrame implements ActionListener {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JButton[][] buttons = new JButton[3][3];
	private JButton botonPulsado;
	private int jugador = 1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TresEnRaya frame = new TresEnRaya();
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
	public TresEnRaya() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 501, 501);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new GridLayout(3, 3));

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				buttons[i][j] = new JButton();
				getContentPane().add(buttons[i][j]);
				buttons[i][j].addActionListener(this);
			}
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		botonPulsado = (JButton) e.getSource();
		
		if (jugador % 2 != 0 && jugador != 10) {
			
			botonPulsado.setBackground(Color.MAGENTA);
//			Desactivar el botón pulsado:
			botonPulsado.setEnabled(false);
			finJuego();
			
		} else {
			
			botonPulsado.setBackground(Color.ORANGE);
			botonPulsado.setEnabled(false);
			finJuego();
			
		}

		finJuego();
		jugador++;

	}

	private void finJuego() {
		
		
		
	}

}
