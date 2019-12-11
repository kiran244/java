
public class Test {
	
int c,d,e,f,g,h;
	
	Test(){
		System.out.println("yash");
		}
	Test(int a, int b){
		c = a;
		d = b;
	}
	
	Test(int a, int b, int e){
		f = a;
		g = b;
		h = e;
	}
	void display(){System.out.println(c + "," + d);}
	
	void display1(){System.out.println(f + "," + g + "," +h );}

	public static void main(String[] args) {
		
		System.out.println("yash");
		
		Test name = new Test();
		
		Test obj1 = new Test(5, 3);
		
		Test obj2 = new Test(5, 3, 8);
		
		 obj1.display();
		 
		 obj2.display1();	
		 
		 obj1.display1();
		 
		 obj2.display();
		

	}

}
