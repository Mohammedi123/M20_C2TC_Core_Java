import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CountTest {

	@Test
	void test() {
		Testing n=new Testing();
		int output=n.countA("MOHAMMEDI");
		assertEquals(9,output);
				
	}

}
