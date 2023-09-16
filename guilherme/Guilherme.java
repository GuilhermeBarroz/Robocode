package guilherme;
import robocode.*;
import java.awt.Color;

/**
 * Guilherme - a class by (Guilherme Barros)
 */

public class Guilherme extends Robot {

    public void run() {
        // Set colors
        setBodyColor(Color.black);
        setGunColor(Color.black);
        setRadarColor(Color.green);
        setBulletColor(Color.white);
        setScanColor(Color.green);

        while (true) {
            ahead(300);
            turnLeft(90);
        }
    }

    // Tank inimigo detectado
    public void onScannedRobot(ScannedRobotEvent e) {
        String robotName = e.getName(); // Corrigido o nome da variável
        double distancia = e.getDistance(); // Corrigido o método getDistance
        if (distancia < 135) {
            fire(3);
        } else {
            fire(0.8);
        }
    }

    public void onHitWall(HitWallEvent e) {
        back(50);
        turnLeft(90);
    }
}
