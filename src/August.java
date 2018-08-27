import java.util.Scanner;

public class August{
	public static void main(String[] args) {
		Seasons seasons = Seasons.MONSOON;
		System.out.println(seasons);
		Scanner sc = new Scanner(System.in);
		String s=sc.nextLine();
		if(s.equalsIgnoreCase(Seasons.MONSOON.toString()))
			System.out.println("is true");
		else
			System.out.println("is false");
		
		String val = sc.nextLine();
		Seasons s1 = Seasons.valueOf(val.toUpperCase());
		
		switch(s1) {
		case AUTUMN:
			System.out.println("Autumn");
			break;
		case MONSOON:
			System.out.println("Monsoon");
			break;
		case SUMMER:
			System.out.println("Summer");
			break;
		case WINTER:
			System.out.println("Winter");
			break;
		}
		
		Seasons seasonss[] = Seasons.values();
		for(Seasons seasonsss: seasonss)
			System.out.println(seasonsss);
	}
}
