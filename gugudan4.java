package chap04;


/*
 2�ܺ��� 9�� ������ ��ü ������ ����� ���� ���� ���� ����ϴ� �ڵ带 �ۼ��ϼ���.

 *2 *1 =2
 *......
 *9*9 =81
 *
 *�� ��øfor�ݺ����� ����մϴ�.
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
