package org.Seleniumtesting;

import java.time.LocalDateTime;

import org.testng.annotations.Test;

public class Jenkins_check {
	@Test
	void test1()
	{
		LocalDateTime d = LocalDateTime.now();
		System.out.println(d);
	}
	

}
