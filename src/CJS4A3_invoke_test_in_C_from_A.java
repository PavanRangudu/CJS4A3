
public class CJS4A3_invoke_test_in_C_from_A {
	public static void main(String []s){
		A a = new A();
		a.invoke_test_C_from_A();
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
	void invoke_test_C_from_B() {
		super.test();
	}
}

class A extends B{
	// C c = new C(); We should not create an instance as per que:
	void test(){
		System.out.println("Test method in A");
	}
	void invoke_test_C_from_A(){
	//	c.test(); With the help of instance, we can invoke the method in C
		super.invoke_test_C_from_B();
	}
}


/* 
 	From among the options given in assignment,
 	
 	Ans : Option (f) It is not possible to invoke test() method defined in C from a method in A.
 	
 	One possible way is to have a method in B (say, invoke_test_C_from_B) which calls test() method in C using super and access this method in B using super from A
 	
 	Also, with the help of instance, we can access as:
 	C c = new C();
 	c.test();
 */
