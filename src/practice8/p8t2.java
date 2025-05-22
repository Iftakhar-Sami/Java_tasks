public class p8t2 {
    public static void main(String[] args) {
        FastFood f1=new FastFood(100);
        f1.calculateTotalBill();
        f1.estimateDeliveryTime();
        FineDining f2=new FineDining(100);
        f2.calculateTotalBill();
        f2.estimateDeliveryTime();
    }
    
}
class Restaurant{
    int eDT=40;
    double price;
    int tax=10;

    void calculateTotalBill(){
        double totalBill=price*tax/100+price;
        System.out.println(totalBill);

    }
    void estimateDeliveryTime(){
        System.out.println(eDT+" min");
    }
    
}
class FastFood extends Restaurant{
    FastFood(double price){
        this.price=price;
        eDT=20;
        tax=15;
    }
}
class FineDining extends Restaurant{
    FineDining(double price){
        this.price=price;
        eDT=60;
    }
}