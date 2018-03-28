package gume;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class AutoGumaTest {

	AutoGuma ag;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		ag = new AutoGuma();
	}

	@After
	public void tearDown() throws Exception {
		ag = null;
	}

	//pocetak setMarkaModel
	@Test
	public void testSetMarkaModelSveOk() {
		ag.setMarkaModel("Pireli");
		assertEquals("Pireli", ag.getMarkaModel());
	}
	@Test (expected = java.lang.RuntimeException.class)
	public void testSetMarkaModelNull() {
		ag.setMarkaModel(null);
	}
	@Test (expected = java.lang.RuntimeException.class)
	public void testSetMarkaModelManjiOdTri() {
		ag.setMarkaModel("Ab");
	}
	//kraj setMarkaModel

	
	
	//pocetak setPrecnik
	@Test
	public void testSetPrecnikSveOk() {
		ag.setPrecnik(14);
		assertEquals(14, ag.getPrecnik());
	}
	
	@Test (expected = java.lang.RuntimeException.class)
	public void testSetPrecnikIspod() {
		ag.setPrecnik(33);
	}
	
	@Test (expected = java.lang.RuntimeException.class)
	public void testSetPrecnikIznad() {
		ag.setPrecnik(2);
	}
	//kraj setPrecnik

	
	
	//pocetak setSirina
	@Test
	public void testSetSirina() {
		ag.setSirina(140);
		assertEquals(140, ag.getSirina());
	}
	@Test (expected = java.lang.RuntimeException.class)
	public void testSetSirinaIspodGranice() {
		ag.setSirina(20);
	}
	@Test (expected = java.lang.RuntimeException.class)
	public void testSetSirinaIznadGranice() {
		ag.setSirina(400);
	}
	//kraj setSirina
	


	//pocetak setVisina
	@Test
	public void testSetVisina() {
		ag.setVisina(27);
		assertEquals(27, ag.getVisina());
	}
	@Test (expected = java.lang.RuntimeException.class)
	public void testSetVisinaIznad() {
		ag.setVisina(100);
	}
	@Test (expected = java.lang.RuntimeException.class)
	public void testSetVisinaIspod() {
		ag.setVisina(2);
	}
	//kraj setVisina

	
	@Test
	public void testToString() {
		ag.setMarkaModel("Mini_Cooper");
		ag.setPrecnik(13);
		ag.setSirina(300);
		ag.setVisina(70);
		assertEquals("AutoGuma [markaModel=Mini_Cooper, precnik=13, sirina=300, visina=70]", ag.toString());
	}

	@Test
	public void testEqualsObject() {
		ag.setMarkaModel("Mini_Cooper");
		ag.setPrecnik(15);
		ag.setVisina(75);
		ag.setSirina(305);
		AutoGuma guma = new AutoGuma();
		guma.setMarkaModel("Mini_Cooper");
		guma.setPrecnik(15);
		guma.setVisina(75);
		guma.setSirina(313);
		assertFalse(ag.equals(guma));
	}
}
