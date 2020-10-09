import java.util.ArrayList;

public class TourTeam implements Traveler{
    private final ArrayList<Tourist> tourists=new ArrayList<>();
    public void add(Tourist tourist){
        tourists.add(tourist);
    }


    @Override
    public void AllowTrip(String location, String date)
    {
        for(Tourist everySingleTourist :tourists)
        {
            everySingleTourist.AllowTrip(location,date);
        }

    }
}
