import java.util.Scanner;

class mainControlPanel{
    double mutton = 2500;
    double chickenPolao = 1500;
    double rice = 1800;
    double chickenTikka = 2000;
    double haleem = 700;
    char sign;
    byte options;
    Scanner reader = new Scanner(System.in);
    //// to display all items in the manu
    void displayItems(){
        System.out.println("1: Mutton");
        System.out.println("2: Chicken Polao");
        System.out.println("3: Rice");
        System.out.println("4: Chicken Tikka");
        System.out.println("5: Haleem");
    }
}

class chickenPolaoPanel extends mainControlPanel{

}
class chickenTikka extends mainControlPanel{

}
class rice extends mainControlPanel{

}
class mutton extends mainControlPanel{

}
class haleem extends mainControlPanel{

}

class controlPanel extends mainControlPanel{
    void controlPanelManager(){
        displayItems();
        System.out.println("How can i help you with Sir? : ");
        options = reader.nextByte();
        switch (options){
            case 1:

                break;
            case 2:

                break;
            case 3:

                break;
            case 4:

                break;
            case 5:

                break;

            default:
                System.out.println("Invalid Arguments");
                break;
        }
    }
}

public class Main {
    public static void main(String[] args) {

    }
}