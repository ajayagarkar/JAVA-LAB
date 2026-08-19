public class exception{
    public static void main(String[] args){
        int a = 10;
        int b = 0;
        try{
            int c = a/b;
            System.out.println(c);
        }
        catch(ArithmeticException e){
            System.out.println("Cannot Divided by 0");
        }
        finally{
            System.out.println("Program Excecuted Successfully");
        }
    }
}