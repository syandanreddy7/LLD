package SingletonPattern;

import java.util.concurrent.locks.ReentrantLock;

public class DatabaseConnection {

    //instantiated to null as to avoid any stray values
    private static DatabaseConnection dbc = null;
    private String username;
    private String password;
    private String url;


    private final static ReentrantLock reEntrantLock = new ReentrantLock(true);

    //default constructor

    // Restricted the usage of the constructor using the "private" access modifier
    // and making a method return the instance of the class

    private DatabaseConnection(){}

    //con: no control on the number of instances created as, the many times we create
    //     we return the new instance of the DatabaseConnection

    //can be addressed by creating an attribute of the class in the same
    // and returning that instance when ever required.
    //Note : the new attribute must be static as static methods cannot access
    //       non-static attributes

    // now below code also addresses the issue of duplicity of the sending new instances of the
    // dbc connection to new requests


    // but we have not made it thread safe, to do so we might have to
    // add the synchronised mechanism and also use the locks in if loops
    public synchronized static DatabaseConnection getInstance()
    {
        if (dbc == null)
        {
            reEntrantLock.lock();
            if (dbc == null)
            {
                dbc = new DatabaseConnection();
            }
            reEntrantLock.unlock();
        }
        return dbc;
    }
}
