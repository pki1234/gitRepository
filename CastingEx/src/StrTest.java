
public class StrTest 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		//문자형 char = 오직 한글자 char = ' '<-공백으로 초기화 
		//문자열 String = 
		
		String strDefault = null;
		//초기값의 특징 : 어떤 다른 내용들과 합쳐져도 영향을 주지 않아야 한다. int = 0; String = "";
		strDefault="";
		String name = "";

		String str = "";
		char ch = ' ';
		//문자열 특징
		//문자열 + any type -> 문자열 + 문자열-> 문자열
		//any type + 문자열 -> 문자열 + 문자열 -> 문자열
		
		
		
		str = "Ja"+"Va ";
		name = str + 8.0;
		
		
		System.out.println("str : "  + str);
		System.out.println("name : "  + name);
		
		String string = "";///////////////////////////////////8/
		string = 7+""+true;//
		System.out.println("string : "  + string);
		
		
		System.out.println("name : "+1);
	}

}
