import java.awt.event.*;
import java.awt.BorderLayout;
import view.VistaRequerimientosReto4;
import javax.swing.*;
import javax.swing.table.JTableHeader;

import java.awt.Color;

public class GUI extends JPanel implements ActionListener {
    JFrame ventana = new JFrame();
    JTextArea textoInicio;
    JLabel lblTitulo;
    JButton btn1,btn2,btn3,btn4;
    JTable tabla1;
    JTableHeader h1,h2,h3;
    JTable tabla2;
    JTable tabla3;
    JPanel panel1,panel2,panel3,panel4;
    private String titulos1[] = {"Constructora","Fecha Inicio","Clasificacion"};
    private String datos[][] = VistaRequerimientosReto4.requerimiento1();
    private String titulos2[] = {"Suma Cantidades"};
    private String datos2[][] = VistaRequerimientosReto4.requerimiento3();
    private String titulos3[] = {"Líder Ciudad"};
    private String datos3[][] = VistaRequerimientosReto4.requerimiento4();

    public GUI (){
        iniciarComponentes();
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setSize(560,560);
        ventana.setTitle("Solucion Reto 5");
        ventana.setLayout(null);
        ventana.setLocationRelativeTo(null);
        ventana.setVisible(true);
        

    }

    private void iniciarComponentes(){
    panel1 =new JPanel();
    panel1.setBackground(Color.CYAN);
    panel1.setBounds(5, 112, 500, 400);
    panel1.setLayout(new BorderLayout());
    panel1.setVisible(false);

    panel2 =new JPanel();
    panel2.setBackground(Color.GREEN);
    panel2.setBounds(5, 112, 500, 400);
    panel2.setLayout(new BorderLayout());
    panel2.setVisible(false);

    panel3 = new JPanel();
    panel3.setBackground(Color.RED);
    panel3.setBounds(5, 112, 500, 400);
    panel3.setLayout(new BorderLayout());
    panel3.setVisible(false);

    panel4 = new JPanel();
    panel4.setBackground(Color.GRAY);
    panel4.setBounds(5, 112, 500, 400);
    panel4.setLayout(new BorderLayout());
    panel4.setVisible(true);

    lblTitulo = new JLabel("Consultas");
    lblTitulo.setBounds(10, 20, 221, 51);

    textoInicio = new JTextArea();
    textoInicio.setBounds(20, 217, 400, 300);
    String text = "En esta area, se mostrara el listado que corresponde a las consultas "
                    + "\nRealizadas para el reto 4. "
                    + "\n"
                    +"\nConsulta 1: corresponde a proyecto ciudad "
                    + "\nConsula 2: corresponde a la suma de las compras hechas en JUMBO"
                    + "\nConsulta 3: Corresponde a el lider de ciudad que vive en dubai";
    textoInicio.setText(text);

    btn1 = new JButton("Consulta 1");
    btn1.setBounds(10, 76, 100, 23);
    btn1.addActionListener(this);

    btn2 = new JButton("Consulta 2");
    btn2.setBounds(110, 76, 100, 23);
    btn2.addActionListener(this);

    btn3 = new JButton("Consulta 3");
    btn3.setBounds(210, 76, 100, 23);
    btn3.addActionListener(this);

    btn4 = new JButton("Volver");
    btn4.setBounds(310, 76, 100, 23);
    btn4.addActionListener(this);

    cargarComponentespanel1();
    cargarComponentespanel2();
    cargarComponentespanel3();
    cargarComponentespanel4();

    ventana.add(btn1);
    ventana.add(btn2);
    ventana.add(btn3);
    ventana.add(btn4);
    ventana.add(lblTitulo);
    

    ventana.add(panel1);
    ventana.add(panel2);
    ventana.add(panel3);
    ventana.add(panel4);
    }
    private void cargarComponentespanel1(){
        tabla1 = new JTable(datos,titulos1);
        h1 = tabla1.getTableHeader();
        tabla1.setBounds(10, 10, 400, 300);
        tabla1.setShowHorizontalLines(true);
        tabla1.setRowSelectionAllowed(true);
        tabla1.setColumnSelectionAllowed(true);
        tabla1.setSelectionForeground(Color.WHITE);
        tabla1.setSelectionBackground(Color.GRAY);
        tabla1.getTableHeader();
        add(new JScrollPane(tabla1), BorderLayout.CENTER);

        panel1.add(tabla1);
        panel1.add(h1,BorderLayout.NORTH);
    }
    
    private void cargarComponentespanel2(){
        tabla2 = new JTable(datos2,titulos2);
        h2 = tabla2.getTableHeader();
        tabla2.setBounds(10, 10, 400, 300);
        tabla2.setShowHorizontalLines(true);
        tabla2.setRowSelectionAllowed(true);
        tabla2.setColumnSelectionAllowed(true);
        tabla2.setSelectionForeground(Color.WHITE);
        tabla2.setSelectionBackground(Color.GRAY);
        add(new JScrollPane(tabla2), BorderLayout.CENTER);

        panel2.add(tabla2);
        panel2.add(h2,BorderLayout.NORTH);
    }

    private void cargarComponentespanel3(){
    tabla3= new JTable(datos3,titulos3);
    h3 = tabla3.getTableHeader();
    tabla3.setBounds(10, 10, 400, 300);
    tabla3.setShowHorizontalLines(true);
    tabla3.setRowSelectionAllowed(true);
    tabla3.setColumnSelectionAllowed(true);
    tabla3.setSelectionForeground(Color.WHITE);
    tabla3.setSelectionBackground(Color.gray);
    add(new JScrollPane(tabla3), BorderLayout.CENTER);

    panel3.add(tabla3);
    panel3.add(h3,BorderLayout.NORTH);
    
    }

    private void cargarComponentespanel4(){
    panel4.add(textoInicio);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btn1){
            panel1.setVisible(true);
            panel2.setVisible(false);
            panel3.setVisible(false);
            panel4.setVisible(false);
        }
        else if(e.getSource() == btn2){
            panel1.setVisible(false);
            panel2.setVisible(true);
            panel3.setVisible(false);
            panel4.setVisible(false);
        }
        else if(e.getSource() == btn3){
            panel1.setVisible(false);
            panel2.setVisible(false);
            panel3.setVisible(true);
            panel4.setVisible(false);
        }
        else if(e.getSource() == btn4){
            panel1.setVisible(false);
            panel2.setVisible(false);
            panel3.setVisible(false);
            panel4.setVisible(true);
        }
    }

}
