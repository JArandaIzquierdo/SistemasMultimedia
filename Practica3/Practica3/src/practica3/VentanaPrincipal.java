package practica3;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;

/**
 *
 * @author Javier Aranda Izquierdo
 */
public class VentanaPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form VentanaPrincipal
     */
    public VentanaPrincipal() {
        initComponents();
    }
    Point p;
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButtonPractica3 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        FormListener formListener = new FormListener();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addMouseListener(formListener);
        getContentPane().setLayout(new java.awt.FlowLayout());

        jButtonPractica3.setText("Boton");
        jButtonPractica3.addMouseMotionListener(formListener);
        jButtonPractica3.addMouseListener(formListener);
        getContentPane().add(jButtonPractica3);

        jButton2.setText("Boton 2");
        jButton2.addMouseListener(formListener);
        jButton2.addActionListener(formListener);
        getContentPane().add(jButton2);

        pack();
    }

    // Code for dispatching events from components to event handlers.

    private class FormListener implements java.awt.event.ActionListener, java.awt.event.MouseListener, java.awt.event.MouseMotionListener {
        FormListener() {}
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            if (evt.getSource() == jButton2) {
                VentanaPrincipal.this.jButton2ActionPerformed(evt);
            }
        }

        public void mouseClicked(java.awt.event.MouseEvent evt) {
            if (evt.getSource() == jButtonPractica3) {
                VentanaPrincipal.this.jButtonPractica3MouseClicked(evt);
            }
            else if (evt.getSource() == VentanaPrincipal.this) {
                VentanaPrincipal.this.formMouseClicked(evt);
            }
            else if (evt.getSource() == jButton2) {
                VentanaPrincipal.this.jButton2MouseClicked(evt);
            }
        }

        public void mouseEntered(java.awt.event.MouseEvent evt) {
            if (evt.getSource() == jButtonPractica3) {
                VentanaPrincipal.this.jButtonPractica3MouseEntered(evt);
            }
        }

        public void mouseExited(java.awt.event.MouseEvent evt) {
            if (evt.getSource() == jButtonPractica3) {
                VentanaPrincipal.this.jButtonPractica3MouseExited(evt);
            }
        }

        public void mousePressed(java.awt.event.MouseEvent evt) {
        }

        public void mouseReleased(java.awt.event.MouseEvent evt) {
        }

        public void mouseDragged(java.awt.event.MouseEvent evt) {
            if (evt.getSource() == jButtonPractica3) {
                VentanaPrincipal.this.jButtonPractica3MouseDragged(evt);
            }
        }

        public void mouseMoved(java.awt.event.MouseEvent evt) {
        }
    }// </editor-fold>//GEN-END:initComponents
    
    private void jButtonPractica3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonPractica3MouseClicked
        // Evento de clicar que cambiar el color del boton
        this.jButtonPractica3.setBackground(Color.red);
    }//GEN-LAST:event_jButtonPractica3MouseClicked

    private void jButtonPractica3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonPractica3MouseEntered
        // Evento al entrar en la region del boton cambia su fondo a color azul
        this.jButtonPractica3.setBackground(Color.blue);
    }//GEN-LAST:event_jButtonPractica3MouseEntered

    private void jButtonPractica3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonPractica3MouseExited
        // Evento al salir de la zona del boton cambia su fonde a color verde
        this.jButtonPractica3.setBackground(Color.green);
    }//GEN-LAST:event_jButtonPractica3MouseExited

    private void jButtonPractica3MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonPractica3MouseDragged
        // Evento al arrastrar el raton desde el boton
        this.jButtonPractica3.setBackground(Color.yellow);
    }//GEN-LAST:event_jButtonPractica3MouseDragged

    private void formMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseClicked
        // Al clicar en el frame, cambia el nombre del boton 
        p=evt.getPoint();
        this.repaint();
    }//GEN-LAST:event_formMouseClicked

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
        // Evento mouseClicked para el boton 2
        this.jButton2.setVisible(false);
    }//GEN-LAST:event_jButton2MouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // ActionPerformance para el boton 2
        this.setSize(400, 400);
    }//GEN-LAST:event_jButton2ActionPerformed

public void paint(Graphics g){
    super.paint(g);
    // Código (mensajes a g)
    g.fillOval(p.x, p.y, 10, 10);
    
}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButtonPractica3;
    // End of variables declaration//GEN-END:variables
}
