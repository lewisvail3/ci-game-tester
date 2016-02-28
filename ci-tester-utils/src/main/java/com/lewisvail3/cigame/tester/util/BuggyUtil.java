package com.lewisvail3.cigame.tester.util;

/**
 * This is a utility class that will be full of bugs that will affect my ci-game score
 * @author lewisvail
 *
 */
public class BuggyUtil {

	public void foo() {
		System.out.println("Foo on you!");
	}
	
	public void nullPointerAccess(String arg) {
		if (arg == null) {
			System.out.println("Trim null arg: " + arg.trim());
		}
	}
}
