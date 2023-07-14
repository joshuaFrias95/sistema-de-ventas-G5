package gui;

import java.awt.Color;
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
        
        contenido.setBackground(new Color(200, 200, 200));
        menu.setBackground(Color.gray);
        
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        menu = new javax.swing.JPanel();
        contenido = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(825, 550));

        menu.setPreferredSize(new java.awt.Dimension(250, 550));

        javax.swing.GroupLayout menuLayout = new javax.swing.GroupLayout(menu);
        menu.setLayout(menuLayout);
        menuLayout.setHorizontalGroup(
            menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 250, Short.MAX_VALUE)
        );
        menuLayout.setVerticalGroup(
            menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 550, Short.MAX_VALUE)
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
    private javax.swing.JPanel contenido;
    private javax.swing.JPanel menu;
    // End of variables declaration//GEN-END:variables
}
