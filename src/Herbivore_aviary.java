
public class Herbivore_aviary {
	private int size;
	private int nowSize;
	Herbivore[] animals;
	
	public Herbivore_aviary(int size) {
		this.size = size;
		animals = new Herbivore[size];
	}
	
	public void addAnimal(Herbivore animal) {
		if (nowSize == size) {
			System.out.println("Aviary is full!");
			return;
		}
		animals[nowSize++] = animal;
	}
	
	public void feedAll(Herbivore_like_food food) {
		for (int i = 0; i < nowSize; i++) {
			animals[i].eat(food);
		}
	}
	
	public void feedRandomAnimal(Herbivore_like_food food) {
		animals[(int)(Math.random() * nowSize)].eat(food);
	}
	
	public Herbivore getLastAnimal() {
		if (nowSize == 0) return null;
		return animals[nowSize - 1];
	}
	
	public Herbivore[] clearAviary() {
		Herbivore[] freeAnimals = new Herbivore[nowSize];
		for (int i = 0; i < nowSize; i++) freeAnimals[i] = animals[i];
		animals = new Herbivore[size];
		nowSize = 0;
		return freeAnimals;
	}
	
	public int getAmountInAviary() {
		return this.nowSize;
	}
	
	public int getMaxAviarySize() {
		return this.size;
	}
}
