package formation.test;

import formation.code.Pocker;
import junit.framework.TestCase;

public class PockerTest extends TestCase {

	public void testNewPocker() {
		Pocker pocker = new Pocker();
		assertTrue (pocker.isOk());
	}
	
}
