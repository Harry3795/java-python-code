package test;

public class Array_count_duplicate {
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 0,j;
		int count = 0;
		int[] arr = {25, 35 ,25, 65 ,65, 34, 87, 67 ,34, 25, 99, 88 ,65};
		
		while(i <=arr.length) 
		{
			j = i+1 ;
			while(j < arr.length)
			{		
				if(arr[i] == arr[j]) {
					count++;
					break;
				}
				j++;
			}
			i++;
		}
		System.out.println("The Number of Duplicate count   = " + count );
	}
}
