public class p5t1 {
    class car{
        String owner;
        String brandName;
        String serialNumber;
        double Fuel;
        car(String owner,String brandName,String serialNumber){
            this.owner=owner;
            this.brandName=brandName;
            this.serialNumber=serialNumber;
        }
        void start(){
            System.out.println("car started");
        }
        void stop(){
            System.out.println("car stopped");
        }
        void checkFuel(){
            System.out.print("checking fuel: "+this.Fuel);
           
        }
    }
}
