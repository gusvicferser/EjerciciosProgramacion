package Componentes;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.border.EmptyBorder;

public class CalculadoraSimple extends JFrame implements ActionListener {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtOperador1;
	private JTextField txtOperador2;
	JButton btnSuma, btnMult;
	JLabel lblResultado;
	private JTextField textField;
	private JLabel lblOperador2;
	private JButton btnResta;
	private JButton btnDivision;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CalculadoraSimple frame = new CalculadoraSimple();
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
	public CalculadoraSimple() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 517);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(117, 80, 123));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblOperador1 = new JLabel("Operador-inator");
		lblOperador1.setForeground(new Color(252, 175, 62));
		lblOperador1.setBackground(new Color(238, 238, 238));
		lblOperador1.setFont(new Font("FreeSans", Font.BOLD, 20));
		lblOperador1.setBounds(43, 59, 159, 27);
		contentPane.add(lblOperador1);

		txtOperador1 = new JTextField();
		txtOperador1.setToolTipText("");
		txtOperador1.setHorizontalAlignment(SwingConstants.RIGHT);
		txtOperador1.setBounds(60, 98, 114, 21);
		contentPane.add(txtOperador1);
		txtOperador1.setColumns(15);

		txtOperador2 = new JTextField();
		txtOperador2.setText("0");
		txtOperador2.setHorizontalAlignment(SwingConstants.RIGHT);
		txtOperador2.setColumns(15);
		txtOperador2.setBounds(247, 98, 114, 21);
		contentPane.add(txtOperador2);

		btnSuma = new JButton("Suma");
		btnSuma.setBackground(new Color(252, 175, 62));
		btnSuma.setBounds(60, 144, 114, 27);
		btnSuma.addActionListener(this);
		contentPane.add(btnSuma);

		btnMult = new JButton("Multiplica");
		btnMult.setBackground(new Color(252, 175, 62));
		btnMult.setBounds(247, 144, 114, 27);
		btnMult.addActionListener(this);
		contentPane.add(btnMult);
		
		btnResta = new JButton("Resta");
		btnResta.setBackground(new Color(252, 175, 62));
		btnResta.setBounds(60, 189, 114, 27);
		btnResta.addActionListener(this);
		contentPane.add(btnResta);
		
		btnDivision = new JButton("División");
		btnDivision.setBackground(new Color(252, 175, 62));
		btnDivision.setBounds(247, 189, 114, 27);
		btnDivision.addActionListener(this);
		contentPane.add(btnDivision);

		lblResultado = new JLabel("RESULTADO");
		lblResultado.setForeground(new Color(252, 175, 62));
		lblResultado.setHorizontalAlignment(SwingConstants.CENTER);
		lblResultado.setFont(new Font("FreeSans", Font.BOLD, 16));
		lblResultado.setBounds(153, 243, 107, 27);
		contentPane.add(lblResultado);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(153, 277, 107, 21);
		contentPane.add(textField);
		
		lblOperador2 = new JLabel("Operador-inator");
		lblOperador2.setForeground(new Color(252, 175, 62));
		lblOperador2.setFont(new Font("FreeSans", Font.BOLD, 20));
		lblOperador2.setBounds(232, 59, 159, 27);
		contentPane.add(lblOperador2);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnSuma) {
			try {
			int num1 = Integer.parseInt(txtOperador1.getText());
			int num2 = Integer.parseInt(txtOperador2.getText());
			int suma = num1 + num2;
			textField.setText("" + suma);
			} catch (NumberFormatException ex) {
				JOptionPane.showMessageDialog(null,"Alerta Letra");
			}
		} else if (e.getSource()==btnMult) {
			try {
			int num1 = Integer.parseInt(txtOperador1.getText());
			int num2 = Integer.parseInt(txtOperador2.getText());
			int multiplica = num1 * num2;
			textField.setText("" + multiplica);
		} catch (NumberFormatException ex) {
			JOptionPane.showMessageDialog(null,"Alerta Letra");
		}
		} else if (e.getSource()==btnResta) {
			try {
			int num1 = Integer.parseInt(txtOperador1.getText());
			int num2 = Integer.parseInt(txtOperador2.getText());
			int resta = num1 - num2;
			textField.setText("" + resta);
		} catch (NumberFormatException ex) {
			JOptionPane.showMessageDialog(null,"Alerta Letra");
		}
		} else if (e.getSource()==btnDivision) {
			try {
			int num1 = Integer.parseInt(txtOperador1.getText());
			int num2 = Integer.parseInt(txtOperador2.getText());
			if(num2!=0) {
				double division = num1 / num2;
				textField.setText("" + division);
			} else {
				JOptionPane.showMessageDialog(null, "El divisor nunca puede ser cero");
			}
			
			} catch (NumberFormatException ex) {
				JOptionPane.showMessageDialog(null,"Alerta Letra");
			}
		}
	}
}
