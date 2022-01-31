package stockers.service;

public class DescendingOrder {

	public void merge(double shareprice[], int left, int mid, int right)
    {
        
        int size1 = mid - left + 1;
        int size2 = right - mid;
 
        
        double Left[] = new double [size1];
        double Right[] = new double [size2];
 
        
        for (int i=0; i<size1; ++i)
            Left[i] = shareprice[left + i];
        for (int j=0; j<size2; ++j)
            Right[j] = shareprice[mid + 1+ j];
        
        int i = 0, j = 0;
        
        int k = left;
        while (i < size1 && j < size2)
        {
            if (Left[i] >= Right[j])
            {
            	shareprice[k] = Left[i];
                i++;
            }
            else
            {
            	shareprice[k] = Right[j];
                j++;
            }
            k++;
        }
        
        while (i < size1)
        {
        	shareprice[k] = Left[i];
            i++;
            k++;
        }
 
        
        while (j < size2)
        {
        	shareprice[k] = Right[j];
            j++;
            k++;
        }
    }
	
	public void sort(double shareprice[], int left, int right)
    {
        if (left < right)
        {
            
            int mid = (left+right)/2;
 
            
            sort(shareprice, left, mid);
            sort(shareprice , mid+1, right);

            merge(shareprice, left, mid, right);
        }
    }
	
	public void printArray(double shareprice[])
    {
        for (int i = 0; i < shareprice.length; ++i)
            System.out.print(shareprice[i] + " ");
        System.out.println();
    }


}