public class pizza {
    private int price;
    private Boolean veg;

    private int extraCheeseprice = 100;
    private int extraToppingsprice = 150;
    private int backpack = 20;
    private int basepizzaprice;

    private boolean isextraCheeseAddes = false;
    private boolean isextraToppingAdded = false;
    private boolean isoptedforTakeaway = false;

    public pizza(Boolean veg) { // depends on veg or non veg the choice
        this.veg = veg;
        if (this.veg) {
            this.price = 300;
        } else {
            this.price = 400;
        }
        basepizzaprice = this.price;
    }

    public void addExtracheese() {
        isextraCheeseAddes = true;
        System.out.println("Extra Cheese added");
        this.price += extraCheeseprice;
    }

    public void addExtraToppings() {
        isextraToppingAdded = true;
        System.out.println("Extra Toppings added");
        this.price += extraToppingsprice;

    }

    public void takeAway() {
        isoptedforTakeaway = true;
        System.out.println("Take Away");
        this.price += backpack;

    }

    public void getBill() {
        String bill = "";
        System.out.println("Pizza:" + basepizzaprice);
        if (isextraCheeseAddes) {
            bill += "Extra Cheese Added:" + extraCheeseprice + "\n";
        }
        if (isextraToppingAdded) {
            bill += "Extra Toppings Added:" + extraToppingsprice + "\n";
        }
        if (isoptedforTakeaway) {
            bill += "Take Away:" + backpack + "\n";
        }
        bill += "Bill:" + this.price + "\n";
        System.out.println(bill);
    }

}
/*
 * base pizza -300
 * toppings -150
 * cheese-100
 * takeaway-20
 */