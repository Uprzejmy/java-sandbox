package uprzejmy;

import java.util.Optional;

public class FooFactory
{
    public Optional<IFoo> createFoo(String data)
    {
        if(!isValid(data))
        {
            return Optional.empty();
        }
        
        return Optional.of(new Foo(data));
    }
    
    private boolean isValid(String data)
    {
        if(data.contentEquals("test"))
        {
            return false;
        }
        
        return true;
    }
}