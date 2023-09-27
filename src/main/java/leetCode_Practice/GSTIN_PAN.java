package leetCode_Practice;

import java.util.Arrays;

import org.testng.annotations.Test;

public class GSTIN_PAN {

	@Test
	public void invalidData() {
		boolean maxProduct = stringValidate("AACCC6016B","29AACCC6016C1Z4");
		System.out.println(maxProduct);
	}

	@Test
	public void validData() {
		boolean maxProduct = stringValidate("AACCC6016B","29AACCC6016B1Z4");
		System.out.println(maxProduct);
	}
	
	private boolean stringValidate(String pan, String gst) {
		int panStart = 0, gstStart = 0;
		StringBuilder str = new StringBuilder();
		while(panStart<pan.length()&& gstStart<gst.length()) {
			if(pan.charAt(panStart)!=gst.charAt(gstStart)) gstStart++;
			else if(pan.charAt(panStart)==gst.charAt(gstStart)) {
				str.append(gst.charAt(gstStart));
				panStart++;
				gstStart++;
			}
		}
		if(str.toString().equals(pan))return true;
		else return false;
	}
	
	private boolean stringValidate_(String pan, String gst) {
	    int gstIndex = gst.indexOf(pan);
	    System.out.println(gstIndex);
	    return gstIndex != -1;
	}
}
