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
		bw.write(String.valueOf(count(Integer.parseInt(br.readLine()))));
		
		br.close();
		bw.flush();
		bw.close();
		
	}
	
	public static int count(int num) {
		int cnt = 0;
		
		if(num<100) {
		return num;
	}
	else {
		cnt = 99;
		if(num==1000) {
			num=999;
		}
		
		for(int i=100; i<=num; i++) {
			int h = i/100;
			int t = (i/10)%10;
			int o = i%10;
			
			if((h-t)==(t-o)) {
				cnt++;
			}
		}
	}
		return cnt;
		
	}

}