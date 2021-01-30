import acm.program.ConsoleProgram;

public class fx extends ConsoleProgram {

	public void run() {
		int[][] arr = new int[5][5];
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				arr[i][j] = readInt("Enter:");
			}
		}
		println(getMaxDescent(arr));
	}

	private int getMaxDescent(int[][] mountains) {
		int ar[];
		int result = 0;

		for (int i = 0; i < mountains.length; i++) {
			ar = mountains[i];

			result = Math.max(result, number(ar));
		}
		return result;
	}

	private int number(int[] ar) {
		if (ar.length == 2)
			return 1;
		int result = 0;
		for (int i = 0; i < ar.length - 1; i++) {
			result = Math.max(result, ar[i] - ar[i + 1]);
		}
		return result;
	}

}
