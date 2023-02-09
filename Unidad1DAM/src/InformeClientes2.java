import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;

public class InformeClientes2 extends JPanel {

	/**
	 * Create the panel.
	 */
	public InformeClientes2() {
		setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Informe Clientes");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblNewLabel.setBounds(153, 11, 127, 14);
		add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Selecciona el cliente a visualizar:");
		lblNewLabel_1.setBounds(60, 45, 166, 14);
		add(lblNewLabel_1);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Antonio Ramirez", "Jesus Alguido", "Manolo Resalino"}));
		comboBox.setBounds(236, 41, 166, 22);
		add(comboBox);
		
		JButton btnNewButton = new JButton("Ver Informe Global");
		btnNewButton.setBounds(246, 70, 156, 23);
		add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Ver Detalles del Cliente");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_1.setBounds(70, 70, 156, 23);
		add(btnNewButton_1);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(10, 103, 430, 186);
		add(textArea);

	}

}
