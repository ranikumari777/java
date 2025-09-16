import java.util.ArrayList;
import java.util.Collections;

public class ArrayLists {
    public static void main(String[] args){
        ArrayList<Integer> list=new ArrayList<Integer>();

        //Add Elelments inArrayList
        list.add(0);
        list.add(1);
        list.add(2);
        list.add(3);
        System.out.println(list);

        //Get any elememnt in Arraylist
        int ele=list.get(0);
        System.out.println(ele);

        //Add Ele in beteen
        list.add(1,10);
        System.out.println(list);

        //Set Ele in ArrayList
        list.set(0, 20);
        System.out.println(list);

        //Remove elements ArrayLists
        list.remove(0);
        System.out.println(list);

        //Sizes of ArrayList
        System.out.println(list.size());

        //Iterrationof ArrayLsits
        for(int i=0; i<list.size(); i++)
        {
            System.out.print(list.get(i));
        }
        System.out.println();

        //Using sorting in ArrayLists
        Collections.sort(list);
        System.out.println(list);
    }
}