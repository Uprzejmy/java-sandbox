package uprzejmy;

public class Foo implements IFoo
{
    private String data;
    
    Foo(String data)
    {
        this.data = data;
    }

    @Override
    public String dumpData() {
        return data;
    }
}