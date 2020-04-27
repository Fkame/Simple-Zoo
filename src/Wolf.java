
public class Wolf extends Carnivorous {
	public Wolf(String name) {
		this.name = name;
	}
	
	public Wolf() { this.name = "Wolf"; }
	
	@Override
	public  void eat(Herbivore_like_food food) {
		System.out.println("No no no! Wolf don\'t eat any meat-like food!!!");
	};
	
	@Override
	public  void eat(Carnivorous_like_food food) {
		System.out.print("*" + ((name == "") ? "Wolf" : name));
		System.out.println(" pretty champs by " + food.getFoodName() + "*");
		
	};
}
