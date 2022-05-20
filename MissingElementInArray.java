package week1.day2;

import java.util.Arrays;

public class MissingElementInArray {
	

	public static void main(String[] args) {
		int[] arr= {1,2,3,6,7,8,9};
		Arrays.sort(arr);
		
		for(int i=arr[0];i<=arr.length;i++) {
			
			if(i!=arr[i-1]) {
				System.out.println("Missing array elemt :"+i);
				break;
			}/*else {
				System.out.println("No missing element..");
			}*/
		}
	}
	
}


