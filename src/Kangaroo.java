
public class Kangaroo extends Herbivore{
	
	public Kangaroo(String name) {
		this.name = name;
	}
	
	public Kangaroo() { this.name = "Kangaroo"; }
	
	@Override
	public  void eat(Carnivorous_like_food food) {
		System.out.println("No no no! Kangaroo don\'t eat any meat-like food!!!");
	};
	
	@Override
	public  void eat(Herbivore_like_food food) {
		System.out.print("*" + ((name == "") ? "Kangaroo" : name));
		System.out.println(" pretty champs by " + food.getFoodName() + "*");
		
	};
}
