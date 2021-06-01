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
		//setting up the required positions and speed for bomb
		Bomb bomb = new Bomb(100, 200, 300, 10, null, 0, 0, 0);
		Coordinates coor = bomb.getReleaseCoordinates();
		
		//making sure that X, Y, Release Alt, and Descent Speed are correct.
		assertEquals(coor.getX(), 100, "getX()");
		assertEquals(coor.getY(), 200, "getY()");
		assertEquals(bomb.getReleaseAltitude(), 300, "getReleaseAltitude()");
		assertEquals(bomb.getDescentSpeed(), 10, "getDescentSpeed()");
		
	}

	@Test
	public void testError () {
		
	}
}
