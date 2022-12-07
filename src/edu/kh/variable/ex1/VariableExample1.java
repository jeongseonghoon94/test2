package edu.kh.variable.ex1;

public class VariableExample1 {
	public static void main(String[] args) {
		System.out.println(2 * 3.141592653589793 * 5);
		System.out.println(3.141592653589793 * 5 * 5);
		System.out.println(3.141592653589793 * 5 * 5 * 20);
		
		
		double pi = 3.141592653589793;
		int r = 5; //반지름
		int h = 20; //높이
		
		System.out.println("==============================");
		
		System.out.println(2* pi * r); //원의 둘레
		System.out.println(pi * r * r); //원의 넓이
		System.out.println(pi * r * r * h); //원기둥의 부피
		
		
		/* 변수(variable)
		 * =메모리에 값을 기록하는 공간
		 * - 공간에 기록되는 값이 변할 수 있어서 변수라고 한다
		 * 변수는 여러 종류 존재(저장되는 값의 형태,크기가 다름)
		 * 장점
		 * 1. 가독성 증가
		 * 2. 재사용성 증가
		 * 3. 코드길이 감소
		 * 4. 유지보수성 증가
		 */
		
	}

}
