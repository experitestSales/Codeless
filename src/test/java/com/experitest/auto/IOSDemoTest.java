package com.experitest.auto;

import org.openqa.selenium.By;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import com.experitest.auto.Steps;

@TestInfo(name = "stam", type = TestType.IOS)
public class IOSDemoTest extends TestBase {

    @Test(groups = "all")
    public void test() {
        Steps.waitFor(1, null, null, context);
        Steps.sendKeys(zs, null, null, context);
    }
}
