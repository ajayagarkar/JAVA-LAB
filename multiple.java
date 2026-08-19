interface father{
    void showfather();
}
interface mother{
    void showmother();
}
class child implements father,mother{
    public void showfather(){
        System.out.println("This is a father class");
    }
    public void showmother(){
        System.out.println("This is a mother class");
    }
}
public class multiple{
    public static void main(String[] args){
        child c = new child();
        c.showfather();
        c.showmother();
    }
}