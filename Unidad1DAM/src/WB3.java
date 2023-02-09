import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextArea;

public class WB3 extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					WB3 frame = new WB3();
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
	public WB3() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 450);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu GEmpresa = new JMenu("Gestión Empresa");
		menuBar.add(GEmpresa);
		
		JMenuItem GArticulos = new JMenuItem("Gestion Articulos");
		GEmpresa.add(GArticulos);
		GArticulos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				contentPane.removeAll();
				JPanel  GArticulos=new JPanel();
				contentPane.add(GArticulos);
				setContentPane(GArticulos);
			}
		});
		GEmpresa.add(GArticulos);
		
		JMenuItem IClientes = new JMenuItem("Informe Clientes");
		IClientes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				contentPane.removeAll();
				InformeClientes2 IClientes=new InformeClientes2();
				contentPane.add(IClientes);
				setContentPane(IClientes);
				
				
				
				
			}
		});
		GEmpresa.add(IClientes);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(128, 128, 128));
		panel.setBounds(10, 11, 414, 211);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Código de artículo:");
		lblNewLabel.setBounds(10, 11, 90, 14);
		panel.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(110, 8, 86, 20);
		panel.add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("Comprobar si existe");
		btnNewButton.setBounds(232, 7, 153, 23);
		panel.add(btnNewButton);
		
		JLabel lblNewLabel_1 = new JLabel("Denominación del artículo:");
		lblNewLabel_1.setBounds(10, 36, 125, 14);
		panel.add(lblNewLabel_1);
		
		textField_1 = new JTextField();
		textField_1.setBounds(145, 33, 240, 20);
		panel.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Precio:");
		lblNewLabel_2.setBounds(10, 61, 33, 14);
		panel.add(lblNewLabel_2);
		
		textField_2 = new JTextField();
		textField_2.setBounds(53, 58, 86, 20);
		panel.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("Stock:");
		lblNewLabel_3.setBounds(169, 61, 33, 14);
		panel.add(lblNewLabel_3);
		
		textField_3 = new JTextField();
		textField_3.setBounds(212, 58, 86, 20);
		panel.add(textField_3);
		textField_3.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("Nombre de zona:");
		lblNewLabel_4.setBounds(10, 86, 86, 14);
		panel.add(lblNewLabel_4);
		
		textField_4 = new JTextField();
		textField_4.setBounds(110, 83, 188, 20);
		panel.add(textField_4);
		textField_4.setColumns(10);
		
		JLabel lblNewLabel_5 = new JLabel("Selecciona el proveedor:");
		lblNewLabel_5.setBounds(10, 111, 118, 14);
		panel.add(lblNewLabel_5);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Proveedor 1", "Proveedor 2", "Proveedor 3", "Proveedor 4", "Proveedor 5", "Proveedor 6", "Proveedor 7"}));
		comboBox.setBounds(138, 107, 203, 22);
		panel.add(comboBox);
		
		JButton btnNewButton_1 = new JButton("Insertar artículo");
		btnNewButton_1.setBounds(10, 136, 118, 23);
		panel.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Borrar artículo");
		btnNewButton_2.setBounds(145, 136, 125, 23);
		panel.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Modificar artículo");
		btnNewButton_3.setBounds(286, 136, 118, 23);
		panel.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("Visualizar artículo");
		btnNewButton_4.setBounds(71, 170, 125, 23);
		panel.add(btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton("Limpiar pantalla");
		btnNewButton_5.setBounds(234, 170, 107, 23);
		panel.add(btnNewButton_5);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(20, 233, 404, 145);
		contentPane.add(textArea);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(0, 0, 10, 10);
		contentPane.add(panel_1);
		
		JLabel lblNewLabel_6 = new JLabel("New label");
		panel_1.add(lblNewLabel_6);
	}
}
