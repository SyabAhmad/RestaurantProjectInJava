class mainControlPanel{
    double mutton = 2500;
    double chickenPolao = 1500;
    double rice = 1800;
    double chickenTikka = 2000;
    double haleem = 700;
    char sign;
    byte options;
    //// to display all items in the manu
    void displayItems(){
        System.out.println("1: Mutton");
        System.out.println("2: Chicken Polao");
        System.out.println("3: Rice");
        System.out.println("4: Chicken Tikka");
        System.out.println("5: Haleem");
    }
}
class controlPanel extends mainControlPanel{
    void controlPanelManager(){
        displayItems();
        System.out.println("How can i help you with Sir? : ");
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


public class Main {
    public static void main(String[] args) {

    }
}