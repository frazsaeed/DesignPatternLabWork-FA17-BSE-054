public class Main {

    public static void main(String[] args) {
        // write your code here
        FactoryLaptop factoryLaptop = new FactoryLaptop();
        Laptop officeBoy = factoryLaptop.getLaptop("Simple");
        officeBoy.create();
        Laptop gamingBoy = factoryLaptop.getLaptop("Gaming");
        gamingBoy.create();
    }
}