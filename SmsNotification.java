
package factorymethod;


public class SmsNotification implements Notification
{
    @Override
    public void sendMessage()
    {
        System.out.println("sending Sms message");
        
    }
    
}
