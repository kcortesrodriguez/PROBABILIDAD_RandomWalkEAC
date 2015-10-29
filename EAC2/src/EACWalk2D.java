public class EACWalk2D {

	public static long startWalk2D(){
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
		Integer[] pos = {0,0,0,0};
		
		do{
			dir=EACRandom.getDireccion();
			step++;
			switch(dir){
				case 1: y++; pos[0]++; break;
				case 2: y--; pos[1]++; break;
				case 3: x++;pos[2]++;break;
				case 4: x--;pos[3]++;break;
			}
			
		}while(x!=0 || y!=0);
		
		return step;		
	}

}
