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
					case 1: y++; break;
					case 2: y--; break;
					case 3: x++; break;
					case 4: x--; break;
				}
				
				Point p =new Point(x, y);
				System.out.println(p);
				coordenadas.add(p);
				
			}while((x!=0 || y!=0) && step<=10000);
			
			if(x!=0 && y!=0)
				System.out.println("OUT OF RANGE");
			else
				System.out.println(step);
			
		return coordenadas;	
	}

}
