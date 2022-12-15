import java.util.*;

class RepeatingArray {

	public static int firstNonRepeating(int arr[], int n) {
		// Loop for checking each element
		for (int i = 0; i < n; i++) {

			// Checking if ith
			for (int j = 0; j < n; j++) {
				if (i != j && arr[i] == arr[j])
					break;
				// if ith element is not present in array
				// except at ith index then return element
				if (j == n)
					return arr[i];
			}
		}
		return -1;
	}
}

// Driver code
public class RepeatingArrayApp {
	public static void main(String x[]) {
		int arr[] = { 9, 4, 9, 6, 7, 4 };

		Scanner sc = new Scanner(System.in);
		int n;
		n = arr.length;
		// System.out.pr
		n = sc.nextInt();
		sc.close();
		System.out.println("enter  ele f");

		System.out.print("firstNonRepeating(arr, n)");
	}
}
