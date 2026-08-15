import java.util.*;

class Nonrepeating {

    public void Nonrepeating(int[] arr){

        Map<Integer,Integer> count = new HashMap<>();

        for(int i = 0 ; i < arr.length ; i++){

         count.put(arr[i], count.getOrDefault(arr[i], 0)+1);

        }

        for(int i = 0 ; i < arr.length ; i++){

            if(count.get(arr[i]) == i){

                System.out.println(arr[i]);

                break;
            }
        }
    }

    public static void main(String[] args){

        Nonrepeating n = new Nonrepeating();

        int[] arr = {1,2,3,1,2,3};

        n.Nonrepeating(arr);


    }
}