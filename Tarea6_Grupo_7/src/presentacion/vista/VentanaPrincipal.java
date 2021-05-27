package presentacion.vista;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;



import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;


public class VentanaPrincipal {
	private JFrame ventana;
	private JMenuBar menuBar;
	private JMenu menuPersona;
	private JMenuItem menuBtnAgregar;
	private JMenuItem menuBtnModificar;
	private JMenuItem menuBtnEliminar;
	private JMenuItem menuBtnListar;
	
	public VentanaPrincipal() {
		
		inicializar();
	}
	
	private void inicializar() {
		ventana = new JFrame();
		ventana.setTitle("Programa");
		ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ventana.setBounds(100, 100, 450, 421);
		
		DibujarMenuBar();
	}
	
	private void DibujarMenuBar() {
		menuBar = new JMenuBar();
		ventana.setJMenuBar(menuBar);
		
		menuPersona = new JMenu("Persona");
		menuBar.add(menuPersona);
		DibujarBtnAgregar();
		DibujarBtnModificar();
		DibujarBtnEliminar();
		DibujarBtnListar();
	}
	
	private void DibujarBtnAgregar() {
		menuBtnAgregar = new JMenuItem("Agregar");
		menuBtnAgregar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
			}
		});
		menuPersona.add(menuBtnAgregar);
	}
	
	private void DibujarBtnModificar() {
		menuBtnModificar = new JMenuItem("Modificar");
		menuBtnModificar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
			}
		});
		menuPersona.add(menuBtnModificar);
	}
	
	private void DibujarBtnEliminar() {
		menuBtnEliminar = new JMenuItem("Eliminar");
		menuBtnEliminar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
			}
		});
		menuPersona.add(menuBtnEliminar);
	}
	
	private void DibujarBtnListar() {
		menuBtnListar = new JMenuItem("Listar");
		menuBtnListar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
			}
		});
		menuPersona.add(menuBtnListar);
	}
	
	public void show()
	{
		this.ventana.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		this.ventana.addWindowListener(new WindowAdapter() 
		{
			@Override
		    public void windowClosing(WindowEvent e) {
		        int confirm = JOptionPane.showOptionDialog(
		             null, "¿Estas seguro que quieres salir?", 
		             "Confirmación", JOptionPane.YES_NO_OPTION,
		             JOptionPane.QUESTION_MESSAGE, null, null, null);
		        if (confirm == 0) {
		        	//Conexion.getConexion().cerrarConexion();
		           System.exit(0);
		        }
		    }
		});
		this.ventana.setVisible(true);
	}
}
