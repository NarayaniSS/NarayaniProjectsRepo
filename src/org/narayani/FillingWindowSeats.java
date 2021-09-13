package org.narayani;

public class FillingWindowSeats {

public void logicForWindowSeats(int A[][],int B[][],int C[][], int D[][], int passengerCount,int booking){
	int max2 = Math.max(A.length, D.length);
	System.out.println("Window Seats booking started from passenger number "+booking );
	for(int i=0;i<max2&& booking<passengerCount;i++){
		if(i<A.length){
			A[i][0]=booking++;
			
		}
		if(i<D.length){
			D[i][D[0].length-1] = booking++;
		}
	}
	
	System.out.println("Window Seats booking ended with passenger number "+(booking-1) );
	if (booking < passengerCount)
	{
		FillingCenterSeats FCS = new FillingCenterSeats();
		FCS.logicForCenterSeats(A, B, C, D, passengerCount,booking);
	}
	else {
		System.out.println("All passengers are booked as per given rules");
		 DisplaySeatsBooked disp = new DisplaySeatsBooked();
         disp.displayArrays(A, B, C, D);
	}
	}
}
