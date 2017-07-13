package Question1;
public class OctalConversion {

	public int convertBinaryToOctal(int n) {
		
		int checkBinary = n, remainder;
		while (checkBinary!=0) {
			remainder = checkBinary % 10;
			if ((remainder == 0) || (remainder == 1)) {
				checkBinary = checkBinary / 10;
			} else {
				break;
			}
		}
		int decimalnum = 0, j = 1;

		while (n > 0) {
			remainder = n % 10;
			decimalnum = decimalnum + (remainder * j);
			j = j * 2;
			n = n / 10;
		}

		int octal[] = new int[100];
		int i = 0, octalnum = 0;
		while (decimalnum != 0) {
			octal[i] = decimalnum % 8;
			decimalnum = decimalnum / 8;
			i++;
		}
		String result = "";
		for (j = i - 1; j >= 0; j--) {
			result = result + Integer.toString(octal[j]);
		}
		octalnum = Integer.parseInt(result);
		if (checkBinary != 0) {
			octalnum = -1;
		}
		return octalnum;
	}

}
