public class EACRandom {

	public static int getRandomPositiveOrNegative(){
		int random = (int )(Math.random() * 256 + 1);
		if(random%2==0){
			return 1;
		}else{
			return -1;
		}
	}
	
	public static int getDireccion(){
		int random = (int )(Math.random() * 4 + 1);
		return random;
	}
	
}
