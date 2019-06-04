
package com.biz.stringarray;

public class StrArray_05 {

	public static void main(String[] args) {
	
		String strName = "홍길동";
		String[] strNames = strName.split("");
		
		
		// 문자열.length("") 메서드는
		// 문자열(변수)에 담긴 문자열들을
		// 한글자씩 분해해서
		// 문자열 개수만큼 배열을 생성해준다
		for(int i =0; i < strNames.length; i++) {
			System.out.println(strNames.length);
		}
		int intNum = 10;
		int intNum2 = intNum + 100;
		
	}

	// makeString() 메서드의 형태만 만들고
	// 내부의 구체적인 기능은 작성하지 않은 상태
	// 이런 코드를 proto type 이라고 한다.
	// 보통 proto type을 만들었을때
	// void 형이 아닌경우에
	// return문을 만들어야 하는데
	// return형이 숫자이면 return 0이라고 작성하고
	// 그외 형일 경우는 return null이라고 작성ㅎ나다.
	public static String[] makeString(String strNations) {

		return null;
	}
}
