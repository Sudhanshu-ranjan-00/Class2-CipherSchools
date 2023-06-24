import java.util.*;

class Example
{
    void example()
    {
        System.out.println("example function of Example class.");
    }
}

class Main{
    public static void main(String args[])
    {
        System.out.println("Inside main");
        Example eg = new Example();
        System.out.println("Calling the function of Example class!");
        eg.example();
    }
}