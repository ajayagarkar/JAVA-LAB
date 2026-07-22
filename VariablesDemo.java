public class variablesdemo{
    int instancevar = 10;
    static String staticvar = "I am static";
    public void showvariable(){
        int localvar = 5;
        System.out.println("instance variables = " +instancevar);
        System.out.println("static variables = " +staticvar);
        System.out.println("local variables = " +localvar);
    }
    public static void main(String[] args){
        variablesdemo obj = new variablesdemo();;
        obj.showvariable();
        System.out.println("accessing static variable via class : " +variablesdemo.staticvar);
    }
}