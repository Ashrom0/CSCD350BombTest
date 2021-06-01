package Tests;

import static org.junit.jupiter.api.Assertions.*;
import org.testng.annotations.Test;
//import Tests.Tests.Bomb.*;

//import org.junit.jupiter.api.*;

class BombTest {

	@Test
	public void testWind() {
		Bomb bomb = new Bomb(0,0,0,0,null,0,45.0,10.0);
		assertEquals(45.0, bomb.getWindDirection());
		assertEquals(10.0, bomb.getWindSpeed());
	}
	
	@Test
	public void testRelease() {
		//setting up the required positions and speed for bomb
		Bomb bomb = new Bomb(100, 200, 300, 10, null, 0, 0, 0);
		Bomb.Coordinates coor = bomb.getReleaseCoordinates();
		
		//making sure that X, Y, Release Alt, and Descent Speed are correct.
		assertEquals(coor.getX(), 100, "getX()");
		assertEquals(coor.getY(), 200, "getY()");
		assertEquals(bomb.getReleaseAltitude(), 300, "getReleaseAltitude()");
		assertEquals(bomb.getDescentSpeed(), 10, "getDescentSpeed()");
		
	}

	@Test
	public void testError () {
		Bomb bomb1 = new Bomb(0, 0, 0, 0, Bomb.E_ErrorType.NONE, 10, 0, 0);
		Bomb bomb2 = new Bomb(0, 0, 0, 0, Bomb.E_ErrorType.UNIFORM, 10, 0, 0);
		Bomb bomb3 = new Bomb(0, 0, 0, 0, Bomb.E_ErrorType.GAUSSIAN, 10, 0, 0);
	}
}
