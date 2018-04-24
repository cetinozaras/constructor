package lab2;
import java.lang.*;
import java.util.Scanner;

public class movietheater {
	
	private int chaircapacity;
	private int ticketprice;
	private static int soldticketcount=0;
		 
		 public int getprice() {
			 return ticketprice;
		 }
		 
		public int getcapacity() {
			 return chaircapacity;
			 
		 }
		
		public void setprice(int t) {
			 ticketprice=t;
			 
		 }
		 
		 public void setcapacity(int c) {
			 chaircapacity=c; 
		 }
		 
		 protected void finalize() throws Throwable {
				soldticketcount--;
				System.out.println("Finalize called + soldticketcount="+soldticketcount);
			
			}
		 
		public void print(){
			System.out.println(chaircapacity + " " + soldticketcount  );
			
			
		}
		
		public movietheater(){
			chaircapacity=0;
			ticketprice=0;
			soldticketcount++;
		}
		
		public movietheater(int t,int c){
			ticketprice=t;
			chaircapacity=c;
			soldticketcount++;		
		}
		 
	 }
