package exercise6;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import exercise1.MyFirstTest;
import exercise2.validateTrueFalse;
import exercise3.validateAssertEquals;
import exercise4.BeforeAndAfterConditions;
import exercise5.BeforeAndAfterClassConditions;

@RunWith(Suite.class)
@SuiteClasses({
	MyFirstTest.class,
	validateTrueFalse.class,
	validateAssertEquals.class,
	BeforeAndAfterConditions.class,
	BeforeAndAfterClassConditions.class,
})

public class TestSuite {

}
