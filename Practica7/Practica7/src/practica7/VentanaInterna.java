package practica7;

/**
 *
 * @author Javier Aranda
 */
public class VentanaInterna extends javax.swing.JInternalFrame {

    /**
     * Creates new form VentanaInterna
     */
    public VentanaInterna() {
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

        lienzo2D1 = new sm.JAI.iu.Lienzo2D();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Nuevo Lienzo");

        javax.swing.GroupLayout lienzo2D1Layout = new javax.swing.GroupLayout(lienzo2D1);
        lienzo2D1.setLayout(lienzo2D1Layout);
        lienzo2D1Layout.setHorizontalGroup(
            lienzo2D1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 394, Short.MAX_VALUE)
        );
        lienzo2D1Layout.setVerticalGroup(
            lienzo2D1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 274, Short.MAX_VALUE)
        );

        getContentPane().add(lienzo2D1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private sm.JAI.iu.Lienzo2D lienzo2D1;
    // End of variables declaration//GEN-END:variables
}
