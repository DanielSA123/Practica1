import static org.junit.Assert.*;


import org.junit.BeforeClass;
import org.junit.Test;


public class AritmeticaTest {
	private static Aritmetica A;
	
	@BeforeClass
	public static void inicializar() {
		A = new Aritmetica(); }

	
	
	@Test
	public void testSuma() {
		assertTrue(A.suma(3,2) == 5);
		assertTrue(A.suma(-3,-2)== -5);
		assertTrue(A.suma(3, -2)== 1);
	}

	@Test
	public void testResta() {
		
		assertTrue(A.resta(3,2) == 1);
		assertTrue(A.resta(-3, -2)== -1);
		assertTrue(A.resta(3, -2) == 5);
	}

	@Test
	public void testMultiplicacion() {
		
		assertTrue(A.multiplicacion(3,2) == 6);
		assertTrue(A.multiplicacion(-3, -2)== 6);
		assertTrue(A.multiplicacion(3, -2)== -6);
	}

	@Test
	public void testDivision() {
		
		assertTrue(A.division(6,2) == 3);
		assertTrue(A.division(-6, -2)== 3);
		assertTrue(A.division(6, -2)== -3);
	}

}
