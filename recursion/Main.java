public class Main{
    public static int dept(int a){
        if(a==1){//base case
            return 1;
        }
        return a*dept(a-1);//recursive case
    }
    public static void main(String[] args){
        int a=dept(5);
        System.out.print(a);
    }
}