
public class SortingAlgorithmsOneDimenional {

	public static int[] bubbleSort(int[] arr) {
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = 0; j < arr.length - i - 1; j++) {
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
		return arr;
	}

	public static int[] insertionSort(int[] arr) {
		for (int i = 1; i < arr.length; i++) {
			int temp = arr[i];
			int j = i - 1;

			while (j >= 0 && arr[j] > temp) {
				arr[j + 1] = arr[j];
				j--;
			}
			arr[j + 1] = temp;
		}
		return arr;
	}

	public static int[] selectionSort(int[] arr) {
		for (int i = 0; i < arr.length - 1; i++) {
			int min = i;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[min] > arr[j]) {
					min = j;
				}
			}
			int temp = arr[i];
			arr[i] = arr[min];
			arr[min] = temp;
		}
		return arr;
	}

	private static int[] mergeSort(int[] arr) {
		int length = arr.length;
		if (length <= 1)
			return arr; // base case
		int middle = length / 2;
		int[] leftArray = new int[middle];
		int[] rightArray = new int[length - middle];
		int i = 0; // left array
		int j = 0; // right array
		for (; i < length; i++) {
			if (i < middle) {
				leftArray[i] = arr[i];
			} else {
				rightArray[j] = arr[i];
				j++;
			}
		}
		mergeSort(leftArray);
		mergeSort(rightArray);
		merge(leftArray, rightArray, arr);
		return arr;
	}

	private static void merge(int[] leftArray, int[] rightArray, int[] arr) {
		int leftSize = arr.length / 2;
		int rightSize = arr.length - leftSize;
		int i = 0, l = 0, r = 0; // indices
		// check the conditions for merging
		while (l < leftSize && r < rightSize) {
			if (leftArray[l] < rightArray[r]) {
				arr[i] = leftArray[l];
				i++;
				l++;
			} else {
				arr[i] = rightArray[r];
				i++;
				r++;
			}
		}
		while (l < leftSize) {
			arr[i] = leftArray[l];
			i++;
			l++;
		}
		while (r < rightSize) {
			arr[i] = rightArray[r];
			i++;
			r++;
		}
	}

	public static void main(String[] args) {
		int array[] = { 4, 3, 5, 9, 1, 2, 6, 8, 7 };
		array = mergeSort(array);
		for (int i : array) {
			System.out.print(i);
		}
	}
}
