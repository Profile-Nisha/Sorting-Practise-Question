import java.util.ArrayList;
public class Monotonic{
    public static boolean MonotincArray(ArrayList<Integer> list){
         for(int i = 1; i < list.size(); i++){
            if(list.get(i) < list.get(i - 1)){
                return true;
            }
         }
         return false;
    }
    public static void main(String args[]){
    ArrayList<Integer> list = new ArrayList<>() ;
      list.add(1);
      list.add(2);
      list.add(3);
      System.out.println(MonotincArray(list));

    }
}