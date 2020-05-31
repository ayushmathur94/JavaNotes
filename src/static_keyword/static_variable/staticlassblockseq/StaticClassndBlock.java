package static_keyword.static_variable.staticlassblockseq;

public class StaticClassndBlock {
static int a = k1();

static {
	System.out.println("This is static block here executing....");
}

static int k1() {
	System.out.println("inside k1 method");
	System.out.println("k1 method ends");
    return 20;
    
}

public static void main(String[] args) {
	System.out.println("inside main method");
	System.out.println("value of a is -: " + a);
	System.out.println("main method ends!!!");
}

}

/** OUTPUT -:  
inside k1 method
k1 method ends
This is static block here executing....
inside main method
value of a is -: 20
main method ends!!!
**/


