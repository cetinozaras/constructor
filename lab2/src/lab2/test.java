package lab2;
public class test {
	public static void main(String args[]){
		movietheater m=new movietheater();
		
		m.setcapacity(100);
		m.setprice(25);
		m.print();
		int c=10;
		
		while(c > 0){
			movietheater m2=new movietheater();
			c--;
			m.print();
		}	
	System.gc();
	System.runFinalization();
	m.print();
	}
}
