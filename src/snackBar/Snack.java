package snackBar;

public class Snack
{
    private static int maxId = 0;

    private int id;
    private String name;
    private int quantity;
    private double cost;
    private int vendMachineId;

    public Snack(String name, int quantity, double cost, int vendMachineId)
    {
        maxId++;

        this.name = name;
        this.quantity = quantity;
        this.cost = cost;
        this.vendMachineId = vendMachineId;
    }

    public int getId()
    {
        return id;
    }

    public void setId(int id)
    {
        this.id = id;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public double getCost()
    {
        return cost;
    }

    public void setCost(double cost)
    {
        this.cost = cost;
    }
   
    public int getVendMachineId()
    {
        return vendMachineId;
    }

    public void setVendMachineId(int vendMachineId)
    {
        this.vendMachineId = vendMachineId;
    }

    public int getQuantity()
    {
        return quantity;
    }

    public void setQuantity(int quantity)
    {
        this.quantity = this.quantity + quantity;
    }

    public double buySnack(int number)
    {
        this.quantity = this.quantity - number;
        double total = getTotal(number);
        return total;
    }

    public double getTotal(int quantity)
    {
        return this.cost * quantity;
    }
}