package edu.java.training.chapter7.user;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class SortingUsers {

	public List<User> sortByAgeAndCountry(List<User> users) {
		return users.stream()
				.sorted((o1, o2) -> o1.getCountry() != o2.getCountry() ? o1.getCountry().compareTo(o2.getCountry())
						: o1.getAge() - o2.getAge())
				.collect(Collectors.toList());
	}

	public List<User> getUsersByAgeAndFirstLetter(List<User> users, int age, String firstLetter) {
		return users.stream().filter((u) -> u.getAge() >= age && u.getName().startsWith(firstLetter))
				.collect(Collectors.toList());
	}

	public void getMaxAndMinElement(List<User> users, int age, String firstLetter) {
		Optional<User> older = getUsersByAgeAndFirstLetter(users, age, firstLetter).stream()
				.max((p1, p2) -> p1.getAge().compareTo(p2.getAge()));
		Optional<User> younger = getUsersByAgeAndFirstLetter(users, age, firstLetter).stream()
				.min((p1, p2) -> p1.getAge().compareTo(p2.getAge()));
		System.out.println("older: " + older);
		System.out.println("younger: " + younger);
	}
}
