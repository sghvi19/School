import acm.program.ConsoleProgram;

public class workout extends ConsoleProgram{


	public void run() {
		int arr[] = new int[100];
		
		for (int i=0; i<10; ) {
			for (int j=0; j<8; j++) {
				j++;
				arr[i+j] = i+2*j;
				i++;
			}
		}

		for (int i=0; i<10; i++) {
			print(arr[i] + " ");
		}
	}

		
}
