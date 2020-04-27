import java.util.Arrays;

public class Zoo_Boost {

	public static void main(String[] args) {
		
		Carnivorous_aviary ca = new Carnivorous_aviary(4);
		ca.addAnimal(new Fox("Holo"));
		ca.addAnimal(new Wolf("Cira"));
		
		Fox foxy = new Fox();
		foxy.giveName("Foxy");;
		
		ca.addAnimal(foxy);
		ca.feedAll(new Rabbit_meat());
		System.out.println("");
		
		Herbivore_aviary ha = new Herbivore_aviary(3);
		ha.addAnimal(new Sloth("Sppedy"));
		ha.addAnimal(new Kangaroo("Lee Sean"));
		ha.addAnimal(new Sloth("Lasty"));
		
		ha.feedAll(new Nuts());
		System.out.println("");
		
		System.out.println("Last added animal in herbivore aviary is " + ha.getLastAnimal().getName());
		
		ha.getLastAnimal().giveName("Not so lasty");
		System.out.println("Last renamed animal in herbivore aviary is " + ha.getLastAnimal().getName() + "\n");
		
		ca.addAnimal(new Wolf());
		Animal[] firstA = ca.clearAviary();
		System.out.println("Carnivorous aviary closed - need to give new to " + firstA.length + " animals");
		System.out.print("They are: " + Arrays.toString(firstA));


		
		
		
		
	}
}
