package junit;

import org.junit.runner.Description;
import org.junit.runner.notification.RunListener;

public class TestListenner extends RunListener{

	@Override
	public void testFinished(Description description) throws java.lang.Exception {
		System.out.println("Execution Finished : " + description.getMethodName());
	}	

}