
public class Functionality {

	public static double mean(int[] arr) {
		if (arr.length == 0) {
			return 0;
		}
		double gesamtwert = 0.0;
		for (int i = 0; i < arr.length; i++) {
			gesamtwert += arr[i];
		}
		double result = gesamtwert / arr.length;
		return result;
	}

	public static double median(int[] arr) {
		if (arr.length == 0) {
			return 0;
		}
		int speicher;
		double result;
		for (int j = 0; j < arr.length; j++) {
			for (int i = 1; i < arr.length; i++) {
				if (arr[i - 1] > arr[i]) {
					speicher = arr[i - 1];
					arr[i - 1] = arr[i];
					arr[i] = speicher;
				}
			}
		}
		if (arr.length % 2 == 0) {
			result = arr[arr.length / 2] + arr[(arr.length / 2) - 1];
			result = result / 2;
		} else {
			result = arr[(arr.length - 1) / 2];
		}
		return result;
	}

	public static int[][] insertionSort2D(int arr[][]) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 1; j < arr[i].length; j++) {
				int temp = arr[i][j];
				int k = j;
				while (k > 0 && arr[i][k - 1] > temp) {
					arr[i][k] = arr[i][k - 1];
					arr[i][k - 1] = temp;
					k--;
				}
			}
		}
		return arr;
	}

	public static double[] MedianeFinden(int[][] arr) {
		double median[] = new double[arr.length];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i].length == 0) {
				median[i] = 0;
			} else if (arr[i].length % 2 != 0) {
				median[i] = arr[i][arr.length / 2];
			} else {
				int a = arr[i][arr.length / 2];
				int b = arr[i][(arr.length / 2) - 1];
				median[i] = (a + b);
				median[i] = median[i] / 2;
			}
		}
		return median;
	}

	public static int[][] insertionMedian(int[][] arr) {
		int[][] arrClone = new int[arr.length][];
		for (int i = 0; i < arr.length; i++) {
			arrClone[i] = new int[arr[i].length];
		}
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arrClone[i][j] = arr[i][j];
			}
		}
		double[] mediane = new double[arrClone.length];
		arrClone = insertionSort2D(arrClone);
		mediane = MedianeFinden(arrClone);
		for (int i = 1; i < mediane.length; i++) {
			double medianeTemp = mediane[i];
			int[] temp = arr[i];
			int j = i - 1;
			while ((j > -1) && (mediane[j] > medianeTemp)) {
				mediane[j + 1] = mediane[j];
				arr[j + 1] = arr[j];
				j--;
			}
			mediane[j + 1] = medianeTemp;
			arr[j + 1] = temp;
		}
		return arr;
	}

	public static int[][] selectionMean(int[][] arr) {
		int emptyArrays = 0;
		for (int x = 0; x < arr.length; x++) {
			if (arr[x].length == 0) {
				int[] speicher;
				speicher = arr[emptyArrays];
				arr[emptyArrays] = arr[x];
				arr[x] = speicher;
				emptyArrays++;
			}
		}
		for (int i = 0 + emptyArrays; i < arr.length - 1; i++) {
			int index = i;
			int sum1 = 0;
			int sum2 = 0;
			for (int j = i + 1; j < arr.length; j++) {
				for (int k = 0; k < arr[j].length; k++) {
					sum1 += arr[j][k];
				}
				sum1 = sum1 / arr[j].length;
				for (int k = 0; k < arr[i].length; k++) {
					sum2 += arr[i][k];
				}
				sum2 = sum2 / arr[i].length;
				if (sum1 < sum2) {
					index = j;
				}
			}
			int[] smallerNumber = arr[index];
			arr[index] = arr[i];
			arr[i] = smallerNumber;
		}
		return arr;
	}

	public static void main(String[] args) {
		mean(new int[] { 21, 4, 3 });
		median(new int[] {});
		int arr[][] = insertionMedian(new int[][] { { 1, 4, -2 }, { 4, 2, 9 }, { -1, 3, 5 }, { -100, 3, 5 } });
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.println(arr[i][j]);
			}
		}
		selectionMean(new int[][] { { 1, 4, -2 }, { 4, 2, 9 }, { -1, 3, 5 }, { -100, 3, 5 } });
	}
}
