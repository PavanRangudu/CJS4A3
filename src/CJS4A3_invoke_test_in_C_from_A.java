
public class CJS4A3_invoke_test_in_C_from_A {
	public static void main(String []s){
		A a = new A();
		a.test();
		// a.invoke_test_C_from_A();
	}

}

class C{
	void test(){
		System.out.println("Test method in C");
	}
}

class B extends C{
	void test(){
		System.out.println("Test method in B");
	}
}

class A extends B{

	void test(){
		super.test(); // Till B we can reach with the help of super 
		System.out.println("Test method in A");
	}

}


/* 
 	From among the options given in assignment,
 	
 	Ans : Option (f) It is not possible to invoke test() method defined in C from a method in A.
 	
 	
 	
 	One possible way is to call super.test() inside test() method in B. Now, test() in B can be called using super from Class A.
 	
 	Also, with the help of instance, we can access as:
 	C c = new C();
 	c.test();
 */
