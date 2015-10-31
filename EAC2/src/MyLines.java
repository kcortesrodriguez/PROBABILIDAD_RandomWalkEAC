import java.awt.Point;
import java.util.List;

import javax.swing.*;

public class MyLines extends JFrame{

	private static final long serialVersionUID = 1L;
	
	public MyLines(List<Point> coordenadas){
	
		Surface walkSurface = new Surface();
		walkSurface.setCoordenadas(coordenadas);
		add(walkSurface);
		setTitle("EAC Walk2D - La caminata del Borracho");
		setExtendedState(JFrame.MAXIMIZED_BOTH); 
		setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
