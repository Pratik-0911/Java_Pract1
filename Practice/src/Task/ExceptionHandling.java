//package Task;
//
//
//class EmailNotVerified extends RuntimeException
//{
//    public EmailNotVerified(String message)
//    {
//        super(message);
//    }
//}
//class UserNameNotFound extends Exception
//{
//    public UserNameNotFound(String message)
//    {
//        super(message);
//    }
//}
//@GlobalE
//public class ExceptionHandling {
//
//    public static void email(String email)
//    {
//        if(email==null)
//        {
//            throw new EmailNotVerified("Email not verified");
//        }
//    }
//
//    public static void check(String userName) throws UserNameNotFound
//    {
//        if(userName.isEmpty())
//        {
//            throw new UserNameNotFound("User not found");
//        }
//    }
//    public static void main(String[] args)throws UserNameNotFound {
//
//        try
//        {
//            check("mahesh");
//        }
//        catch (Exception e)
//        {
//            System.out.println(e.getMessage());
//        }
//        email("mmm");
//    }
//}
