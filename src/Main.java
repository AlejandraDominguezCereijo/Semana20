import javax.swing.*;
import javax.swing.table.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;



public class Main {

    public static void main(String[] args) {
        JFrame ventana = new JFrame();
        ventana.setBounds(0, 0, 1600, 900);
        ventana.setTitle("Probando la libreria Swing en Java"); // titulo que se mostrara en nuestra ventana
        ventana.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        //creamos la barra del menu y los diferentes campos que necesitamos
        JMenuBar menuBar = new JMenuBar();
        JMenu menuArchivo = new JMenu("Archivo");
        JMenu menuAcciones = new JMenu("Acciones");
        JMenu menuAyuda = new JMenu("Ayuda");
        menuBar.setBounds(0, 0, 1600, 40);

        JButton botonNuevaLiga = new JButton("Nueva liga"); // instanciamos el campo y le indicampos entre los parentesis el contenido que debe mostrar
        botonNuevaLiga.setBounds(100, 200, 200, 40); //damos tamaño y posicion a los distintos campos
        botonNuevaLiga.setEnabled(true); // indicando true o false habilitamos o no el boton
        botonNuevaLiga.addActionListener(new ActionListener() { // nos muestra un mensaje por consola indicandonos que el boton funciona correctamente y realiza la accion
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("El boton nueva liga funciona");
            }
        });

        JButton botonJugarLiga = new JButton("Jugar liga");
        botonJugarLiga.setBounds(100, 265, 200, 40);
        botonJugarLiga.setEnabled(true);
        botonJugarLiga.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("El boton  jugar liga funciona");
            }
        });

        JButton botonSiguienteJornada = new JButton("Siguiente Jornada");
        botonSiguienteJornada.setBounds(100, 330, 200, 40);
        botonSiguienteJornada.setEnabled(false);


        JButton botonSimular = new JButton("Simulacion completada");
        botonSimular.setBounds(100, 395, 200, 40);
        botonSimular.setEnabled(false);


        JButton botonSalir = new JButton("Salir");
        botonSalir.setBounds(100, 540, 200, 40);
        botonSalir.setEnabled(true);
        botonSalir.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("El boton  salir funciona");
            }
        });


        // creamos la tabla y le indicamos el numero de filas y columnas que necesitamos para nuestra aplicacion, añadiendo un array con los nombres de las columnas
        String datos[][]={

        };
        String cabecera [] ={"Equipo","Partido jugado","Victorias","Empates","Derrotas","Goles en contra","Goles a favor","Diferencia de goles","Puntos"} ;
        JTable tabla = new JTable();
        //Creacion del header de la tabla
        JTableHeader header = tabla.getTableHeader();
        tabla.setTableHeader(header);
        header.setBounds(450, 200, 1000, 40);
        DefaultTableModel modeloTabla= new DefaultTableModel(cabecera,22);

        tabla.setModel(modeloTabla);
        tabla.setBounds(450, 230, 1000, 350);



        //eliminamos el layout
        ventana.setLayout(null);

        //añadimos a nuestra ventana los distintos elementos que vamos creando
        ventana.add(menuBar);
        //añadimos cada elemento a la menuBar
        menuBar.add(menuArchivo);
        menuBar.add(menuAcciones);
        menuBar.add(menuAyuda);

        ventana.add(botonNuevaLiga);
        ventana.add(botonJugarLiga);
        ventana.add(botonSiguienteJornada);
        ventana.add(botonSimular);
        ventana.add(botonSalir);

        ventana.add(tabla);
        ventana.add(tabla.getTableHeader());




        //hacemos que nuestra ventana sea visible indicando true
        ventana.setVisible(true);
        //Deshabilitamos la redimension de la ventana
        ventana.setResizable(false);

    }
}
