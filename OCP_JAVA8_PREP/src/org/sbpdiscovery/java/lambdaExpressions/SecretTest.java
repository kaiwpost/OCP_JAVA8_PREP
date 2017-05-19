package org.sbpdiscovery.java.lambdaExpressions;


/**
 * @author Kai W. Post, SBP Medical Discovery Institute, 2017
 */
public class SecretTest {
	
	private static void whatsTheWord(double d, Secret secret) {
		System.out.println(secret.magic(d));
	}
	
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		whatsTheWord(5.6, (e) -> { String f = ""; return "Poof!"; });
	}
}
