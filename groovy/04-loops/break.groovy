class Example {
   static void main(String[] args) {
      int[] array = [0,1,2,3];
		
      for(int i in array) {
         println(i);
         if(i == 2)
         break;
      }
   } 
}