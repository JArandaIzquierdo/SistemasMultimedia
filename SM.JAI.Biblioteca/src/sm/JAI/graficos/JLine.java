package sm.JAI.graficos;

import java.awt.geom.Point2D;


/**
 *
 * @author Javier Aranda
 */
public class JLine extends AbstracLineaPunto {
    
    public boolean contains(Point2D p) {
           return isNear(p);
       }
}
