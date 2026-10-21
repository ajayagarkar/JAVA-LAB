interface grandparent{
    void showgrand();
}
interface father extends grandparent{
    void showfather();
}
interface mother{
    void showmother();
}
class child implements father,mother{
    public void showgrand(){
        System.out.println("This is grandparent");
    }
    public void showfather(){
        System.out.println("This is father");
    }
    public void showmother(){
        System.out.println("This is mother");
    }
}
public class hybrid{
    public static void main(String args[]){
        child obj = new child();
        obj.showgrand();
        obj.showfather();
        obj.showmother();
    }
}
