
public abstract class Animal {
	
	protected String name = "";
	
	public abstract void eat(Carnivorous_like_food food);
	
	public abstract void eat(Herbivore_like_food food);
	
	public void giveName(String name) { this.name = name; }
	
	public String getName() { return this.name; }
	
	public String toString() { return (this.name == "") ? this.getClass().toString() : this.name; };
	
}
