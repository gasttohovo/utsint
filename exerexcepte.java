public class BillPughSingleton {

    // Private constructor to prevent instantiation
    private BillPughSingleton() { }

    // Inner static helper class responsible for holding the singleton instance
    private static class SingletonHelper {
        // The single instance of BillPughSingleton is created when the SingletonHelper class is loaded.
        private static final BillPughSingleton INSTANCE = new BillPughSingleton();
    }

    // Public method to provide access to the singleton instance
    public static BillPughSingleton getInstance() {
        return SingletonHelper.INSTANCE;
    }
    
    // Other methods of the singleton class can be defined here
    public void showMessage(){
        System.out.println("Hello World from Bill Pugh Singleton!");
    }

    // Main method for demonstration purposes
    public static void main(String[] args) {
        BillPughSingleton instance = BillPughSingleton.getInstance();
        instance.showMessage();
    }
}
