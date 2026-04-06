
package factorymethod;


public class FactoryMethod 
{

   
    public static void main(String[] args) 
    {
        NotificationFactory obj1=new EmailFactory();
        obj1.createNotification();
        NotificationFactory obj2=new SmsFactory();
        obj2.createNotification();
        NotificationFactory obj3=new PushFactory();
        obj3.createNotification();
        
        
    }
    
}
