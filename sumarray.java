class sumarray{
    public static void main(String[] args){
        int[] num = {1, 7, 8, 18, 45};
        int sum = 0;
        for(int i = 0; i < num.length; i++){
            sum += num[i];
        }
        System.out.println("The sum of the numbers is:" + sum);
    }
}