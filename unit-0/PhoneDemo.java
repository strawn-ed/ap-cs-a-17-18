public class PhoneDemo
{
    private String brand;
    private double version;
    private boolean iPhone;
    
    public PhoneDemo(String brandName, double versionNumber, boolean iPhoneTest)
    {
        brand = brandName;
        version = versionNumber;
        iPhone = iPhoneTest;
    }
    
    public void makeCall(String phoneNumber)
    {
        System.out.println("Calling " + phoneNumber + "...");
    }
    
    public void sendText(String phoneNumber, String message)
    {
        System.out.println("Sending message: \"" + message + "\"");
        System.out.println("Sending to " + phoneNumber + "...");
        System.out.print("Message ");
        System.out.println("sent!");
    }
    
    public static void main(String args[])
    {
        PhoneDemo myPhone = new PhoneDemo("Apple", 10.3, true);
        
        myPhone.makeCall("867-5309");
        myPhone.sendText("867-5309", "Hello, world!");
    }
}