package anotherPackage;
import static org.junit.Assert.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.*;

import java.lang.reflect.Array;

import org.junit.jupiter.api.Test;


class ArrayQuiz {

	@Test
	void test() {
		int[] expected = {5,4,6};
		int[] give = {6,4,5};
		reverseArray(give);
		assertArrayEquals(expected, give);

	}

	private void reverseArray(int[] i) {
		//int[] temp = {5,4,6};

		for (int j = 0; j < i.length / 2; j++) {
			int x = i[j];
			i[j] = i[i.length - 1 - j];
			i[i.length - 1 - j] = x;
			

		}

		// TODO Auto-generated method stub

		

	}

}
