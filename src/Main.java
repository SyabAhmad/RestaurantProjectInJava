import java.util.Scanner;

class mainControlPanel{
    double mutton = 2500;
    double chickenPolao = 1500;
    double rice = 1800;
    double chickenTikka = 2000;
    double haleem = 700;
    char sign;
    String pkr;
    String doller;
    String euro;
    byte options;
    int quantitiyOfItem;
    Scanner reader = new Scanner(System.in);
    //// to display all items in the manu
    void displayItems(){
        System.out.println("1: Mutton");
        System.out.println("2: Chicken Polao");
        System.out.println("3: Rice");
        System.out.println("4: Chicken Tikka");
        System.out.println("5: Haleem");
    }
    void quantity(){
        System.out.println("How Much Do you want it Sir? ");
        quantitiyOfItem = reader.nextInt();
    }
}

class chickenPolaoPanel extends mainControlPanel{
    void chickenPolaoManager(){
        System.out.println("Chicken Polao Selected : Price = " + chickenPolao + "PKR");
        quantity();
    }

}
class chickenTikka extends mainControlPanel{
    void chickenTikkaManager(){
        System.out.println("Chicken Tikka Selected : Price = " + chickenTikka + "PKR");
        quantity();
    }
}
class rice extends mainControlPanel{
    void riceManager(){
        System.out.println("Rice Selected : Price = " + rice + "PKR");
        quantity();
    }
}
class mutton extends mainControlPanel{
    void muttonManager(){
        System.out.println("mutton Selected : Price = " + mutton + "PKR");
        quantity();
    }
}
class haleem extends mainControlPanel{
    void haleemManager(){
        System.out.println("Haleem Selected : Price = " + haleem + "PKR");
        quantity();
    }
}

class controlPanel extends mainControlPanel{
    void controlPanelManager(){
        displayItems();
        System.out.println("How can i help you with Sir? : ");
        options = reader.nextByte();
        chickenPolaoPanel chickenPanel = new chickenPolaoPanel();
        switch (options){
            case 1:
                chickenPanel.chickenPolaoManager();
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
        controlPanel controlManager = new controlPanel();
        controlManager.controlPanelManager();
    }
}