package static_keyword.static_variable.CanVChngeStaticVarVal;

public class CanChangeStaticVarVal {

	public static int carCode = 10;
	
	public static void main(String[] args) {
		System.out.println(changeNumber());
	}
	
	static int changeNumber() {
	
		return carCode = 20;
	}
	
}
//Output : 20
// Can we change static variable value? 
// Answer is yes we can but by static method / static block only.


