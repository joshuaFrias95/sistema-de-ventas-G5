package gui;

import static gui.Agregar.obtenerInstanciaAgregar;
import static gui.Confirmacion.obtenerInstanciaConfirmacion;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.plaf.basic.BasicButtonUI;
/**
 *
 * @author Dr. lagrimasnegras
 */
public class VentanaPrincipal extends javax.swing.JFrame {

    /*
        En el contstructor de nuestro JFrame podemos ingresar todas las propiedades que necesitemos
        hacer fuera del Window builder, en esta ocasión solo quitaremos el resize.
    
        OJO: También es posible agregar ciertas propiedades desde el Window Builder (como lo hicimos 
        con el Prefered Size) y en nuestro método run (como hicimos con la posición relativa).
    */
    public VentanaPrincipal() {
        
        // Cargando propiedades desde el constructor
        setResizable(false);
        
 
        
        // Apartir del llamado de este método podemos comenzar a trabajar con los componentes
        initComponents();
        
        /*
        
        Podemos agregar color de dos formas diferentes: utilizando un color predefinido en Java o
        generando uno nuevo con valores rgb, rgba o hexadecimal. Estos valores creados también pueden ser
        guardados en una variable del tipo Color (un objeto). Probaremos todos esos métodos aquí.
        
        Vamos a trabajar con los métdosos .setBackground() y .setForeground()
        
            .setBackground() -> Cambia el color de fondo de los elementos
            .setForeground() -> Cambia el color de texto de los elementos
        
        Estos métodos pueden ser utilizados en cualquier elemento que tenga un fondo o texto respectivamente
        
        
        */
        
        // ~~~ Dandole estilos a los paneles contenedores ~~~
        contenido.setBackground(new Color(200, 200, 200));  // Creando un nuevo color de forma anónima
        menu.setBackground(Color.lightGray); // Uitlizando un color predefinido en Java Swing
        
        
        // ~~~ Dandole estilos a los JLabels ~~~
        
        /*
        
        Vamos a probar dos métodos interesantes para aplicar estilos (aunque puede ser utilizado para un sin fin de cosas.
        
        1. Podemos aplicar estilos uno a uno como lo haremos a nuestro JLabel "bienvenida"
        2. Podemos utilizar ciclos para aplicar el mismo a varios estilos
        
        OJO: Estos dos métodos que revisaremos no solo se aplican a JLabels, puedes aplicarlo a todos los elementos que necesites
        
        */
        
        // ~~~ /// Método 1 - Estilos uno a uno \\\ `~~~
        
        // Almacenando un color en una variable del tipo Color
        
        Color texto = new Color(15, 15, 15);    // Valores rgb
        bienvenida.setForeground(texto);   // Implementación de nuestro color almacenado
        /*
        Al igual que el color es posible generar fuentes nuevas instanciando anónimamente la clase Font.
        Este contiene un constructor que pide tres parámetros que son:
            1. Fuente
            2. Estilo
            3. Tamaño de fuente
        
        De igual manera que el color es posible almacenar esos valores en una variable
        */
        bienvenida.setFont(new Font("Arial", Font.BOLD, 20));   
        
        // ~~~ /// Método 1 - Estilos por medio de ciclos for \\\ `~~~
        
        /*
        Para hacer más limpio nuestro programa y no repetir lineas innecesarias es posible utilizar ciclos for
        para agregar propiedades, existen muchas formas diferentes de hacer esto mismo pero aquí haremos uso de
        únicamente dos cosas:
        
            - un array
            - un ciclo for o for each
        */
        
        // 2.1 Agrupamos los elementos de forma semántica junto con los estilos de fuente que vamos a utilizar para cada uno
        // 2.2 Creamos un método que realice las modificaciones
        // 2.3 Imlementando el método llenando los parámetros solicidato
        
        
        Font fuentetitulos = new Font("Arial", Font.ITALIC, 13);
        Font fuentetotal = new Font("Arial", Font.BOLD, 19);
        Font textFieldfont = new Font("Arial", Font.PLAIN, 12);
       
        
        // Array con Text fields
        JTextField [] textFields = {
            textFieldProductoVp,
            textFieldValorVp
        };
        
        setStyles(textFields, textFieldfont);
        
        
        ///Arrays con JLabels
        JLabel [] titulosTextFields = {
            productoTitulo,
            recibeTitulo
        };
        
        setStyles(titulosTextFields, texto, fuentetitulos);
        
        JLabel [] totales = {
            subtotal,
            cambio,
            total
        };
        
        setStyles(totales, texto, fuentetotal);
        
        setStyles(completar);
        
        
        
    }
    
    // Método para cambiar estilos usado para fuente
    private void setStyles(JLabel [] label, Color color, Font font) {
        for (JLabel lb : label) {
            lb.setForeground(color);    // Reutilizaremos más adelante nuestra variable texto del tipo Color en la linea 68, por mientras solo le indicamos como parámetro que utilizaremos tal tipo de valor
            lb.setFont(font);
        }
    }
    
    // Aplicamos sobre carga de funciones
    private void setStyles(JTextField [] txtfld, Font font) {
        for (JTextField fld : txtfld) {
            fld.setBackground(new Color(201, 200, 197));
            fld.setFont(font);
            fld.setForeground(Color.darkGray);
            fld.addMouseListener(new MouseAdapter(){
                @Override
                public void mouseEntered(MouseEvent e) {
                    fld.setBackground(new Color(221, 220, 217));
                }

                @Override
                public void mouseExited(MouseEvent e) {
                    fld.setBackground(new Color(201, 200, 197));
                }              
        });
        }
    }
    
    private void setStyles(JButton boton) {
        boton.setUI(new BasicButtonUI());
        boton.setBackground(new Color(0, 100, 0));
        boton.setForeground(Color.white);
        boton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                boton.setCursor(new Cursor(Cursor.HAND_CURSOR));
            }

            @Override
            public void mouseClicked(MouseEvent e) {
                boton.setBackground(new Color(0, 150, 0));
            }

            @Override
            public void mouseExited(MouseEvent e) {
                boton.setBackground(new Color(0, 100, 0));
            }
            
            
            
            
        });
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        menu = new javax.swing.JPanel();
        bienvenida = new javax.swing.JLabel();
        productoTitulo = new javax.swing.JLabel();
        textFieldProductoVp = new javax.swing.JTextField();
        recibeTitulo = new javax.swing.JLabel();
        textFieldValorVp = new javax.swing.JTextField();
        subtotal = new javax.swing.JLabel();
        cambio = new javax.swing.JLabel();
        total = new javax.swing.JLabel();
        completar = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        contenido = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableProductos = new javax.swing.JTable();

        jTextField1.setText("jTextField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        menu.setPreferredSize(new java.awt.Dimension(250, 550));

        bienvenida.setText("Bienvenido usuario");

        productoTitulo.setText("Producto:");

        recibeTitulo.setText("Recibe:");

        subtotal.setText("SUBTOTAL:");

        cambio.setText("CAMBIO:");

        total.setText("TOTAL:");

        completar.setText("Completar operación");
        completar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                completarActionPerformed(evt);
            }
        });

        jButton1.setText("+");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout menuLayout = new javax.swing.GroupLayout(menu);
        menu.setLayout(menuLayout);
        menuLayout.setHorizontalGroup(
            menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(total)
                    .addComponent(cambio)
                    .addComponent(subtotal)
                    .addComponent(recibeTitulo)
                    .addComponent(textFieldValorVp)
                    .addComponent(productoTitulo)
                    .addComponent(bienvenida)
                    .addComponent(textFieldProductoVp)
                    .addComponent(completar, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        menuLayout.setVerticalGroup(
            menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuLayout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(bienvenida)
                .addGap(66, 66, 66)
                .addComponent(productoTitulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textFieldProductoVp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addGap(43, 43, 43)
                .addComponent(recibeTitulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(textFieldValorVp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addComponent(subtotal)
                .addGap(12, 12, 12)
                .addComponent(cambio)
                .addGap(50, 50, 50)
                .addComponent(total)
                .addGap(18, 18, 18)
                .addComponent(completar, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(60, Short.MAX_VALUE))
        );

        getContentPane().add(menu, java.awt.BorderLayout.EAST);

        contenido.setLayout(new java.awt.BorderLayout());

        jTableProductos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null}
            },
            new String [] {
                "Nombre", "Categoria", "Cantidad", "Descripcion"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTableProductos);
        if (jTableProductos.getColumnModel().getColumnCount() > 0) {
            jTableProductos.getColumnModel().getColumn(0).setResizable(false);
            jTableProductos.getColumnModel().getColumn(0).setPreferredWidth(70);
            jTableProductos.getColumnModel().getColumn(1).setResizable(false);
            jTableProductos.getColumnModel().getColumn(1).setPreferredWidth(70);
            jTableProductos.getColumnModel().getColumn(2).setResizable(false);
            jTableProductos.getColumnModel().getColumn(2).setPreferredWidth(30);
            jTableProductos.getColumnModel().getColumn(3).setResizable(false);
            jTableProductos.getColumnModel().getColumn(3).setPreferredWidth(145);
        }

        contenido.add(jScrollPane1, java.awt.BorderLayout.CENTER);

        getContentPane().add(contenido, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void completarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_completarActionPerformed
        /* Se crea y inicializa instancia de Clase Confirmacion para que haya una sola en toda la ejecucion */
        Confirmacion conf = obtenerInstanciaConfirmacion();
        conf.setVisible(true);
        // Cerrar ventana secundaria pero no la principal
        conf.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        conf.setResizable(false);
    }//GEN-LAST:event_completarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        /* Se crea y inicializa instancia de Clase Agregar para que haya una sola en toda la ejecucion */
        Agregar agr = obtenerInstanciaAgregar();
        agr.setVisible(true);
        // Cerrar ventana secundaria pero no la principal
        agr.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        agr.setResizable(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * En Netbeans es común que genere un try catch que incluye un Look & Feel,
     * este se genera debajo del comentario "Set the (nombre del look and feel)"
     * y termina sobre el comentario "Create and display form". Este L & F no es 
     * indispensable y es posible eliminarlo teniendo quidado de no eliminar
     * la función java.awt.EventQueue.invokeLater
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                /**
                 * Originalmente el IDE nos va a generar la siguiente linea:
                 * 
                 * new VentanaPrincipal().setVisible(true);
                 * 
                 * Podemos dejarla tal cual, sin embargo, si quieremos agregar métodos en tiempo de ejecución 
                 * será más sencillo instanciar nuestro JFrame de la siguiente manera
                 */
                
                VentanaPrincipal vp = new VentanaPrincipal();   // Instanciamos nuestro JFrame con las iniciales de su nombre
                vp.pack();
                vp.setLocationRelativeTo(null);     // Indicamos que la ventana se abra siempre al centro
                vp.setVisible(true);    // el método .setVisible(true) es importante ya que nos va a permitir mostrar nuestro programa, siempre debe ir al final del mismo

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bienvenida;
    private javax.swing.JLabel cambio;
    private javax.swing.JButton completar;
    private javax.swing.JPanel contenido;
    private javax.swing.JButton jButton1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableProductos;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JPanel menu;
    private javax.swing.JLabel productoTitulo;
    private javax.swing.JLabel recibeTitulo;
    private javax.swing.JLabel subtotal;
    private javax.swing.JTextField textFieldProductoVp;
    private javax.swing.JTextField textFieldValorVp;
    private javax.swing.JLabel total;
    // End of variables declaration//GEN-END:variables
}
