package sm.JAI.graficos;

import java.awt.Color;
import java.awt.Stroke;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;

/**
 *
 * Clase abstracta que contiene la parte comun para dibujar los shaper punto y linea
 * 
 * @author Javier Aranda
 */
abstract class AbstracLineaPunto extends Line2D.Double implements PropiedadesShapes{

    private Color colorTrazo;
    private Stroke grosor;
    private float width;
    private boolean isContinuo;


    /**
     * Constructor por defecto de la clase
     * 
     */
    public AbstracLineaPunto() {
        super();
        this.width=1.0F;
        isContinuo=true;
    }

        /**
     * constructor por parametros de la clase
     * @param p1    Punto uno de la clase
     * @param p2    Punto dos de la clase
     */
    protected AbstracLineaPunto(Point2D p1,Point2D p2){
        super(p1,p2);
        this.width=1.0F;
        isContinuo=true;
    }
    











}

