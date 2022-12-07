package edu.kh.variable.ex1;

public class VariableExample3 {
	
	public static void main(String[] args) {
		/* 형변환(casting) : 값의 자료형을 변환하는 것
		 * 단 , boolean 형 제외
		 * 형변환이 필요한 이유
		 * -컴퓨터는 기본적으로 같은 자료형끼리 연산가능.
		 * -다른 자료형 연산 시 오류 발생.
		 * --이런 상황을 해결하기 위해 필요한 기술이 형변환
		 * 자동/강제 형변환이 존재
		 * 
		 */
		
		// 자동 형변환
		// -[값의 범위]가 큰 자료형과 [값의 범위]가 작은 자료형 연산 시 
		// 작은 자료형에서 큰 자료형으로
		// 컴파일러에 의해 자동적으로 변환되는 것
		
		int num1 = 10;
		double num2 = 3.5;
		System.out.println(num1 + num2);
		// 원래 에러가 발생해야되지만 "자동 형변환" 덕분에 발생되지 않음.
		
		int i1 = 3;
		double d1 = i1; //double은 실수만 저장할 수 있는 자로형
						//정수가 대입되는 연산이 수행되면
		
		System.out.println("i1 : " + i1);
		System.out.println("d1 : " + d1);
		
		System.out.println(d1 + num2); //double + double
		
		//char 문자형 자료형
		//char 자로형은 문자형이지만 실제 저장하는 값은
		// 0부터 6만5천번 사이에 있는 숫자
		char ch = 'V';
		int i3 = ch;
		
		System.out.println("i3 : " + i3); //V라는 숫자가 유니코드로 86이라는것임
		
		char ch1 = '각';
		int i4 = ch1;
		System.out.println("i4 : " + i4);

	}

}
