package org.narayani;

public class FillingCenterSeats {

public void logicForCenterSeats(int A[][],int B[][],int C[][], int D[][], int passengerCount,int booking){
	int max = Math.max(Math.max(A.length, B.length),Math.max(C.length,D.length));

	System.out.println("Center Seats booking started from passenger number "+booking );
	
	for(int i=0;i<max; i++){
		for(int j=0;j<A[0].length && i<A.length && booking<=passengerCount;j++)
		{
			
		
		if(A[i][j]==0) A[i][j]=booking++;
			
		
		}
		for(int j=0;j<B[0].length && i<B.length &&  booking<=passengerCount;j++)
		{
		
			if(B[i][j]==0) B[i][j]=booking++;
		}
		for(int j=0;j<C[0].length && i<C.length && booking<=passengerCount;j++)
		{
		
			if(C[i][j]==0) C[i][j]=booking++;
		}
		for(int j=0;j<D[0].length && i<D.length  && booking<=passengerCount ;j++)
		{
		
			if(D[i][j]==0) D[i][j]=booking++;
		}
		
	}
	System.out.println("Center Seats booking ended with passenger number "+ (booking-1) );
     System.out.println("All passengers are booked as per given rules");
	 DisplaySeatsBooked disp = new DisplaySeatsBooked();
     disp.displayArrays(A, B, C, D);	
}
}
