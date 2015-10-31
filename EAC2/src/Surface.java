import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.Toolkit;
import java.util.List;
import javax.swing.JPanel;

public class Surface extends JPanel {
	
	private static final long serialVersionUID = 1L;

	private List<Point> coordenadas = null;

	public void setCoordenadas(List<Point> coordenadas){
		this.coordenadas = coordenadas;		
	}
	
	
	private void doDrawing(Graphics g) {

		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		int cx = screenSize.width/2;
		int cy = screenSize.height/2;
		int pixels = 5;
		Graphics2D g2d = (Graphics2D) g;
		g2d.setColor(Color.BLACK);
		g2d.fillOval(cx, cy, 5, 5);
		g2d.drawLine(0, 0, coordenadas.get(0).x, coordenadas.get(0).y);
		
        //g2d.drawLine(30, 30, 200, 30);
		for(int i = 0; i < coordenadas.size()-1; i++){
			int x1 = coordenadas.get(i).x*pixels + cx;
			int y1 = coordenadas.get(i).y*pixels + cy;
			int x2 = coordenadas.get(i+1).x*pixels+ cx;
			int y2 = coordenadas.get(i+1).y*pixels+ cy;
			g2d.drawLine(x1, y1, x2, y2);
		}
		
    }

    @Override
    public void paintComponent(Graphics g) {

        super.paintComponent(g);
        doDrawing(g);
    }

}
