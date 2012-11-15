import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class MultipleGroupsDontWorkTest {
	private Foo foo;

	@BeforeMethod(groups = { "automated", "integration" })
	public void setup() {
		System.out.println("[MultipleGroupsDontWorkTest] setup()");
		this.foo = new Foo();
	}

	@Test(groups = "automated")
	public void automated() {
		System.out.println("[MultipleGroupsDontWorkTest] automated");
		Assert.assertEquals(foo.getValue(1), 2);
	}

	@Test(groups = "integration")
	public void integration() {
		System.out.println("[MultipleGroupsDontWorkTest] integration");
		Assert.assertEquals(foo.getValue(0), 0);
	}
}
