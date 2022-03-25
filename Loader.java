
public class Loader
{
    public static void main(String[] args)
    {
     Cat artem = new Cat();
     artem.getStatus();
     artem.setTransport(Transport.BUS);
     System.out.println(Cat.getCount());
    }
}