package immutable;

/**
 * To make a class as immutable 
 * 1.Declare all variables as final
 * 2.class must be final
 * 3.Don't provide setters
 * 4.Any change in state of the object will 
 *   result in a new object
 * 5.Object must be properly constructed i.e. 
 * 	 object reference must not leak during construction process.

Read more: https://javarevisited.blogspot.com/2013/03/how-to-create-immutable-class-object-java-example-tutorial.html#ixzz6BDVQeDCh

1) Immutable objects are by default thread safe, can be shared without synchronization in concurrent environment.
2) Immutable object simplifies development, because its easier to share between multiple threads without external synchronization.

3) Immutable object boost performance of Java application by reducing synchronization in code.

4) Another important benefit of Immutable objects is reusability, you can cache Immutable object and reuse them, much like String literals and Integers.
  You can use static factory methods to provide methods like valueOf(), which can return an existing Immutable object from cache, instead of creating a new one.


Read more: https://javarevisited.blogspot.com/2013/03/how-to-create-immutable-class-object-java-example-tutorial.html#ixzz6BDibJHXz
 */





//  https://stackoverflow.com/questions/12306651/why-would-one-declare-an-immutable-class-final-in-java?noredirect=1&lq=1
//  https://stackoverflow.com/questions/31214446/immutable-classes-and-subclasses
//  https://javarevisited.blogspot.com/2013/03/how-to-create-immutable-class-object-java-example-tutorial.html
public class Immutable {
	private final int value;
	
	public Immutable(int value) {
		this.value = value;
	}
	
	public int getValue() {
		return value;
	}
}
