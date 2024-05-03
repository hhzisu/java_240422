package practice04;

public class CoronaSum {
	public static void main(String[] args) {
		int res =0;
		int sum=0;
		int corona[][] = new int[12][3];
		for (int i = 1; i <= 12 ; i++) {
			
			for (int j = 1; j <= 3; j++) {
				res = i*10+j;
				corona[i][j] = res;
				sum+=res;
			}
		}
		System.out.println("1년 전체 코로나 환자수는 "+sum);
	}
}
//완성 못함