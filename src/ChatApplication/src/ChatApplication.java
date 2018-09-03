import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;


public class ChatApplication {
	public static void main(String[] args) {
//		List<String> messages = new ArrayList<>();
//		Map<Integer, messages> Users = new
		int id;
		String password;
		Scanner sc = new Scanner(System.in);
		Scanner msgs = new Scanner(System.in);
		Map<Integer, User> users = new HashMap<>();
		Map<Integer, List> chatrooms = new HashMap<>();
		List<String> usersOfChatroom = new ArrayList<>();
		Map<Integer, List> listOfMessages = new HashMap<>();
		List<String> messages = new ArrayList<>();
		
		int option = 1;
		do {
			System.out.println("Menu:");
			System.out.println("1. Add User");
			System.out.println("2. Login");
			System.out.println("3. Delete User");
			System.out.println("4. Logout");
			option = sc.nextInt();
			sc.nextLine();
		}
		while(option==4);
		
		users.put(1,new User("Srey", 1, "1234"));
		users.put(2,new User("Ruhika", 2, "1234"));
		switch(option)
		{
			case 2:	System.out.println("Enter credentials");
					id=sc.nextInt();
					sc.nextLine();
					password=sc.next();
					System.out.println(id+" : "+password);
					if(users.containsKey(id)) {
						
						User u = users.get(id);
						System.out.println("Succesfully logged in!");
						System.out.println("Welcome , "+u.getName());
						System.out.println("Enter chatroom number: ");
						usersOfChatroom = chatrooms.get(msgs.nextInt());
						System.out.println(usersOfChatroom);
						usersOfChatroom.add(u.getName());
						msgs.nextLine();
						messages = listOfMessages.get(u.getId());
						System.out.println("Enter 5 messages");
						int c=5;
						while(c>0)
						{
							c--;
							messages.add(msgs.next());
						}
						System.out.println("Goodbye "+u.getName());
						listOfMessages.put(u.getId(),messages);
						
						System.out.println("Saved messages: "+messages);	
						
						messages.clear();
					}
					else
					{
						System.out.println("Please check your credentials.");
					}
		}
	}
}
