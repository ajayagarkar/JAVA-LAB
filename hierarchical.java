class parent{
    void house(){
        System.out.println("parents are in House");
    }
}
class Boy extends parent{
    void play(){
        System.out.println("Boy is Playing");
    }
}
class Girl extends parent{
    void dance(){
        System.out.println("Girl is Dancing");
    }
}
public class hierarchical{
    public static void main(String[] args){
        Boy b = new Boy();
        b.house();
        b.play();

        Girl g = new Girl();
        g.house();
        g.dance();
    }
}