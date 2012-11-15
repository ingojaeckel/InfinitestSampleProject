import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class OneGroupOnlyWorksTest {
	private Foo foo;

	@BeforeMethod(groups = "automated")
	public void setup() {
		System.out.println("[OneGroupOnlyWorksTest] setup()");
		this.foo = new Foo();
	}

	@Test(groups = "automated")
	public void automated() {
		System.out.println("[OneGroupOnlyWorksTest] automated");
		Assert.assertEquals(foo.getValue(0), 0);
	}
}
