package sm.JAI.graficos;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Stroke;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;

/**
 *
 * @author Javier Aranda Izquierdo
 */
public class AbstractLineaPunto extends Line2D.Double implements JAtributosShapes,JMetodosComunes{

    //Declaracion de variables
    
    private Color colorTrazo;
    private Color colorRelleno;
    private GradientPaint gradiente;
    private Stroke stroke;
    private float grosor;
    private boolean isRelleno;
    private boolean isGradiente;
    private boolean isContinuo;
    
    /**
     * Constructor por defecto de la clase 
     */
    public AbstractLineaPunto() {
        super();
        this.colorRelleno=Color.BLACK;
        colorRelleno=null;
        this.grosor=1.0F;
        isRelleno=false;
        isContinuo=true;
        isGradiente=false;
    }
    
    /**
     * constructor por parametros de la clase
     * @param p1    Punto uno de la clase
     * @param p2    Punto dos de la clase
     */
    protected AbstractLineaPunto(Point2D p1,Point2D p2){
        super(p1,p2);
        this.colorRelleno=Color.BLACK;
        colorRelleno=null;
        this.grosor=1.0F;
        isRelleno=false;
        isContinuo=true;
        isGradiente=false;
    }
    
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

    private boolean isNear(Point2D p) {
        return this.ptLineDist(p) <= 2.0;
    }
    
    @Override
    public boolean isContained(Point2D p) {
        return isNear(p);
    }

    @Override
    public void setLocation(Point2D posicion) {
        
    }

    @Override
    public void update(Point2D p1, Point2D p2) {
        
    }

    @Override
    public void paint(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        if(isContinuo){
            stroke = new BasicStroke(grosor);
            g2d.setStroke(stroke);
        }else{
            stroke = new BasicStroke(grosor, BasicStroke.CAP_BUTT, BasicStroke.JOIN_MITER, 10.0f, discontinua, 0.0f);
            g2d.setStroke(stroke);
        }
        
        g2d.setPaint(colorRelleno);
        g2d.draw(this);
        if(isRelleno){
            g2d.setPaint(colorTrazo);
            g2d.fill(this);
        }else if(isGradiente){
            g2d.setPaint(gradiente);
            g2d.fill(this);        
        }
    }
}    
