package practica4;

import java.awt.Color;
import static java.awt.Color.black;
import java.awt.Graphics;
import java.awt.Point;

/**
 *
 * @author Javier Aranda Izquiedo
 */
public class Lienzo extends javax.swing.JPanel {

    /**
     * Creates new form Lienzo
     */
    public Lienzo() {
        this.c = black;//Inicia el color a negro
        initComponents();
    }
    
    Point p; //Punto para dibujar solo puntos
    Point pInicial;  //Punto inical
    Point pFinal;  //Punto final
    private Color c; //Variable para el color
    boolean relleno=false; //Variable para el relleno
    //static final String forma;
    String forma="punto";

    public void setForma(String forma) {
        this.forma = forma;
    }
    
    public Color getColor() {
        return c;
    }

    public void setColor(Color c) {
        this.c = c;
    }

    public boolean isRelleno() {
        return relleno;
    }

    public void setRelleno(boolean relleno) {
        this.relleno = relleno;
    }
    
    //Metodo para borrar todo lo que hay en el lienzo
    public void borrarPuntos(){
        p=null;
        pInicial=null;
        pFinal=null;
    }
    
    
    @Override
    public void paint(Graphics g){
        super.paint (g);
        
        // Código (mensajes a g)
        g.setColor(c);
        //Si elegimos la forma punto:
        if (forma=="Punto"){
            if(p!=null){
                g.fillOval(p.x, p.y, 10, 10);
            }
        }
        //Si elegimos la forma linea:
        else if (forma=="Linea"){
            if(pInicial!= null && pFinal!= null){
                g.drawLine(pInicial.x,pInicial.y,pFinal.x, pFinal.y);
            }
        }
        //Si elegimos la forma rectangulo:
        else if(forma=="Rectangulo"){
            if(pInicial!= null && pFinal!= null){
                int x = Math.min(pInicial.x, pFinal.x);
                int y = Math.min(pInicial.y, pFinal.y);
                int ancho = Math.abs(pInicial.y - pFinal.y);
                int alto = Math.abs(pInicial.x - pFinal.x);

                if(relleno)g.fillRect(x, y, alto, ancho);
                else g.drawRect(x, y, alto, ancho);
            }
        }
        //Si elegimos la forma elipse:
        else if(forma=="Elipse"){
            if(pInicial!= null && pFinal!= null){
                int x = Math.min(pInicial.x, pFinal.x);
                int y = Math.min(pInicial.y, pFinal.y);
                int ancho = Math.abs(pInicial.y - pFinal.y);
                int alto = Math.abs(pInicial.x - pFinal.x);

                if (relleno)g.fillOval(x, y, alto, ancho);
                else g.drawOval(x, y, alto, ancho);
            }
        }
            
            //Funciona bien pero no muestra los botones en la ejecucion
        
           /* switch(forma){
                //En el caso de dibujar un punto
                case "Punto":
                    if(p!=null){
                        g.fillOval(p.x, p.y, 10, 10);
                    }
                break;
                
                //En el caso de dibujar una linea    
                case "Linea":
                    if(pInicial!= null && pFinal!= null){
                        g.drawLine(pInicial.x,pInicial.y,pFinal.x, pFinal.y);
                    }
                break;
                    
                //En el caso de dibujar un rectangulo    
                case "Rectangulo":
                    if(pInicial!= null && pFinal!= null){
                        int x = Math.min(pInicial.x, pFinal.x);
                        int y = Math.min(pInicial.y, pFinal.y);
                        int ancho = Math.abs(pInicial.y - pFinal.y);
                        int alto = Math.abs(pInicial.x - pFinal.x);
                        
                        if(relleno)g.fillRect(x, y, alto, ancho);
                        else g.drawRect(x, y, alto, ancho);
                    }
                break;
                
                //En el caso de dibujar una elipse
                case"Elipse":
                    if(pInicial!= null && pFinal!= null){
                        int x = Math.min(pInicial.x, pFinal.x);
                        int y = Math.min(pInicial.y, pFinal.y);
                        int ancho = Math.abs(pInicial.y - pFinal.y);
                        int alto = Math.abs(pInicial.x - pFinal.x);
                        
                        if (relleno)g.fillOval(x, y, alto, ancho);
                        else g.drawOval(x, y, alto, ancho);
                    }
                  break;  
                                        
            }   */     
        
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

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
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                formMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void formMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseClicked
        // En nuestro caso, utilizamos mouseClicked para dibujar puntos
        p=evt.getPoint();
        this.repaint();
    }//GEN-LAST:event_formMouseClicked

    private void formMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMousePressed
        // Utilizamos MousePressed para tener las coordenadas del punto inicial
        pInicial=evt.getPoint();
    }//GEN-LAST:event_formMousePressed

    private void formMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseReleased
        // utilizamos MouseReleasd para saber el punto final y tras esto, pintar
        pFinal=evt.getPoint();
        this.repaint();
    }//GEN-LAST:event_formMouseReleased

    private void formMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseDragged
        // 
        pFinal=evt.getPoint();
        this.repaint();
    }//GEN-LAST:event_formMouseDragged


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables


}
