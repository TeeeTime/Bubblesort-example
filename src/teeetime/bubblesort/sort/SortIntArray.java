package teeetime.bubblesort.sort;

public class SortIntArray {
	
	public int[] sorter(int[] array) {
		boolean ready = false;
		
		//checking if the array is empty or if it only has one component
		if(array.length == 0) {
			return(array);
		}else if(array.length == 1) {
			return(array);	
		}
				
		int arg1;
		int arg2;
		int iteration = 0;
		
		//Checking if something was resorted. If not, it continues
		while(!ready) {
			ready = true;

			//going through the whole array
            for (int i=iteration; i<array.length-1; i++) {
				arg1 = array[i];
				arg2 = array[i+1];
				
				//comparing the two numbers
				if(arg1 > arg2) {
					array[i] = arg2;
					array[i+1] = arg1;
					//initialises that something was changed so it will do another round
					ready = false;
				}	
			iteration++;	
			}		
		}

		//returning the sorted array
		return array;
	}
}
