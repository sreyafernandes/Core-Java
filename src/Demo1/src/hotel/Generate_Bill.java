package hotel;

import java.util.Scanner;

public class Generate_Bill {

	public static void main(String[] args) {
		Guest_Bill gb[] = new Guest_Bill[3];
		Scanner sc = new Scanner(System.in);
		for(int i=0; i<gb.length; i++)
		{
			gb[i] = new Guest_Bill();
			System.out.println("Enter a name: ");
			gb[i].setgN(sc.nextLine());
			System.out.println("Enter a month: ");
			gb[i].setM(sc.nextLine());
			System.out.println("Enter a Room rent value: ");
			gb[i].setRr(sc.nextDouble());
			System.out.println("Enter a food: ");
			gb[i].setF(sc.nextDouble());
			sc.nextLine();
			System.out.println();
			System.out.println(gb[i].getgN());
			gb[i].rent();
			System.out.println();
		}
		sc.close();
	}

}
