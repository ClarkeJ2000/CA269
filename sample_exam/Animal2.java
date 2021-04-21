public abstract class Animal2
{
    public Animal(String n)
    {
        name = n;
    }

    abstract String hello();
    
    public String greeting()
    {
        return hello() + ", I am " + name;
    }
    // private
    private String name;
}