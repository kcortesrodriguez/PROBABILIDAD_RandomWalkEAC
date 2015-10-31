import java.awt.Dimension;
import java.awt.Point;
import java.awt.Toolkit;
import java.util.List;

import javax.swing.*;

public class MyLines extends JFrame{

	private static final long serialVersionUID = 1L;
	
	public MyLines(List<Point> coordenadas){
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		add(new Surface());
		setTitle("EAC Walk2D - La caminata del Borracho");
		setSize(screenSize.width,screenSize.height);
		setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
