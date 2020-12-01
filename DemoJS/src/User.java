public class User
{
    private double startingMoney;
    private String firstName;
    private String lastName;
    private String username;
    private String password;

    private static int count = 0; // number of objects in memory SGD

 //edited by Anshus
     // output String indicating that constructor was called.
     public User( String first, String last )
     {
        firstName = first;
        lastName = last;

        count++; // increment static count of Users
        System.out.printf( "User constructor: %s %s; count = %d\n",
           firstName, lastName, count );
     } // end User constructor


     private double startingMoney;
    private String firstName;
    private String lastName;
    private String username;
    private String password;


     //another constructer 
     public User( Double sMoney, String first, String last, String name, String pass)
     {
         startingMoney = sMoney
         firstName = first;
         lastName = last;
         username = name;
         password = pass;

         count++; // increment static count of Users
         System.out.printf( "User constructor: %s %s; count = %d\n",
            firstName, lastName, count );
      } // end User constructor


      // subtract 1 from static count when garbage
      // collector calls finalize to clean up object;
      // confirm that finalize was called
      protected void finalize()
      {
         count--; // decrement static count of users
         System.out.printf( "User finalizer: %s %s; count = %d\n",
            firstName, lastName, count );
      } // end method finalize

    // set first name
      public String setFirstName(String firstName)
      {
         this.firstName = firstName;
      } // end method setFirstName

      // set last name
      public String setLastName(String lastName)
      {
         this.lastName = lastName;
      } // end method setLastName

     // set user name
      public String setUserName(String name)
      {
         this.username = name;
      } // end method setUserName

      // set password
      public String setPassword(String password)
      {
         this.password = password;
      } // end method setPassword






      public String getStartingName()
      {
         return startingName;
      } // end method getstartingName


     // get username
      public String getUserName()
      {
         return username;
      } // end method getUserName..

      // get password
      public String getPassword()
      {
         return password;
      } // end method getPassword

     // get first name
      public String getFirstName()
      {
         return firstName;
      } // end method getFirstName
      // get last name
      public String getLastName()
      {
         return lastName;
      } 
      // static method to get static count value
      public static int getCount()              
      {                                         
         return count;    
      }// end method getCount check 34987r39832
 }
