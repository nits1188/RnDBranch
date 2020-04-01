package src.java.test2;

import java.util.Arrays;

/* 1. Sort an Array
   2. Remove Duplicates from array
   3. frequency of elements in an array
   4. Duplicate Element  */

public class array {
	static int counter = 0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String arr[] = { "Nitin", "Edahcu", "Anay", "Ayan", "Sony", "Nitin" , "Vrushali", "Vrushali","Nitin"};
		
		duplicateElement(arr);
		// copy array to different array
		String copyArr[] = new String[arr.length];		
		for (int i = 0; i < arr.length; i++) {
			copyArr[i] = arr[i];
		}
		Arrays.sort(arr);
		
		int len = arr.length;
		len = removeDuplicate(arr, len);
		// frequency
		for (int i = 0; i < len; i++) {
			int counter = 0;
			for (int j = 0; j < copyArr.length; j++) {
				if (arr[i] == copyArr[j]) {
					counter++;
				} else
					continue;
			}
			System.out.println(arr[i] + " " + counter);
		}
	}

	private static void duplicateElement(String[] arr) {
		// TODO Auto-generated method stub
		
		for(int i =0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]==arr[j]) {
					System.out.println("Duplicate Element is: " +arr[i]);
					break;
				}
			}
		}
		
	}

	private static int removeDuplicate(String[] arr, int length) {
		// TODO Auto-generated method stub

		String temp[] = new String[length];
		int j = 0;
		
		for (int i = 0; i < length - 1; i++) {
			if (arr[i] != arr[i + 1]) {
				temp[j++] = arr[i];
			}
		}
		temp[j++] = arr[length - 1];
		for (int i = 0; i < j; i++) {
			arr[i] = temp[i];
		}
		return j;
	}
}
