package chap04;
import java.util.Scanner;

/*
 * ����ڿ��� �������� ���� �Է� �޾� ������ ����� ����ϴ� �ڵ带 �ۼ��ϼ���.
 * ���࿹)
 * �������� ���� �Է��ϼ���: 4
 * 
 *[4��]
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
		
		
		System.out.print("�������� ���� �Է� �ϼ���: ");
		gugu = sc.nextInt();
		sc.close();
		
		System.out.printf("[ %d �� ]\n",gugu);
		
		for(i=1; i<=9; i++) {
			result= i*gugu;
			
			System.out.printf("%d x %d = %d\n",gugu,i,result);
		}
		
		
	}

}
