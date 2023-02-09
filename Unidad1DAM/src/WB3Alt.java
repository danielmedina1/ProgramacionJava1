import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class WB3Alt extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					WB3Alt frame = new WB3Alt();
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
	public WB3Alt() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 500);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnGestionArticulos = new JMenu("Gestion Empresa");
		menuBar.add(mnGestionArticulos);
		
		JMenuItem GArticulos = new JMenuItem("Gestión Articulos");
		GArticulos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				contentPane.removeAll();
				WB3Alt GArticulos=new WB3Alt();
				contentPane.add(GArticulos);
				setContentPane(GArticulos);
				
				
			}
		});
		mnGestionArticulos.add(GArticulos);
		
		JMenuItem IClientes = new JMenuItem("Información Clientes");
		IClientes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				contentPane.removeAll();
				InformeClientes2 IClientes=new InformeClientes2();
				contentPane.add(IClientes);
				setContentPane(IClientes);
			}
		});
		mnGestionArticulos.add(IClientes);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 434, 439);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setForeground(new Color(128, 128, 128));
		panel_1.setBounds(10, 45, 414, 255);
		panel.add(panel_1);
		
		JLabel lblNewLabel = new JLabel("Hola buenos dias");
		lblNewLabel.setBounds(154, 11, 110, 14);
		panel.add(lblNewLabel);
	}
}
