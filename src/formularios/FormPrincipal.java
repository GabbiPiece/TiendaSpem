/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package formularios;

/**
 *
 * @author Smile
 */
public class FormPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form FormPrincipal
     */
    public FormPrincipal() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar1 = new javax.swing.JMenuBar();
        menuCliente = new javax.swing.JMenu();
        menuClienteListado = new javax.swing.JMenuItem();
        menuClienteAlta = new javax.swing.JMenuItem();
        menuCuentas = new javax.swing.JMenu();
        menuCuentasListado = new javax.swing.JMenuItem();
        menuCuentasAlta = new javax.swing.JMenuItem();
        menuProductos = new javax.swing.JMenu();
        menuProductosListado = new javax.swing.JMenuItem();
        menuProductosAlta = new javax.swing.JMenuItem();
        menuUsuario = new javax.swing.JMenu();
        menuUsuarioConfiguracion = new javax.swing.JMenuItem();
        menuUsuarioSalir = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Spem");

        menuCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/clientes.png"))); // NOI18N
        menuCliente.setText("Clientes");

        menuClienteListado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/listadoClientes.png"))); // NOI18N
        menuClienteListado.setText("Listado");
        menuClienteListado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuClienteListadoActionPerformed(evt);
            }
        });
        menuCliente.add(menuClienteListado);

        menuClienteAlta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/altaCliente.png"))); // NOI18N
        menuClienteAlta.setText("Nuevo Cliente");
        menuCliente.add(menuClienteAlta);

        jMenuBar1.add(menuCliente);

        menuCuentas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/cuentas.png"))); // NOI18N
        menuCuentas.setText("Cuentas");

        menuCuentasListado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/listadoClientes.png"))); // NOI18N
        menuCuentasListado.setText("Listado");
        menuCuentas.add(menuCuentasListado);

        menuCuentasAlta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/cuentasAlta.png"))); // NOI18N
        menuCuentasAlta.setText("Nueva Cuenta");
        menuCuentas.add(menuCuentasAlta);

        jMenuBar1.add(menuCuentas);

        menuProductos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/productos.png"))); // NOI18N
        menuProductos.setText("Productos");

        menuProductosListado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/listadoClientes.png"))); // NOI18N
        menuProductosListado.setText("Listado");
        menuProductos.add(menuProductosListado);

        menuProductosAlta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/productosAlta.png"))); // NOI18N
        menuProductosAlta.setText("Nuevo Producto");
        menuProductos.add(menuProductosAlta);

        jMenuBar1.add(menuProductos);

        menuUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/usuario.png"))); // NOI18N
        menuUsuario.setText("Usuario");

        menuUsuarioConfiguracion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/usuarioConfiuracion.png"))); // NOI18N
        menuUsuarioConfiguracion.setText("Configuracion");
        menuUsuario.add(menuUsuarioConfiguracion);

        menuUsuarioSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/cerrarSesion.png"))); // NOI18N
        menuUsuarioSalir.setText("Cerrar Sesion");
        menuUsuario.add(menuUsuarioSalir);

        jMenuBar1.add(menuUsuario);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 444, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 250, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void menuClienteListadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuClienteListadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_menuClienteListadoActionPerformed

    /**
     * @param args the command line arguments
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
            java.util.logging.Logger.getLogger(FormPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu menuCliente;
    private javax.swing.JMenuItem menuClienteAlta;
    private javax.swing.JMenuItem menuClienteListado;
    private javax.swing.JMenu menuCuentas;
    private javax.swing.JMenuItem menuCuentasAlta;
    private javax.swing.JMenuItem menuCuentasListado;
    private javax.swing.JMenu menuProductos;
    private javax.swing.JMenuItem menuProductosAlta;
    private javax.swing.JMenuItem menuProductosListado;
    private javax.swing.JMenu menuUsuario;
    private javax.swing.JMenuItem menuUsuarioConfiguracion;
    private javax.swing.JMenuItem menuUsuarioSalir;
    // End of variables declaration//GEN-END:variables
}
