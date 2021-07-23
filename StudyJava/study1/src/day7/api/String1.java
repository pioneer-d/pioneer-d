package day7.api;

public class String1 {
	
	public static void main(String[] args) {
		
		String str1 = "abcd";
		String str2 = "EFGH";
		String str3 = " ijkl " ;
		
		//문자열의 위치는 0부터이다!
		
		//concat - 문자열 연결
			System.out.println("문자열 연결 : "+str1.concat(str2));
		//substring - 문자열 자르기 - 개수니까 1부터
			System.out.println("문자열 자르기 : "+str1.substring(2));
		//length - 문자열 길이
			System.out.println("문자열 길이 : "+str1.length());
		//toUpperCase - 대문자화
			System.out.println("대문자화 : "+str1.toUpperCase());
		//to LowerCase - 소문자화
			System.out.println("소문자화 : "+str2.toLowerCase());
		//charAt - 특정 위치의 글자 찾기 - 순서니까 0부터
			System.out.println("특정 위치의 글자 찾기 : "+str1.charAt(2));
		//indexOf - 특정 문자열의 위치 찾기
			System.out.println("특정 문자열의 위치 찾기 : "+str1.indexOf("a"));
		//equal - 문자열 비교
			System.out.println("문자열 비교 : "+str1.equals(str3));
		//trim - 문자열 공백제거(가장자리만)
			System.out.println("문자열 공백 제거 : "+str3);
			System.out.println("문자열 공백 제거 : "+str3.trim());
		//replace - 특정 문자 변경
			System.out.println("특정 문자 변경 : "+str1.replace('a','b'));
		//replaceAll - 특정 문자열 변경
			System.out.println("특정 문자열 변경 : "+str1.replaceAll("abc","aaa"));
	}

}
