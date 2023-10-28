import java.util.*;

public class LinkedListExample {
    public static void main(String[] args) {

        // Create two LinkedLists to store integers
        LinkedList<Integer> list1 = new LinkedList<>();
        LinkedList<Integer> list2 = new LinkedList<>();

        // Add elements to list1
        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(4);
        list1.add(6);
        list1.add(7);
        list1.add(5);
        list1.add(4);
        list1.add(57);
        list1.add(5);
        list1.addLast(55);
        list1.addFirst(55);

        // Add elements to list2
        list2.add(12);
        list2.add(22);
        list2.add(33);
        list2.add(44);
        list2.add(66);
        list2.add(77);
        list2.addLast(556);

        // Add all elements from list2 to the beginning of list1
        list1.addAll(2, list2);

        // Check if list1 contains the element 12
        System.out.println("Does list1 contain 12? " + list1.contains(12));

        // Find the index of the first occurrence of 5 in list1
        System.out.println("Index of first occurrence of 5 in list1: " + list1.indexOf(5));

        // Find the index of the last occurrence of 5 in list1
        System.out.println("Index of last occurrence of 5 in list1: " + list1.lastIndexOf(5));

        // Uncomment the next line to clear all elements in list1
        // list1.clear();

        // Print the elements of list1
        System.out.print("Elements in list1: ");
        for (int i = 0; i < list1.size(); i++) {
            System.out.print(list1.get(i));
            if (i < list1.size() - 1) {
                System.out.print(", ");
            }
        }
    }
}
