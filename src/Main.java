import java.util.Scanner;  //// For taking Inputs from user

class mainControlPanel{ //// from this mai control panel we will manage our all program

    double mutton = 2500; /// price of mutto
    double chickenPolao = 1500;/// price of Chicken Polao
    double rice = 1800;/// price of Rice
    double chickenTikka = 2000;/// price of Chicken Tika
    //double someThingElse;
    double haleem = 700;/// price of Haleem
    String currencySign = "PKR"; /// to print currency sign after Price
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
        System.out.println("1: Mutton");///to display menu items
        System.out.println("2: Chicken Polao");///to display menu items
        System.out.println("3: Rice");///to display menu items
        System.out.println("4: Chicken Tikka");///to display menu items
        System.out.println("5: Haleem");///to display menu items
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
            System.out.println(totalPrice); /// it will show total Bill to the Customer
        } else if (priceForTax > 3000) { /// this block of code will run if the condition if true and price is greater then 3000
            saleTax = (priceForTax/100) * 5;//// calculation for tax of 5%
            totalPrice = quantitiyOfItem*priceForTax;///as above
            totalPrice = totalPrice + saleTax; ////5%
            //totalPrice +=priceForTax;
            System.out.println(totalPrice);/// it will show total Bill to the Customer
        }
    }

    void currencyChooser(){ //// this Function will ask the customer about there currency, the will pay
        System.out.println("Enter You Desire Currency: ");//// taking input from user
        System.out.println("1: PKR"); //// displaying currency value
        System.out.println("2: Euro");//// displaying currency value
        System.out.println("3: Dolor");//// displaying currency value
        optionsForCurrency = reader.nextByte();//// taking input of Currency in BYTE data type
        switch (optionsForCurrency){ //// switch case is used here for 3 type of Currency
            case 1://// if the customer want to pay in PKR
                totalPrice = totalPrice*1; /// it will just multiply with 1 (due to 1 it will not change)
                currencySign = "PKR"; ///currencySign of Currency
                break;
            case 2: //// if the customer want to pay in Euro
                totalPrice = totalPrice/280; //// it will multiply the total Price with 280 (Changes every Day)
                currencySign = "Euro";///// currencySign of Currency
                break;
            case 3: //// if the customer want to pay in dollor
                totalPrice = totalPrice/230; //// it will multiplay the totak price with 230 (changes every day)
                currencySign = "Dolor";/// currencySign of currency
                break;
        }
    }
}

class chickenPolaoPanel extends mainControlPanel{ //// chicken Polao Panel, we will manage it here
    void chickenPolaoManager(){
        System.out.println("Chicken Polao Selected : Price = " + chickenPolao + currencySign);/// selection confirmation message
        quantity(); /// we have call the quantity function here, there the function will take input for Quantity
        totalPrice = quantitiyOfItem*chickenPolao; /// calculation for Total Price
        saleTaxPanel(chickenPolao);///// adding tax to the total Price
        currencyChooser();///// here w`ll Chose currency
        System.out.println("Your Bill is: " + totalPrice +" "+ currencySign + stringText);/// Final Bill
    }

}
class chickenTikkaPanel extends mainControlPanel{ //// chicken Tikka Panel, we will manage it here
    void chickenTikkaManager(){
        System.out.println("Chicken Tikka Selected : Price = " + chickenTikka + currencySign);/// selection confirmation message
        quantity(); /// we have call the quantity function here, there the function will take input for Quantity
        totalPrice = quantitiyOfItem*chickenTikka;/// calculation for Total Price
        saleTaxPanel(chickenTikka);///// adding tax to the total Price
        currencyChooser();///// here w`ll Chose currency
        System.out.println("Your Bill is: " + totalPrice +" " + currencySign + stringText);/// Final Bill
    }
}
class ricePanel extends mainControlPanel{ //// Rice Panel, we will manage it here
    void riceManager(){
        System.out.println("Rice Selected : Price = " + rice + currencySign);/// selection confirmation message
        quantity(); /// we have call the quantity function here, there the function will take input for Quantity
        totalPrice = quantitiyOfItem*rice;/// calculation for Total Price
        saleTaxPanel(rice);///// adding tax to the total Price
        currencyChooser();///// here w`ll Chose currency
        System.out.println("Your Bill is: " + totalPrice +" "+ currencySign + stringText);/// Final Bill
    }
}
class muttonPanel extends mainControlPanel{ //// Mutton Panel, we will manage it here
    void muttonManager(){
        System.out.println("mutton Selected : Price = " + mutton + currencySign);/// selection confirmation message
        quantity(); /// we have call the quantity function here, there the function will take input for Quantity
        totalPrice = quantitiyOfItem*mutton;/// calculation for Total Price
        saleTaxPanel(mutton);///// adding tax to the total Price
        currencyChooser();///// here w`ll Chose currency
        System.out.println("Your Bill is: " + totalPrice + " " + currencySign + stringText);/// Final Bill
    }
}
class haleemPanel extends mainControlPanel{ //// Haleem Panel, we will manage it here
    void haleemManager(){
        System.out.println("Haleem Selected : Price = " + haleem + currencySign);/// selection confirmation message
        quantity(); /// we have call the quantity function here, there the function will take input for Quantity
        totalPrice = quantitiyOfItem*haleem;/// calculation for Total Price
        saleTaxPanel(haleem);///// adding tax to the total Price
        currencyChooser();///// here w`ll Chose currency
        System.out.println("Your Bill is: " + totalPrice + " " + currencySign + stringText);/// Final Bill
    }
}

class controlPanel extends mainControlPanel{ /// main COntrol Panel we will Access and Manage all classes and functions From here
    void controlPanelManager(){ ///  main methods (Not Main)
        displayItems(); /// calling Display Items Function to display Manu
        System.out.println("How can i help you with Sir? : ");/// Taking input for Dishes
        options = reader.nextByte(); //// in BYTE Data Type (variables name is options)
        chickenPolaoPanel chickenPanel = new chickenPolaoPanel();/// objects is created for accessing other classes Functions
        muttonPanel mutton = new muttonPanel();/// objects is created for accessing other classes Functions
        ricePanel rice = new ricePanel();/// objects is created for accessing other classes Functions
        chickenTikkaPanel chicken = new chickenTikkaPanel();/// objects is created for accessing other classes Functions
        haleemPanel haleem = new haleemPanel();/// objects is created for accessing other classes Functions
        switch (options){ /// Switch is for cases
            case 1:/// if mutton Manager
                mutton.muttonManager();
                break;
            case 2:/// if Chicken Polao Manager
                chickenPanel.chickenPolaoManager();
                break;
            case 3:/// if Rice Manager
                rice.riceManager();
                break;
            case 4:/// if chicken tikka Manager
                 chicken.chickenTikkaManager();
                 break;
            case 5:/// if haleem Manager
                  haleem.haleemManager();
                  break;
            default: //// if invalid : like: 7, 45, 8, 6 etc
                   System.out.println("Invalid Arguments");
                   break;
                    }

    }
}

public class Main {//// Now this is the main Class and Main Method for calling all the above functions.
    public static void main(String[] args) {
        controlPanel controlManager = new controlPanel(); /// we just created one object for control Panel class
        controlManager.controlPanelManager();////  and we have just call the main Control panel method from the above Class.
    }
}