// Fig. 16.14: PriorityQueueTest.java
// PriorityQueue test program.
import java.util.PriorityQueue;

public class PriorityQueueTest {
   public static void main(String[] args) {
      
	   
	   
	   // queue of capacity 5                             
      PriorityQueue<SpaceTime> queue = new PriorityQueue<SpaceTime>(5, new SpaceTimeComparator());

      
	   // insert elements to queue
      queue.add(new SpaceTime(10.5,11.11,12.12,5,30,56));
      queue.add(new SpaceTime(1.5,78.5,15.2,6,14,12));
      queue.add(new SpaceTime(1.5,8.5,5.2,1,4,2));
     
      System.out.print("Polling from queue: ");

      while(!queue.isEmpty()) {
    	  System.out.println(queue.toString());
    	  queue.poll();
      }
   } 
}


/**************************************************************************
 * (C) Copyright 1992-2018 by Deitel & Associates, Inc. and               *
 * Pearson Education, Inc. All Rights Reserved.                           *
 *                                                                        *
 * DISCLAIMER: The authors and publisher of this book have used their     *
 * best efforts in preparing the book. These efforts include the          *
 * development, research, and testing of the theories and programs        *
 * to determine their effectiveness. The authors and publisher make       *
 * no warranty of any kind, expressed or implied, with regard to these    *
 * programs or to the documentation contained in these books. The authors *
 * and publisher shall not be liable in any event for incidental or       *
 * consequential damages in connection with, or arising out of, the       *
 * furnishing, performance, or use of these programs.                     *
 *************************************************************************/
