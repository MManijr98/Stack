/**
 * 
 */

/**
 * @author Student
 *
 */
import java.util.Stack;
public class myStackExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Stack <String> names = new Stack<String>();

names.push("Mike");
names.push("Marty");
names.push("Joe");
names.push("Larry");

System.out.println(names);

names.pop();
System.out.println(names);


System.out.println(names.search("Mike"));
	}

}
