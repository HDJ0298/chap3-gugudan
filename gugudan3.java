package chap04;


/*
 2�ܺ��� 9�� ������ ��ü ������ ����� ���� ���� ���� ����ϴ� �ڵ带 �ۼ��ϼ���.


[2��]
 *2 *1 =2
 *......
 *9*9 =81
 *
 *�� �ϳ��� for�ݺ����� ����մϴ�.
*/
 
 
public class gugudan3 {

	public static void main(String[] args) {
		
		int dan =2;
		int num = 1;
		
		
		for(int i=0; i<72; i++ ) {
			if(num ==1) {
				System.out.printf("\n\n[%d��]",dan);
			}
			
			System.out.printf("\n%d X %d = %d",dan,num,dan*num);
			
			num++;
			
			if(num == 10) {
				
				dan ++;
				num = 1;
			}
			
		}

	}

}
