package ch04;
import java.util.ArrayList;

class NameTag{
	String name;
	
	static class Nation {
		String nationName;
		public Nation(String nationName) {
			this.nationName = nationName;
		}
		
	}
}

public class Ch04Ex08 {

	public static void main(String[] args) {
	//	ArrayList<String>  strArrayList = new ArrayList<>();
		
		Class<?> cl = String[].class;	
		System.out.println(cl.getCanonicalName());
		System.out.println(cl.getSimpleName());
		System.out.println(cl.getTypeName());
		System.out.println(cl.getName());
		System.out.println(cl.toString());
		System.out.println(cl.toGenericString());
		System.out.println(cl.getSuperclass());
		System.out.println(cl.getInterfaces());
		System.out.println(cl.getPackage());
		System.out.println();
		
		Class<?> cl2 = ArrayList.class;
		System.out.println(cl2.getCanonicalName());
		System.out.println(cl2.getSimpleName());
		System.out.println(cl2.getTypeName());
		System.out.println(cl2.getName());
		System.out.println(cl2.toString());
		System.out.println(cl2.toGenericString());
		System.out.println(cl2.getSuperclass());
		System.out.println(cl2.getInterfaces());
		System.out.println(cl2.getPackage());
		System.out.println();
		
		Class<?> cl3 = NameTag.Nation.class;
		System.out.println(cl3.getCanonicalName());
		System.out.println(cl3.getSimpleName());
		System.out.println(cl3.getTypeName());
		System.out.println(cl3.getName());
		System.out.println(cl3.toString());
		System.out.println(cl3.toGenericString());
		System.out.println(cl3.getSuperclass());
		System.out.println(cl3.getInterfaces());
		System.out.println(cl3.getPackage());
		System.out.println();
		
		Class<?> cl4 = double.class;
		System.out.println(cl4.getCanonicalName());
		System.out.println(cl4.getSimpleName());
		System.out.println(cl4.getTypeName());
		System.out.println(cl4.getName());
		System.out.println(cl4.toString());
		System.out.println(cl4.toGenericString());
		System.out.println(cl4.getSuperclass());
		System.out.println(cl4.getInterfaces());
		System.out.println(cl4.getPackage());
		System.out.println();
	}

}
