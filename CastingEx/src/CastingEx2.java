
public class CastingEx2 
{

	public static void main(String[] args) 
	{
		
		// TODO Auto-generated method stub
		
		// 자동 형변환
		///자동현변환이ㅡ 규칙
		//기존의 값을 최대한 보존할 수 있는 타입으로 자동 형변환한다.
		
		//1			2		4		8		4		8
		//byte -> short -> int -> long -> flot -> double
		//			char->
		
		//묵시적 형변환 값의 손실이 없다.
		//명시적 형변환 값의 손실이 있지만 그 결과가 원하는 결과라고 compiler에게 알려준다.
		
		/*
		 * 
		 * 1. boolean을 제외한 나머지 7개의 기본형은 서로 형변환이 가능하다.
		 *
		 * 2. 서로 다른 타입의 변수간의 연산은 형변환을 하는것이 원칙이지만,
		 * 	    값의 범위가 작은 타입에서 큰타입의 형변환은 생략할수있다.
		 * 
		 */
		
		//double doubleNum=0.0;
		
		//doubleNum=10;
		
		//int < long < double
		
		//------------------int임-----
		int longgg2=(int)123456789123456L;//명시적 형변환
		long longgggggggg = 333333333;//묵시적 형변환
		double dddddddddd =longgg2;
		
		System.out.println(longgg2);
		System.out.println(longgggggggg);
		System.out.println(dddddddddd);
		
		 longgg2= (int)longgggggggg;//명시적 형변환
		 longgggggggg = longgg2;//묵시적 형변환
		 dddddddddd =longgg2;//묵시적
		
		System.out.println(longgg2);
		System.out.println(longgggggggg);
		System.out.println(dddddddddd);
		
		

	}

}
