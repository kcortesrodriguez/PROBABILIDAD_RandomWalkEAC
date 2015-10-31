import java.awt.EventQueue;
import java.awt.Point;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		
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
