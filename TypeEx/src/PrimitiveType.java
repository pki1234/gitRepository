
public class PrimitiveType 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

		//���� boolean true false
		//������ char 0~65535
		//������ byte , short , int , long
		//byte: -127~127
		//short: -32,768 ~ 32,767
		//int: 2�� 32�� ~ �ݴ���� �� +-28��
		//long: -2�� 63�� ~ �ݴ����
		
	
		//�Ǽ��� float , double
		//float: 1.4e~45 ~ 3.4E38
		//double: ��ûũ��(long���� ŭ)
		
		
		boolean power = true;
		boolean checked = false;
		
		//checked=
		
		System.out.println("��� yes/no,����ġ on/off");
		System.out.println(power);
		System.out.println(checked);
		System.out.println();
		System.out.println();
		
		char ch=92;
		//�ϳ��� ���ڸ��� ����
		
		
		
		System.out.println(ch);
		
		//���ڵ�  ���ڵ�
		
		
		//정수형
		
		//byte, short, int, long
		// 1, 	2 , 	4, 	8
		//bit 8, 16 , 32, 64	
		
		int num =10;
		System.out.println(num);
		
		
		byte b = 127;
		
		b=(byte)(b+2);
		
		System.out.println(b);
		
		
		
		long bingNum = 300000000000L;
		long bingNum2 = 300000000000000000L;
		System.out.println("long 타입: "+ bingNum);
		
		int firstNum = 1500000000;
		int secondNum = 1300000000;
		
		int sum=0;
		sum = firstNum + secondNum;
		
		System.out.println("총 명품금액 "+ sum);
		
		//실수형
		//float, double
		//실수정확도 -> 정밀도
		float f= 9.123456789012345678901234567890f;
		float f2= 1.2345678901234567890f;
		double d=9.123456789012345678901234567890d;
		
		System.out.println(f);
		System.out.println(f2);
		System.out.println(d);
		
	}

}
