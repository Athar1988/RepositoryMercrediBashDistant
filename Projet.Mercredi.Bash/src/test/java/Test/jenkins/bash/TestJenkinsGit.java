package Test.jenkins.bash;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestJenkinsGit {

	@Test
	public void test() {
			int a=2;
			int b=1;
			assertTrue(a+b==3);
		}
	@Test
	public void testfail() {
			int a=2;
			int b=2;
			assertTrue(a+b==4);
		}
	}
