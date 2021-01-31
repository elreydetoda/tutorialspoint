/*
def methodName() { 
   //Method code 
}
*/
class Example {
   static def DisplayName() {
      println("This is how methods work in groovy");
      println("This is an example of a simple method");
   } 
    
   static void main(String[] args) {
      DisplayName();
      sum(10,5);
      pre_set_sum(6);
      println(return_sum(6));
      Example ex = new Example(); 
      ex.setX(100); 
      println(ex.getX()); 
      println(getY());
      println(ex.getW())
   } 
    // def methodName(parameter1, parameter2, parameter3) { 
    // Method code goes here 
    // }
    static void sum(int a,int b) {
      int c = a+b;
      println(c);
    }
    // def someMethod(parameter1, parameter2 = 0, parameter3 = 0) { 
    //    // Method code goes here 
    // } 
    static void pre_set_sum(int a,int b = 5) { 
      int c = a+b; 
      println(c); 
   } 
   static int return_sum(int a,int b = 5) {
      int c = a+b;
      return c;
   } 
   int x; 
    
   public int getX() { 
      return x; 
   } 
    
   public void setX(int pX) { 
      x = pX; 
   } 

   static int y = 100; 

   public static int getY() { 
      int ly = 200; 
      println(ly); 
      return y; 
   } 
   int w = 100; 
    
   public int getW() { 
      this.w = 200; 
      return w; 
   }
}