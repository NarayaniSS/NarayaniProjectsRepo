package org.narayani;


public class FillingAisleSeats {
	
	int booking = 1;
	

	public void logicForAisleSeats(int A[][],int B[][],int C[][], int D[][], int passengerCount){
		int max = Math.max(Math.max(A.length, B.length),Math.max(C.length,D.length));
		
System.out.println("Aisle Seats booking started from passenger number "+booking );
		
		for(int i=0;i<max && booking<passengerCount;i++){
			if(i<A.length){ 
				A[i][A[0].length-1]= booking++;
				}
			if(i<B.length){
				B[i][0] = booking++;
			    B[i][B[0].length-1]=booking++;
			   
			}
			if(i<C.length){
			C[i][0]=booking++;
			C[i][C[0].length-1]=booking++;
			}
			if(i<D.length){ 
				D[i][0]=booking++;
			}
		}
		
		System.out.println("Aisle Seats booking ended with passenger number "+ (booking-1) );

		if (booking < passengerCount)
		{
			FillingWindowSeats FWS = new FillingWindowSeats();
			FWS.logicForWindowSeats(A, B, C, D,passengerCount,booking);
		}
		else {
			System.out.println("All passengers are booked as per given rules");
            DisplaySeatsBooked disp = new DisplaySeatsBooked();
            disp.displayArrays(A, B, C, D);
			
		}
		
	}
}
