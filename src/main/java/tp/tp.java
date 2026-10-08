package tp;

import java.util.*;

public class tp {
    public static void main(String[] args) {

//        arraylistFunction();
//        linkedlistFunction();
//        setFunction();
//        treeSetFunction();
//        mapFunction();
        proprityQueueFunction();


    }
    public static void arraylistFunction() {

        List<Integer> list1 = new ArrayList<>();
        list1.add(100);
        list1.add(20);
        list1.add(30);
        list1.add(30);
        list1.add(40);
        list1.add(50);
        System.out.println(list1);
        System.out.println(list1.remove(Integer.valueOf(20)));          //removes element  (returns boolean value)
        System.out.println("removing element at index 1: " + list1.remove(1));                        // removes value form 1st index (returns the poped out value)
        System.out.println("list: " + list1);

        System.out.println(list1.set(0, 44));            // Replace the value of index 0 with 44
        System.out.println("list: " + list1);

        list1.clear();                  // clears list
        System.out.println("list: " + list1);

        Set<Integer> set1 = Set.of(10, 20, 30, 40, 50);
        System.out.println("set: " + set1);
        System.out.println(set1);
        Iterator<Integer> it = set1.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        Map<Integer, String> map = Map.of(1, "Niraj", 2, "Suumedh", 3, "niraj");
        System.out.println(map);
        System.out.println(map.entrySet());

        System.out.println(list1);
        list1.sort(Comparator.reverseOrder());
        System.out.println(list1);


        ArrayList<ArrayList<Integer>> matrix = new ArrayList<>();
        matrix.add(new ArrayList<>(Arrays.asList(1, 2, 3)));
        matrix.add(new ArrayList<>(Arrays.asList(4, 5, 6)));
        for (ArrayList<Integer> row : matrix) System.out.println(row);

    }

    public static void linkedlistFunction() {

        LinkedList<Integer> ll = new LinkedList<>();
        ll.add(1);
        ll.add(2);
        System.out.println(ll);
        ll.addFirst(444);
        ll.addFirst(254);
        ll.addLast(10);
        ll.offerFirst(12);
        ll.offer(22);
        ll.offer(2);
        System.out.println(ll);
        ll.poll();
        System.out.println(ll);

    }

    public static void setFunction() {
        Set<Integer> set1 = new HashSet<>(Arrays.asList(4, 2, 4, 7, 2));
        set1.retainAll(Set.of(1,2,3,4,5,6));            //returns the common ele from both sets
        set1.addAll(Set.of(1,2,3,4,5,6));               // Returns the uniques set of ele from both set
        System.out.println(set1);
        set1.removeAll(Set.of(1,2,3,4,5));
        System.out.println(set1);


        int[] values = {2, 5, 2, 8, 5, 9};
        Set<Integer> seen = new HashSet<>();
        Set<Integer> duplicates = new HashSet<>();
        for (int value : values)
            if (!seen.add(value)) duplicates.add(value);
        System.out.println(duplicates);

    }

    public static void treeSetFunction(){

        TreeSet<Integer> treeSet = new TreeSet<>();
        treeSet.add(10);
        treeSet.add(20);
        treeSet.add(24);
        treeSet.add(30);
        treeSet.add(40);
        System.out.println(treeSet);

        System.out.println(treeSet.ceiling(25));        //return [ equal or higher ] number from set
        System.out.println(treeSet.higher(24));         //return only higher number from set
        System.out.println(treeSet.subSet(20,30));
        System.out.println(treeSet.headSet(24,true));
        System.out.println(treeSet.tailSet(24,true));

        System.out.println(treeSet.descendingSet());



        TreeSet<Player> players = new TreeSet<>(Comparator.comparingInt(p -> p.runs));
        players.add(new Player("A", 70));
        players.add(new Player("B", 90));
        players.add(new Player("C", 80));
        for (Player p : players) System.out.println(p.name + " " + p.runs);


    }

    public static void mapFunction(){
        String[] words = {"java", "sql", "java", "html"};
        HashMap<String, Integer> count = new HashMap<>();
        for (String word : words) count.put(word, count.getOrDefault(word, 0) + 1);
        System.out.println(count);

    }

    public static void proprityQueueFunction(){
//        PriorityQueue<Integer> queue = new PriorityQueue<>(Comparator.reverseOrder());
//        queue.addAll(Arrays.asList(40, 10, 30, 20));
//        while (!queue.isEmpty()) System.out.print(queue.poll()+" ");


        int[] values = {7, 4, 9, 1, 8, 2};
        int k = 3;
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        for (int value : values) {
            queue.offer(value);
            System.out.println(queue);
            if (queue.size() > k) queue.poll();
        }
        System.out.println(queue.size());   //4
        System.out.println(queue.peek());



    }
}
