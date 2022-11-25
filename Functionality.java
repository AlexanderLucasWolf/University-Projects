
public class Functionality {
	public static int[] countingStones(String[] arr) {
		if (arr == null) {
			return null;
		}
		int[] rgb = { 0, 0, 0 };
		for (int i = 0; i < arr.length; i++) {
			sorting(arr[i], rgb);
		}

		for (int i = 0; i < rgb.length; i++) {
			System.out.print(rgb[i] + " ");
		}
		if (rgb[0] == 0 && rgb[1] == 0 && rgb[2] == 0) {
			return null;
		}
		return rgb;
	}

	public static int[] sorting(String input, int[] rgb) {
		if (input.equals("r")) {
			rgb[0] += 1;
			return rgb;
		}
		if (input.equals("g")) {
			rgb[1] += 1;
			return rgb;
		}
		if (input.equals("b")) {
			rgb[2] += 1;
			return rgb;
		}
		System.out.println("No rgb");
		return rgb;
	}

	public static int[] arrayDiv(int[] array, int zahl) {
		assert zahl != 0 && array != null && array.length >= 0;
		int[] result = new int[array.length];
		for (int i = 0; i < array.length; i++) {
			result[i] = array[i] / zahl;
		}
		assert result != null && result.length >= 0 && result.length == array.length && biggerThanZero(result) == true;
		for (int i = 0; i < result.length; i++) {
			System.out.print(result[i] + " ");
		}
		return result;
	}

	public static boolean biggerThanZero(int[] array) {
		assert array != null && array.length >= 0;
		int acc = 0;
		for (int i = 0; i < array.length; i++) {
			acc += array[i];
		}
		return acc >= 0;
	}

	public static void main(String[] args) {
		countingStones(new String[] { "g", "g", "g", "b", "g", "g", "g", "b", "r", "g", "g", "b", "b" });
		System.out.println(" ");
		arrayDiv(new int[] { -8 }, 7);
	}
}
