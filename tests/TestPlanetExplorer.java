import static org.junit.Assert.*;

import org.junit.Test;

public class TestPlanetExplorer {

	PlanetExplorer pe= new PlanetExplorer(100,100);


//	@Test
//	public void test_executeCommand() {
//		fail("Not yet implemented");
//	}
//	@Test
//	public void test_PlanetCreate() {
//
//		boolean ok= false;
//		if (100==pe.getX() && 100==pe.getY()) {
//			ok=true;
//		}
//
//		assertTrue(ok);
//	}
//
//	@Test
//	public void test_LandingEmptyComand() {
//
//		String status= pe.executeCommand("");
//		assertEquals("(0,0,N)", status);
//	}
//
//	@Test
//	public void test_TurnRight() {
//		String status= pe.executeCommand("r");
//		assertEquals("(0,0,E)", status);
//	}
//	
//	@Test
//	public void test_TurnLeft() {
//		String status= pe.executeCommand("l");
//		assertEquals("(0,0,W)", status);
//	}
//
//	@Test
//	public void test_TurnFordward() {
//		String status= pe.executeCommand("f");
//		assertEquals("(0,1,N)", status);
//	}
//	
//	@Test
//	public void test_TurnBackward() {
//		pe.setPosX(pe.getPosX()+5);
//		String status= pe.executeCommand("b");
//		assertEquals("(4,0,N)", status);
//	}
//	
	@Test
	public void test_MovingAndTurningCombined() {
		String status= pe.executeCommand("ffrff");
		assertEquals("(2,2,E)", status);
	}
}
