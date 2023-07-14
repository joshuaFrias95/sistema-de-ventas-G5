package gui;

import java.awt.Color;
import java.awt.Font;
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
        
        // ~~~ /// Método 1 \\\ `~~~
        
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
        
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        menu = new javax.swing.JPanel();
        bienvenida = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        contenido = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(825, 550));

        menu.setPreferredSize(new java.awt.Dimension(250, 550));

        bienvenida.setText("Bienvenido usuario");

        jLabel1.setText("Producto:");

        jLabel2.setText("Recibe:");

        jLabel3.setText("SUBTOTAL:");

        jLabel4.setText("TOTAL:");

        jLabel5.setText("CAMBIO:");

        jButton1.setText("Completar operación");

        javax.swing.GroupLayout menuLayout = new javax.swing.GroupLayout(menu);
        menu.setLayout(menuLayout);
        menuLayout.setHorizontalGroup(
            menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuLayout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel5)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2)
                    .addComponent(jTextField2, javax.swing.GroupLayout.DEFAULT_SIZE, 177, Short.MAX_VALUE)
                    .addComponent(jLabel1)
                    .addComponent(bienvenida)
                    .addComponent(jTextField1)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(31, Short.MAX_VALUE))
        );
        menuLayout.setVerticalGroup(
            menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuLayout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(bienvenida)
                .addGap(39, 39, 39)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(119, 119, 119)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addGap(12, 12, 12)
                .addComponent(jLabel4)
                .addGap(26, 26, 26)
                .addComponent(jLabel5)
                .addGap(39, 39, 39)
                .addComponent(jButton1)
                .addContainerGap(48, Short.MAX_VALUE))
        );

        getContentPane().add(menu, java.awt.BorderLayout.EAST);

        javax.swing.GroupLayout contenidoLayout = new javax.swing.GroupLayout(contenido);
        contenido.setLayout(contenidoLayout);
        contenidoLayout.setHorizontalGroup(
            contenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        contenidoLayout.setVerticalGroup(
            contenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 550, Short.MAX_VALUE)
        );

        getContentPane().add(contenido, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
    private javax.swing.JPanel contenido;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JPanel menu;
    // End of variables declaration//GEN-END:variables
}
