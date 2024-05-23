package Componentes;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.util.ArrayList;

import javax.swing.*;

public class Agenda extends JFrame implements ActionListener {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtNombreContacto;
	private JTextField txtNumTelefono;
	JButton btnNuevoContacto;
	JComboBox comboBox;
	static ArrayList<Contacto> listaContactos = new ArrayList<Contacto>();
	private JButton btnSave, btnLoad;
	JMenu mnExit;
	JMenuItem mntmGuardarAgenda, mntmRecuperarAgenda;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Agenda frame = new Agenda();
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
	public Agenda() {
		setFont(new Font("DejaVu Sans", Font.PLAIN, 16));
		setTitle("AGENDA SIMPLE");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(700, 350, 500, 350);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblNuevoNombre = new JLabel("NUEVO NOMBRE");
		lblNuevoNombre.setBounds(25, 68, 121, 17);
		contentPane.add(lblNuevoNombre);

		JLabel lblNuevoTeléfono = new JLabel("NUEVO TELÉFONO");
		lblNuevoTeléfono.setBounds(25, 103, 121, 17);
		contentPane.add(lblNuevoTeléfono);

		txtNombreContacto = new JTextField();
		txtNombreContacto.setBounds(156, 66, 188, 21);
		contentPane.add(txtNombreContacto);
		txtNombreContacto.setColumns(10);

		txtNumTelefono = new JTextField();
		txtNumTelefono.setColumns(10);
		txtNumTelefono.setBounds(156, 101, 188, 21);
		contentPane.add(txtNumTelefono);

		btnNuevoContacto = new JButton("AÑADIR"); // Hay que añadir el JButton declarado al inicio.
		btnNuevoContacto.setBounds(356, 61, 108, 59);
		btnNuevoContacto.addActionListener(this); // He de pasarle como objeto la propia instancia de Agenda (a sí
													// mismo) ya que necesita un objeto que haga una acción.
		contentPane.add(btnNuevoContacto);

//		Muestra la información del array:
		comboBox = new JComboBox(); // Hay que añadirlo también al principio declarado para poder usarlo en
									// actionPerformed
		comboBox.setBounds(25, 156, 439, 26);
		contentPane.add(comboBox);

		btnSave = new JButton("GUARDAR EN DISCO");
		btnSave.setBounds(25, 221, 182, 59);
		btnSave.addActionListener(this); // Hay que decirle que le pasamos la clase agenda
		contentPane.add(btnSave);

		btnLoad = new JButton("RECUPERAR AGENDA");
		btnLoad.setBounds(282, 221, 182, 59);
		btnLoad.addActionListener(this); // Lo mismo aquí.
		contentPane.add(btnLoad);

		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(0, 0, 492, 23);
		contentPane.add(menuBar);

		JMenu mnMenu = new JMenu("OPCIONES");
		menuBar.add(mnMenu);

//		Nuevamente hay que iniciarlos fuera de la clase:
		mntmGuardarAgenda = new JMenuItem("Guardar Agenda");
//		Añadir antes de .add:
		mntmGuardarAgenda.addActionListener(this); // Así hacemos que atienda a la activación de este objeto.
		mnMenu.add(mntmGuardarAgenda);
		

		mntmRecuperarAgenda = new JMenuItem("Recuperar Agenda");
		mntmRecuperarAgenda.addActionListener(this);
		mnMenu.add(mntmRecuperarAgenda);
		
		mnExit = new JMenu("EXIT");
		mnExit.addActionListener(this);
		menuBar.add(mnExit);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		if (e.getSource() == btnNuevoContacto) {

			if (txtNombreContacto.getText().length() == 0 || txtNumTelefono.getText().length() == 0) {
				JOptionPane.showMessageDialog(null, "No se puede añadir un contacto vacío");
			} else {
				Contacto contact = new Contacto(txtNombreContacto.getText(), txtNumTelefono.getText());

				listaContactos.add(contact); // Lo añadimos al array
				comboBox.addItem(contact.toString()); // Lo añadimos a la box
				System.out.println("¡Contacto añadido a la lista!");
			}
		}

//		Como no vamos a pulsar los dos botones a la vez, creamos otro if
		if (e.getSource() == btnSave) {
			guardarAgenda();
		}

		if (e.getSource() == btnLoad) {
			obtenerAgenda();
		}
		
		if(e.getSource()==mntmGuardarAgenda) {
			guardarAgenda();
		}

		if(e.getSource()==mntmRecuperarAgenda) {
			obtenerAgenda();
		}
		
		if(e.getSource()==mnExit) {
			
		}
	}

	private void guardarAgenda() {
		try {
			FileOutputStream archivoSalida = new FileOutputStream("contactos.txt");
			ObjectOutputStream objetoSalida = new ObjectOutputStream(archivoSalida);
			objetoSalida.writeObject(listaContactos);
			JOptionPane.showMessageDialog(null, "Agenda Guardada"); // Para enseñar un mensaje por pantalla hemos de
																	// usar JOptionPane
			archivoSalida.close();
			objetoSalida.close();

		} catch (IOException ioe) {
			ioe.printStackTrace();
		}
	}

	private void obtenerAgenda() {

		try {
			FileInputStream archivoEntrada = new FileInputStream("contactos.txt");
			ObjectInputStream objetoEntrada = new ObjectInputStream(archivoEntrada);
			ArrayList<Contacto> listaTemporal = (ArrayList<Contacto>) objetoEntrada.readObject();
			listaContactos.addAll(listaTemporal);
			JOptionPane.showMessageDialog(null, "Agenda Recuperada"); // Para enseñar un mensaje por pantalla hemos de
																		// usar JOptionPane

			for (Contacto elemento : listaContactos) {
				comboBox.addItem(elemento.toString());
			}

			archivoEntrada.close();
			objetoEntrada.close();

		} catch (ClassNotFoundException cnfe) {
			System.out.println("No se ha encontrado la clase");
		} catch (IOException ioe) {
			JOptionPane.showMessageDialog(null, "No existe aún agenda");
		}
	}
}
