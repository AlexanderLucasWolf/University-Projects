import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class Tests {
	int[] arr = { 1, 7, 5, 3 };
	int[] arr2 = { 1, 7, 5, 3, 6, 9, 37, 1, 8, 92 };
	int[] arr3 = { 100, 10, 1 };
	int[] arr4 = { 7, 12 };
	int[] arr5 = { 57 };

	@Test
	public void Normalfall1() {
		int[] arrResult = { 70, 490, 350, 210 };
		assertArrayEquals(Functionality.arrayMultiplizieren(arr, 70), arrResult);
	}

	@Test
	public void Normalfall2() {
		int[] arrResult = { 3, 21, 15, 9, 18, 27, 111, 3, 24, 276 };
		int[] arrCalculated = Functionality.arrayMultiplizieren(arr2, 3);
		for (int i = 0; i < arrResult.length; i++) {
			assertEquals(arrCalculated[i], arrResult[i]);
		}
	}

	@Test
	public void Grenzfall1() { // Grenzfall, da Ergebnis = 1000
		int[] arrResult = { 1000, 100, 10 };
		assertArrayEquals(Functionality.arrayMultiplizieren(arr3, 10), arrResult);
	}

	@Test
	public void Grenzfall2() { // Grenzfall, da Länge des Array 2
		int[] arrResult = { 119, 204 };
		assertArrayEquals(Functionality.arrayMultiplizieren(arr4, 17), arrResult);
	}

	@Test(expected = ValueTooBigException.class)
	public void Fehlerfall1() throws ValueTooBigException {
		Functionality.arrayMultiplizieren(arr, 267);
	}

	@Test(expected = LengthTooSmallException.class)
	public void Fehlerfall2() throws LengthTooSmallException {
		Functionality.arrayMultiplizieren(arr5, 5);
	}
}
