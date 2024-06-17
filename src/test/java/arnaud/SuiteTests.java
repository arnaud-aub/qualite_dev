package arnaud;

import org.junit.platform.suite.api.*;

@Suite
@SuiteDisplayName("Test Suite de Test")
@SelectPackages("arnaud")
@IncludeClassNamePatterns(".*Test")

public class SuiteTests {

}
