package chap04;


/*
 2단부터 9단 까지의 전체 구구단 결과를 실행 예와 같이 출력하는 코드를 작성하세요.

 *2 *1 =2
 *......
 *9*9 =81
 *
 *단 하나의 for반복문을 사용합니다.
*/
 
 
public class gugudan2 {

	public static void main(String[] args) {
		
		int dan =2;
		int num = 1;
		
		
		for(int i=0; i<72; i++ ) {
			
			
			System.out.printf("\n%d X %d = %d",dan,num,dan*num);
			num++;
			
			if(num == 10) {
				dan ++;
				num = 1;
			}
		}

	}

}
