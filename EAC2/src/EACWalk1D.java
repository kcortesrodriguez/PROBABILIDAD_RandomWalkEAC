import java.util.ArrayList;
import java.util.List;

public class EACWalk1D {

	public static List<Integer> startWalk1D(){
		
		/**
		 * El enunciado dice que lo haga para movimientos menores a 10000
		 * Suponga como máximo un número grande de posibles transiciones
		 * para creer en el no-retorno
		 */
		
		List<Integer> list = new ArrayList<>();
		
		int step = 0;
		int pos = 0;
		int der = 0;
		do{
			int relativePos = EACRandom.getRandomPositiveOrNegative();
			if(relativePos==1)
				der++;
			
			pos+=relativePos;	
			System.out.println(step+" "+pos);
			step++;
		}while(step<10000 && pos!=0);
		
		list.add(der);
		list.add(step);
		return list;
		
	}

}
