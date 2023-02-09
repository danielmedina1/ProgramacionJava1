import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextField;
import javax.swing.JButton;

public class WB2 extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					WB2 frame = new WB2();
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
	public WB2() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Datos de Departamento");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 19));
		lblNewLabel.setBounds(112, 11, 205, 23);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Código Departamento:");
		lblNewLabel_1.setBounds(10, 50, 109, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNombreDepartamento = new JLabel("Nombre Departamento:");
		lblNombreDepartamento.setBounds(10, 75, 113, 14);
		contentPane.add(lblNombreDepartamento);
		
		JLabel lblNewLabel_2 = new JLabel("Localidad Departamento:");
		lblNewLabel_2.setBounds(10, 100, 120, 14);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_2_1 = new JLabel("Localidad Departamento:");
		lblNewLabel_2_1.setBounds(10, 136, 120, 14);
		contentPane.add(lblNewLabel_2_1);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"España", "Francia", "Paquistán", "Japon", "China", "EE.UU"}));
		comboBox.setBounds(140, 132, 165, 22);
		contentPane.add(comboBox);
		
		textField = new JTextField();
		textField.setBounds(140, 97, 165, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(140, 72, 165, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(140, 47, 165, 20);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		JButton btnNewButton = new JButton("Ver Datos");
		btnNewButton.setBounds(56, 161, 111, 23);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Limpiar Datos");
		btnNewButton_1.setBounds(177, 161, 128, 23);
		contentPane.add(btnNewButton_1);
	}
}
