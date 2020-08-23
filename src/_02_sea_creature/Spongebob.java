package _02_sea_creature;

public class Spongebob {
public static void main(String[] args) {
	SeaCreature spongebob = new SeaCreature("Spongebob");
	SeaCreature squidward = new SeaCreature("Squidward");
	SeaCreature patrick = new SeaCreature("Patrick");
	spongebob.eat();
	spongebob.laugh();
	patrick.eat();
	patrick.laugh();
	squidward.eat();
	squidward.laugh();
}
}
