public class p5t2 {
    public class dog {
        String name;
        String breed;
        int age;
        dog(String name, String breed, int age) {
            this.name = name;
            this.breed = breed;
            this.age = age;
        } 
        void bark(){
            System.out.println("woof woof");
        }
        void spin(){
            System.out.println("spinning");
        }
        void run(){
            System.out.println("running");
        }
    }
}
