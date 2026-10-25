package Lab4;

public class TestBook {
    public static void main(String[] args) {

        Author a1 = new Author("Rahul", "rahul@gmail.com", 'M');
        Author a2 = new Author("Priya", "priya@gmail.com", 'F');

        Book b1 = new Book("Java Programming", a1, 850, 20);
        Book b2 = new Book("Python Basics", a2, 650);

        System.out.println(b1);
        System.out.println(b2);

        System.out.println("Book Name : " + b1.getName());
        System.out.println("Author : " + b1.getAuthor());
        System.out.println("Price : " + b1.getPrice());
        System.out.println("Quantity : " + b1.getQty());

        b1.setPrice(950);
        b1.setQty(25);

        System.out.println("Updated Book : " + b1);
    }
}