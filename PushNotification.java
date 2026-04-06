
package factorymethod;


public class PushNotification implements Notification
{
     @Override
    public void sendMessage()
    {
        System.out.println("sending push message");
        
    }
    
}
