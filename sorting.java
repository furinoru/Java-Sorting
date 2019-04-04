import java.io.*;
import java.util.*;

public class sorting{
	public static void main(String args[]){
		Scanner kuha = new Scanner(System.in);
		int arr[] = new int[5];
		int first = 0, second = 0, third = 0, firstTemp = 0, secondTemp = 0;
		System.out.println("Enter number: ");
		arr[i] = kuha.nextInt();
		for (i  = 0; i <= 5; i++){
			
			if (arr[i] == first) {
				continue;
			}
			if (arr[i] > first) {
				firstTemp = first;
				secondTemp = second;
				first = arr[i];
				second = firstTemp;
				if (secondTemp > third) {
					third = secondTemp;
				}
			}
			else{
				if ((arr[i] == second) || (arr[i]) == first) {
					continue;
				}
				if ((arr[i] > second) && (arr[i]) < first) {
					secondTemp = second;
					second = arr[i];
					if (secondTemp > third) {
						third = secondTemp;
					}
				}
				else{
					if (arr[i] > third) {
						third = arr[i];
					}
				}
			}
		}
		System.out.println("Third Largest Number: " + third);
		System.out.println("Second Largest Number: " + second);
		System.out.println("Largest Number: " + first);
	}
}