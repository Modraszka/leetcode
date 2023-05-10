package leetcode.easy;

import static org.junit.jupiter.api.DynamicTest.dynamicTest;

import java.util.Arrays;
import java.util.Collection;

import org.junit.jupiter.api.DynamicTest;
import org.junit.jupiter.api.TestFactory;

class RunningSum1dArrayTest {
	@TestFactory
	Collection<DynamicTest> dynamicTestsFromCollection() {
		int[] test = { 1, 2 };
		int[] sample = { 1, 2,3,4 };
		return Arrays.asList(dynamicTest("test",
				() -> System.out.println(Arrays.toString(RunningSum1dArray.runningSum(test)))),
				dynamicTest("default",
						() -> System.out.println(Arrays.toString(RunningSum1dArray.runningSum(sample)))));
	}

}
