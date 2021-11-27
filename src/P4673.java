import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class P4673 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		boolean[] x = new boolean[10001];
		
		for(int i=1; i<10001; i++) {
			int n = d(i);
			
			if(n<10001) {
				x[n] = true;
			}
		}
		
		for(int i=1; i<10001; i++) {
			if (!x[i]) {
				bw.write(String.valueOf(i) + "\n");
			}
		}
		bw.flush();
		bw.close();

	}
	
	public static int d(int number) {
		int sum = number;
		
		while(number !=0) {
			sum = sum + (number%10);
			number = number/10;
		}
		return sum;
	}

}