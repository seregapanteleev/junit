package junit;

import org.junit.runner.notification.RunNotifier;
import org.junit.runners.BlockJUnit4ClassRunner;
import org.junit.runners.model.InitializationError;

public class TestRunner extends BlockJUnit4ClassRunner {

	private TestListenner ourListener;

	public TestRunner(Class<TestListenner> clz) throws InitializationError {
		super(clz);
		ourListener = new TestListenner();
	}

	@Override
	public void run(final RunNotifier notifier) {
		notifier.addListener(ourListener);
		super.run(notifier);
	}
}
