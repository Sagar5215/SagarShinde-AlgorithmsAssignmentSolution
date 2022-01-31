package stockers.service;

public class Search {
	
	public static void stockSearch(double shareprice[], double key){ 
		
		int flag = 0;
		for(int i=0; i< shareprice.length; i++) {
			if (shareprice[i] == key) {
				flag =1 ;
			}
		}
		if(flag == 1) {
			System.out.println("Stock of value "+key+" is present");
		}
		else {
			System.out.println("Value not found");
		}
		
	}
}