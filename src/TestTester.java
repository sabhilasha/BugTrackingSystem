import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import junit.framework.Assert;

class TestTester {

	@Test
	void testAddNewBug() {
		Tester tester = new Tester();
		BUGTYPE result3  = tester.addNewBug();
		Assert.assertEquals(BUGTYPE.ARITHMETIC, result3);
	}

}
