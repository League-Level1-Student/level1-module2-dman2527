package _04_tea_maker;

public class TeaMakerRunner {
public static void main(String[] args) {
	TeaBag teabag = new TeaBag("vanilla");
	Kettle kettle = new Kettle();
	Cup cup = new Cup();
	kettle.boil();
	cup.makeTea(teabag, kettle.getWater());
	
}
}
