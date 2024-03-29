package sm.JAI.iu;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.image.BufferedImage;

/**
 *
 * @author Javier Aranda
 */
public class Lienzo2DImagen extends Lienzo2D {
    
     private BufferedImage img=null;
     
    /**
     * Creates new form Lienzo2DImagen
     */
    public Lienzo2DImagen() {
        initComponents();
    }
    /**
     * Metodo Paint que pinta las imagenes
     * @param g: Es el objeto imagen
     */
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        if(img!=null) g.drawImage(img,0,0,this);
    }
    /**
     * Metodo que da una imagen
     * @param img 
     */
    public void setImage(BufferedImage img){
        this.img = img;
        if(img!=null) {
            setPreferredSize(new Dimension(img.getWidth(),img.getHeight()));
        }
    }
    /**
     * Metodo que devuelve la imagen
     * @return 
     */             
    public BufferedImage getImage(){
        return img; 
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

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


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
