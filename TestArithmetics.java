package Test;

import org.junit.*;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

import junit.framework.Assert;

public class TestArithmetics {
	Arithmetics a;

	@Before
	public void runT() {
		a = new Arithmetics();

	}
	@Rule
	public final ExpectedException exp = ExpectedException.none();
	
	@Rule
	public Timeout time = new Timeout(1000);

	@Test
	public void testAdd() {
		double check = a.add(3, 7);
		if (check != 10)
			Assert.fail();
	}

	@Test
	public void testDeduct() {
		double check = a.deduct(3, 7);
		if (check != -4)
			Assert.fail();
	}

	@Test
	public void testMult() {
		double check = a.mult(3, 7);
		if (check != 21)
			Assert.fail();
	}

	@Test
	public void testDiv() {
		double check = a.div(10, 2);
		if (check != 5)
			Assert.fail();
	}

	@Test //(expected = Exception.class)
	public void testDivException() {
		exp.expect(ArithmeticException.class);
		a.div(10.0, 0.0);
	}

	@Test
	public void timeOut() {
		while (true) {
		}
	}

}
