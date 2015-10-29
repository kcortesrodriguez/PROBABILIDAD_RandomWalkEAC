public class EACWalk1D {

	public static int startWalk1D(){
		
		/**
		 * El enunciado dice que lo haga para movimientos menores a 10000
		 * Suponga como máximo un número grande de posibles transiciones
		 * para creer en el no-retorno
		 */
		int step = 0;

			int init = 0;
			//seteo el primer movimiento!!!
			int pos = init + EACRandom.getRandomPositiveOrNegative();
			step++;
			
			while( pos != 0 && step<9999 ){
				pos += EACRandom.getRandomPositiveOrNegative();
				step++;
			}

		return step;
	}

}
