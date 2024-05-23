package DBGraph;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.Color;

public class VentanaCiclismo extends JFrame implements ActionListener {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	JButton btnListar;
	JComboBox comboBoxCiclismo;
	private JTextField txtIntroducido;
	private JButton btnInsertar, btnEliminar, btnModificar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaCiclismo frame = new VentanaCiclismo();
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
	public VentanaCiclismo() {

		iniciarComponentes();

		listar();
	}

	public void iniciarComponentes() {

		setResizable(false);
		setTitle("VENTANA CICLISMO");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(650, 350, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(173, 127, 168));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		comboBoxCiclismo = new JComboBox();
		comboBoxCiclismo.setBackground(new Color(255, 255, 255));
		comboBoxCiclismo.setBounds(48, 36, 328, 26);
		contentPane.add(comboBoxCiclismo);

		btnListar = new JButton("Listar");
		btnListar.setBounds(141, 74, 143, 38);
		btnListar.addActionListener(this);
		contentPane.add(btnListar);

		btnInsertar = new JButton("Insertar");
		btnInsertar.setBounds(48, 191, 100, 38);
		btnInsertar.addActionListener(this);
		contentPane.add(btnInsertar);

		txtIntroducido = new JTextField();
		txtIntroducido.setBackground(new Color(255, 255, 255));
		txtIntroducido.setBounds(49, 133, 327, 37);
		txtIntroducido.addActionListener(this);
		contentPane.add(txtIntroducido);
		txtIntroducido.setColumns(10);

		btnEliminar = new JButton("Eliminar");
		btnEliminar.setBounds(276, 191, 100, 38);
		btnEliminar.addActionListener(this);
		contentPane.add(btnEliminar);

		btnModificar = new JButton("Modificar");
		btnModificar.setBounds(160, 191, 100, 38);
		btnModificar.addActionListener(this);
		contentPane.add(btnModificar);
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		if (e.getSource() == btnInsertar) {

			listar();

		}

		if (e.getSource() == btnInsertar) {

			insertar();
			listar();

		}

		if (e.getSource() == btnEliminar) {

			eliminar();
			listar();

		}

		if (e.getSource() == btnModificar) {

			modificar();
			listar();

		}
	}

	public void listar() {

		try {
			ResultSet resultado = conectar();

			comboBoxCiclismo.removeAllItems();

			while (resultado.next()) {

//				System.out.println(resultado.getString("nomeq")); // Traza
				comboBoxCiclismo.addItem(resultado.getString("nomeq"));

			}

		} catch (SQLException sqle) {
			sqle.printStackTrace();
		}

	}

	public void insertar() {

		try {

			ResultSet resultado = conectar();

			String textoIntroducir = txtIntroducido.getText();

			while (resultado.next()) {

				if (!resultado.getString("nomeq").equalsIgnoreCase(textoIntroducir) && !textoIntroducir.isBlank()) {
					resultado.moveToInsertRow();
					resultado.updateString(1, textoIntroducir);
					resultado.insertRow();
					JOptionPane.showMessageDialog(null, "Se ha insertado el equipo");
					break;
				} else if (textoIntroducir.isBlank()) {
					JOptionPane.showMessageDialog(null, "No puede introducir un equipo vacío.");
					break;
				} else {
					JOptionPane.showMessageDialog(null, "El valor que intenta introducir ya existe.");
					break;
				}
			}

		} catch (SQLException sqle) {
			sqle.printStackTrace();
		}
	}

	public void eliminar() {

		try {

			ResultSet resultado = conectar();

			String txtEliminar = comboBoxCiclismo.getSelectedItem().toString();

			while (resultado.next()) {

				if (resultado.getString("nomeq").equalsIgnoreCase(txtEliminar)) {

					int res = JOptionPane.showConfirmDialog(null,
							"¿Está seguro de que quiere borrar " + txtEliminar + " como equipo?", "",
							JOptionPane.OK_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE);
					if (res == 0) {
						resultado.deleteRow();
						JOptionPane.showMessageDialog(null, "Se ha borrado el equipo");
					} else {
						JOptionPane.showMessageDialog(null, "No se ha borrado ningún equipo");
					}
				}
			}

		} catch (SQLException sqle) {

			sqle.printStackTrace();
		}
	}

	public void modificar() {

		try {
			ResultSet resultado = conectar();

			String equipo = comboBoxCiclismo.getSelectedItem().toString();

			String txtModificar = txtIntroducido.getText();

			int resul = JOptionPane.showConfirmDialog(null,
					"¿Está seguro de que quiere modificar el equipo " + equipo + "?", "", JOptionPane.YES_NO_OPTION);

			if (resul == 0) {

				while (resultado.next()) {

					if (resultado.getString("nomeq").equalsIgnoreCase(equipo)) {

						resultado.updateString("nomeq", txtModificar);
						resultado.updateRow();
						JOptionPane.showMessageDialog(null, "Se ha actualizado el equipo " + txtModificar);
					}
				}
			}
		} catch (SQLException sqle) {
			sqle.getStackTrace();
		}
	}

	public ResultSet conectar() throws SQLException {

		Connection conexion = ConexionDB.conectar();

		String query = "SELECT nomeq FROM equipo";

		Statement queryUpdate = conexion.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
		ResultSet resultado = queryUpdate.executeQuery(query);

		return resultado;
	}
}
