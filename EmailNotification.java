
package factorymethod;


public class EmailNotification implements Notification
{
    @Override
    public void sendMessage()
    {
        System.out.println("sending email message");
        
    }
    
    
    
}
