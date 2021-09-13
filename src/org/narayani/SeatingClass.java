package org.narayani;

import java.util.*;

public class SeatingClass {

	public static void main(String []args){
		
		Scanner sc = new Scanner(System.in);
		int seat[][] = new int[4][2];
		int multiplier;
		int totalSeats = 0;
		int passengerCount=0;
		
		//writing the below code considering there are 4 portions/deck whose rows and columns are dynamically entered by user
		
		System.out.println("Enter the seats row index and column index in 2D array \n");
		for(int i=0;i<4;i++){
			multiplier = 1;
			for(int j=0;j<2;j++)
			{
				int temp = sc.nextInt();
				if(temp <0 || temp == 0 ){
					System.out.println("Seat row index or column index should not be zero or negative. Please re-enter the value");
					temp = sc.nextInt();
				}
				if(temp >0 ){
					seat[i][j] = temp;
					multiplier = multiplier * seat[i][j];
				}
				
				
			}
			totalSeats = totalSeats + multiplier;
		}
		System.out.println("The rows and columns of seats you've entered in 2D array is\n");
		System.out.println(Arrays.deepToString(seat));
		
		System.out.println("\n Enter the count of passengers: ");
		int temp2 = sc.nextInt();
		if(totalSeats<temp2){
			System.out.println("Passenger count exceeds total number of seats which is "+totalSeats+ " Please re-enter passenger count.");
			temp2 = sc.nextInt();
		}
		if(totalSeats>=temp2){
			passengerCount = temp2;
		}
		//Setting the rows and columns to each portion/deck
		int  A[][] = new int[seat[0][1]][seat[0][0]];
		int  B[][] = new int[seat[1][1]][seat[1][0]];
		int  C[][] = new int[seat[2][1]][seat[2][0]];
		int  D[][] = new int[seat[3][1]][seat[3][0]];
		
		
		FillingAisleSeats FAS = new FillingAisleSeats();
		
		// Aisle seats filling
		FAS.logicForAisleSeats(A,B,C,D,passengerCount);	
		sc.close();	
		
		
	}
}