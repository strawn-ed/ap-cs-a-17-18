public class Temperature
{
    // data members/instance variables
    private String scale;
    private double temp;
    
    // constructor
    public Temperature(String scale, double temp)
    {
        this.scale = scale;
        this.temp = temp;
    }
    
    // getters
    public String getScale()
    {
        return scale;
    }
    
    public double getTemp()
    {
        return temp;
    }
    
    // setters
    public void setScale(String newScale)
    {
        scale = newScale;
    }
    
    public void setTemp(double newTemp)
    {
        temp = newTemp;
    }
    
    // conversion methods
    public double cToF()
    {
        return temp * 9 / 5 + 32;
    }
    
    public double fToC()
    {
        return (temp - 32) * 5 / 9;
    }
}