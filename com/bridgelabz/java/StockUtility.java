/* 
* Author:Dhareppa Metri
* File:StockUtility.java
* Date:12/10/2016
* Purpose:program to read in Stock Names, Number of Share, Share Price. Print a Stock Report with total value of each * Stock and the total value of Stock.
**/
import com.bridgelabz.java.StockUtility;
import java.util.Scanner;
class StockUtility{
	    int mNumber;
		double mAllTotal = 0;
		Scanner sc=new Scanner(System.in);
		String mName[] = new String[100];
		int mShare[] = new int[100];
		double mValue[] = new double[100];
		double mTotal[] = new double[100];
		/*
		* This method is used to read and store all the stock information i.e stock name,
		* number of shares and value for each share.
		**/
		public void entry(int mNumber){
			this.mNumber = mNumber;
			for(int i=0;i<mNumber;i++){
				System.out.println("Please Enter Details for Stock: ");
				System.out.println("Name:");
				mName[i] = sc.next();
				System.out.println("No. of shares:");
				mShare[i] = sc.nextInt();
				System.out.println("Value for Each share:");
				mValue[i] = sc.nextDouble();		
			}
			
		}
		/*
		* This method is used to calculate total sum value of each stock.
		**/
		public void calculate(){
			for(int i=0;i<mNumber;i++){
				mVotal[i] = mShare[i]*mValue[i];
				System.out.println("Total value for Stock "+(i+1)+" is: "+mTotal[i]+" Rs.");
			}
		}
		/*
		* This method is used to calculate the total sum of all the stocks.
		**/
		public void totalval(){
			for(int i=0;i<mNumber;i++){
				mAllTotal = mAllTotal+mTotal[i];
			}
			System.out.println("\nTotal value of all "+mNumber+" Stock is: "+mAllTotal+" Rs.");
		}
	}
