
package factorymethod;


abstract public class NotificationFactory 
{
    
    abstract Notification createNotification();
    public void notification()
    {
        Notification n= createNotification();
        n.sendMessage();
    }
   
   
}
