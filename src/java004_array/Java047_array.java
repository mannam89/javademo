package java004_array;

//[데이터]
//홍길동   90  85 40
//이영희  100  35 75
//
//[출력결과]
//홍길동   90  85 40 215 71.7
//이영희  100  35 75 210 70.0

public class Java047_array {

	public static void main(String[] args) {
		String[] name = {"홍길동","이영희"};
		int[][] jumsu= {{90,85,40},{100,35,75}};
		int sum;
		double avg;
		for(int i =0; i<jumsu.length;i++) {
			sum=0;
			System.out.printf("%s\t",name[i]);
			for(int j=0;j<jumsu[i].length;j++) {
				sum+=jumsu[i][j];
				System.out.printf("%4d", jumsu[i][j]);
			}
			avg=(double)sum/jumsu[i].length;
			System.out.printf("%4d %.1f\n",sum,avg);			
		}
	}
}
