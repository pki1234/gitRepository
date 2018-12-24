
public class OpEx1 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		// 연사자와 피연산자
		// 연산자(operator)연산을 수행하는 기호
		// 피연산자 연산자의 작업대상(변수,리터럴,수식등)
		// ex : x+3->연산자 + / 피연산자x, 3
		
		int num = 0;
		
		num = 1;
		
		num=num+10;
		
		System.out.println(num);
		
		//산술변환
		//두값의 타입을 길게 일치시킨다(보다 큰 타입으로 일치)
		//long +int -> long+long ->long
		//double+int ->double+double->double
		//double+long -> double+double ->double
		//피연산ㄴ자의 타입이 int보다 작은 타입이면 int로 변환된다.
		//byte+short-> int+int ->int
		//char + short->int +int ->int

		//타입보다 큰 숫자가 오게되는 경우 overflow가 발생
		//의도하지 않은 값 출력
		
	}

}
