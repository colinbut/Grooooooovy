/**
 * 
 */

/**
 * @author Colin
 *
 */
class HelloWorld {

	/**
	 * Main 
	 * 
	 * @param args
	 */
	static main(args) {
		
		// Hello World
		println('Hello World');
		
		// list contents can be 'dynamically typed'
		def list = [1, 2, "Colin", "But", 100];
		
		// prints each list item
		list.each  { println it }
		
		HelloWorld hello = new HelloWorld();
		hello.printSum();
	}

	
	def printSum(){
		println new Calculation().sum(1,2);	
	}
	
	/**
	 * Private class
	 * 
	 * @author Colin
	 *
	 */
	private class Calculation{
		
		def sum(a,b){
			a+b;
		}
		
	}
}
