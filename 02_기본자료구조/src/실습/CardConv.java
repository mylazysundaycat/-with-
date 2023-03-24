package 실습;

public class CardConv {
	static int cardConv(int x, int r, char[] d) {
		int digits = 0;
		String dchar = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		
		do {
			d[digits++]=dchar.charAt(x%r);
			x/=r;
		} while(x!=0);
		
		
		for(int i=0; i<digits/2; i++) {
			char t = d[i];
			d[i] = d[digits-i-1];
			d[digits-i-1] = t;
			
		}
	}
}
