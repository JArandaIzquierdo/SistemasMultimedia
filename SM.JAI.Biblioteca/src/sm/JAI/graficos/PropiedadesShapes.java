package sm.JAI.graficos;

import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Shape;
import java.awt.geom.Point2D;

/**
 *
 * Interface que contiene todos los atributos que tiene cada figura
 * Con esto hacemos que cada objeto pueda tener sus propios atributos
 * 
 * @author Javier Aranda Izquierdo
 */
public interface PropiedadesShapes extends Shape{
    static final float discontinua[]={10.f};
    
    /**
     * Asigna un color al trazo
     * 
     * @param color : color seleccionado para el trazo
     */
    void setCorlorTrazo(Color color);
    
    /**
     * Devuelve el color de trazo actual
     * 
     * @return : color del trazo 
     */
    Color getColorTrazo();
    
    /**
     * Asigna un color al relleno del shape
     * 
     * @param color : color del relleno
     */
    void setColorRelleno(Color color);
    
    /**
     * Devuelve el color del relleno actual
     * 
     * @return : color del relleno
     */
    Color getColorRelleno();
    
    /**
     * Asigna el gradiente al shape
     * 
     * @param gradiente : gradiente (relleno degradado)
     */
    void setGradiente(GradientPaint gradiente);
    
    /**
     * Devuelve el gradiente del shape
     * 
     * @return : gradiente (relleno degradado)
     */
    GradientPaint getGradientPaint();
    
    /**
     * Asigna el grosor al shape
     * 
     * @param stroke : grosor
     */
    void setGrosor(float stroke);
    
    /**
     * Devuelve el grosor del shape
     * 
     * @return : grosor
     */
    float getGrosor();
    
    /**
     * Asigna que el shape tiene relleno
     * 
     * @param relleno : relleno
     */
    void setIsRelleno(boolean relleno);
    
    /**
     * Nos devuelve si el shape tiene relleno
     * 
     * @return : relleno true o false
     */
    boolean isRelleno();
    
    /**
     * Asigna si el shape es continuo o discontinuo
     * 
     * @param continuidad : continuidad
     */
    void setIsContinuo(boolean continuidad);
    
    /**
     * Devuelve si el trazo es continuo o discontinuo
     * 
     * @return : continuo true o false
     */
    boolean isContinuo();
    
    /**
     * asigna si el shape tiene un relleno de estilo degradado
     * 
     * @param gradiente : gradiente
     */
    void setIsGradiente(boolean gradiente);
    
    /**
     * Devuelve si el shape tiene un relleno de estilo degradado
     * 
     * @return : gradiante true o false
     */
    boolean getisGradiente();
    
    /**
     * Devuelve si la figura se encuentra en la el Point2D que pasame 
     * por parametro
     * 
     * @param p Point2D
     * @return : boolean true o false
     */
    boolean isContained(Point2D p);
    
    /**
     * Mueve el shape seleccionado
     * 
     * @param posicion 
     */
    void setLocation(Point2D posicion);
    
    /**
     * Actualiza la forma del dibujo 
     * 
     * @param p1 :punto 1
     * @param p2 :punto 2
     */
    void update(Point2D p1, Point2D p2);
    
    /**
     * Se usa para pintar
     * @param g 
     */
    void paint(Graphics g);
    
    
}
