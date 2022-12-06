public class BankApp {
    private BagelShop bagels;
    private CreditCard card;
    private Bank bank;
    private int choice;

    public BankApp( BagelShop bagels, CreditCard card, Bank bank){
        this.bagels = bagels;
        this.card = card;
        this.bank = bank;
    }

    public String menu(){
        return"1.Make a purchase or return at the bagel shop.\n "+
                "2.Make a payment on the credit card.\n"+
                "3.Open second credit card, or choose one credit card\n"+
                "4.Compare credit card balances\n"+
                "5.Deposit profit\n"+
                "6.Check inventory";

    }

    public String menuChoice(int choice){
        this.choice = choice;
        if(choice == 1) {
            return "What is the quantity of bagels you'd like to return or purchase";

        }
        if(choice == 2){
            return "What is the amount owed";
        }
        if(choice == 3){
            return "Type 1 if you'd like to make a second credit card. Type 2 if you'd like to choose the credit card you want to use";

        }
        if(choice == 4){
            return "Type 1 if you'd like to compare credit card balances ";
        }
        if(choice == 5){
            return "How much would you like to deposit";
        }
        if (choice == 6){
            return "Type 1 Check inventory";
        }

        public String menuReturn (int response){

            
        }
    }
}
