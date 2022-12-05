

import org.junit.jupiter.api.Test;

import javax.swing.*;
import java.time.LocalDate;
import java.util.*;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Practices {


    ArrayList<String> b2;


    enum mobile {
        SAMSUNG, APPLE, NOKIA;
    }

    private static Practices single_instance = null;


    public static Practices getInstance() {

        if (single_instance == null) {
            single_instance = new Practices();

        }
        return single_instance;
    }


    public void arraylist() {

        ArrayList<String> array = new ArrayList<>();
        array.add("java");
        array.add("c");
        array.add("c++");
        ArrayList<String> array2 = new ArrayList<>();
        array2.add("Telugu");
        array2.add("English");
        array2.add("Hindi");
        System.out.println(array);
        System.out.println(array2);
        array.addAll(array2);
        System.out.println(array);
        ArrayList<String> a1 = (ArrayList<String>) array.clone();
        System.out.println(a1.contains("English"));
        System.out.println(a1.get(3));
        a1.remove("Telugu");
        System.out.println(a1);
        System.out.println(a1.lastIndexOf("English"));

        ArrayList<String> b1 = new ArrayList<String>(
                Arrays.asList("Ram", "Raju", "Ramesh", "Rohit", "Raju"));
        System.out.println(b1);
        HashSet<String> names = new HashSet<>(b1);
        System.out.println(names);
        try {
            b2 = new ArrayList<String>(b1.subList(2, 5));
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e);
        }

        b1.retainAll(Collections.singleton("Raju"));

        System.out.println(b2);
        b1.stream().distinct();

        ArrayList<Integer> number = new ArrayList<>(Arrays.asList(1, 2, 4, 2, 5, 6, 2, 54, 45, 6, 7, 34, 1, 32));
        number.forEach(p -> System.out.println(p));

        System.out.println(number.stream().distinct().collect(Collectors.toList()));


        Map<String, String> map1 = Stream.of(new String[][]{
                {"tom", "Grade A"},
                {"peter", "Grade B"},
        }).collect(Collectors.toMap(data -> data[0], data -> data[1]));


        Map<String, String> map2 = Collections.singletonMap("JAVA", "1995");
        System.out.println(map2);
        CopyOnWriteArrayList<String> array1 = new CopyOnWriteArrayList<String>(Arrays.asList("Raju", "Rama", "Ravi", "Ramesh"));


    }

    public void forEachLoop() {


        //creating sample Collection
        List<Integer> myList = new ArrayList<Integer>();
        for (int i = 0; i < 10; i++) myList.add(i);

        //traversing using Iterator
        Iterator<Integer> it = myList.iterator();
        while (it.hasNext()) {
            Integer i = it.next();
            System.out.println("Iterator Value::" + i);
        }


    }

    @Test
    public void string() {

        StringBuffer s2 = new StringBuffer("EXAMPLE");
        System.out.println(s2.reverse());
        Scanner sc = new Scanner(System.in);

        String name = sc.next();
        char gender = sc.next().charAt(0);
        long mobileNo = sc.nextLong();
        int age = sc.nextInt();


    }

    public static void main(String args[]) {
//        List<Person> l = Arrays.asList(new Person("ravi", "reddy", 25),
//                new Person("Mamata", "Hirawat", 22), new Person("anil", "kumar", 28));
//        Collections.sort(l, (o1,o2)->o1.getLastName().compareTo(o2.getLastName()));
//        Collections.reverseOrder();

        ArrayList<Integer> number = new ArrayList<>(Arrays.asList(1, 2, 4, 2, 5, 6, 2, 54, 45, 6, 7, 34, 1, 32));
        Collections.reverse(number);
        number.forEach(p -> System.out.println(p));

    }

    public static void print(List<Person> person) {

        for (Person p : person)
            System.out.println(p);


    }

    public static void lastLetterC(List<Person> person) {

        for (Person p : person)
            if (p.getLastName().startsWith("H"))
                System.out.println(p.getLastName());


    }

    @Test
    public void linkedList() {

        List<String> li = new LinkedList<>(Arrays.asList("ram", "ravi,raju,ramesh"));



        System.out.println(LocalDate.now());
        System.out.println(LocalDate.of(1991, 01, 21));
        System.out.println(LocalDate.ofYearDay(1984, 336));

        List<Product> list = new ArrayList<Product>();

        //Adding Products
        list.add(new Product(1, "HP Laptop", 25000f));
        list.add(new Product(3, "Keyboard", 300f));
        list.add(new Product(2, "Dell Mouse", 150f));

        System.out.println("Sorting on the basis of name...");
        List<Product> list1 = new ArrayList<Product>();
        list1.add(new Product(1, "Samsung A5", 17000f));
        list1.add(new Product(3, "Iphone 6S", 65000f));
        list1.add(new Product(2, "Sony Xperia", 25000f));
        list1.add(new Product(4, "Nokia Lumia", 15000f));
        list1.add(new Product(5, "Redmi4 ", 26000f));
        list1.add(new Product(6, "Lenevo Vibe", 19000f));

        Predicate<Product> p = Product -> Product.price > 20000;

        System.out.println(list1.stream().anyMatch(product -> product.price > 16000 && product.name.startsWith("S")));

//        System.out.println(list1.stream().sorted((o1, o2) -> o1.price > o2.price));

        List<Integer> ranks  = new ArrayList<>(Arrays.asList(21,26,87,2,98,55,97));
        Collections.reverse(ranks);

        List <Integer> rankRevers = new ArrayList<>();

       int  arr[] = {1, 2, 3};
        int a = arr[1];
        for ( int i =1; i< arr.length;i++){

        }



    }


    class Product {
        int id;
        String name;
        float price;

        public Product(int id, String name, float price) {
            super();
            this.id = id;
            this.name = name;
            this.price = price;
        }
    }
}