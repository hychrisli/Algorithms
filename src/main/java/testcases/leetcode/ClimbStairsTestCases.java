package testcases.leetcode;

import base.TestCases;
import structures.TestCase;
import structures.TestCaseHandler;

public class ClimbStairsTestCases extends TestCases<Integer, Integer> implements TestCaseHandler<Integer, Integer> {

    private static final long serialVersionUID = 548177458147948666L;

    public ClimbStairsTestCases(){
        addTestCase("Basic Test", 5, 8);
        addTestCase("Test 0", 0, 1);
        addTestCase("Test 1", 1, 1);
        addTestCase("Test 2", 2, 2);
        addTestCase("Test 11", 11, 144);
    }
    
    @Override
    public boolean addTestCase(String name, Integer input, Integer output) {
        return this.add(new TestCase<Integer, Integer>(name, input, output));
    }

}
