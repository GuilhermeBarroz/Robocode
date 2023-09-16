package guilherme;
import robocode.*;
import java.awt.Color;

/**
 * Alvo - a class by (Guilherme Barros)
 */
public class Alvo extends Robot{
	public void run(){
		setColors(Color.red,Color.red, Color.green,Color.white,Color.black);
		ahead(100);
		back(30);
	}
}
