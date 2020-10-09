public class Main {

    public static void main(String[] args) {
        // write your code here


        Tourist tourist1=new Tourist("Faraz");
        Tourist tourist2=new Tourist("Hamza");
        Tourist tourist3=new Tourist("Hassan");
        Tourist tourist4=new Tourist("Zaid");
        Tourist tourist5=new Tourist("Usman");


        TourTeam team01=new TourTeam();

        TourTeam team02=new TourTeam();


        team01.add(tourist1);
        team01.add(tourist2);
        team01.add(tourist4);
        team02.add(tourist3);
        team02.add(tourist4);





        team01.AllowTrip("Abbottabad", "10th august");
        team02.AllowTrip("Haripur","11th August" );


        tourist5.AllowTrip("Naran", "2nd March");





    }
}
