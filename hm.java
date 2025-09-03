import java.util.*;
public class hm {
    public static void main(String[] args) {
        // HashMap<Integer,Integer> m=new HashMap<>();
            // m.put(7,2);
            // m.put(4,1);

            // m.put(-1,3);
            // m.put(10,15);
            // m.put(13,-6);
            // m.put(-7,2);





            // m.put(2,4);
            // System.err.println(m);                                                 
            // System.out.println(m.size());
            // m.get(7);
            // System.out.println(m.get(10));
            // // m.remove(7);
            // System.out.println(m.remove(7));
            // System.out.println(m.remove(7));
            // System.out.println(m.containsKey(-1));
            //  System.out.println(m.getOrDefault(-2,7));

            //  for(Map.Entry<Integer,Integer> x: m.entrySet()){
            //     System.out.println(x.getKey()+ " " + x.getValue());


            int arr[]={3,1,2,5,6,1,2,3,1,1,6,12};
        HashMap<Integer,Integer> m=new HashMap<>();
        for(int i : arr){
            m.put(i,m.getOrDefault(i,0)+1);
        }
        int val=0,key=-1;
        for(Map.Entry<Integer,Integer> x: m.entrySet()){
            if(x.getValue()>val){
                val=x.getValue();
                key=x.getKey();
            }
            


        }
        System.out.println(key+ " "+val);


             }
        
    }
    

