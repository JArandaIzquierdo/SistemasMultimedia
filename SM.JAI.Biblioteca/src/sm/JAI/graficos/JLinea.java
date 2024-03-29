package sm.JAI.graficos;

import java.awt.geom.Point2D;

/**
 *
 * @author Javier Aranda
 */
public class JLinea extends AbstractLineaPunto {
    
    public JLinea(){
        super();
    }
    
     public JLinea(Point2D p1,Point2D p2){
        super(p1, p2);
    }
    
    @Override
    public void setLocation(Point2D p) {
        double dx=p.getX()-this.getX1(); 
        double dy=p.getY()-this.getY1();  
        Point2D newp2 = new Point2D.Double(this.getX2()+dx,this.getY2()+dy);    
        this.setLine(p,newp2);    
    }

    @Override
    public void update(Point2D p1, Point2D p2) {
        this.setLine(p1, p2);
    }
}
