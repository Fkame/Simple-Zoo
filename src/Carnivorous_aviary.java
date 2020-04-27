
public class Carnivorous_aviary {
	private int size;
	private int nowSize;
	Carnivorous[] animals;
	
	public Carnivorous_aviary(int size) {
		this.size = size;
		animals = new Carnivorous[size];
	}
	
	public void addAnimal(Carnivorous animal) {
		if (nowSize == size) {
			System.out.println("Aviary is full!");
			return;
		}
		animals[nowSize++] = animal;
	}
	
	public void feedAll(Carnivorous_like_food food) {
		for (int i = 0; i < nowSize; i++) {
			animals[i].eat(food);
		}
	}
	
	public void feedRandomAnimal(Carnivorous_like_food food) {
		animals[(int)(Math.random() * nowSize)].eat(food);
	}
	
	public Carnivorous getLastAnimal() {
		if (nowSize == 0) return null;
		return animals[nowSize - 1];
	}
	
	public Carnivorous[] clearAviary() {
		Carnivorous[] freeAnimals = animals;
		animals = new Carnivorous[size];
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
