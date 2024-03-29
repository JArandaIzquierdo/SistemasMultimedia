package practica5;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.Shape;
import java.awt.geom.Arc2D;
import java.awt.geom.CubicCurve2D;
import java.awt.geom.Ellipse2D;
import java.awt.geom.GeneralPath;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;
import java.awt.geom.QuadCurve2D;
import java.awt.geom.Rectangle2D;
import java.awt.geom.RoundRectangle2D;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JCheckBox;

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
    Point p;//punto
    Rectangle rectangulo;//rectangulo
    List<Shape> vShape = new ArrayList();//Para guardar los rectangulos
    private static boolean editar=false;
    
    
    public void paint(Graphics g){
        super.paint (g);
        Graphics2D g2d =(Graphics2D)g;
        
        //pruebaShape(g2d);
        if(rectangulo!=null) g2d.draw(rectangulo);
        
        for(Shape s:vShape) g2d.draw(s);//dibuja lo que hay en el vector
    }
    private Shape getSelectedShape(Point2D p){
                   for(Shape s:vShape)
                     if(s.contains(p)) return s;
                   return null;
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
        
        //Arco 2D
        Arc2D arco = new Arc2D.Double(400, 400, 70, 90, 90, 135, Arc2D.OPEN);
        g2d.draw(arco);
        
        //QuadCurve
        QuadCurve2D quad =new QuadCurve2D.Double(40, 40, 80, 300, 400, 400);
        g2d.draw(quad);
        
        //Cubicurve
        CubicCurve2D cubi=new CubicCurve2D.Double(300, 300, 500, 600, 700, 650, 700, 700);
        g2d.draw(cubi);
        
        //Trazo libre
        //GeneralPath trazoLibre= new GeneralPath
        
        
    }
    
public static void setEditar(boolean e) {
    editar = e;
}

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jCheckBox1 = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                formMouseDragged(evt);
            }
        });
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                formMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                formMouseReleased(evt);
            }
        });

        jCheckBox1.setText("Editar");
        jCheckBox1.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jCheckBox1StateChanged(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(336, Short.MAX_VALUE)
                .addComponent(jCheckBox1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(271, Short.MAX_VALUE)
                .addComponent(jCheckBox1)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMousePressed
        // MousePressed
        p = evt.getPoint();
        //if (rectangulo instanceof Rectangle){//para saber que forma es
            rectangulo = new Rectangle(p);
            vShape.add(rectangulo);//se agrega el rectangulo al vector
        //}
            //hay que llamar al getSelectec
            /*if (editar) rectangulo = (Rectangle) getSelectecShape(evt.getPoint());
            else{
                p= evt.getPoint();
                rectangulo=new Rectangle (p);
                vShape.add(rectangle);
            */
    }//GEN-LAST:event_formMousePressed

    private void formMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseDragged
        // MouseDrager
        if(editar){
            if(rectangulo!=null) rectangulo.setLocation(evt.getPoint());  
        }
        
        rectangulo.setFrameFromDiagonal(p, evt.getPoint());
        this.repaint();
    }//GEN-LAST:event_formMouseDragged

    public void setjCheckBox1(JCheckBox jCheckBox1) {
        this.jCheckBox1 = jCheckBox1;
    }

    private void formMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseReleased
        // MouseRealiese
        this. formMouseDragged(evt);
    }//GEN-LAST:event_formMouseReleased

    private void jCheckBox1StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jCheckBox1StateChanged
        this.setEditar(jCheckBox1.isSelected());
        
    }//GEN-LAST:event_jCheckBox1StateChanged



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox jCheckBox1;
    // End of variables declaration//GEN-END:variables
}
