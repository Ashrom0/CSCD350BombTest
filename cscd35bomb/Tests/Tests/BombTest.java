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
		
	}

	@Test
	public void testError () {
		
	}
}
