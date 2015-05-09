package sm.JAI.graficos;

import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Stroke;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;

/**
 *
 * @author Javier Aranda Izquierdo
 */
public class AbstractLineaPunto extends Line2D.Double implements JAtributosShapes,JPropiedadesShapes{

    //Declaracion de variables
    
    private Color colorTrazo;
    private Color colorRelleno;
    private GradientPaint gradiente;
    private Stroke stroke;
    private float grosor;
    private boolean isRelleno;
    private boolean isGradiente;
    private boolean isContinuo;
    
    @Override
    public void setCorlorTrazo(Color color) {
        colorTrazo=color;
    }

    @Override
    public Color getColorTrazo() {
        return colorTrazo;
    }

    @Override
    public void setColorRelleno(Color color) {
        colorRelleno=color;
    }

    @Override
    public Color getColorRelleno() {
        return colorRelleno;
    }

    @Override
    public void setGradiente(GradientPaint gradiente) {
        (this).gradiente=gradiente;
    }

    @Override
    public GradientPaint getGradientPaint() {
        return gradiente;
    }

    @Override
    public void setGrosor(float stroke) {
        grosor=stroke;
    }

    @Override
    public float getGrosor() {
        return grosor;
    }

    @Override
    public void setIsRelleno(boolean relleno) {
        isRelleno=relleno;
    }

    @Override
    public boolean isRelleno() {
        return isRelleno;
    }

    @Override
    public void setIsContinuo(boolean continuidad) {
        isContinuo=continuidad;
    }

    @Override
    public boolean isContinuo() {
        return isContinuo;
    }

    @Override
    public void setIsGradiente(boolean gradiente) {
        isGradiente=gradiente;
    }

    @Override
    public boolean getisGradiente() {
        return isGradiente;
    }

    @Override
    public boolean isContained(Point2D p) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setLocation(Point2D posicion) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void update(Point2D p1, Point2D p2) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void paint(Graphics g) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
