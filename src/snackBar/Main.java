package snackBar;


public class Main
{
    private static void workWithData()
    {
        Customer c1 = new Customer("Jane", 45.25);
        Customer c2 = new Customer("Bob", 33.14);

        VendingMachine v1 = new VendingMachine("Food");
        VendingMachine v2 = new VendingMachine("Drink");
        VendingMachine v3 = new VendingMachine("Office");

        Snack s1 = new Snack("Chips", 36, 1.75, v1.getId());
        Snack s2 = new Snack("Cholcalte Bar", 36, 1.00, v1.getId());
        Snack s3 = new Snack("Pretzel", 30, 2.00, v1.getId());

        Snack s4 = new Snack("Soda", 24, 2.50, v2.getId());
        Snack s5 = new Snack("Water", 20, 2.75, v2.getId());

    // Customer 1 buys 3 of snack 4. Print Customer 1 Cash on hand. Print quantity of snack 4.
    // 45.25
        c1.buyStuff(s4.buySnack(3));
        System.out.println(c1.getCash());
        System.out.println(s4.getQuantity());

    // Customer 1 buys 1 of snack 3. Print Customer 1 Cash on hand. Print quantity of snack 3.
        c1.buyStuff(s3.buySnack(1));
        System.out.println(c1.getCash());
        System.out.println(s3.getQuantity());


    // Customer 2 buys 2 of snack 4. Print Customer 2 Cash on Hand. Print quantity of snack 4.
        c2.buyStuff(s4.buySnack(2));
        System.out.println(c2.getCash());
        System.out.println(s4.getQuantity());
    // Customer 1 finds $10. Print Customer 1 Cash on Hand.
        c1.addCash(10);
        System.out.println(c1.getCash());
    // Customer 1 buys 1 of snack 2. Print Customer 1 Cash on Hand. Print quantity of snack 2.
        c1.buyStuff(s2.buySnack(1));
        System.out.println(c1.getCash());
        System.out.println(s2.getQuantity());
    // Add 12 more items to snack 3. Print quantity of snack 3.
        s3.setQuantity(12);
        System.out.println(s3.getQuantity());
    // Customer 2 buys 3 of snack 3. Print Customer 2 Cash on hand. Print quantity of snack 3.
        c2.buyStuff(s3.buySnack(3));
        System.out.println(c2.getCash());
        System.out.println(s3.getQuantity());

    } 

    
    public static void main(String[] args) {
        workWithData();
    }
}