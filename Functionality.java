
public class Functionality {

	public static String longestWord(String a) {
		String longestWord = "";
		String currentWord = "";
		char currentLetter;
		if (a == "") {
			return "";
		}
		for (int i = 0; i < a.length(); i++) {
			currentLetter = a.charAt(i);
			if (currentLetter != ' ') {
				currentWord += a.charAt(i);
			} else {
				if (currentWord.length() > longestWord.length()) {
					longestWord = currentWord;
				}
				currentWord = "";
			}
			if (i == a.length() - 1) {
				if (currentWord.length() > longestWord.length()) {
					longestWord = currentWord;
				}
			}
		}
		longestWord = longestWord + " " + longestWord.length();
		System.out.println(longestWord);
		return longestWord;
	}

	public static int[][] decompress(int arr[]) {
		int laenge1;
		int laenge2;
		if (arr.length % 2 == 0) {
			laenge1 = arr.length / 2;
			laenge2 = arr.length / 2;
		} else {
			laenge1 = (arr.length + 1) / 2;
			laenge2 = (arr.length - 1) / 2;
		}

		int[][] newArr = new int[2][];
		newArr[0] = new int[laenge1];
		newArr[1] = new int[laenge2];

		for (int i = 0; i < laenge1; i++) {
			newArr[0][i] = arr[i];
		}
		for (int i = 0; i < laenge2; i++) {
			newArr[1][i] = arr[i + laenge1];
		}
		return newArr;
	}

	public static void main(String[] args) {
		longestWord("Universitaet Koblenz-Landau");
		int[] arr = { 1, 2, 3, 4, 5, 6, 7 };
		int[][] newArr = decompress(new int[] { -2, -6, 10, 98, 7 });
		for (int i = 0; i < newArr.length; ++i) {
			for (int j = 0; j < newArr[i].length; ++j) {
				System.out.println(i + " " + j + " " + newArr[i][j] + " ");
			}
		}
	}
}
