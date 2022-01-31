package stockers.service;

public class CounterFreq {
	
	public void countFreqRise(boolean value[])
    {
		int size = value.length;
		int counter = 0;

        for (int i = 0; i < size; i++)
        {
            if (value[i] == true)
            {
            	counter+=1;
            }
            
        }
                
        System.out.println("Total no of companies whose stock price rose today : "+counter);
        }
	
	public void countFreqFall(boolean value[])
    {
		int size = value.length;
		int counter = 0;

        for (int i = 0; i < size; i++)
        {
            if (value[i] == false)
            {
            	counter+=1;
            }
            
        }
                
        System.out.println("Total no of companies whose stock price declined today : "+counter);
        }
	
}