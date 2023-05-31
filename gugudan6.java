package chap04;

/*
2단부터 9단 까지의 전체 구구단 결과를 실행 예와 같이 출력하는 코드를 작성하세요.

 *중첩 for문 사용
 *
 *옆으로 출력
*/

public class gugudan6 {

	public static void main(String[] args) {
		
		for(int i=1; i<=9; i++) {   //단 곱하는 수가 바뀜
			for(int j=2; j<=9; j++) { //줄 구구단의 단만 바뀜   한줄이 끝나면 개행
				System.out.printf("%d x %d = %d\t",j,i,i*j);
				
			}
			System.out.println();
		}
		
		/*  내가한거
		 for(int i=1; i<=9; i++) {
			System.out.printf("\n");
			for(int j=2; j<=9; j++) {
				System.out.printf("\t%d x %d = %d",j,i,i*j);
				
			}
		}
		 */
		

	}

}
