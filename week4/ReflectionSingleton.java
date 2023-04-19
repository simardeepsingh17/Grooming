package week4;

import java.lang.reflect.Constructor;


class Singleton {
	// public instance initialized when loading the class
	public static Singleton instance = new Singleton();

	private Singleton()
	{
		
	}
}

public class ReflectionSingleton {

	public static void main(String[] args)
	{
		Singleton instance1 = Singleton.instance;
		Singleton instance2 = null;
		try {
			Constructor[] constructors
				= Singleton.class.getDeclaredConstructors();
			for (Constructor constructor : constructors) {
				
				constructor.setAccessible(true);
				instance2
					= (Singleton)constructor.newInstance();
				break;
			}
		}

		catch (Exception e) {
			e.printStackTrace();
		}

		System.out.println("instance1.hashCode():- "
						+ instance1.hashCode());
		System.out.println("instance2.hashCode():- "
						+ instance2.hashCode());
	}
}
