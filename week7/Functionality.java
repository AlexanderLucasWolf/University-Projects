package myPackage;

public class Functionality {

	public static double lengthTwoVectors(int[] vector1, int[] vector2) throws DifferentDimensionsException {
		if (vector1.length != vector2.length) {
			throw new DifferentDimensionsException("Die uebergebenen Arrays haben unterschiedliche Dimensionen!");
		}
		if (vector1.length == 0 || vector2.length == 0) {
			throw new NullPointerException("Eines der uebergebenen Arrays ist null!");
		}
		int[] vector3 = new int[vector1.length];
		for (int i = 0; i < vector1.length; i++) {
			vector3[i] = vector1[i] + vector2[i];
		}
		for (int i = 0; i < vector3.length; i++) {
			vector3[i] = vector3[i] * vector3[i];
		}
		try {
			int sum = vectorSum(vector3);
			return Math.round(Math.sqrt(sum) * 1000.0) / 1000.0;
		} catch (NullvectorException e) {
			System.out.println("Eines der uebergebenen Arrays ist ein Nullvektor!");
			return Double.NaN;
		} catch (NullPointerException e) {
			System.out.println("Der uebergebene Vektor ist null");
			return Double.NaN;
		}
	}

	public static int vectorSum(int[] vector) throws NullvectorException, NullPointerException {
		if (vector == null) {
			throw new NullPointerException("Das uebergebene Array ist null!");
		}
		int sum = 0;
		for (int i = 0; i < vector.length; i++) {
			sum += vector[i];
		}
		if (sum == 0) {
			throw new NullvectorException("Die Summe ist 0!");
		}
		return sum;
	}

	public static void main(String[] args) throws DifferentDimensionsException {
		int[] vector1 = { -1 };
		int[] vector2 = { 1 };
		System.out.println(lengthTwoVectors(vector1, vector2));
	}
}
