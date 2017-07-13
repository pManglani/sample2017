package Question6;

import org.junit.Assert;
import org.junit.Test;

public class TestMergeArray {

	// when some of elements are different in both the array
	@Test
	public void testWhenArrayIsSorted() {
		int input1[] = { 1, 2, 3, 4, 5, 6, 7 };
		int input2[] = { 8, 9, 10, 11, 12, 13, 14 };
		int expected[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14 };
		MergeArray testMerge = new MergeArray();
		int actual[] = testMerge.merge(input1, input2);
		Assert.assertArrayEquals(expected, actual);
	}

	// when some of elements are same in both the array
	@Test
	public void testOnSameElements() {
		int input1[] = { 1, 2, 3, 4, 5, 6, 7 };
		int input2[] = { 0, 2, 3, 11, 12, 13, 14 };
		int expected[] = { 0, 1, 2, 2, 3, 3, 4, 5, 6, 7, 11, 12, 13, 14 };
		MergeArray testMerge = new MergeArray();
		int actual[] = testMerge.merge(input1, input2);
		Assert.assertArrayEquals(expected, actual);
	}

	// when one of the array is null
	@Test
	public void testOnEmpty() {
		int input1[] = {};
		int input2[] = { 0, 2, 3, 11, 12, 13, 14 };
		int expected[] = { 0, 2, 3, 11, 12, 13, 14 };
		MergeArray testMerge = new MergeArray();
		int actual[] = testMerge.merge(input1, input2);
		Assert.assertArrayEquals(expected, actual);
	}

}
