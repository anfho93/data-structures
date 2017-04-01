package semana6.recursividad;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.Polygon;

public class Triangulo {

	
	
	Polygon poligono;
	Point punto1;
	Point punto2;
	Point punto3;
	Color c;
	
	public Triangulo(int x1, int y1, int x2, int y2, int x3, int y3, Color c) {
		punto1 = new Point(x1, y1);
		punto2  = new Point(x2, y2);
		punto3 = new Point(x3, y3);
		poligono = new Polygon(new int[]{x1,x2,x3}, new int[]{y1,y2,y3}, 3);
		this.c = c;
	}
	
	
	public void dibujar(Graphics g){
		g.setColor(c);
		g.fillPolygon(poligono);
	}
	
	public Polygon getPoligono() {
		return poligono;
	}
	public void setPoligono(Polygon poligono) {
		this.poligono = poligono;
	}
	public Point getPunto1() {
		return punto1;
	}
	public void setPunto1(Point punto1) {
		this.punto1 = punto1;
	}
	public Point getPunto2() {
		return punto2;
	}
	public void setPunto2(Point punto2) {
		this.punto2 = punto2;
	}
	public Point getPunto3() {
		return punto3;
	}
	public void setPunto3(Point punto3) {
		this.punto3 = punto3;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return punto1.toString()+"-"+punto2.toString()+"-"+punto3.toString();
	}
}
