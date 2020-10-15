package training.supportbank;

public class Main {
    public static void main(String args[]) {
        String line = "01/01/2014,Jon A,Sarah T,Pokemon Training,7.8";
        String[] parts = line.split(",");
        Transaction transaction = new Transaction();
        transaction.date = parts[0];
        transaction.from = parts[1];
        transaction.to = parts[2];
        transaction.narrative = parts[3];
        transaction.amount = Double.parseDouble(parts [4]);
        System.out.println(transaction.date);
        System.out.println(transaction.from);
        System.out.println(transaction.to);
        System.out.println(transaction.narrative);
        System.out.println(transaction.amount);
    }
}
