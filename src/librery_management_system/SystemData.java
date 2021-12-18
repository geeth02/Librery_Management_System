package librery_management_system;
public class SystemData {
      private static String currentUser;
      private static String employee;
      
      public static String getCurrentUser(){
          return currentUser;
      }
      public  static void setCurrentUser(String aCurrentUser){
      currentUser=aCurrentUser;
      }   
         public  static void setUEmployee (String employee){
      SystemData.employee=employee;
      }
       public static String getemployee(){
          return employee;
      }
}

