import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AlwaysRunWorksTest {
	private Foo foo;

	@BeforeMethod(alwaysRun = true)
	public void setup() {
		System.out.println("[AlwaysRunWorksTest] setup()");
		this.foo = new Foo();
	}

	@Test(groups = "automated")
	public void automated() {
		System.out.println("[AlwaysRunWorksTest] automated");
		Assert.assertEquals(foo.getValue(0), 0);
	}

	@Test(groups = "integration")
	public void integration() {
		System.out.println("[AlwaysRunWorksTest] integration");
		Assert.assertEquals(foo.getValue(0), 0);
	}
}
