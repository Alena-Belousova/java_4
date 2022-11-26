import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Task1 {
    public static void main(String[] args)
    {
        System.out.println("task_1");
        List<Integer> k = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7,8,9,0));
       Collections.shuffle(k);
        List<Integer> list1 = new ArrayList<Integer>();
        List<Integer> list2 = new ArrayList<Integer>();
for(int i=0;i<k.size(); i++)
{
 if (i%2==0)
 {
     list1.add(k.get(i)) ;
 }
 else
 {
     list2.add(k.get(i));
 }
}
        System.out.println("карты игрока 1: "+list1);
        System.out.println("карты игрока 2: "+list2);
        int set=0;
while(!list1.isEmpty()&&!list2.isEmpty())
{
    if (list1.get(0)>list2.get(0)){
        list1.add(list2.get(0));
        list2.remove(0);
        System.out.println("первый победил") ;
        set++;
    }
    else{
        list2.add(list1.get(0));
        list1.remove(0);
        System.out.println("второй победил") ;
        set++;
    }
    if(set>100000 )
    {
        System.out.println("botva");
        break;
    }
    System.out.println("игрок 1 "+Arrays.toString(list1.toArray()));
    System.out.println("игрок 2 "+Arrays.toString(list2.toArray()));
}
if(!list1.isEmpty())
{
    System.out.println("победил в игре первый") ;
    System.out.println(set);
}
else
     {
        System.out.println("победил в игре второй") ;
         System.out.println("количество шагов"+set);
     }
}
    }


