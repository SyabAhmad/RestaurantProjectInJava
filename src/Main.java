import java.util.Scanner;  //// For taking Inputs from user

class mainControlPanel{ //// from this mai control panel we will manage our all program

    double mutton = 2500; /// price of mutton
    double chickenPolao = 1500;/// price of Chicken Polao
    double rice = 1800;/// price of Rice
    double chickenTikka = 2000;/// price of Chicken Tikka
    //double someThingElse;
    double haleem = 700;/// price of Haleem
    String sign = "PKR"; /// to print currency sign after Price
    byte options;
    byte optionsForCurrency;
    int quantitiyOfItem; /// used for quantity of items entered by user
    double totalPrice = 0; /// total price we initialize it with 0
    double saleTax = 0; //// also tax sale is initialize with zero 0
    String stringText = "With Taxes"; //// is string to print in bill Section
    Scanner reader = new Scanner(System.in); // reader is object through which we can
                                        /// access the Scanner package and all its Functions
    //// is a function used for to display all items in the manu
    void displayItems(){
        System.out.println("1: Mutton");
        System.out.println("2: Chicken Polao");
        System.out.println("3: Rice");
        System.out.println("4: Chicken Tikka");
        System.out.println("5: Haleem");
    }
    //// this function is used for entering Quantity of items
    ///and will be called after displayItem() Function
    void quantity(){
        System.out.println("How Much Do you want it Sir? ");
        quantitiyOfItem = reader.nextInt();

    }
    ///in this method i just added tax to every price and then will add to the total price
    void saleTaxPanel( double priceForTax){

        if (priceForTax <= 1000){ // if price of item is less than 1000
            priceForTax = priceForTax+0; /// then there will be no tax
            totalPrice +=priceForTax;
            System.out.println(totalPrice); /// to display Total Price
        } else if (priceForTax > 1000 && priceForTax <= 3000) { // if price is >1000 and <3000
            saleTax = (priceForTax/100) * 2; /// it will add 2% to the original Price and then will add to the total price
            totalPrice = quantitiyOfItem*priceForTax; //// as above
            totalPrice = totalPrice + saleTax; ////2% ////as above
            //totalPrice +=priceForTax;
            System.out.println(totalPrice);
        } else if (priceForTax > 3000) {
            saleTax = (priceForTax/100) * 5;
            totalPrice = quantitiyOfItem*priceForTax;
            totalPrice = totalPrice + saleTax; ////5%
            //totalPrice +=priceForTax;
            System.out.println(totalPrice);
        }
    }

    void currencyChooser(){
        System.out.println("Enter You Desire Currency: ");
        System.out.println("1: PKR");
        System.out.println("2: Euro");
        System.out.println("3: Dolor");
        optionsForCurrency = reader.nextByte();
        switch (optionsForCurrency){
            case 1:
                totalPrice = totalPrice*1;
                sign = "PKR";
                break;
            case 2:
                totalPrice = totalPrice/280;
                sign = "Euro";
                break;
            case 3:
                totalPrice = totalPrice/230;
                sign = "Dolor";
                break;
        }
    }
}

class chickenPolaoPanel extends mainControlPanel{
    void chickenPolaoManager(){
        System.out.println("Chicken Polao Selected : Price = " + chickenPolao + sign);
        quantity();
        totalPrice = quantitiyOfItem*chickenPolao;
        saleTaxPanel(chickenPolao);
        currencyChooser();
        System.out.println("Your Bill is: " + totalPrice +" "+ sign + stringText);
    }

}
class chickenTikkaPanel extends mainControlPanel{
    void chickenTikkaManager(){
        System.out.println("Chicken Tikka Selected : Price = " + chickenTikka + sign);
        quantity();
        totalPrice = quantitiyOfItem*chickenTikka;
        saleTaxPanel(chickenTikka);
        currencyChooser();
        System.out.println("Your Bill is: " + totalPrice +" " + sign + stringText);
    }
}
class ricePanel extends mainControlPanel{
    void riceManager(){
        System.out.println("Rice Selected : Price = " + rice + sign);
        quantity();
        totalPrice = quantitiyOfItem*rice;
        saleTaxPanel(rice);
        currencyChooser();
        System.out.println("Your Bill is: " + totalPrice +" "+ sign + stringText);
    }
}
class muttonPanel extends mainControlPanel{
    void muttonManager(){
        System.out.println("mutton Selected : Price = " + mutton + sign);
        quantity();
        totalPrice = quantitiyOfItem*mutton;
        saleTaxPanel(mutton);
        currencyChooser();
        System.out.println("Your Bill is: " + totalPrice + " " + sign + stringText);
    }
}
class haleemPanel extends mainControlPanel{
    void haleemManager(){
        System.out.println("Haleem Selected : Price = " + haleem + sign);
        quantity();
        totalPrice = quantitiyOfItem*haleem;
        saleTaxPanel(haleem);
        currencyChooser();
        System.out.println("Your Bill is: " + totalPrice + " " + sign + stringText);
    }
}

class controlPanel extends mainControlPanel{
    void controlPanelManager(){
        displayItems();
        System.out.println("How can i help you with Sir? : ");
        options = reader.nextByte();
        chickenPolaoPanel chickenPanel = new chickenPolaoPanel();
        muttonPanel mutton = new muttonPanel();
        ricePanel rice = new ricePanel();
        chickenTikkaPanel chicken = new chickenTikkaPanel();
        haleemPanel haleem = new haleemPanel();
        switch (options){
            case 1:
                mutton.muttonManager();
                break;
            case 2:
                chickenPanel.chickenPolaoManager();
                break;
            case 3:
                rice.riceManager();
                break;
            case 4:
                 chicken.chickenTikkaManager();
                 break;
            case 5:
                  haleem.haleemManager();
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