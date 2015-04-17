package practica7;

import java.awt.Color;
import java.io.File;
import javax.swing.JFileChooser;

/**
 *
 * @author Javier Aranda
 */
public class VentanaPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form VentanaPrincipal
     */
    public VentanaPrincipal() {
        initComponents();
        this.setSize(700, 700);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroupHerramientasDibujo = new javax.swing.ButtonGroup();
        jToolBarHerramientasDibujo = new javax.swing.JToolBar();
        jToggleButtonPunto = new javax.swing.JToggleButton();
        jToggleButtonLinea = new javax.swing.JToggleButton();
        jToggleButtonRectangulo = new javax.swing.JToggleButton();
        jToggleButtonOvalo = new javax.swing.JToggleButton();
        jLabelBarraEstado = new javax.swing.JLabel();
        pabelCentral = new javax.swing.JPanel();
        jToolBarHerramientasAbajo = new javax.swing.JToolBar();
        jPanelHerramientasAbajo = new javax.swing.JPanel();
        jPanelColor = new javax.swing.JPanel();
        panelColores = new javax.swing.JPanel();
        jToggleButtonColorNegro = new javax.swing.JToggleButton();
        jToggleButtonColorRojo = new javax.swing.JToggleButton();
        jToggleButtonColorAzul = new javax.swing.JToggleButton();
        jToggleButtonColorBlanco = new javax.swing.JToggleButton();
        jToggleButtonColorAmarillo = new javax.swing.JToggleButton();
        jToggleButtonColorVerde = new javax.swing.JToggleButton();
        jPanelGrosor = new javax.swing.JPanel();
        jSpinner1 = new javax.swing.JSpinner();
        jPanelCheksBox = new javax.swing.JPanel();
        jCheckBoxRelleno = new javax.swing.JCheckBox();
        jCheckBoxTrans = new javax.swing.JCheckBox();
        jCheckBoxAlisar = new javax.swing.JCheckBox();
        jCheckBoxEditar = new javax.swing.JCheckBox();
        escritorio = new javax.swing.JDesktopPane();
        jMenuBarArchivoEdicion = new javax.swing.JMenuBar();
        jMenuArchivo = new javax.swing.JMenu();
        jMenuItemNuevo = new javax.swing.JMenuItem();
        jMenuItemAbrirç = new javax.swing.JMenuItem();
        jMenuItemGuardar = new javax.swing.JMenuItem();
        jMenuEdicion = new javax.swing.JMenu();
        jCheckBoxMenuItemEdicion = new javax.swing.JCheckBoxMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jToolBarHerramientasDibujo.setRollover(true);

        buttonGroupHerramientasDibujo.add(jToggleButtonPunto);
        jToggleButtonPunto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Lapiz.gif"))); // NOI18N
        jToggleButtonPunto.setFocusable(false);
        jToggleButtonPunto.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jToggleButtonPunto.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToggleButtonPunto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButtonPuntoActionPerformed(evt);
            }
        });
        jToolBarHerramientasDibujo.add(jToggleButtonPunto);

        buttonGroupHerramientasDibujo.add(jToggleButtonLinea);
        jToggleButtonLinea.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Linea.gif"))); // NOI18N
        jToggleButtonLinea.setFocusable(false);
        jToggleButtonLinea.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jToggleButtonLinea.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToggleButtonLinea.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButtonLineaActionPerformed(evt);
            }
        });
        jToolBarHerramientasDibujo.add(jToggleButtonLinea);

        buttonGroupHerramientasDibujo.add(jToggleButtonRectangulo);
        jToggleButtonRectangulo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Rectangulo.gif"))); // NOI18N
        jToggleButtonRectangulo.setFocusable(false);
        jToggleButtonRectangulo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jToggleButtonRectangulo.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToggleButtonRectangulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButtonRectanguloActionPerformed(evt);
            }
        });
        jToolBarHerramientasDibujo.add(jToggleButtonRectangulo);

        buttonGroupHerramientasDibujo.add(jToggleButtonOvalo);
        jToggleButtonOvalo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Ovalo.gif"))); // NOI18N
        jToggleButtonOvalo.setFocusable(false);
        jToggleButtonOvalo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jToggleButtonOvalo.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToggleButtonOvalo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButtonOvaloActionPerformed(evt);
            }
        });
        jToolBarHerramientasDibujo.add(jToggleButtonOvalo);

        getContentPane().add(jToolBarHerramientasDibujo, java.awt.BorderLayout.NORTH);

        jLabelBarraEstado.setText("Barra de estado");
        jLabelBarraEstado.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED)));
        getContentPane().add(jLabelBarraEstado, java.awt.BorderLayout.SOUTH);

        pabelCentral.setLayout(new java.awt.BorderLayout());

        jToolBarHerramientasAbajo.setRollover(true);

        jPanelHerramientasAbajo.setLayout(new java.awt.GridLayout(0, 3, 2, 3));

        jPanelColor.setLayout(new java.awt.GridLayout());

        panelColores.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED), "Color"));
        panelColores.setLayout(new java.awt.GridLayout(2, 3));

        jToggleButtonColorNegro.setBackground(new java.awt.Color(0, 0, 0));
        jToggleButtonColorNegro.setPreferredSize(new java.awt.Dimension(25, 25));
        jToggleButtonColorNegro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButtonColorNegroActionPerformed(evt);
            }
        });
        panelColores.add(jToggleButtonColorNegro);

        jToggleButtonColorRojo.setBackground(new java.awt.Color(204, 0, 0));
        jToggleButtonColorRojo.setPreferredSize(new java.awt.Dimension(25, 25));
        jToggleButtonColorRojo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButtonColorRojoActionPerformed(evt);
            }
        });
        panelColores.add(jToggleButtonColorRojo);

        jToggleButtonColorAzul.setBackground(new java.awt.Color(0, 0, 153));
        jToggleButtonColorAzul.setPreferredSize(new java.awt.Dimension(25, 25));
        jToggleButtonColorAzul.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButtonColorAzulActionPerformed(evt);
            }
        });
        panelColores.add(jToggleButtonColorAzul);

        jToggleButtonColorBlanco.setBackground(new java.awt.Color(255, 255, 255));
        jToggleButtonColorBlanco.setPreferredSize(new java.awt.Dimension(25, 25));
        jToggleButtonColorBlanco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButtonColorBlancoActionPerformed(evt);
            }
        });
        panelColores.add(jToggleButtonColorBlanco);

        jToggleButtonColorAmarillo.setBackground(new java.awt.Color(255, 255, 0));
        jToggleButtonColorAmarillo.setPreferredSize(new java.awt.Dimension(25, 25));
        jToggleButtonColorAmarillo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButtonColorAmarilloActionPerformed(evt);
            }
        });
        panelColores.add(jToggleButtonColorAmarillo);

        jToggleButtonColorVerde.setBackground(new java.awt.Color(0, 204, 51));
        jToggleButtonColorVerde.setPreferredSize(new java.awt.Dimension(25, 25));
        jToggleButtonColorVerde.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButtonColorVerdeActionPerformed(evt);
            }
        });
        panelColores.add(jToggleButtonColorVerde);

        jPanelColor.add(panelColores);

        jPanelHerramientasAbajo.add(jPanelColor);

        jPanelGrosor.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED), "Grosor"));
        jPanelGrosor.add(jSpinner1);

        jPanelHerramientasAbajo.add(jPanelGrosor);

        jPanelCheksBox.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED), " "));
        jPanelCheksBox.setLayout(new java.awt.GridLayout(2, 2));

        jCheckBoxRelleno.setText("Relleno");
        jPanelCheksBox.add(jCheckBoxRelleno);

        jCheckBoxTrans.setText("Transparencia");
        jPanelCheksBox.add(jCheckBoxTrans);

        jCheckBoxAlisar.setText("Alisar");
        jPanelCheksBox.add(jCheckBoxAlisar);

        jCheckBoxEditar.setText("Editar");
        jPanelCheksBox.add(jCheckBoxEditar);

        jPanelHerramientasAbajo.add(jPanelCheksBox);

        jToolBarHerramientasAbajo.add(jPanelHerramientasAbajo);

        pabelCentral.add(jToolBarHerramientasAbajo, java.awt.BorderLayout.SOUTH);

        javax.swing.GroupLayout escritorioLayout = new javax.swing.GroupLayout(escritorio);
        escritorio.setLayout(escritorioLayout);
        escritorioLayout.setHorizontalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1288, Short.MAX_VALUE)
        );
        escritorioLayout.setVerticalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        pabelCentral.add(escritorio, java.awt.BorderLayout.CENTER);

        getContentPane().add(pabelCentral, java.awt.BorderLayout.CENTER);

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

        jMenuBarArchivoEdicion.add(jMenuArchivo);

        jMenuEdicion.setText("Edición");

        jCheckBoxMenuItemEdicion.setSelected(true);
        jCheckBoxMenuItemEdicion.setText("Ver barra de estado");
        jCheckBoxMenuItemEdicion.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jCheckBoxMenuItemEdicionStateChanged(evt);
            }
        });
        jMenuEdicion.add(jCheckBoxMenuItemEdicion);

        jMenuBarArchivoEdicion.add(jMenuEdicion);

        setJMenuBar(jMenuBarArchivoEdicion);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItemAbrirçActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemAbrirçActionPerformed
        // TODO add your handling code here:
        JFileChooser dlg = new JFileChooser();
        int resp = dlg.showOpenDialog(this);
        if( resp == JFileChooser.APPROVE_OPTION) {
            File f = dlg.getSelectedFile();
            //Código
}
    }//GEN-LAST:event_jMenuItemAbrirçActionPerformed

    private void jMenuItemGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemGuardarActionPerformed
        // TODO add your handling code here:
        JFileChooser dlg = new JFileChooser();
        int resp = dlg.showSaveDialog(this);
        if( resp == JFileChooser.APPROVE_OPTION) {
            File f = dlg.getSelectedFile();
            //Código
        }
    }//GEN-LAST:event_jMenuItemGuardarActionPerformed

    private void jToggleButtonPuntoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButtonPuntoActionPerformed
        // Al hacer clik en el punto
        this.jLabelBarraEstado.setText("Lapiz");
        //this.lienzo.setForma("Punto");
    }//GEN-LAST:event_jToggleButtonPuntoActionPerformed

    private void jToggleButtonLineaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButtonLineaActionPerformed
        // Al hacer clik en la linea
        this.jLabelBarraEstado.setText("Linea");
        //this.lienzo.setForma("Linea");
    }//GEN-LAST:event_jToggleButtonLineaActionPerformed

    private void jToggleButtonRectanguloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButtonRectanguloActionPerformed
        // Al hacer clik en el rectangulo
        this.jLabelBarraEstado.setText("Rectangulo");
        //this.lienzo.setForma("Rectangulo");
    }//GEN-LAST:event_jToggleButtonRectanguloActionPerformed

    private void jToggleButtonOvaloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButtonOvaloActionPerformed
        // Al hacer clik en el ovalo
        this.jLabelBarraEstado.setText("Elipse");
        //this.lienzo.setForma("Elipse");
    }//GEN-LAST:event_jToggleButtonOvaloActionPerformed

    private void jCheckBoxMenuItemEdicionStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jCheckBoxMenuItemEdicionStateChanged
        // Con este checkBox controlamos que la barra de estado sea visible o no
        this.jLabelBarraEstado.setVisible(this.jCheckBoxMenuItemEdicion.isSelected());
    }//GEN-LAST:event_jCheckBoxMenuItemEdicionStateChanged

    private void jMenuItemNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemNuevoActionPerformed
        // Este item elimina todo lo pintado en el lienzo
        //this.lienzo.borrarPuntos();
        VentanaInterna vi = new VentanaInterna();
        escritorio.add(vi);
                      vi.setVisible(true);
        repaint();
    }//GEN-LAST:event_jMenuItemNuevoActionPerformed

    private void jToggleButtonColorVerdeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButtonColorVerdeActionPerformed
        // Al hacer clik en el color Verde
        this.jLabelBarraEstado.setText("Color Verde");
        //this.lienzo.setColor(Color.green);
    }//GEN-LAST:event_jToggleButtonColorVerdeActionPerformed

    private void jToggleButtonColorAmarilloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButtonColorAmarilloActionPerformed
        // Al hacer clik en el color Amarillo
        this.jLabelBarraEstado.setText("Color Amarillo");
        //this.lienzo.setColor(Color.yellow);
    }//GEN-LAST:event_jToggleButtonColorAmarilloActionPerformed

    private void jToggleButtonColorBlancoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButtonColorBlancoActionPerformed
        // Al hacer clik en el color Blanco
        this.jLabelBarraEstado.setText("Color Blanco");
        //this.lienzo.setColor(Color.white);
    }//GEN-LAST:event_jToggleButtonColorBlancoActionPerformed

    private void jToggleButtonColorAzulActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButtonColorAzulActionPerformed
        // Al hacer clik en el color Azul
        this.jLabelBarraEstado.setText("Color Azul");
        //this.lienzo.setColor(Color.blue);
    }//GEN-LAST:event_jToggleButtonColorAzulActionPerformed

    private void jToggleButtonColorRojoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButtonColorRojoActionPerformed
        // Al hacer clik en el color rojo
        this.jLabelBarraEstado.setText("Color Rojo");
        //this.lienzo.setColor(Color.red);
    }//GEN-LAST:event_jToggleButtonColorRojoActionPerformed

    private void jToggleButtonColorNegroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButtonColorNegroActionPerformed
        // Al hacer clik en el color negro
        this.jLabelBarraEstado.setText("Color Negro");
        //this.lienzo.setColor(Color.black);
    }//GEN-LAST:event_jToggleButtonColorNegroActionPerformed



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroupHerramientasDibujo;
    private javax.swing.JDesktopPane escritorio;
    private javax.swing.JCheckBox jCheckBoxAlisar;
    private javax.swing.JCheckBox jCheckBoxEditar;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItemEdicion;
    private javax.swing.JCheckBox jCheckBoxRelleno;
    private javax.swing.JCheckBox jCheckBoxTrans;
    private javax.swing.JLabel jLabelBarraEstado;
    private javax.swing.JMenu jMenuArchivo;
    private javax.swing.JMenuBar jMenuBarArchivoEdicion;
    private javax.swing.JMenu jMenuEdicion;
    private javax.swing.JMenuItem jMenuItemAbrirç;
    private javax.swing.JMenuItem jMenuItemGuardar;
    private javax.swing.JMenuItem jMenuItemNuevo;
    private javax.swing.JPanel jPanelCheksBox;
    private javax.swing.JPanel jPanelColor;
    private javax.swing.JPanel jPanelGrosor;
    private javax.swing.JPanel jPanelHerramientasAbajo;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JToggleButton jToggleButtonColorAmarillo;
    private javax.swing.JToggleButton jToggleButtonColorAzul;
    private javax.swing.JToggleButton jToggleButtonColorBlanco;
    private javax.swing.JToggleButton jToggleButtonColorNegro;
    private javax.swing.JToggleButton jToggleButtonColorRojo;
    private javax.swing.JToggleButton jToggleButtonColorVerde;
    private javax.swing.JToggleButton jToggleButtonLinea;
    private javax.swing.JToggleButton jToggleButtonOvalo;
    private javax.swing.JToggleButton jToggleButtonPunto;
    private javax.swing.JToggleButton jToggleButtonRectangulo;
    private javax.swing.JToolBar jToolBarHerramientasAbajo;
    private javax.swing.JToolBar jToolBarHerramientasDibujo;
    private javax.swing.JPanel pabelCentral;
    private javax.swing.JPanel panelColores;
    // End of variables declaration//GEN-END:variables
}
