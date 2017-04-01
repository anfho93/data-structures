package semana6.recursividad;

import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Graphics;

import javax.jws.Oneway;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class VentanaTriangulos extends JFrame{

   
    public static void main(String[] args) {
        new VentanaTriangulos().setVisible(true);
    }
   
    public VentanaTriangulos(){
        super();
        this.setPreferredSize(new Dimension(600, 600));
        this.setMaximumSize(new Dimension(600, 600));
        this.setMinimumSize(new Dimension(600, 600));
        setVisible(true);
        pack();      
       
    }
   
   
   
    @Override
    public void paint(Graphics g) {
        // TODO Auto-generated method stub
        super.paint(g);       
       //pintarPrimerTriangulo(g);
       // System.out.println(getWidth());
        pintarPrimerH(g);
    }
    
    private void pintarPrimerH(Graphics g) {
		// TODO Auto-generated method stub
    	 H miH = new H((int)(getWidth()*0.25), (int)((getHeight()/2)-(getHeight()/4)), (int)(getWidth()*0.75),(int)((getHeight()/2)+(getHeight()/4)), g);
    	 arbolH(g, 0, miH);
	}

	public void arbolH(Graphics g, int profundidad, H h){
    	if (profundidad ==  5) {
			return;
		}else{
			//primeraH
			long x = h.getL1().getX2()- h.getL1().getX1();
			long y = h.getL2().getY2() - h.getL2().getY1();
			
	    	 H miH1 = new H((int)(h.getL1().getX1()-(x/4)), (int)(h.getL2().getY1()-(y/4)) ,(int)(h.getL1().getX1()+(x/4)), (int)(h.getL2().getY1()+(y/4)), g);
	    	 H miH2 = new H((int)(h.getL1().getX2()-(x/4)), (int)(h.getL2().getY1()-(y/4)) ,(int)(h.getL1().getX2()+(x/4)), (int)(h.getL2().getY1()+(y/4)), g);	    	// H miH3 = new H((int)(h.getL1().getX1()-(x/4)), (int)((h.getL2().getY2() )),(int)(h.getL1().getX1()+(x/4)), g);
	    	 H miH3 = new H((int)(h.getL1().getX1()-(x/4)), (int)(h.getL2().getY2()-(y/4)) ,(int)(h.getL1().getX1()+(x/4)), (int)(h.getL2().getY2()+(y/4)), g);	    	// H miH3 = new H((int)(h.getL1().getX1()-(x/4)), (int)((h.getL2().getY2() )),(int)(h.getL1().getX1()+(x/4)), g);	    	
	    	 H miH4 = new H((int)(h.getL1().getX2()-(x/4)), (int)(h.getL2().getY2()-(y/4)) ,(int)(h.getL1().getX2()+(x/4)), (int)(h.getL2().getY2()+(y/4)), g);
	    	 
	    	 arbolH(g, profundidad+1, miH1);
	    	 arbolH(g, profundidad+1, miH2);
	    	 arbolH(g, profundidad+1, miH3);
	    	 arbolH(g, profundidad+1, miH4);
			
		}
    	
    }
   
   
    private void pintarPrimerTriangulo(Graphics g){
       
        Triangulo inicial = new Triangulo(getWidth()/2, 0, 0, getHeight(), getWidth(), getHeight(), Color.black);
        inicial.dibujar(g);
        generarTriangulos(g, inicial, 0);
    }
    
    
    

    private void generarTriangulos(Graphics g, Triangulo contenedor, int profundidad) {
        if(profundidad == 5)
        {
            return;
        }else{
        	Color c = Color.red;
        	if(profundidad%2==0){        		 
        	}           
           
            Triangulo t1 = new Triangulo(contenedor.getPunto1().x, contenedor.getPunto2().y,
                                        contenedor.getPunto2().x+((contenedor.getPunto1().x-contenedor.getPunto2().x)/2), contenedor.getPunto1().y + ((contenedor.getPunto2().y - contenedor.getPunto1().y)/2),
                                        contenedor.getPunto3().x-((contenedor.getPunto3().x-contenedor.getPunto1().x)/2),   contenedor.getPunto1().y + ((contenedor.getPunto2().y- contenedor.getPunto1().y)/2), c);
            t1.dibujar(g);
           
            Triangulo contenedor1 = new Triangulo(contenedor.getPunto1().x, contenedor.getPunto1().y,
                                                 contenedor.getPunto2().x+((contenedor.getPunto1().x-contenedor.getPunto2().x)/2), contenedor.getPunto1().y + ((contenedor.getPunto2().y - contenedor.getPunto1().y)/2),
                                                 contenedor.getPunto1().x+((contenedor.getPunto3().x-contenedor.getPunto1().x)/2), contenedor.getPunto1().y + ((contenedor.getPunto2().y - contenedor.getPunto1().y)/2), c);
           
            Triangulo contenedor2 = new Triangulo(contenedor.getPunto1().x-(contenedor.getPunto1().x-contenedor.getPunto2().x)/2, contenedor.getPunto1().y +((contenedor.getPunto2().y-contenedor.getPunto1().y)/2),
            									  contenedor.getPunto2().x,contenedor.getPunto2().y,
            								      contenedor.getPunto1().x,contenedor.getPunto2().y   , c);
            
            Triangulo  contenedor3 = new Triangulo(contenedor.getPunto1().x + ((contenedor.getPunto3().x -contenedor.getPunto1().x)/2), contenedor.getPunto1().y+(contenedor.getPunto3().y-contenedor.getPunto1().y)/2, 
            										contenedor.getPunto1().x, contenedor.getPunto3().y,
            										contenedor.getPunto3().x, contenedor.getPunto3().y, c);
            
                     
           generarTriangulos(g, contenedor1, profundidad+1);
           generarTriangulos(g, contenedor2, profundidad+1);
           generarTriangulos(g, contenedor3, profundidad+1);
        }
    }
   
   
}