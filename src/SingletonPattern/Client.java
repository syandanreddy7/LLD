package SingletonPattern;

public class Client {

    public static void main(String[] args) {

        // new database connection instance for the client service
        //DatabaseConnection dbc = new DatabaseConnection();


        //returning the instance using the internal method restricting the
        //constructor, still we don't have the control over the number of
        //instances created
        DatabaseConnection dbc = DatabaseConnection.getInstance();

        System.out.println(dbc);
        System.out.println("===========================");
        System.out.println("Secondary instance creation process");
        System.out.println("===========================");

        DatabaseConnection dbc2 = DatabaseConnection.getInstance();
        System.out.println(dbc2);

        System.out.println("End of program :)");




    }
}
