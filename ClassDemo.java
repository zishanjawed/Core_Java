package com.Zishan.c1;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ClassDemo {

	public static void main(String[] args) throws Exception {
		String str = "";
		BufferedReader br = null;
		try
		{
		br = new BufferedReader (new InputStreamReader (System.in));
		str = br.readLine();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		finally{
			br.close();
		}
		System.out.println(str);
		
	}

}
