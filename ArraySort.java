import java.util.ArrayList;

public class ArraySort{

  public static ArrayList<Integer> numbers = new ArrayList<Integer>();

 // while the array's size is greater than zero, find lowest number in the array then add it to end of the sorted numbers array.

public static ArrayList<Integer> numberSort(ArrayList<Integer> numbers){
  // create new array to collect sorted numbers
  ArrayList<Integer> sortedArray = new ArrayList<Integer>();
    int index = 0;
    while(numbers.size() > 0 ){

    Integer lowest = findLowest(numbers);

    numbers.remove((Integer) lowest);
    sortedArray.add((Integer) lowest);
    }

    return sortedArray;
}

public static Integer findLowest(ArrayList<Integer> numbers){

  Integer lowest = numbers.get(0);

  for (int i = 0 ; i < numbers.size() ; i++){
    if (numbers.get(i) <= lowest){
      lowest = numbers.get(i);
    }
    
}
return lowest;
}



public static void main(String [ ] args){

  numbers.add(4);
  numbers.add(5);
  numbers.add(9);
  numbers.add(2);
  numbers.add(6);
  numbers.add(8);
  numbers.add(3);
  numbers.add(7);
  numbers.add(10);
  numbers.add(1);

  System.out.println(numbers);
  ArrayList<Integer> sorted = numberSort(numbers);
  System.out.println(sorted);
  // Integer lowest = findLowest(numbers);
  // System.out.println(lowest);

}


}

