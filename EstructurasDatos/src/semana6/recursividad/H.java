package semana6.recursividad;

import java.awt.Graphics;

public class H {

	
	private Linea l1;
	private Linea l2;
	private Linea l3;
	
	
	public H(int x1, int y1, int x2 , int y2, Graphics g) {
		super();
			
		 l1 = new Linea(x1, y1+(y2-y1)/2,x2, y1+(y2-y1)/2);
    	 l2 = new Linea(x1,(int)(y1), x1, (int)(y2));
    	 l3 = new Linea((int)(x2), (int)(y1), (int)(x2),(int)(y2));
    	l1.dibujar(g);
    	l2.dibujar(g);
    	l3.dibujar(g);    	
		
	}
	
	
	public Linea getL1() {
		return l1;
	}
	public void setL1(Linea l1) {
		this.l1 = l1;
	}
	public Linea getL2() {
		return l2;
	}
	public void setL2(Linea l2) {
		this.l2 = l2;
	}
	public Linea getL3() {
		return l3;
	}
	public void setL3(Linea l3) {
		this.l3 = l3;
	}
	
	public void dibujar(Graphics g){
		l1.dibujar(g);
		l2.dibujar(g);
		l3.dibujar(g);
		
	}
	
}
