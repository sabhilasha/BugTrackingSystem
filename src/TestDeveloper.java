import static org.junit.jupiter.api.Assertions.*;
import junit.framework.Assert;

import org.junit.jupiter.api.Test;

class TestDeveloper {

	
		@Test
		void testBugAnalyzing() {
			Developer developer= new Developer();
			BUGSTATUS result4  =developer.bugAnalyzing(7365,"Abug");
			Assert.assertEquals(BUGSTATUS.CLOSED, result4);
		}

}
