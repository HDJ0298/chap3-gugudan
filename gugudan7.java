package chap04;

/*
2�ܺ��� 9�� ������ ��ü ������ ����� ���� ���� ���� ����ϴ� �ڵ带 �ۼ��ϼ���.

 *��ø for�� ���
 *
 *���̸� ����ϱ�
 *0���� �߰��ؼ� i==0 �϶� print�߰��ϱ�. �̰��� �������ߴ�.   2x0 �̸� print ���
*/

public class gugudan7 {

	public static void main(String[] args) {
		
		
		for(int i=0; i<=9; i++) {      //0�ٺ��� 9�ٱ���~  ���ϴ� �� ���� �ݺ���
			for(int j=2; j<=9; j++) {   //�ܼ� ���� �ݺ���
				if(i==0) {
					System.out.printf("  [%d ��]\t\t",j);
				}else {
					System.out.printf("%d x %d = %d\t",j,i,i*j);
				}
			}
			System.out.println();
		}
		
		
		
		/*
		for(int i=0; i<=9; i++) {   //�� ���ϴ� ���� �ٲ�
			
			for(int j=2; j<=9; j++) { //�� �������� �ܸ� �ٲ�   ������ ������ ����
				if(i==0) {
					System.out.printf("  [%d ��]\t\t",j);
				}else {
					System.out.printf("%d x %d = %d\t",j,i,i*j);
				}
				
			}
			System.out.println();
		}
		*/
		
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
