package Question6;

public class MergeArray {
	public int[] merge(int[] input1, int[] input2) {

		int len = input1.length + input2.length;
		int result[] = new int[len];

		int len1 = input1.length, len2 = input2.length, pos = 0;
		int index1 = 0, index2 = 0;


			while (index1 < len1 && index2 < len2) {
				if (input1[index1] < input2[index2]) {
					result[pos] = input1[index1];
					index1++;
				} else {
					result[pos] = input2[index2];
					index2++;
				}
				pos++;
			}
			
			// Store remaining elements of first array
				while (index1 < len1) {
					result[pos] = input1[index1];
					index1++;
					pos++;
				}
			
		   // Store remaining elements of second array
				while (index2 < len2) {
					result[pos] = input2[index2];
					index2++;
					pos++;
				
		}
		return result;
	}
}
