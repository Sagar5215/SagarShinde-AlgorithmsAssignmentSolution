package stockers.service;

import java.util.Scanner;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Enter the no of companies");
		try (Scanner sc = new Scanner(System.in)) {
			int size = sc.nextInt();
			
			double shareprice[] = new double[size];
			boolean value[] = new boolean[size];
			for (int i=0; i<size; i++) {
				System.out.println("Enter current stock price of the company "+ i);
				shareprice[i] = sc.nextDouble();
				System.out.println("Whether company's stock price rose today compare to yesterday?");
				value[i] = sc.nextBoolean();
			}
			
			AscendingOrder asc = new AscendingOrder();
			DescendingOrder dsc = new DescendingOrder();
			CounterFreq counter = new CounterFreq();

			
			boolean loop = true;
			
			while(loop) {
			
			System.out.println("Enter the operation that you want to perform");
			System.out.println("1. Display the companies stock prices in ascending order");
			System.out.println("2. Display the companies stock prices in descending order");
			System.out.println("3. Display the total no of companies for which stock prices rose today");
			System.out.println("4. Display the total no of companies for which stock prices declined today");
			System.out.println("5. Search a specific stock price");
			System.out.println("6. press 0 to exit");
			
			int choice = sc.nextInt();
			
			switch (choice) {
			case 1:
			    asc.sort(shareprice, 0, shareprice.length-1);
			    System.out.println("Stock prices in ascending order are :");
			    asc.printArray(shareprice);
			    break;
			    
			    
			case 2:
			    dsc.sort(shareprice, 0, shareprice.length-1);
			    System.out.println("Stock prices in descending order are :");
			    dsc.printArray(shareprice);
			    break;
			 
			case 3:
			    counter.countFreqRise(value);
			    break;
			    
			case 4:
				counter.countFreqFall(value);
			    break;
			 
			case 5:
				System.out.println("enter the key value");
				double key = sc.nextDouble();
				Search.stockSearch(shareprice, key);
			    break;
			    
			case 0:
				loop = false;
				System.out.println("Exited successfully");
			    break;
     
			default:
			    System.out.println("Invalid choice");
			}
			}
		}

	}

}