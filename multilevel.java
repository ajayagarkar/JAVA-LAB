class grandparents{
    void showgrand(){
        System.out.println("GrandParents Class");
    }
}
class parents extends grandparents{
    void showparent(){
        System.out.println("Parents Class");
    }
}
class child extends parents{
    void showchild(){
        System.out.println("Childs Class");
    }
}
public class multilevel{
    public static void main(String[] args){
        child c = new child();
        c.showgrand();
        c.showparent();
        c.showchild();
    }
}
