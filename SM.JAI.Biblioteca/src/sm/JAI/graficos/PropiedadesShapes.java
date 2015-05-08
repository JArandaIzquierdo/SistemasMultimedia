package sm.JAI.graficos;

import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Shape;

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
    void setRelleno(boolean relleno);
    
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
    void setContinuo(boolean continuidad);
    
    /**
     * Devuelve si el trazo es continuo o discontinuo
     * 
     * @return : continuo true o false
     */
    boolean isContinuo();
}
