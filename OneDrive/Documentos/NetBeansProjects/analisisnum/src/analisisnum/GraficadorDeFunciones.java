package analisisnum;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;

public class GraficadorDeFunciones extends JFrame {

    private JComboBox<String> funcionesComboBox;
    private JButton confirmarButton;
    private JButton graficarButton;
    private XYSeries graficaSeries;
    double x0, y0, y1, x1, x2, y2, x3, y3, x4, y4, x5, y5, x6, y6, a0, a1, a2, a3, a4, a5, a6, a7, x, r;
    // Campos de texto para la interpolación
    private JTextField[] xTextField;
    private JTextField[] yTextField;
    private JPanel inputPanel; // Nuevo panel para campos de texto y botón "Confirmar"

    public GraficadorDeFunciones() {
        super("Graficador de Funciones");
        initComponents();
    }

    private void initComponents() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(800, 600);

        // Componentes
        funcionesComboBox = new JComboBox<>(new String[]{"Interpolacion grado 2", "Interpolacion grado 3", "Interpolacion grado 4", "Interpolacion grado 5", "Interpolacion grado 6", "Interpolacion grado 7"});
        confirmarButton = new JButton("Confirmar");
        graficarButton = new JButton("Graficar");
        graficaSeries = new XYSeries("Función");

        // Inicializar campos de texto
        xTextField = new JTextField[7];
        yTextField = new JTextField[7];
        for (int i = 0; i < 7; i++) {
            xTextField[i] = new JTextField(5);
            yTextField[i] = new JTextField(5);
            xTextField[i].setVisible(false);
            yTextField[i].setVisible(false);
        }

        // Configurar el gráfico
        JFreeChart chart = ChartFactory.createXYLineChart(
                "Gráfico de Función",
                "X",
                "Y",
                new XYSeriesCollection(graficaSeries),
                PlotOrientation.VERTICAL,
                true,
                true,
                false
        );

        ChartPanel chartPanel = new ChartPanel(chart);
        chartPanel.setPreferredSize(new java.awt.Dimension(760, 450));
        chartPanel.setMouseWheelEnabled(true);

        // Configurar el nuevo panel para campos de texto y botón "Confirmar"
        inputPanel = new JPanel();
        GroupLayout inputLayout = new GroupLayout(inputPanel);
        inputPanel.setLayout(inputLayout);
        inputLayout.setHorizontalGroup(
                inputLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(inputLayout.createSequentialGroup()
                                .addComponent(confirmarButton)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(graficarButton)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(funcionesComboBox, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(inputLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addGroup(inputLayout.createSequentialGroup()
                                                .addComponent(xTextField[0])
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(yTextField[0]))
                                        .addGroup(inputLayout.createSequentialGroup()
                                                .addComponent(xTextField[1])
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(yTextField[1]))
                                        .addGroup(inputLayout.createSequentialGroup()
                                                .addComponent(xTextField[2])
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(yTextField[2]))
                                        .addGroup(inputLayout.createSequentialGroup()
                                                .addComponent(xTextField[3])
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(yTextField[3]))
                                        .addGroup(inputLayout.createSequentialGroup()
                                                .addComponent(xTextField[4])
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(yTextField[4]))
                                        .addGroup(inputLayout.createSequentialGroup()
                                                .addComponent(xTextField[5])
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(yTextField[5]))
                                        .addGroup(inputLayout.createSequentialGroup()
                                                .addComponent(xTextField[6])
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(yTextField[6]))))
        );
        inputLayout.setVerticalGroup(
                inputLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(inputLayout.createSequentialGroup()
                                .addGroup(inputLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(confirmarButton)
                                        .addComponent(graficarButton)
                                        .addComponent(funcionesComboBox, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(xTextField[0])
                                        .addComponent(yTextField[0]))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(inputLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(xTextField[1])
                                        .addComponent(yTextField[1]))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(inputLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(xTextField[2])
                                        .addComponent(yTextField[2]))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(inputLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(xTextField[3])
                                        .addComponent(yTextField[3]))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(inputLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(xTextField[4])
                                        .addComponent(yTextField[4]))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(inputLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(xTextField[5])
                                        .addComponent(yTextField[5]))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(inputLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(xTextField[6])
                                        .addComponent(yTextField[6]))
                                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        // Configurar el diseño principal
        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addComponent(inputPanel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(chartPanel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addContainerGap())
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(inputPanel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(chartPanel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addContainerGap())
        );

        // Configurar acciones de botones
        graficarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                graficarFuncion();
                repaint();
            }
        });

        // Configurar listener para el ComboBox
        funcionesComboBox.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                actualizarVisibilidadCampos();
            }
        });

        // Configurar acciones de botones
        confirmarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String funcionSeleccionada = (String) funcionesComboBox.getSelectedItem();
                if (funcionSeleccionada.equals("Interpolacion grado 2")) {
                    x0 = Double.parseDouble(xTextField[0].getText());
                    x1 = Double.parseDouble(xTextField[1].getText());
                    y0 = Double.parseDouble(yTextField[0].getText());
                    y1 = Double.parseDouble(yTextField[1].getText());
                    interpolacionGrado2();
                }
                if (funcionSeleccionada.equals("Interpolacion grado 3")) {
                    x0 = Double.parseDouble(xTextField[0].getText());
                    x1 = Double.parseDouble(xTextField[1].getText());
                    x2 = Double.parseDouble(xTextField[2].getText());
                    y0 = Double.parseDouble(yTextField[0].getText());
                    y1 = Double.parseDouble(yTextField[1].getText());
                    y2 = Double.parseDouble(yTextField[2].getText());

                    interpolacionGrado3();
                }
                if (funcionSeleccionada.equals("Interpolacion grado 4")) {
                    x0 = Double.parseDouble(xTextField[0].getText());
                    x1 = Double.parseDouble(xTextField[1].getText());
                    x2 = Double.parseDouble(xTextField[2].getText());
                    x3 = Double.parseDouble(xTextField[3].getText());
                    y0 = Double.parseDouble(yTextField[0].getText());
                    y1 = Double.parseDouble(yTextField[1].getText());
                    y2 = Double.parseDouble(yTextField[2].getText());
                    y3 = Double.parseDouble(yTextField[3].getText());

                    interpolacionGrado4();
                }
                if (funcionSeleccionada.equals("Interpolacion grado 5")) {
                    x0 = Double.parseDouble(xTextField[0].getText());
                    x1 = Double.parseDouble(xTextField[1].getText());
                    x2 = Double.parseDouble(xTextField[2].getText());
                    x3 = Double.parseDouble(xTextField[3].getText());
                    x4 = Double.parseDouble(xTextField[4].getText());
                    y0 = Double.parseDouble(yTextField[0].getText());
                    y1 = Double.parseDouble(yTextField[1].getText());
                    y2 = Double.parseDouble(yTextField[2].getText());
                    y3 = Double.parseDouble(yTextField[3].getText());
                    y4 = Double.parseDouble(yTextField[4].getText());

                    interpolacionGrado5();
                }
                if (funcionSeleccionada.equals("Interpolacion grado 6")) {
                    x0 = Double.parseDouble(xTextField[0].getText());
                    x1 = Double.parseDouble(xTextField[1].getText());
                    x2 = Double.parseDouble(xTextField[2].getText());
                    x3 = Double.parseDouble(xTextField[3].getText());
                    x4 = Double.parseDouble(xTextField[4].getText());
                    x5 = Double.parseDouble(xTextField[5].getText());
                    y0 = Double.parseDouble(yTextField[0].getText());
                    y1 = Double.parseDouble(yTextField[1].getText());
                    y2 = Double.parseDouble(yTextField[2].getText());
                    y3 = Double.parseDouble(yTextField[3].getText());
                    y4 = Double.parseDouble(yTextField[4].getText());
                    y5 = Double.parseDouble(yTextField[5].getText());

                    interpolacionGrado6();
                }
                if (funcionSeleccionada.equals("Interpolacion grado 7")) {
                    x0 = Double.parseDouble(xTextField[0].getText());
                    x1 = Double.parseDouble(xTextField[1].getText());
                    x2 = Double.parseDouble(xTextField[2].getText());
                    x3 = Double.parseDouble(xTextField[3].getText());
                    x4 = Double.parseDouble(xTextField[4].getText());
                    x5 = Double.parseDouble(xTextField[5].getText());
                    x6 = Double.parseDouble(xTextField[6].getText());
                    y0 = Double.parseDouble(yTextField[0].getText());
                    y1 = Double.parseDouble(yTextField[1].getText());
                    y2 = Double.parseDouble(yTextField[2].getText());
                    y3 = Double.parseDouble(yTextField[3].getText());
                    y4 = Double.parseDouble(yTextField[4].getText());
                    y5 = Double.parseDouble(yTextField[5].getText());
                    y6 = Double.parseDouble(yTextField[6].getText());

                    interpolacionGrado7();
                }

            }
        });
    }

    private void graficarFuncion() {
        // Obtener la función seleccionada
        String funcionSeleccionada = (String) funcionesComboBox.getSelectedItem();
        // Limpiar el gráfico
        graficaSeries.clear();

        // Generar valores para x en un rango
        for (double x = -100000; x <= 100000; x += 0.1) {
            double y = evaluarFuncion(funcionSeleccionada, x);
            graficaSeries.add(x, y);
        }

        // Repintar el panel de la gráfica
        inputPanel.repaint();
    }

    private void cargarValores() {
        // Cargar los valores de los campos de texto a los campos de interpolación
        for (int i = 0; i < 7; i++) {
            xTextField[i].setText("");  // Limpiar los campos de texto
            yTextField[i].setText("");
        }
    }

    private double evaluarFuncion(String funcion, double x) {
        switch (funcion) {
            case "Interpolacion grado 2":
                return a0 + a1 * (x - x0);
            //return Math.sin(x);
            case "Interpolacion grado 3":
                return a0 + (a1 * (x - x0)) + (a2 * (x - x0) * (x - x1));
            // return interpolacionGrado3(x);
            case "Interpolacion grado 4":
                return a0 + (a1 * (x - x0)) + (a2 * (x - x0) * (x - x1)) + (a3 * (x - x0) * (x - x1) * (x - x2));
            //return interpolacionGrado4(x);
            case "Interpolacion grado 5":
                return  a0 + (a1 * (x - x0)) + (a2 * (x - x0) * (x - x1)) + (a3 * (x - x0) * (x - x1) * (x - x2)) + (a4 * (x - x0) * (x - x1) * (x - x2) * (x - x3));
            //return interpolacionGrado5(x);
            case "Interpolacion grado 6":
                 return a0 + (a1*(x - x0)) + (a2*(x - x0)*(x - x1)) + (a3*(x - x0)*(x - x1)*(x - x2)) + (a4*(x - x0)*(x - x1)*(x - x2)*(x - x3)) + (a5*(x - x0)*(x - x1)*(x - x2)*(x - x3)*(x - x4));
            //return interpolacionGrado6(x);
            case "Interpolacion grado 7":
            //return interpolacionGrado7(x);
            default:
                return 0;
        }
    }

    private void interpolacionGrado2() {
        System.out.printf("Puntos: (" + x0 + "," + y0 + ")" + "(" + x1 + "," + y1 + ")");

        a0 = y0;
        a1 = (y1 - y0) / (x1 - x0);

        JOptionPane.showMessageDialog(this, "El polinomio es:" + a0 + " + " + a1 + "(x - " + x0 + ")");

        char opc;
        do {

            x = Double.parseDouble(JOptionPane.showInputDialog(this, "\nIngrese el valor en el que desea probar el polinomio 'x': "));
            // completar para grado 6
            r = a0 + (a1 * (x - x0));
            JOptionPane.showMessageDialog(this, "El polinomio evaluado en " + x + " es " + r);
            //System.out.printf("\nEl valor del polinomio evaluado en '%.2f' es de: %.2f", x, r);
            opc = JOptionPane.showInputDialog("Desea probar mÃ¡s puntos? (Y/N): ").charAt(0);

        } while (opc != 'N' && opc != 'n');

    }

    private void interpolacionGrado3() {
        System.out.println("Puntos: (" + x0 + "," + y0 + ")" + "(" + x1 + "," + y1 + ")" + "(" + x2 + "," + y2 + ")");
        //printf("Puntos: (%.2f,%.2f), (%.2f,%.2f), (%.2f,%.2f),",x0,y0,x1,y1,x2,y2);

        a0 = y0;
        a1 = (y1 - y0) / (x1 - x0);
        a2 = (((y2 - y0) / (x2 - x0)) - a1) / (x2 - x1);
        JOptionPane.showMessageDialog(this, "El polinomio es:" + a0 + " + " + a1 + "(x - " + x0 + ") + " + a2 + "(x - " + x0 + ")(x - " + x1 + ")");
        //printf("\nEl polinomio es: %.2f + %.2f(x - %.2f) + %.2f(x - %.2f)(x - %.2f)", a0, a1, x0, a2, x0, x1);
        char opc;
        do {

            x = Double.parseDouble(JOptionPane.showInputDialog("\nIngrese el el valor en el que desea probar el polinomio 'x': "));
            r = a0 + (a1 * (x - x0)) + (a2 * (x - x0) * (x - x1));
            JOptionPane.showMessageDialog(this, "\nEl valor del polinomio evaluado en " + x + "es de: " + r);
            opc = JOptionPane.showInputDialog("Desea probar mÃ¡s puntos? (Y/N): ").charAt(0);

        } while (opc != 'N' && opc != 'n');

    }

    private void interpolacionGrado4() {
        System.out.println("Puntos: (" + x0 + "," + y0 + ")" + "(" + x1 + "," + y1 + ")" + "(" + x2 + "," + y2 + ")" + "(" + x3 + "," + y3 + ")");
        a0 = y0;
        a1 = (y1 - y0) / (x1 - x0);
        a2 = (((y2 - y0) / (x2 - x0)) - a1) / (x2 - x1);
        a3 = (((((y3 - y0) / (x3 - x0)) - a1) / (x3 - x1)) - a2) / (x3 - x2);
        JOptionPane.showMessageDialog(this, "El polinomio es:" + a0 + " + " + "(" + a1 + ")*(x - " + x0 + ")) + (" + a2 + "*(x - " + x0 + ")*(x - " + x1 + ")) + (" + a3 + "*(x - " + x0 + ")*(x - " + x1 + ")*(x - " + x2 + "))");
        //printf("\nEl polinomio es: %.2f + %.2f(x - %.2f) + %.2f(x - %.2f)(x - %.2f)", a0, a1, x0, a2, x0, x1);
        char opc;
        do {

            x = Double.parseDouble(JOptionPane.showInputDialog("\nIngrese el el valor en el que desea probar el polinomio 'x': "));
            r = a0 + (a1 * (x - x0)) + (a2 * (x - x0) * (x - x1)) + (a3 * (x - x0) * (x - x1) * (x - x2));
            JOptionPane.showMessageDialog(this, "\nEl valor del polinomio evaluado en " + x + "es de: " + r);
            opc = JOptionPane.showInputDialog("Desea probar mÃ¡s puntos? (Y/N): ").charAt(0);

        } while (opc != 'N' && opc != 'n');

    }

    private void interpolacionGrado5() {
        System.out.println("Puntos: (" + x0 + "," + y0 + ")" + "(" + x1 + "," + y1 + ")" + "(" + x2 + "," + y2 + ")" + "(" + x3 + "," + y3 + ")" + "(" + x4 + "," + y4 + ")");
        a0 = y0;
        a1 = (y1 - y0) / (x1 - x0);
        a2 = (((y2 - y0) / (x2 - x0)) - a1) / (x2 - x1);
        a3 = (((((y3 - y0) / (x3 - x0)) - a1) / (x3 - x1)) - a2) / (x3 - x2);
        a4 = (((((((y4 - y0) / (x4 - x0)) - a1) / (x4 - x1)) - a2) / (x4 - x2)) - a3) / (x4 - x3);
        JOptionPane.showMessageDialog(this, "EL polinomio es: \n"+a0 +" + "+ "("+a1+" * (x - "+x0+")) + ("+a2+" * (x - "+x0+") * (x - "+x1+")) + ("+a3+" * (x - "+x0+") * (x - "+x1+") * (x - "+x2+")) + ("+a4+" * (x - "+x0+") * (x - "+x1+") * (x - "+x2+") * (x - "+x3+"))");
        char opc;
        do {
            x= Double.parseDouble(JOptionPane.showInputDialog(this,"\nIngrese el el valor en el que desea probar el polinomio 'x': "));
            r = a0 + (a1 * (x - x0)) + (a2 * (x - x0) * (x - x1)) + (a3 * (x - x0) * (x - x1) * (x - x2)) + (a4 * (x - x0) * (x - x1) * (x - x2) * (x - x3));
            JOptionPane.showMessageDialog(this, "\nEl valor del polinomio evaluado en " + x + "es de: " + r);
            opc = JOptionPane.showInputDialog("Desea probar mÃ¡s puntos? (Y/N): ").charAt(0);

        } while (opc != 'N' && opc != 'n');

    }

    private void interpolacionGrado6() {
         System.out.println("Puntos: (" + x0 + "," + y0 + ")" + "(" + x1 + "," + y1 + ")" + "(" + x2 + "," + y2 + ")" + "(" + x3 + "," + y3 + ")" + "(" + x4 + "," + y4 + ")"+ x5 + "," + y5 + ")");
         a0 = y0;
        a1 = (y1 - y0)/(x1 - x0);
        a2 = (((y2 - y0)/(x2 - x0)) - a1)/(x2 - x1);
        a3 = (((((y3 - y0)/(x3 - x0)) - a1)/(x3 - x1)) - a2)/(x3 - x2); 
        a4 = (((((((y4 - y0)/(x4 - x0)) - a1)/(x4 - x1)) - a2)/(x4 - x2)) - a3)/(x4 - x3); 
        a5 = (((((((((y5 - y0)/(x5 - x0)) - a1)/(x5 - x1)) - a2)/(x5 - x2)) - a3)/(x5 - x3)) - a4)/(x5 - x4);
        JOptionPane.showMessageDialog(null, "El polinomio Es: "+a0+" + ("+a1+"*(x - "+x0+")) + ("+a2+"*(x - "+x0+")*(x - "+x1+")) + ("+a3+"*(x - "+x0+")*(x - "+x1+")*(x - "+x2+")) + ("+a4+"*(x - "+x0+")*(x - "+x1+")*(x - "+x2+")*(x - "+x3+")) + ("+a5+"*(x - "+x0+")*(x - "+x1+")*(x - "+x2+")*(x - "+x3+")*(x - "+x4+"))");
        char opc;
        do {
            x= Double.parseDouble(JOptionPane.showInputDialog(this,"\nIngrese el el valor en el que desea probar el polinomio 'x': "));
            r = a0 + (a1*(x - x0)) + (a2*(x - x0)*(x - x1)) + (a3*(x - x0)*(x - x1)*(x - x2)) + (a4*(x - x0)*(x - x1)*(x - x2)*(x - x3)) + (a5*(x - x0)*(x - x1)*(x - x2)*(x - x3)*(x - x4));
            JOptionPane.showMessageDialog(this, "\nEl valor del polinomio evaluado en " + x + "es de: " + r);
            opc = JOptionPane.showInputDialog("Desea probar mÃ¡s puntos? (Y/N): ").charAt(0);

        } while (opc != 'N' && opc != 'n');
         
    }

    private void interpolacionGrado7() {
        
    }

    private void actualizarVisibilidadCampos() {
        int gradoSeleccionado = funcionesComboBox.getSelectedIndex() + 2; // Se agrega 2 ya que los grados van de 2 a 7

        for (int i = 0; i < 7; i++) {
            xTextField[i].setVisible(i < gradoSeleccionado);
            yTextField[i].setVisible(i < gradoSeleccionado);
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new GraficadorDeFunciones().setVisible(true);
            }
        });
    }
}
