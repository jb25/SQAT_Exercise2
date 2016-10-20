import static org.junit.Assert.*;

import org.junit.Test;

public class TestPlanetExplorer {

	@Test
	public void test_executeCommand() {
		fail("Not yet implemented");
	}
	@Test
	public void test_PlanetCreate() {
		PlanetExplorer pe= new PlanetExplorer(100,100);

		boolean ok= false;
		if (100==pe.getX() && 100==pe.getY()) {
			ok=true;
		}

		assertTrue(ok);
	}
	@Test
	public void test_LandingEmptyComand() {
		PlanetExplorer pe= new PlanetExplorer(100,100);

		String status= pe.executeCommand("");

	}
}
