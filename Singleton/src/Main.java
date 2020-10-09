

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        System.out.println("*** Start Main***");


        ArrayList<SingletonClass> lst = new ArrayList<SingletonClass>();

        for(int i = 0 ; i<100; i++){
            SingletonClass Myinstance = SingletonClass.getInstance();
            Myinstance.setId(i);
            Myinstance.setValue("instance"+i);
            System.out.println(Myinstance.toString(""+Myinstance.hashCode()));
        }
    }
}