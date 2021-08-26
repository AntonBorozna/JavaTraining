package edu.java.training.chapter11.part_a;

public class Runner {
	
	public static void main(String[] args) {
		CollectionTasks util = new CollectionTasks();
		util.getReversOrder();
		util.swithcStack();
		System.out.println(util.getReversString("Yesterday I visited my Granny in the countryside.\r\n"
				+ "We go there every weekend and I enjoy these trips. But not this time.\r\n"
				+ "It was raining cats and dogs, our car broke several times and we all were very tired.\r\n"
				+ "But when we saw the Granny, I forgot about the difficulties."));
		util.sum(3);
		util.mapFunction();
		util.getIdentificalWords("dog Dog Dogs dogs");
		
	}  

}
