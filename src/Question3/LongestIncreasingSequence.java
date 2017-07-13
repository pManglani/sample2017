package Question3;

public class LongestIncreasingSequence {

	int[] longestSequence(int input[]) {

		int start = 0, end = 0, length = 0, index, max = 0;
		int arrayLength = input.length;

		for (index = 1; index < arrayLength; index++) {
			if (input[index] > input[index - 1]) {
				max++;
			}

			else {
				if (max > length) {
					length = max;
					end = index;
					start = end - length;
				}
				max = 0;
				index--;
			}
		}
		int resultLength = end - start + 1;
		int result[] = new int[resultLength];
		for (index = 0; index < resultLength; index++) {
			result[index] = input[start];
		}

		return result;
	}
}
