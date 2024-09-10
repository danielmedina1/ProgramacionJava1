package examen2019;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.SwingConstants;

public class Login extends JFrame {

	private JPanel contentPane;
	private JTextField usuario;
	private JTextField contrasena;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login frame = new Login();
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
	public Login() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		usuario = new JTextField();
		usuario.setBounds(122, 69, 192, 20);
		contentPane.add(usuario);
		usuario.setColumns(10);
		
		contrasena = new JTextField();
		contrasena.setBounds(122, 137, 192, 20);
		contentPane.add(contrasena);
		contrasena.setColumns(10);
		
		JLabel equivocacion = new JLabel("Usuario o Contraseña Incorrectos, pruebe otra vez");
		equivocacion.setForeground(new Color(255, 0, 0));
		equivocacion.setFont(new Font("Tahoma", Font.BOLD, 15));
		equivocacion.setBounds(35, 218, 377, 14);
		contentPane.add(equivocacion);
		equivocacion.setVisible(false);
		
		JButton bentrar = new JButton("Entrar");
		bentrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try {
					DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
					Connection conn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/XE","examen","examen");
					Statement stmt=conn.createStatement();
					ResultSet rset=stmt.executeQuery("select TRIM(tipo_usuario), TRIM(login), TRIM(password) from usuarios");
					int si=0;
					String tipo="";
				while (rset.next()) {
					if (rset.getString(2).toString().equals(usuario.getText()) && rset.getString(3).toString().equals(contrasena.getText())) {
						si=1;
						tipo=rset.getString(1);
					}
				}
				Scanner teclado=new Scanner(System.in);
				if (si==1) {
					equivocacion.setVisible(false);
					if (tipo.equals("A")) {
						int opcion=0;
						do {
							menu();
							opcion=teclado.nextInt();
							switch (opcion) {
								case 1: {
									altaGrupoBD();
									System.out.println("Grupo dado de alta correctamente");
								} break;
								case 2: {
									bajaGrupoBD();
									
								} break;
								case 3: {
									
									
								} break;
								case 4: {
									
									
								} break;
								case 5: {
									
									
								} break;
								case 6: {
									
									
								} break;
								case 7: {
									
									
								} break;
								case 8: {
									System.out.println("Nos Vemos");
								} break;

							
							
							}
							
						
						} while(opcion!=8);
					}
					
				} else {
					equivocacion.setVisible(true);
				}
				
				} catch (SQLException e1) {
					e1.printStackTrace();
				}
				
			}

			private void bajaGrupoBD()  throws SQLException{
				Scanner teclado=new Scanner(System.in);
				int grupoBorrar=0;
				System.out.println("Inserte el codigo del grupo a borrar junto a sus canciones");
				grupoBorrar=teclado.nextInt();
				DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
				Connection conn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/XE","examen","examen");
				Statement stmt=conn.createStatement();
				stmt.executeQuery("DELETE FROM canciones WHERE codigo_grupo = "+grupoBorrar);
				System.out.println("Canciones Borradas");
				ResultSet rset=stmt.executeQuery("DELETE FROM grupos WHERE codigo = "+grupoBorrar);
				System.out.println("Grupo Borrado");
					
			}

			private void altaGrupoBD() throws SQLException{
				Scanner teclado=new Scanner(System.in);
				Grupos gr=new Grupos();
				String atributos="";
				System.out.println("Inserte el nombre");
				atributos = teclado.next();
				gr.setNombre(atributos);
				System.out.println("Inserte el codigo");
				atributos = teclado.next();
				gr.setCodigo(atributos);
				System.out.println("Inserte el año de creacion");
				atributos = teclado.next();
				gr.setAñoCreacion(atributos);
				System.out.println("Inserte el tipo de música");
				atributos = teclado.next(); 
				gr.setTipoMusica(atributos);
				DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
				Connection conn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/XE","examen","examen");
				Statement stmt=conn.createStatement();
				ResultSet rset=stmt.executeQuery("INSERT INTO grupos (codigo, nombre, A�O, tipo_musica) VALUES ("+Integer.parseInt(gr.getCodigo())+", '"+gr.getNombre()+"', "+Integer.parseInt(gr.getAñoCreacion())+", '"+gr.getTipoMusica()+"')");
				
				
			}

			private void menu() {
				System.out.println("Bienvenido Administrador, ¿que operacion desea realizar?");
				System.out.println("\t1. Dar de alta un nuevo grupo en la BD");
				System.out.println("\t2. Dar de baja un grupo borrando todas sus canciones");
				System.out.println("\t3. Dar de baja una cancion de un grupo");
				System.out.println("\t4. Dar de alta una cancion de un grupo");
				System.out.println("\t5. Consultar Usuarios");
				System.out.println("\t6. Generar Grupos.csv");
				System.out.println("\t7. Generar Canciones.csv");
				System.out.println("\t8. Salir");
				
			}
		});
		bentrar.setBounds(173, 184, 89, 23);
		contentPane.add(bentrar);
		
		JLabel eusuario = new JLabel("Usuario");
		eusuario.setFont(new Font("Tahoma", Font.PLAIN, 18));
		eusuario.setBounds(185, 45, 64, 14);
		contentPane.add(eusuario);
		
		JLabel econtraseña = new JLabel("Contraseña");
		econtraseña.setFont(new Font("Tahoma", Font.PLAIN, 18));
		econtraseña.setBounds(173, 114, 89, 14);
		contentPane.add(econtraseña);
		
		
	}
}
