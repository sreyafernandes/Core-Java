import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class BankAccountList {
	public static void main(String[] args) {
		
		List<BankAccount> ba = new ArrayList<>();
		ba.add(new BankAccount(1, 50000, "Srey"));
		ba.add(new BankAccount(2, 55000, "Snorlax"));
		ba.add(new BankAccount(3, 56000, "Sreya"));
		ba.add(new BankAccount(4, 1000, "A"));
		ba.add(new BankAccount(5, 2000, "Ar"));
		ba.add(new BankAccount(6, 3000, "Arya"));
		
		
		System.out.print("Highest Balance : ");
		ba.stream().max(Comparator.comparingInt(BankAccount::getBalance)).ifPresent(System.out::println);
		System.out.println();
		System.out.print("Starts with A : ");
		ba.stream().filter((x)->x.getName().startsWith("A")).forEach(System.out::println);
		System.out.println();
		System.out.print("Lowest Balance : ");
		ba.stream().min(Comparator.comparingInt(BankAccount::getBalance)).ifPresent(System.out::println);
		System.out.println();
		System.out.print("Starts with A and Highest Balance : ");
		ba.stream().filter((x)->x.getName().startsWith("A")).max(Comparator.comparingInt(BankAccount::getBalance)).ifPresent(System.out::println);
		
	}
}
