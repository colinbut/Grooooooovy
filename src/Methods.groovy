/**
 * 
 */

/**
 * @author Colin
 *
 */
class Methods {

	static main(args){
		
		Methods methodsClass = new Methods();
		methodsClass.method1();
		methodsClass.method2('Colin', 3, new File("Text.txt"));
		println ''; // prints a blank line
		println methodsClass.sum(1,2);
		println methodsClass.multiply(3,5);
	}
	
	def method1(){
		println 'This is a method call';
	}
	
	/**
	 * 
	 * 
	 * @param a
	 * @param b
	 * @param c
	 * @return
	 */
	def method2(a,b,c){
		printf 'This is a method with (dynamic) parameters %s', a;
	}
	
	/**
	 * 
	 * @param a
	 * @param b
	 * @return
	 */
	def sum(a,b){
		a+b;
	}
	
	/**
	 * 
	 * @param a
	 * @param b
	 * @return
	 */
	int multiply(a,b){
		a*b;
	}
}
