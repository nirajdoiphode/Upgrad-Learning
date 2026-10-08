package practiceAssignment.collectionDay1;

import java.util.ArrayList;
import java.util.List;

public class Question2 {
    public static void main(String[] args) {
        ArrayList<Books> javaBooks = new ArrayList<>();

        javaBooks.add(new Books(101, "Effective Java", "Joshua Bloch", 850));
        javaBooks.add(new Books(102, "Head First Java", "Kathy Sierra", 650));
        javaBooks.add(new Books(103, "Java: The Complete Reference", "Herbert Schildt", 900));


        ArrayList<Books> pythonBooks = new ArrayList<>();

        pythonBooks.add(new Books(201, "Python Crash Course", "Eric Matthes", 700));
        pythonBooks.add(new Books(202, "Automate the Boring Stuff with Python", "Al Sweigart", 600));
        pythonBooks.add(new Books(203, "Learning Python", "Mark Lutz", 800));


        ArrayList<Books> webBooks = new ArrayList<>();

        webBooks.add(new Books(301, "HTML and CSS", "Jon Duckett", 550));
        webBooks.add(new Books(302, "JavaScript: The Definitive Guide", "David Flanagan", 950));
        webBooks.add(new Books(303, "Learning Web Design", "Jennifer Niederst Robbins", 750));


        List<List<Books>> library=new ArrayList<>();
        library.add(javaBooks);
        library.add(pythonBooks);
        library.add(webBooks);

        System.out.println("All Books Section Wise: ");
        System.out.println("\n\n Java Books: ");
        System.out.println(library.get(0).toString());

        System.out.println(" \n\n Python Books: ");
        System.out.println(library.get(1).toString());

        System.out.println("\n\n Web Books:");
        System.out.println(library.get(2).toString());


        System.out.println("\n\n Books in java section: ");
        System.out.println(javaBooks.toString());

        System.out.println("\n\n Total No of Sections: ");
        System.out.println(library.size());

        System.out.println("\n\n Total no of books in each Section: ");
        int i=1;
        for(List<Books> b:library)
            System.out.println("Section "+(i++)+"= "+b.size());
    }
}
