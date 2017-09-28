public class DreamVacation
{
    private String destination;
    private double cost;
    
    public DreamVacation()
    {
        this.destination = "Hawaii";
        this.cost = 1000.00;
    }
    
    public DreamVacation(String destination, double cost)
    {
        this.destination = destination;
        this.cost = cost;
    }
    
    public String getDestination()
    {
        return destination;
    }
    
    public double getCost()
    {
        return cost;
    }
    
    public void setDestination(String newDestination)
    {
        this.destination = newDestination;
    }
    
    public void setCost(double newCost)
    {
        this.cost = newCost;
    }
}