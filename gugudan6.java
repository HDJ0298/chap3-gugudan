package chap04;

/*
2�ܺ��� 9�� ������ ��ü ������ ����� ���� ���� ���� ����ϴ� �ڵ带 �ۼ��ϼ���.

 *��ø for�� ���
 *
 *������ ���
*/

public class gugudan6 {

	public static void main(String[] args) {
		
		for(int i=1; i<=9; i++) {   //�� ���ϴ� ���� �ٲ�
			for(int j=2; j<=9; j++) { //�� �������� �ܸ� �ٲ�   ������ ������ ����
				System.out.printf("%d x %d = %d\t",j,i,i*j);
				
			}
			System.out.println();
		}
		
		/*  �����Ѱ�
		 for(int i=1; i<=9; i++) {
			System.out.printf("\n");
			for(int j=2; j<=9; j++) {
				System.out.printf("\t%d x %d = %d",j,i,i*j);
				
			}
		}
		 */
		

	}

}
