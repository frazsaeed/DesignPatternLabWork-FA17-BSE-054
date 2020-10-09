public class FactoryLaptop {
    public Laptop getLaptop(String LaptopType){
        if(LaptopType==null)
            return null;
        if (LaptopType.equalsIgnoreCase("Simple"))
            return new OfficeLaptop();
        else if (LaptopType.equalsIgnoreCase("Gaming"))
            return new GamingLaptop();
        else
            return null;
    }
}
