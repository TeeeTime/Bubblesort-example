package teeetime.bubblesort.sort;

public class SortIntArray {
	
	public int[] sorter(int[] array) {
		boolean ready = false;
		
		if(array.length == 0) {
			return(array);
			
		}else if(array.length == 1) {
			return(array);	
		}
			
			
		int arg1;
		int arg2;
		int iteration = 0;
		
		while(!ready) {
			ready = true;

            for (int i=iteration; i<array.length-1; i++) {
				arg1 = array[i];
				arg2 = array[i+1];
				
				if(arg1 > arg2) {
					array[i] = arg2;
					array[i+1] = arg1;
					ready = false;
				}
				
			iteration++;	
			}
				
		}
		
		return array;
	}

}
