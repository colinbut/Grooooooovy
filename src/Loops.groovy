/**
 * 
 */

/**
 * @author Colin
 *
 */
class Loops {

	static main(args) {
	
		Loops loops = new Loops();
		
		loops.groovyLoopFeatures();
	}
	
	def collections(){
		
		def list = [1,3,5,6,'Colin'];
		
		// prints each item using the "it" variable
		list.each { println it };
		
		// prints each item using "closure"
		list.each { item -> println item };
		
	}
	
	def groovyLoopFeatures(){
		
		5.times { println "Times + $it " };
	}

}
