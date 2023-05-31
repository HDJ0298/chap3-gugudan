package chap04;


/*
 2단부터 9단 까지의 전체 구구단 결과를 실행 예와 같이 출력하는 코드를 작성하세요.

 *2 *1 =2
 *......
 *9*9 =81
 *
 *단 중첩for반복문을 사용합니다.
*/
 
 
public class gugudan4 {

	public static void main(String[] args) {
		
		for(int i=2; i<=9; i++) {
			for(int j=1; j<=9; j++) {
				
				System.out.printf("\n%d x %d = %d",i,j,i*j);
			}
		}
		
	}

}
