public class Dec {
    public static void DecRecurr(int n){
        if(n==1){
            System.out.println(n);
            return;
        }
        
        DecRecurr(n - 1);
        System.out.println(n);
    }
    public static void main(String args[]){
        int n = 10;
        DecRecurr(n);
    }
    
}
