package sm.JAI.graficos;

import java.awt.geom.Point2D;

/**
 *
 * @author Javier Aranda
 */
public class JPunto extends AbstractLineaPunto{
    
    public JPunto(Point2D p1,Point2D p2){
        super(p1, p1);
    }
    
    @Override
    public void setLocation(Point2D pos) {
        super.setLine(pos.getX(), pos.getY(), pos.getX() + 1, pos.getY() + 1);
    }

    @Override
    public void update(Point2D p1, Point2D p2) {
        setLine(p1, p1);
    }
    
}
