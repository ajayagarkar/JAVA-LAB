class college{
    String name;
    static String college = "SCSVMV";
    college(String n){
        name = n;
    }
    void display(){
        System.out.println(name + " - " + college);
    }
    public static void main(String[] args){
        college s1 = new college("Ajay");
        college s2 = new college("Nari");
        s1.display();
        s2.display();
    }
}