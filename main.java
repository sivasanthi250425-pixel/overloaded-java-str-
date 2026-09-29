
import java.util.Scanner;
public class main {
	public static void main(String [] arg) {
		Scanner sc=new Scanner(System.in);
		String name=sc.next();
		String name1=sc.next();
		String name2=sc.next();

		Favourite(name);
		Favourite(name,name1);
		Favourite(name,name1,name2);

}
	static void Favourite(String name) {
		 System.out.printf("Favourite movie is  %s \n",name);
	}
	static void Favourite(String name,String name1) {
		 System.out.printf("Favourite movie are  %s %s \n",name,name1);
	}
	static void Favourite(String name,String name1,String name2) {
		 System.out.printf("Favourite movie are  %s %s %s\n",name,name1,name2);
	}
	
}
