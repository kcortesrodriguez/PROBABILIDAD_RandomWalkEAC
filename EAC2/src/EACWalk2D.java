import java.awt.*;
import java.util.ArrayList;

public class EACWalk2D {
	
	public static java.util.List<Point> startWalk2D(){
		/*
		 * 1 - ARRIBA
		 * 2 - ABAJO
		 * 3 - DERECHA
		 * 4 - IZQUIERDA 
		 */
				
		int y = 0;
		int x = 0;
		int dir;
		long step=0;
		java.util.List<Point> coordenadas = new ArrayList<>();		
		
		do{
			dir=EACRandom.getDireccion();
			step++;
			switch(dir){
				case 1: y++; System.out.println("arriba"); break;
				case 2: y--; System.out.println("abajo");break;
				case 3: x++; System.out.println("derecha");break;
				case 4: x--; System.out.println("izquierda");break;
			}
			
			coordenadas.add(new Point(x, y));
			
		}while((x!=0 || y!=0) && step<10000);
		
		System.out.println(step);
		return coordenadas;	
	}

}
