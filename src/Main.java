import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;

public class Main {
    public static void main(String[] args) {
        JFrame ventana = new JFrame();
        ventana.setBounds(0, 0, 1600, 900);
        ventana.setTitle("Probando Swing");
        ventana.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        ventana.setLayout(new BorderLayout());



        JLabel etiqueta = new JLabel();
        etiqueta.setText("Probando la libreria Swing en Java");
        etiqueta.setBounds(800, 10, 300, 40);

        JMenuBar menuBar = new JMenuBar();
        JMenu menuArchivo = new JMenu("Archivo");
        JMenu menuAcciones = new JMenu("Acciones");
        JMenu menuAyuda = new JMenu("Ayuda");
        menuBar.setBounds(100,100,400,40);

        JTextField campoTexto = new JTextField();
        campoTexto.setBounds(950, 100, 850, 800);

        JButton botonNuevaLiga =new JButton("Nueva liga");
        botonNuevaLiga.setBounds(100,200,180,40);
        botonNuevaLiga.setEnabled(true);
        botonNuevaLiga.addActionListener(new ActionListener(){   @Override
        public void actionPerformed(ActionEvent e) {
            System.out.println("El boton funciona");
        }
        });
        JButton botonJugarLiga=new JButton("Jugar liga");
        botonJugarLiga.setBounds(100,240,180,40);
        botonJugarLiga.setEnabled(true);

        JButton botonSiguienteJornada= new JButton("Siguiente Jornada");
        botonSiguienteJornada.setBounds(100,280,180,40);
        botonSiguienteJornada.setEnabled(false);

        JButton botonSimular =new JButton("Simulacion completada");
        botonSimular.setBounds(100,320,180,40);
        botonSimular.setEnabled(false);

        JButton botonSalir =new JButton("Salir");
        botonSalir.setBounds(100,360,180,40);
        botonSalir.setEnabled(true);


        Button boton = new Button();
        boton.setLabel("Pulsador");
        boton.setBounds(100, 150, 100, 50);
        boton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("El boton funciona");
            }
        });
        ventana.add(etiqueta);
        ventana.add(menuBar);
        menuBar.add(menuArchivo);
        menuBar.add(menuAcciones);
        menuBar.add(menuAyuda);

        ventana.add(botonNuevaLiga);
        ventana.add(botonJugarLiga);
        ventana.add(botonSiguienteJornada);
        ventana.add(botonSimular);
        ventana.add(botonSalir);



        ventana.add(campoTexto);
        ventana.add(boton);
        ventana.setVisible(true);


    }
}

