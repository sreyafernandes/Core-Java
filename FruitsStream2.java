package com.Sept3;

import java.util.ArrayList;
import java.util.Comparator;
import static java.util.stream.Collectors.groupingBy;
import static java.util.stream.Collectors.counting;

public class FruitsStream {
	public static void main(String[] args) {
		ArrayList<Fruits> fruits = new ArrayList<>();
		fruits.add(new Fruits("plums", 90, 70, "red"));
		fruits.add(new Fruits("apple", 90, 50, "red"));
		fruits.add(new Fruits("cherries", 90, 60, "red"));
		fruits.add(new Fruits("orange", 80, 50, "orange"));
		fruits.add(new Fruits("grapes", 70, 50, "green"));
		
		ArrayList<News> news = new ArrayList<>();
		news.add(new News(1, "M", "X", "Good Job"));
		news.add(new News(1, "M", "X", "Good"));
		news.add(new News(1, "M", "X", "Great work"));
		news.add(new News(2, "A", "B", "Great work"));
		
		System.out.println("Color wise printing: ");
		fruits.stream().sorted((d1,d2)->d1.getColor().compareTo(d2.getColor())).forEach(System.out::println);
		System.out.println();
		
		System.out.println("Display only RED color fruits sorted as per their price in ascending order.");
		fruits.stream().filter(x->x.getColor().equals("red")).sorted(Comparator.comparingInt(Fruits::getPrice)).forEach(System.out::println);
		System.out.println();
		
		System.out.println("Find out the newsId which has received maximum comments.");
//		System.out.println();
		news.stream().collect(groupingBy(News::getPostedByUser,counting()));
	}
}
