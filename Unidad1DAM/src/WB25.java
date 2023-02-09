import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.CardLayout;
import javax.swing.JTabbedPane;
import java.awt.Panel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.DefaultComboBoxModel;

public class WB25 extends JFrame {

	private JPanel contentPane;
	private JTextField localidad4;
	private JTextField nombre2;
	private JTextField codigo2;
	private JTextField grat;
	private JTextField nom;
	private JTextField cod;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					WB25 frame = new WB25();
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
	public WB25() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 425);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new CardLayout(0, 0));
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		contentPane.add(tabbedPane, "name_606963730267000");
		
		Panel panel = new Panel();
		tabbedPane.addTab("Insertar Departamentos", null, panel, null);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Datos de Departamentos");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblNewLabel.setBounds(107, 11, 195, 14);
		panel.add(lblNewLabel);
		
		JLabel codigo = new JLabel("Código Departamento:");
		codigo.setBounds(25, 50, 109, 14);
		panel.add(codigo);
		
		JLabel nombre = new JLabel("Nombre Departamento:");
		nombre.setBounds(25, 75, 113, 14);
		panel.add(nombre);
		
		JLabel localidad1 = new JLabel("Localidad Departamento:");
		localidad1.setBounds(25, 100, 120, 14);
		panel.add(localidad1);
		
		JLabel localidad2 = new JLabel("Localidad Departamento:");
		localidad2.setBounds(25, 125, 120, 14);
		panel.add(localidad2);
		
		localidad4 = new JTextField();
		localidad4.setBounds(155, 97, 186, 20);
		panel.add(localidad4);
		localidad4.setColumns(10);
		
		nombre2 = new JTextField();
		nombre2.setBounds(155, 72, 186, 20);
		panel.add(nombre2);
		nombre2.setColumns(10);
		
		codigo2 = new JTextField();
		codigo2.setBounds(155, 47, 186, 20);
		panel.add(codigo2);
		codigo2.setColumns(10);
		
		JComboBox localidad3 = new JComboBox();
		localidad3.setModel(new DefaultComboBoxModel(new String[] {"España", "Francia", "Alemania"}));
		localidad3.setBounds(155, 121, 186, 22);
		panel.add(localidad3);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(25, 335, 384, -147);
		panel.add(scrollPane);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(10, 190, 399, 147);
		panel.add(textArea);
		
		
		JButton btnNewButton = new JButton("Ver Datos");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textArea.setText("El precio es: "+codigo2.getText());
				textArea.append("\nEl nombre es: "+nombre2.getText());
				textArea.append("\nLa localidad es: "+localidad4.getText());
				textArea.append("\nLa localidad es: "+localidad3.getSelectedIndex());
				textArea.append("\n"+localidad3.getSelectedItem());
				
				
				
				
				
				
				
			}
		});
		btnNewButton.setBounds(73, 154, 125, 23);
		panel.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Limpiar Datos");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textArea.setText(" ");
				nombre2.setText(" ");
				localidad4.setText(" ");
				codigo2.setText(" ");
				
				
				
			}
		});
		btnNewButton_1.setBounds(216, 154, 125, 23);
		panel.add(btnNewButton_1);
		
		
		
		Panel panel_1 = new Panel();
		tabbedPane.addTab("Insertar Oficinas", null, panel_1, null);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Inserción de Oficinas");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblNewLabel_1.setBounds(123, 11, 155, 14);
		panel_1.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Código:");
		lblNewLabel_2.setBounds(51, 51, 46, 14);
		panel_1.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Nombre:");
		lblNewLabel_3.setBounds(51, 76, 46, 14);
		panel_1.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Gratificación:");
		lblNewLabel_4.setBounds(51, 101, 63, 14);
		panel_1.add(lblNewLabel_4);
		
		grat = new JTextField();
		grat.setBounds(124, 98, 154, 20);
		panel_1.add(grat);
		grat.setColumns(10);
		
		nom = new JTextField();
		nom.setBounds(123, 73, 155, 20);
		panel_1.add(nom);
		nom.setColumns(10);
		
		cod = new JTextField();
		cod.setBounds(123, 48, 155, 20);
		panel_1.add(cod);
		cod.setColumns(10);
		
		JTextArea textArea1 = new JTextArea();
		textArea1.setBounds(10, 170, 399, 167);
		panel_1.add(textArea1);
		
		JButton btnNewButton_2 = new JButton("Ver Datos");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textArea1.setText("El código es: "+cod.getText());
				textArea1.append("\nEl nombre es: "+nom.getText());
				textArea1.append("\nLa gratificacion es: "+grat.getText());
			}
		});
		btnNewButton_2.setBounds(51, 141, 135, 23);
		panel_1.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Limpiar Datos");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textArea1.setText(" ");
				nom.setText(" ");
				cod.setText(" ");
				grat.setText(" ");
			}
		});
		btnNewButton_3.setBounds(220, 141, 135, 23);
		panel_1.add(btnNewButton_3);
		

	}
}
