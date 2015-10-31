import java.awt.EventQueue;
import java.awt.Point;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		
		/*
		for(int i=0;i<1;i++){
			List<Integer> list = EACWalk1D.startWalk1D();
			System.out.println("*******");
			System.out.println("PASOS DERECHA "+list.get(0)+" - TOTAL: "+list.get(1));
		}
		*/
		List<Point> coordenadas = EACWalk2D.startWalk2D();

		EventQueue.invokeLater(new Runnable() {
			
			@Override
			public void run() {
				MyLines lines = new MyLines(coordenadas);
				lines.setVisible(true);
			}
		});
		
		
	}

}
