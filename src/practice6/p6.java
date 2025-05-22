import java.sql.Date;

public class p6 {
    
}
class book{
    int Bookid;
    String Bookname;
    String BookAuthor;
    String YearofPub;
    float Price;
    String status;
    void AddBook(){
        System.out.println("Book added");
    }
    void DeleteBook(){
        System.out.println("Book deleted");
    }
    void DisplayBookDetails(){
        System.out.println("Book details displayed");
    }
    void InquiryBook(){
        System.out.println("Book Inquired");
    }

}
class Librarian{
    int Id;
    String Name;
    void SearchBook(String Bookname){
        System.out.println("Searching for"+Bookname);
    }
    boolean VerifyMember(int id){
        System.out.println("Member verified");
        return true;
    }
    void OrderBook(){
        System.out.println("Book ordered");
    }
    void SellBook(){
        System.out.println("Book sold");
    }
}
class User{
    int UserID;
    String UserName;
    String UserAddress;
    int PhoneNo;

    void ReturnBook(){
        System.out.println("Book returned");
    }
    int PayFine(Date Dt){
        System.out.println("Checking fine");
        return 0;    
    }
    void AddNewUSer(){
        System.out.println("User added");
    }
    void DeleteUser(){
        System.out.println("User deleted");
    }
    void UpdateDetails(){
        System.out.println("Details updated");
    }
    void BookPurchase(){
        System.out.println("Book purchased");
    }

}

class Publisher{
    int Id;
    String Name;
    String Adress;
    int PhoneNo;
    void AddPub(){
        System.out.println("Publisher added");
    }
    void ModifyPub(){
        System.out.println("Publisher modified");
    }
    void DeletePub(){
        System.out.println("Publisher deleted");
    }
    void OrderStatus(){
        System.out.println("Order status displayed");
    }
}
