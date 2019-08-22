import java.util.ArrayList;
import java.util.List;

interface A{
	public void show();
}
public class Lambda {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A obj;
        obj=()-> System.out.println("Hi");
        obj.show();
        List<Integer> l=new ArrayList<Integer>();
        l.add(1);
        l.add(2);
        l.add(3);
        l.forEach(System.out::println);
	}

}
