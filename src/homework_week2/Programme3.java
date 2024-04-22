package homework_week2;

/**
 * 3.1 Declare one instance and one static variable.
 * 3.2 Declare one instance method.
 * 3.3 Declare one static method.
 * 3.4 Call both instance and static variables into both instance and static methods inside the
 * print statement.
 * 3.5 Declare the Main method.
 * 3.6 Call both instance and static methods into the Main method and run the programme.`
 */
public class Programme3 {
static  String message="Hello";
        String message2="World";


       public static void getmessage(){
           System.out.println(message);
           Programme3 obj = new Programme3();
           System.out.println(obj.message2);
           System.out.println("-------------------");
       }
       public void getData(){
           System.out.println(message2);
           System.out.println(Programme3.message);
       }

            public static void main(String[] args) {
            Programme3 obj2= new Programme3();
            getmessage();
            obj2.getData();
       }

}
