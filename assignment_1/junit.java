package assignment_1;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class junit {
	Calculator c = new Calculator();
	
	@Test
	void test() {
		c.divide(8, 0);
		
		int x = c.add(-1000,6);
		assertEquals(-1000+6,x,0);
		
		
		float f = c.divide(4, 5), t = 4.0f/5;
		assertEquals(t,f,0);
		
		
		f = c.divide(0,4);
		t = 0;
		assertEquals(t,f,0);
		
		f = c.divide(1,3);
		t = 1/3.0f;
		assertEquals(t,f,0);
		
		
		f = c.divide(-12, 42);
		t = -12.0f/42;
		assertEquals(t,f,0);
		
		/////////////////////////
		//division by zero test//
		/////////////////////////
		assertThrows(RuntimeException.class, () -> c.divide(5, 0) );
		assertThrows(RuntimeException.class, () -> c.divide(0, 0) );
	}
	
	

}
