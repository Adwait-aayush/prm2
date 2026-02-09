package even_odd;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Result_Test {
@Test
public void Testinvalid() {
	Assert.assertEquals(Result.check(-1), "invalid");
}
@Test
public void TestEven() {
	Assert.assertEquals(Result.check(2), "Even");
}
@Test
public void Testodd() {
	Assert.assertEquals(Result.check(1), "Odd");
}
}
