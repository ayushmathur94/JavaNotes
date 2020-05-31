package static_keyword.static_variable.onlyclasslevel;

public class ClassLevelStaticVar {

	
	public static void main(String[] args) {
		
		System.out.println(func());
	}
	
	static int func() {
//		static int x = 10;   // error: Illegal modifier for parameter x; only final is permitted
		int x  = 10;
		return --x;
	}
}
