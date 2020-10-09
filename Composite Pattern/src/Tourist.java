public class Tourist implements Traveler{
    String Name;
    @Override
    public void AllowTrip(String location, String date)
    {
        System.out.println(this.Name+" is allowed for trip to " +location+ " for the date "+date);

    }
    public Tourist(String name)
    {
        this.Name=name;
    }

}
