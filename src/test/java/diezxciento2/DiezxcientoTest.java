/**
 * 
 */
package diezxciento2;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * @author Oscar
 *
 */
public class DiezxcientoTest {

	/**
	 * Test method for {@link diezxciento2.Diezxciento#Diezxciento()}.
	 */
	@Test
	public void testDiezxciento() {
		//throw new RuntimeException("not yet implemented");
		
		//Given
		Diezxciento diezxciento = new Diezxciento(1000000,700000);

		//When

		//Then
		assertEquals(1000000,diezxciento.diezxciento());

	}

	/**
	 * Test method for {@link diezxciento2.Diezxciento#impuesto()}.
	 */
	@Test
	public void testImpuesto() {
		//throw new RuntimeException("not yet implemented");

		//Given
		Diezxciento diezxciento = new Diezxciento(1000000,700000);

		//When

		//Then
		assertEquals(0,0);
	}

	/**
	 * Test method for {@link diezxciento2.Diezxciento#saldoAhorro()}.
	 */
	@Test
	public void testSaldoAhorro() {
		//throw new RuntimeException("not yet implemented");

		//Given
		Diezxciento diezxciento = new Diezxciento(1000000,700000);

		//When

		//Then
		assertEquals(900000,diezxciento.saldoAhorro());

	}

}