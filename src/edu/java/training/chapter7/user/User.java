package edu.java.training.chapter7.user;

/*
Написать класс Пользователь с полями: id, имя, возраст, страна. Создать
массив Пользователей. Отсортировать по стране и возрасту. Выбрать всех
Пользователей старше заданного возраста, первая буква имени у которых
начинается с заданной буквы. Получить максимальный и минимальный
элемент в сгруппированном результате по возрасту.
 */

public class User {

	private int id;
	private String name;
	private Integer age;
	private String country;
		
	public User(int id, String name, int age, String country) {		
		this.id = id;
		this.name = name;
		this.age = age;
		this.country = country;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		User other = (User) obj;
		if (age == null) {
			if (other.age != null)
				return false;
		} else if (!age.equals(other.age))
			return false;
		if (country == null) {
			if (other.country != null)
				return false;
		} else if (!country.equals(other.country))
			return false;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((age == null) ? 0 : age.hashCode());
		result = prime * result + ((country == null) ? 0 : country.hashCode());
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}
	
	@Override
	public String toString() {
		return "\nUser [id=" + id + ", name=" + name + ", age=" + age + ", country=" + country + "]";
	}
}
