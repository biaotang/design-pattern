package com.design.pattern.decorator;

import java.io.InputStream;
import java.io.StringBufferInputStream;

public class InputTest {
	
	public static void main(String[] args) {
		int c;
		try (InputStream in = new LowerCaseInputStream(new StringBufferInputStream("HELLO WORLD"));){
			while ((c = in.read()) >= 0) {
				System.out.print((char)c);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
