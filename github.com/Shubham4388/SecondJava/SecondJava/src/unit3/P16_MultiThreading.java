// identify dependent and non-dependent task in respective process//
//insert selective task into threads //


package unit3;
import java.util.Scanner;

public class P16_MultiThreading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//C1 obj1 = new C1();
		//obj1.show1();
		//System.out.println("\n");
		//C2 obj2 = new C2();

		Thread t1 = new Thread(new T1(),"T1");
		Thread t2 = new Thread(new T2(),"T2");
		Thread t3 = new Thread(new T3(),"T3");
		
		t1.start();
		t2.start();
		t3.start();
		
		//System.out.println("");

	}

}
class C1 {
	void show1()
	{
		Scanner obj = new Scanner(System.in);
		int a = obj.nextInt();
		System.out.println(a);
		System.out.println("Done with show1 () !");
		
	}
}

class C2 {
	void show2()
	{
		for(int i=0;i<10;i++)
		{
			System.out.println(i  + "-Hey_2");
		}
	}
}

class T1 extends Thread {
	public void run() {
		Scanner obj = new Scanner(System.in);
		int a = obj.nextInt();
		System.out.println(a);
		System.out.println("Done with show1() !");
	}
}
class T2 extends Thread {
	public void run() {
		for(int i=0;i<10;i++)
		{
			System.out.println(i + "-Hey_2");
			
			
	}
}
}
	class T3 extends Thread {
		public void run() {
			for(int i=0;i<10;i++)
			{
				System.out.println(i + "-Hey_3");
			}
		}
}
