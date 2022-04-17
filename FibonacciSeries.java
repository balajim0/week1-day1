package week1.day1;

public class FibonacciSeries {
	public static void main(String[] args) {
		int range = 8;
		int firstnum = 0;
		int secNum = 1;
		int sum=0;
		System.out.println(firstnum);
		for ( firstnum=1; firstnum<range; ++firstnum)
		{
			
			
					
			firstnum= secNum;
			
			secNum = sum;
			sum =(firstnum+secNum);
			System.out.println(sum);
		}
}
}
