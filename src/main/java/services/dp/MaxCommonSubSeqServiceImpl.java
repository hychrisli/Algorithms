package services.dp;

import base.Solution;
import base.SolutionService;
import base.TestCases;
import solutions.dp.MaxCommonSubSeq;
import structures.TwoComposite;
import testcases.dp.MaxCommonSubSeqTestCases;

public class MaxCommonSubSeqServiceImpl extends SolutionService {

    @Override
    public void run() {
        TestCases<TwoComposite<String, String>, String> testCases = new MaxCommonSubSeqTestCases();

        Solution<TwoComposite<String, String>, String> solution = new MaxCommonSubSeq();
        solution.runTests(testCases);

    }

}