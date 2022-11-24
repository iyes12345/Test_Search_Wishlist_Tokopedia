package cucumber.utils;

public enum TestScenarios {

    T1("User search product item"),
    ;

    private String testName;

    TestScenarios(String value) {
        testName = value;
    }

    public String getTestName() {
        return testName;
    }

}