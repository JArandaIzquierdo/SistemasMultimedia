/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sm.JAI.graficos;

import java.awt.Graphics;
import java.awt.geom.Point2D;

/**
 *
 * @author JaviAir
 */
public interface JMetodosComunes {
    
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
