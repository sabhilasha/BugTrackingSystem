import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import junit.framework.Assert;


class testMath {
	Math math;
	@BeforeEach
	void init(){
		System.out.println("init");
		math= new Math();
		
	}

	@Test
	void testAdd() {
		int result = math.add(1,2,3);
		Assert.assertEquals(6, result);
		
		
	}
	@Test
	void testAddwithNegative() {
		int result1 = math.add(-1,-2,-3);
		Assert.assertEquals(-6, result1);
	}
	@Test
	void testMultiply() {
		int result = math.multiply(3,4,1);
		Assert.assertEquals(12, result);
		
	}
	@Test
	void testMultiplywithOneZero() {
		int result = math.multiply(3,4,0);
		Assert.assertEquals(0, result);
		
	}
	@Test
	void testMultiplywithOneNegative() {
		Exception exception = assertThrows(IllegalArgumentException.class,()->{
		 math.multiply(5,-9);
		
		
	});
	}

}
