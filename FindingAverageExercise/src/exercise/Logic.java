package exercise;

import java.util.IntSummaryStatistics;
import java.util.Scanner;

public class Logic {

	private int valuesLeft = 3;
	private Average pojo = new Average();
	private Scanner scanner = new Scanner(System.in);

	public void run() {
		adding();
		doAverage();
		divideTheSum();
		
	}

	private void adding() {
		wipeAndReset();
		System.out.println("Please, input the values to be added to the list!");
		for (int i = 0; i < 3; i++) {
			System.out.println(valuesLeft + " remaining to be added!");
			pojo.getIntList().add(scanner.nextInt());
			valuesLeft--;
		}
	}

	private void doAverage() {
		IntSummaryStatistics calculations = pojo.getIntList().stream()
				.mapToInt((val) -> val)
				.summaryStatistics();
		System.out.println("The average of this list is " + calculations.getAverage());
		pojo.setAverage(calculations.getAverage());
	}
	
	private void divideTheSum() {
		IntSummaryStatistics calculations = pojo.getIntList().stream()
				.mapToInt((val) -> val)
				.summaryStatistics();
		System.out.println("The result of the sum divided by the average is " + (calculations.getSum() / pojo.getAverage()));
	}

	public void getAverage() {
		System.out.println("The average stored is " + pojo.getAverage() );
	}

	public void getListValues() {
		System.out.println("The values inside the list are " + pojo.getIntList());
	}

	private void wipeAndReset() {
		pojo.getIntList().clear();
		valuesLeft = 3;
	}

}
