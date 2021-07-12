package edu.java.training.chapter7.user;

import java.util.ArrayList;
import java.util.List;

public class Runner {

	public static void main(String[] args) {
		SortingUsers sorting = new SortingUsers();
		List<User> users = new ArrayList<>();
		users.add(new User(1, "Nick", 21, "USA"));
		users.add(new User(2, "Mike", 25, "England"));
		users.add(new User(3, "Julia", 22, "Germany"));
		users.add(new User(4, "Jose", 25, "Spain"));
		users.add(new User(5, "Mikhail", 21, "Russia"));
		users.add(new User(6, "Lui", 21, "Italy"));
		users.add(new User(7, "Hanna", 21, "Belarus"));
		users.add(new User(8, "Sam", 20, "USA"));
		users.add(new User(9, "Frank", 22, "USA"));
		users.add(new User(9, "Martin", 19, "USA"));
		users.add(new User(9, "Marta", 34, "USA"));
		System.out.println(sorting.sortByAgeAndCountry(users));
		System.out.println(sorting.getUsersByAgeAndFirstLetter(users, 20, "M"));
		sorting.getMaxAndMinElement(users, 20, "M");
	}

}
