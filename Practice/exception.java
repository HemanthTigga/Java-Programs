class exception{
    public static void main(String[] args)             //or throws InterruptedException
    {
        // System.out.println("Hello");
        try{
            int a= 3/0;
        }
        catch(Exception e)
        {
            System.out.println("catch block");
        }
        finally{
            System.out.println("finally block");
        }
        
        System.out.println("Java");
    }
}