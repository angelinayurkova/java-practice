package day_38;
import java.util.*;
public class AddAll {
public static void main(String[] args) {
	

List<String> l1 = new ArrayList<>();
l1.add("java");
l1.add("phyton");

List<String> l2 = new ArrayList<>();
l2.add("C#");
l2.add("c++");
System.out.println(l1);
System.out.println(l2);

l2.addAll(l1);
System.out.println(l2);

l2.addAll(l1);
System.out.println(l2);

l2.addAll(l1);
System.out.println(l2);


}
}