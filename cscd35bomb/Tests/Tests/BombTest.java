package Tests;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.Test;
import Tests.Bomb.*;

class BombTest {

	@Test
	public void testWind() {
		
	}
	
	@Test
	public void testRelease() {
		Bomb bomb = new Bomb(100, 200, 300, 10, null, 0, 0, 0);
		Coordinates coor = bomb.getReleaseCoordinates();
		double x = coor.getX();
		double y = coor.getY();
		double alt = bomb.getReleaseAltitude();
		double descSpeed = bomb.getDescentSpeed();
	}

	@Test
	public void testError () {
		
	}
}
