
public class Fox extends Carnivorous {
	public Fox(String name) {
		this.name = name;
	}
	
	public Fox() { this.name = "Fox"; }
	
	@Override
	public  void eat(Herbivore_like_food food) {
		System.out.println("No no no! Fox don\'t eat any meat-like food!!!");
	};
	
	@Override
	public  void eat(Carnivorous_like_food food) {
		System.out.print("*" + ((name == "") ? "Fox" : name));
		System.out.println(" pretty champs by " + food.getFoodName() + "*");
		
	};
}
