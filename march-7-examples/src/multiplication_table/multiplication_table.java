package multiplication_table;

public class multiplication_table {

	public static void main(String[] args) {
		for(int i = 1; i <= 9; i++) {
			for(int j = 1; j <= 9; j++) {
				int result = i * j;
				String formattedOutput = String.format("(%d x %d) = %d", i, j, result);
				System.out.println(formattedOutput);
			}
		}
	}

}
