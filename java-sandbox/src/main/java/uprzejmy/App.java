package uprzejmy;

import java.util.Optional;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        FooFactory fooFactory = new FooFactory();
        
        Optional<IFoo> foo1 = fooFactory.createFoo("test2");
        System.out.println(foo1.get().dumpData());


        Optional<IFoo> foo2= fooFactory.createFoo("test");

        if(foo2.isPresent())
        {
            System.out.println(foo2.get().dumpData());
        }

    }
}
