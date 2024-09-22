package Java8_Examples;

import java.util.Arrays;
import java.util.DoubleSummaryStatistics;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.LongSummaryStatistics;

public class SummaryStatistics_Example_Java8 {

	public static void main(String[] args) {
		List<Integer> numList = Arrays.asList(10, 40, 20, 50, 100);
		IntSummaryStatistics summaryStatistics = numList.stream().mapToInt(Integer::intValue).summaryStatistics();

		System.out.println("Count: " + summaryStatistics.getCount());
		System.out.println("Min: " + summaryStatistics.getMin());
		System.out.println("max: " + summaryStatistics.getMax());
		System.out.println("Sum: " + summaryStatistics.getSum());
		System.out.println("Average: " + summaryStatistics.getAverage());

		System.out.println("-------------");

		List<Double> doubleNumList = Arrays.asList(10.1d, 40.4d, 20.3d, 50.1d, 100.9d);
		DoubleSummaryStatistics doubleSummaryStatistics = doubleNumList.stream().mapToDouble(Double::doubleValue)
				.summaryStatistics();

		System.out.println("Count: " + doubleSummaryStatistics.getCount());
		System.out.println("Min: " + doubleSummaryStatistics.getMin());
		System.out.println("max: " + doubleSummaryStatistics.getMax());
		System.out.println("Sum: " + doubleSummaryStatistics.getSum());
		System.out.println("Average: " + doubleSummaryStatistics.getAverage());
		
		System.out.println("-------------");

		List<Long> longNumList = Arrays.asList(10L, 40L, 20L, 50L, 100L);
		LongSummaryStatistics longSummaryStatistics = longNumList.stream().mapToLong(Long::longValue)
				.summaryStatistics();

		System.out.println("Count: " + longSummaryStatistics.getCount());
		System.out.println("Min: " + longSummaryStatistics.getMin());
		System.out.println("max: " + longSummaryStatistics.getMax());
		System.out.println("Sum: " + longSummaryStatistics.getSum());
		System.out.println("Average: " + longSummaryStatistics.getAverage());

	}

}
