package _03_smurf;

public class smurfRunner {
public static void main(String[] args) {
	Smurf handySmurf = new Smurf("Handy");
	handySmurf.eat();
	System.out.println(handySmurf.getName());
	Smurf PapaSmurf = new Smurf("Papa Smurf");
	Smurf Smurfette = new Smurf("Smurfette");
	System.out.println(PapaSmurf.getName());
	System.out.println(PapaSmurf.getHatColor());
	System.out.println(PapaSmurf.isGirlOrBoy());
	System.out.println(Smurfette.getName());
	System.out.println(Smurfette.getHatColor());
	System.out.println(Smurfette.isGirlOrBoy());
}
}
