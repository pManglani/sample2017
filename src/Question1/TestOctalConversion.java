package Question1;
import static org.junit.Assert.assertEquals;

import org.junit.Test;


public class TestOctalConversion {
	@Test
	  public void testWhenBinary() {
	    OctalConversion octalconversion = new OctalConversion();
	    int num = octalconversion.convertBinaryToOctal(Integer.parseInt("000100"));
	    assertEquals(4, num);
	  }
	
	@Test
	  public void testWhenNotBinary() {
		 OctalConversion octalconversion = new OctalConversion();
		 String helper="";
		 int num = octalconversion.convertBinaryToOctal(Integer.parseInt("12101"));
		 assertEquals(-1, num);
	}
}
