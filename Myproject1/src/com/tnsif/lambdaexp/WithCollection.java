package com.tnsif.lambdaexp;

import java.util.Arrays;
import java.util.List;

public class WithCollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       List<String>ob=Arrays.asList("ram", "kumar", "Satya");
       ob.forEach(name->System.out.println(name));
	}

}
