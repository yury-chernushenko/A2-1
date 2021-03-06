package logic;



import java.rmi.Remote;
import java.rmi.RemoteException;
import orders.ResultWithErr;
import inventoryMgmt.Result;


public interface LogicInterface extends Remote{
    
        //Usage: order App
	public ResultWithErr selectFromInventory(String serverIP, String dbName, String tableName) throws RemoteException;
	public String submitOrder(String SQLServerIP, String firstName, String lastName, String phoneNumber, String customerAddress, String sTotalCost, String[] items) throws RemoteException;
        
        // Usage: userLogin 
        public String authentication(String SQLServerIP,String username, String pw) throws RemoteException;
	public String recordUserActivity(String SQLServerIP, String username) throws RemoteException;
        public String getUserAccess (String SQLServerIP, String user )throws RemoteException;
        
        //Usage: Inventory App
	public Result selectEntriesFromInventory(String serverIP, String dbName, String tableName) throws RemoteException;
        public Result insertEntriesToInventory(String serverIP, String dbName, String tableName, 
                                                String description, String productID, Integer quantity, Float perUnitCost) throws RemoteException;
        public Result deleteEntryFromInventory(String serverIP, String dbName, String tableName, String productID) throws RemoteException;
        public Result decrementEntryFromInventory(String serverIP, String dbName, String tableName, String productID) throws RemoteException;

}
