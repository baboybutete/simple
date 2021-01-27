package Test;

public class Animal {
	private int age;
	private float weight;
	
	public Animal() {
	}
	
	public Animal(int age, float weight) {
		this.age = age;
		this.weight = weight;
	}
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public float getWeight() {
		return weight;
	}
	public void setWeight(float weight) {
		this.weight = weight;
	}
	
	public void speak(int age , float weight) {
		System.out.println("age = " + age);
		System.out.println("weight = " + weight);
	}
	
	public static void main(String[] args) {
		Animal animal = new Animal();
		animal.speak(2, 5.0f);
	}
}
