import static org.junit.Assert.fail;

import org.junit.Ignore;
import org.junit.Test;

public class MainTest {

	@Test
	public void testMain() {
		Main.main(new String[]{"arg1"});
		fail("Testing failed test");
	}

}
