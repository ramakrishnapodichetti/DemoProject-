package Demo;

//import io.restassured.RestAssured;
//import static io.restassured.RestAssured.*;

/*
 * public class basics {
 * 
 * public static void main(String[] args) { // TODO Auto-generated method stub
 * 
 * int a = 1; int b = 100; int count = 0; int j=0; boolean flag = true; for(int
 * i=a;i<=b;i++) { for(j=2;j<i;j++) { //System.out.println("i"+i); //
 * System.out.println("j"+j); if(i%j==0) { flag=false; break; } flag=true; }
 * 
 * 
 * if(flag==true) { System.out.println(i); count++; }
 * 
 * } System.out.println("\nCount - "+count);
 * 
 * 
 * int a=7; int fact=1; for(int i=1;i<=a;i++) { fact=fact*i; }
 * System.out.println(fact);
 * 
 * 
 * //Add place API
 * 
 * //given -- all inputs //when -- Submit the API //then -- Validate the
 * response RestAssured.baseURI = "https://rehulshettyacademy.com";
 * given().queryParam("Key","qaclick123").header("Content-Type",
 * "application/json") .body("");
 * 
 * 
 * 
 * 
 * 
 * }
 * 
 * 
 * }
 */
class Parent { 
    // Static method in base class 
    // which will be hidden in subclass 
	protected void m1() 
    { 
        System.out.println("From parent "
                           + "static m1()"); 
        System.out.println("Git Commit From parent "
                + "static m1()");
    } 
  
    // Non-static method which will 
    // be overridden in derived class 
    void m2() 
    { 
        System.out.println("From parent "
                           + "non-static(instance) m2()"); 
    } 
    final void show() {} 
} 
  
class Child extends Parent { 
	// void show() {} 
    // This method hides m1() in Parent 
	public  void m1() 
    { 
		super.m1();
        System.out.println("From child static m1()"); 
    } 
  
    // This method overrides m2() in Parent 
    @Override
    public void m2() 
    { 
        System.out.println("From child "
                           + "non-static(instance) m2()"); 
    } 
} 
  
// Driver class 
class basics { 
    public static void main(String[] args) 
    { 
        Parent obj1 = new Child(); 
  
        // As per overriding rules this 
        // should call to class Child static 
        // overridden method. Since static 
        // method can not be overridden, it 
        // calls Parent's m1() 
        obj1.m1(); 
  
        // Here overriding works 
        // and Child's m2() is called 
        obj1.m2(); 
    } 

    public static void main(String args) 
    { 
        byte a = 25; 
        Demo obj = new Demo(); 
        obj.show(a); // it will go to 
        // byte argument 
        obj.show("hello"); // String 
        obj.show(250); // Int 
        obj.show('A'); // Since char is 
        // not available, so the datatype 
        // higher than char in terms of 
        // range is int. 
        obj.show("A"); // String 
       // obj.show(7.5); // since float datatype 
// is not available and so it's higher 
// datatype, so at this step their 
// will be an error. 
} 

    
}
    class Demo { 
        public void show(int x) 
        { 
            System.out.println("In int" + x); 
        } 
        public void show(String s) 
        { 
            System.out.println("In String" + s); 
        } 
        public void show(byte b) 
        { 
            System.out.println("In byte" + b); 
        } 
    } 
   
