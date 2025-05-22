public class p5t3 {
    public static void main(String[] args) {
        book b1 = new book("Ninja Hatori");
        book b2= new book("Ninja Hatori","Hatori");
    }
}

class book{
    String title;
    String author;
    book(String title,String author){
        this.title=title;
        this.author=author;
    }
    book(String title){
        this.title=title;
    }

}