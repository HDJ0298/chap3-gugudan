package chap04;
import java.util.Scanner;

/*
 * 사용자에게 구구단의 단을 입력 받아 구구단 결과를 출력하는 코드를 작성하세요.
 * 실행예)
 * 구구단의 단을 입력하세요: 4
 * 
 *[4단]
 *4 *1 =4
 *......
 *4*9 =36
*/




public class gugudan {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int i;
		int gugu;
		int result = 0;
		
		
		System.out.print("구구단의 단을 입력 하세요: ");
		gugu = sc.nextInt();
		sc.close();
		
		System.out.printf("[ %d 단 ]\n",gugu);
		
		for(i=1; i<=9; i++) {
			result= i*gugu;
			
			System.out.printf("%d x %d = %d\n",gugu,i,result);
		}
		
		
	}

}
