import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.SpringLayout;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import javax.swing.JTextField;
import java.awt.Insets;
import net.miginfocom.swing.MigLayout;
import javax.swing.JSplitPane;
import java.awt.SystemColor;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.UIManager;
import javax.swing.JComboBox;
import javax.swing.AbstractButton;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.ButtonModel;

public class ENDE extends JFrame {
	private JSplitPane splitPane;
	private JSplitPane splitPane_1;
	private JSplitPane splitPane_2;
	private JButton btnNewButton_3;
	private JButton btnNewButton_4;
	private JTextField codigo;
	private JTextField nombre;
	private JTextField localidad;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;
	private JLabel lblNewLabel_3;
	private JComboBox comboBox;
	private JScrollPane scrollPane;
	private JTextArea textArea;
	private JRadioButton gestion;
	private JRadioButton personal;
	private JRadioButton apoyo;
	private JRadioButton tecnologico;
	private JLabel lblNewLabel_4;
	private final ButtonGroup buttonGroup = new ButtonGroup();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ENDE frame = new ENDE();
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
	public ENDE() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(new MigLayout("", "[434px,grow][]", "[28px][27px][27px][27px][][][][][grow]"));
		
		JLabel lblNewLabel = new JLabel("Datos de Departamento");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 23));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		getContentPane().add(lblNewLabel, "cell 0 0,growx,aligny top");
		
		lblNewLabel_4 = new JLabel("Tipo de departamento:");
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
		getContentPane().add(lblNewLabel_4, "cell 1 1");
		
		splitPane_2 = new JSplitPane();
		getContentPane().add(splitPane_2, "cell 0 2,grow");
		
		codigo = new JTextField();
		splitPane_2.setRightComponent(codigo);
		codigo.setColumns(10);
		
		lblNewLabel_1 = new JLabel("Código de Departamento:");
		splitPane_2.setLeftComponent(lblNewLabel_1);
		
		
		gestion = new JRadioButton("Gestión");
		buttonGroup.add(gestion);
		getContentPane().add(gestion, "cell 1 2");
		ButtonModel gest=gestion.getModel();
		
		splitPane_1 = new JSplitPane();
		getContentPane().add(splitPane_1, "cell 0 3,grow");
		
		nombre = new JTextField();
		splitPane_1.setRightComponent(nombre);
		nombre.setColumns(10);
		
		lblNewLabel_2 = new JLabel("Nombre de departamento:");
		splitPane_1.setLeftComponent(lblNewLabel_2);
		
		personal = new JRadioButton("Personal");
		buttonGroup.add(personal);
		getContentPane().add(personal, "cell 1 3");
		ButtonModel pers=personal.getModel();
		
		splitPane = new JSplitPane();
		getContentPane().add(splitPane, "flowx,cell 0 4,grow");
		
		localidad = new JTextField();
		splitPane.setRightComponent(localidad);
		localidad.setColumns(10);
		
		lblNewLabel_3 = new JLabel("Localidad departamento:");
		splitPane.setLeftComponent(lblNewLabel_3);
		
		apoyo = new JRadioButton("Apoyo");
		buttonGroup.add(apoyo);
		getContentPane().add(apoyo, "cell 1 4");
		ButtonModel apo=apoyo.getModel();
		
		tecnologico = new JRadioButton("Tecnológico");
		buttonGroup.add(tecnologico);
		getContentPane().add(tecnologico, "cell 1 5");
		ButtonModel tecno=tecnologico.getModel();
		
		btnNewButton_3 = new JButton("Insertar datos\r\n");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				textArea.setText("El código de departamento es: "+codigo.getText());
				textArea.append("\nEl nombre de departamento es: "+nombre.getText());
				textArea.append("\nEl localidad de departamento es: "+localidad.getText());
				textArea.append("\nEl pais es: "+comboBox.getSelectedIndex());
				textArea.append("\nEl pais es: "+comboBox.getSelectedItem());
				
				if(buttonGroup.getSelection().equals(gest)) {textArea.append("\nPulsaste gestión");}
				if(buttonGroup.getSelection().equals(pers)) {textArea.append("\nPulsaste personal");}
				if(buttonGroup.getSelection().equals(tecno)) {textArea.append("\nPulsaste tecnología");}
				if(buttonGroup.getSelection().equals(apo)) {textArea.append("\nPulsaste apoyo");}

			}
		});
		
		
		
		comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"España", "Francia", "Alemania ", "Portugal", "Andorra"}));
		getContentPane().add(comboBox, "cell 0 6,growx");
		btnNewButton_3.setHorizontalAlignment(SwingConstants.RIGHT);
		getContentPane().add(btnNewButton_3, "flowx,cell 0 7,alignx center,aligny center");
		
		btnNewButton_4 = new JButton("Limpiar datos");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				codigo.setText("");
				nombre.setText("");
				localidad.setText("");
				textArea.setText(" "+codigo.getText());
				textArea.append("\n "+nombre.getText());
				textArea.append("\n "+localidad.getText());
				if(buttonGroup.getSelection().equals(gest)) {textArea.append("\n ");}
				if(buttonGroup.getSelection().equals(pers)) {textArea.append("\n ");}
				if(buttonGroup.getSelection().equals(tecno)) {textArea.append("\n ");}
				if(buttonGroup.getSelection().equals(apo)) {textArea.append("\n ");}
			}
		});
		btnNewButton_4.setHorizontalAlignment(SwingConstants.RIGHT);
		getContentPane().add(btnNewButton_4, "cell 0 7,alignx right,aligny center");
		
		scrollPane = new JScrollPane();
		getContentPane().add(scrollPane, "cell 0 8,grow");
		
		textArea = new JTextArea();
		scrollPane.setViewportView(textArea);
	}
}
