/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica8;

import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;
import javax.swing.JFileChooser;

/**
 *
 * @author JaviAir
 */
public class VentanaPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form VentanaPrincipal
     */
    public VentanaPrincipal() {
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

        buttonGroupShapesYEditar = new javax.swing.ButtonGroup();
        jToolBar1 = new javax.swing.JToolBar();
        jButtonNuevo = new javax.swing.JButton();
        jButtonAbrir = new javax.swing.JButton();
        jButtonGuardar = new javax.swing.JButton();
        jToggleButtonPunto = new javax.swing.JToggleButton();
        jToggleButtonLinea = new javax.swing.JToggleButton();
        jToggleButtonRectangulo = new javax.swing.JToggleButton();
        jToggleButtonElipse = new javax.swing.JToggleButton();
        jToggleButtonEditar = new javax.swing.JToggleButton();
        jComboBox1 = new javax.swing.JComboBox();
        jSpinnerGrosor = new javax.swing.JSpinner();
        jToggleButtonRellenar = new javax.swing.JToggleButton();
        jToggleButtonTransparencia = new javax.swing.JToggleButton();
        jToggleButtonAlisar = new javax.swing.JToggleButton();
        jLabelBarraEstado = new javax.swing.JLabel();
        escritorio = new javax.swing.JDesktopPane();
        jMenuBar2 = new javax.swing.JMenuBar();
        jMenuArchivo = new javax.swing.JMenu();
        jMenuItemNuevo = new javax.swing.JMenuItem();
        jMenuItemAbrirç = new javax.swing.JMenuItem();
        jMenuItemGuardar = new javax.swing.JMenuItem();
        jMenuVer = new javax.swing.JMenu();
        jCheckBoxMenuItemEdicion = new javax.swing.JCheckBoxMenuItem();
        jMenuItemBarraFormas = new javax.swing.JMenuItem();
        jMenuItemBarraAtributos = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jToolBar1.setRollover(true);

        jButtonNuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/nuevo.png"))); // NOI18N
        jButtonNuevo.setFocusable(false);
        jButtonNuevo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonNuevo.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar1.add(jButtonNuevo);

        jButtonAbrir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/abrir.png"))); // NOI18N
        jButtonAbrir.setFocusable(false);
        jButtonAbrir.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonAbrir.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar1.add(jButtonAbrir);

        jButtonGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/guardar.png"))); // NOI18N
        jButtonGuardar.setFocusable(false);
        jButtonGuardar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonGuardar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar1.add(jButtonGuardar);

        buttonGroupShapesYEditar.add(jToggleButtonPunto);
        jToggleButtonPunto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/punto.png"))); // NOI18N
        jToggleButtonPunto.setFocusable(false);
        jToggleButtonPunto.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jToggleButtonPunto.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar1.add(jToggleButtonPunto);

        buttonGroupShapesYEditar.add(jToggleButtonLinea);
        jToggleButtonLinea.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/linea.png"))); // NOI18N
        jToggleButtonLinea.setFocusable(false);
        jToggleButtonLinea.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jToggleButtonLinea.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToggleButtonLinea.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButtonLineaActionPerformed(evt);
            }
        });
        jToolBar1.add(jToggleButtonLinea);

        buttonGroupShapesYEditar.add(jToggleButtonRectangulo);
        jToggleButtonRectangulo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/rectangulo.png"))); // NOI18N
        jToggleButtonRectangulo.setFocusable(false);
        jToggleButtonRectangulo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jToggleButtonRectangulo.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar1.add(jToggleButtonRectangulo);

        buttonGroupShapesYEditar.add(jToggleButtonElipse);
        jToggleButtonElipse.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/elipse.png"))); // NOI18N
        jToggleButtonElipse.setFocusable(false);
        jToggleButtonElipse.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jToggleButtonElipse.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar1.add(jToggleButtonElipse);

        buttonGroupShapesYEditar.add(jToggleButtonEditar);
        jToggleButtonEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/seleccion.png"))); // NOI18N
        jToggleButtonEditar.setFocusable(false);
        jToggleButtonEditar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jToggleButtonEditar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar1.add(jToggleButtonEditar);

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        jToolBar1.add(jComboBox1);
        jToolBar1.add(jSpinnerGrosor);

        jToggleButtonRellenar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/rellenar.png"))); // NOI18N
        jToggleButtonRellenar.setFocusable(false);
        jToggleButtonRellenar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jToggleButtonRellenar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar1.add(jToggleButtonRellenar);

        jToggleButtonTransparencia.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/transparencia.png"))); // NOI18N
        jToggleButtonTransparencia.setFocusable(false);
        jToggleButtonTransparencia.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jToggleButtonTransparencia.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar1.add(jToggleButtonTransparencia);

        jToggleButtonAlisar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/alisar.png"))); // NOI18N
        jToggleButtonAlisar.setFocusable(false);
        jToggleButtonAlisar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jToggleButtonAlisar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar1.add(jToggleButtonAlisar);

        getContentPane().add(jToolBar1, java.awt.BorderLayout.PAGE_START);

        jLabelBarraEstado.setText("Barra de estado");
        jLabelBarraEstado.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED)));
        getContentPane().add(jLabelBarraEstado, java.awt.BorderLayout.SOUTH);

        javax.swing.GroupLayout escritorioLayout = new javax.swing.GroupLayout(escritorio);
        escritorio.setLayout(escritorioLayout);
        escritorioLayout.setHorizontalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 577, Short.MAX_VALUE)
        );
        escritorioLayout.setVerticalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 218, Short.MAX_VALUE)
        );

        getContentPane().add(escritorio, java.awt.BorderLayout.CENTER);

        jMenuArchivo.setText("Archivo");

        jMenuItemNuevo.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.ALT_MASK));
        jMenuItemNuevo.setText("Nuevo");
        jMenuItemNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemNuevoActionPerformed(evt);
            }
        });
        jMenuArchivo.add(jMenuItemNuevo);

        jMenuItemAbrirç.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.ALT_MASK));
        jMenuItemAbrirç.setText("Abrir");
        jMenuItemAbrirç.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemAbrirçActionPerformed(evt);
            }
        });
        jMenuArchivo.add(jMenuItemAbrirç);

        jMenuItemGuardar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_G, java.awt.event.InputEvent.ALT_MASK));
        jMenuItemGuardar.setText("Guardar");
        jMenuItemGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemGuardarActionPerformed(evt);
            }
        });
        jMenuArchivo.add(jMenuItemGuardar);

        jMenuBar2.add(jMenuArchivo);

        jMenuVer.setText("Ver");

        jCheckBoxMenuItemEdicion.setSelected(true);
        jCheckBoxMenuItemEdicion.setText("Ver barra de estado");
        jCheckBoxMenuItemEdicion.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jCheckBoxMenuItemEdicionStateChanged(evt);
            }
        });
        jMenuVer.add(jCheckBoxMenuItemEdicion);

        jMenuItemBarraFormas.setText("Ver barra de formar");
        jMenuItemBarraFormas.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jMenuItemBarraFormasStateChanged(evt);
            }
        });
        jMenuVer.add(jMenuItemBarraFormas);

        jMenuItemBarraAtributos.setText("Ver barra de atributos");
        jMenuItemBarraAtributos.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jMenuItemBarraAtributosStateChanged(evt);
            }
        });
        jMenuVer.add(jMenuItemBarraAtributos);

        jMenuBar2.add(jMenuVer);

        setJMenuBar(jMenuBar2);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItemNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemNuevoActionPerformed
        //Creamos una nueva VentanaInterna con una imagen
        VentanaInterna vi = new VentanaInterna();
        //Añadimos la ventana interna al esccritorio
        escritorio.add(vi);
        vi.setVisible(true);
        BufferedImage img;
        img = new BufferedImage(300,300,BufferedImage.TYPE_INT_RGB);
        //codigo para que sea blanca, pintar un rectangulo blanco en la imagen (HACER)
        vi.getLienzo().setImage(img);

    }//GEN-LAST:event_jMenuItemNuevoActionPerformed

    private void jMenuItemAbrirçActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemAbrirçActionPerformed
                
        JFileChooser dlg = new JFileChooser();
        int resp = dlg.showOpenDialog(this);
        if( resp == JFileChooser.APPROVE_OPTION) {
            try{
                 File f = dlg.getSelectedFile();
                 BufferedImage img = ImageIO.read(f);
                 VentanaInterna vi = new VentanaInterna();
                 vi.getLienzo().setImage(img);
                 this.escritorio.add(vi);
                 vi.setTitle(f.getName());
                 vi.setVisible(true);
            }catch(Exception ex){
                System.err.println("Error al leer la imagen");
            }
        }
    }//GEN-LAST:event_jMenuItemAbrirçActionPerformed

    private void jMenuItemGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemGuardarActionPerformed

        VentanaInterna vi=(VentanaInterna) escritorio.getSelectedFrame();
            if (vi != null) {
                JFileChooser dlg = new JFileChooser();
                int resp = dlg.showSaveDialog(this);
                if (resp == JFileChooser.APPROVE_OPTION) {
                    try {
                        BufferedImage img = vi.getLienzo().getImage();
                        if (img != null) {
                            File f = dlg.getSelectedFile();
                            ImageIO.write(img, "jpg", f);
                            vi.setTitle(f.getName());
}
                    }catch (Exception ex) {
                        System.err.println("Error al guardar la imagen");
                    }
               }
            }
    }//GEN-LAST:event_jMenuItemGuardarActionPerformed

    private void jCheckBoxMenuItemEdicionStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jCheckBoxMenuItemEdicionStateChanged
        // Con este checkBox controlamos que la barra de estado sea visible o no
        this.jLabelBarraEstado.setVisible(this.jCheckBoxMenuItemEdicion.isSelected());
    }//GEN-LAST:event_jCheckBoxMenuItemEdicionStateChanged

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jMenuItemBarraFormasStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jMenuItemBarraFormasStateChanged
        // TODO add your handling code here:
        // Con este checkBox controlamos que la barra de estado sea visible o no
        this.jMenuItemBarraFormas.setVisible(this.jCheckBoxMenuItemEdicion.isSelected());
    }//GEN-LAST:event_jMenuItemBarraFormasStateChanged

    private void jMenuItemBarraAtributosStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jMenuItemBarraAtributosStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItemBarraAtributosStateChanged

    private void jToggleButtonLineaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButtonLineaActionPerformed
        // Boton de Linea
        
        
    }//GEN-LAST:event_jToggleButtonLineaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroupShapesYEditar;
    private javax.swing.JDesktopPane escritorio;
    private javax.swing.JButton jButtonAbrir;
    private javax.swing.JButton jButtonGuardar;
    private javax.swing.JButton jButtonNuevo;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItemEdicion;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JLabel jLabelBarraEstado;
    private javax.swing.JMenu jMenuArchivo;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuItem jMenuItemAbrirç;
    private javax.swing.JMenuItem jMenuItemBarraAtributos;
    private javax.swing.JMenuItem jMenuItemBarraFormas;
    private javax.swing.JMenuItem jMenuItemGuardar;
    private javax.swing.JMenuItem jMenuItemNuevo;
    private javax.swing.JMenu jMenuVer;
    private javax.swing.JSpinner jSpinnerGrosor;
    private javax.swing.JToggleButton jToggleButtonAlisar;
    private javax.swing.JToggleButton jToggleButtonEditar;
    private javax.swing.JToggleButton jToggleButtonElipse;
    private javax.swing.JToggleButton jToggleButtonLinea;
    private javax.swing.JToggleButton jToggleButtonPunto;
    private javax.swing.JToggleButton jToggleButtonRectangulo;
    private javax.swing.JToggleButton jToggleButtonRellenar;
    private javax.swing.JToggleButton jToggleButtonTransparencia;
    private javax.swing.JToolBar jToolBar1;
    // End of variables declaration//GEN-END:variables
}
