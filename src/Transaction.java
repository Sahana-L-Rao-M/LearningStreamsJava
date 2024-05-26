import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

public class Transaction{


    private String from;
    private String to;
    private int transactionID;
    private double amount;
    private String message;
    private List<Transaction> listOfTransactions=new ArrayList<>();
    private static Transaction transaction=null;

    private Transaction() {}
    public static Transaction getTransaction() {
        if(transaction==null)
            transaction=new Transaction();
        return transaction;
    }

    Supplier<List<Transaction>> getTransactions=()-> {
        return listOfTransactions;
    };
}
