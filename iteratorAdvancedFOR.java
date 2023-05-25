import java.util.ArrayList;
import java.util.Iterator;
class ietratorAdvancedFOR {
public static void main(String[] args) { 
ArrayList<Integer> a1 = new ArrayList<Integer>();
a1.add(20);
a1.add(30);
a1.add(40);
System.out.println("Using For Loop:");
for(int i=0;i< a1.size();i++){
System.out.print(a1.get(i)+" ");
}
System.out.println("\nUsing Iterator:");
Iterator it = a1.iterator();
while (it.hasNext())
System.out.print(it.next() + " ");
System.out.println("\nUsing Advanced For Loop:");
for (Integer i : a1){
System.out.print(i+" ");
}
}
}
