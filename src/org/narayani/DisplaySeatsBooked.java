package org.narayani;

public class DisplaySeatsBooked {
	
	public void displayArrays(int A[][],int B[][],int C[][], int D[][]){
		int rowmax = Math.max(Math.max(A.length, B.length),Math.max(C.length,D.length));
		int colmax = Math.max(Math.max(A[0].length, B[0].length),Math.max(C[0].length,D[0].length));
		
//		for(int i=0;i<rowmax;i++){
//			for(int j=0;j<A[0].length && i<A.length;j++){
//				if(A[i][j]!=0)System.out.print(A[i][j]+" ");
//				else System.out.print(" "+" ");
//			}
//			System.out.print("-- ");
//			for(int j=0;j<B[0].length && i<B.length;j++){
//				if(B[i][j]!=0)System.out.print(B[i][j]+" ");
//				else System.out.print(" "+" ");
//			}
//			System.out.print("-- ");
//			for(int j=0;j<C[0].length && i<C.length;j++){
//				if(C[i][j]!=0)System.out.print(C[i][j]+" ");
//				else System.out.print(" "+" ");
//			}
//			System.out.print("-- ");
//			for(int j=0;j<D[0].length && i<D.length;j++){
//				if(D[i][j]!=0)System.out.print(D[i][j]+" ");
//				else System.out.print(" "+" ");
//			}
//			System.out.print("\n");
//		}
		
		System.out.println("A matrix");
		for(int i = 0; i<A.length ; i++){
			for (int j=0;j<A[0].length && i<A.length;j++){
				System.out.print(A[i][j]+ " ");
			}
			System.out.println("");
		}
		System.out.println("B matrix");
		for(int i = 0; i<B.length ; i++){
			for (int j=0;j<B[0].length && i<B.length;j++){
				System.out.print(B[i][j]+ " ");
			}
			System.out.println("");
		}
		System.out.println("C matrix");
		for(int i = 0; i<C.length ; i++){
			for (int j=0;j<C[0].length && i<C.length;j++){
				System.out.print(C[i][j]+ " ");
			}
			System.out.println("");
		}
		System.out.println("D matrix");
		for(int i = 0; i<D.length ; i++){
			for (int j=0;j<D[0].length && i<D.length;j++){
				System.out.print(D[i][j]+ " ");
			}
			System.out.println("");
		}
	}

}
