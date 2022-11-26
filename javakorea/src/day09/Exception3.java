package day09;

import java.io.BufferedReader;
import java.io.IOException;

// Exception : 제일 포괄적인 범위
// IOException : Input, Output(입출력)관련된 범위

public class Exception3 {
	public static void main(String[] args) throws Exception {
		// Test1 . 객체화 후에 go 사용
		Try3 try3 = new Try3();
		try3.go();
		// throws Exception : 예외가 발생할 경우 Exception 클래스에 맡긴다
	}
}

class Try3{
	private BufferedReader br = null;	
	public void go() throws Exception {				
		// 예외처리 방법1. try~catch 사용
		try {
			br.read();								// 우선 try를 시도, 만약 오류가 발생할 경우 catch부분을 실행
		}catch (IndexOutOfBoundsException e) {		// 의미 : 배열범위가 넘어갔을 때 예외처리
			e.printStackTrace();			
		}catch (IOException e) {					// 의미 : IO 예외가 나왔을 때만
			e.printStackTrace();
		}catch (Exception e) {						// 모든 예외대상에 대해서
			e.printStackTrace();					
		}
	
		// 예외처리 방법2. 해당 메서드에 throws Exception 사용
		br.read();
	}
}