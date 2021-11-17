import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class P1065 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Integer.parseInt(br.readLine());
		int count=0;
		
		for(int i=1; i<=n; i++) {
			
			if(100<=n) {
				if(((n/100) - (n%100/10)) == ((n%100/10) - (n/10))) {
					count = count+1;
				}
				
			}
			else if(n<100) {
				count = count+1;
			}
		}
		bw.write(String.valueOf(count+ "\n"));
		
		br.close();
		bw.flush();
		bw.close();

	}

}