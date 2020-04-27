
public class Sloth extends Herbivore {
	public Sloth(String name) {
		this.name = name;
	}
	
	public Sloth() { this.name = "Sloth"; }
	
	@Override
	public  void eat(Carnivorous_like_food food) {
		System.out.println("No no no! Sloth don\'t eat any meat-like food!!!");
	};
	
	@Override
	public  void eat(Herbivore_like_food food) {
		System.out.print("*" + ((name == "") ? "Sloth" : name));
		System.out.println(" pretty champs by " + food.getFoodName() + "*");
		
	};
}
