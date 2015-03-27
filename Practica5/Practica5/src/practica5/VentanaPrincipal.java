package practica5;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;
import java.awt.geom.Rectangle2D;
import java.awt.geom.RoundRectangle2D;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author javi
 */
public class VentanaPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form VentanaPrincipal
     */
    public VentanaPrincipal() {
        initComponents();
    }
    
    public void paint(Graphics g){
        super.paint (g);
        Graphics2D g2d =(Graphics2D)g;
        
        pruebaShape(g2d);
        
        
    }
    
    public void pruebaShape(Graphics2D g2d){
       
        // Línea
        Point2D p1=new Point2D.Float(70,70);
        Point2D p2=new Point2D.Float(200,200);
        Line2D linea = new Line2D.Float(p1,p2);
        g2d.draw(linea);
        
        //Rectangulo
        Rectangle2D rectangulo=new Rectangle2D.Float(50, 50, 50, 50);
        g2d.draw(rectangulo);
        
        //RoundRectangle
        RoundRectangle2D rectanguloRedondo= new RoundRectangle2D.Double(100, 100, 100, 100, 20, 20);
        g2d.draw(rectanguloRedondo);
        
        //Elipse
        Ellipse2D elipse=new Ellipse2D.Double(200, 300, 100, 50);
        g2d.draw(elipse);
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents



    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
