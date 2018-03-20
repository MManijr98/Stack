/**
 * 
 */

/**
 * @author Student
 *
 */
import java.util.Queue;
import java.util.LinkedList;

public class myQueueExamples {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Queue <String> family = new LinkedList<String>();

family.add("Mom");
family.add("Dad");
family.add("Brother");
family.add("Sister");
	
 System.out.println(family);
 
 family.remove();
 
 System.out.println(family);
 System.out.println(family.peek());
 
 System.out.println(family);
	}

}
