package inharitance;

class Animal{
	public void move() {
		System.out.println("Animal is moving");
	}
}

class Human extends Animal{
	public void move() {
		System.out.println("Human is moving by 2 legs");
	}
	
	public void think() {
		System.out.println("Human is thinkable");
	}
}

class Tiger extends Animal{
	public void move() {
		System.out.println("Tiger is moving by 4 legs");
	}
	
	public void hunt() {
		System.out.println("Tiger can hunt other animals");
	}
}

class Eagle extends Animal{
	int height;
	
	public void move() {
		System.out.println("Eagle is moving by wing");
	}
	public int height(int height) {
		this.height = height;
		System.out.println("Eagle is flying " + height);
		return height;
	}
}

public class AnimalTest {

	public static void main(String[] args) {
		AnimalTest test = new AnimalTest();
		test.moveAnimal(new Human());
		test.moveAnimal(new Tiger());
		test.moveAnimal(new Eagle());
		
		System.out.println("=========");
		Animal a = new Human();
		a.move();
		
		Eagle e = new Eagle();
		e.height(300);
	}
	
	public void moveAnimal(Animal animal) {//�Ű������� �ڷ����� ����Ŭ����
		
		animal.move(); //�������� ���� �����ǵ� �޼��尡 ȣ��ȴ�
		if( animal instanceof Human) { //�ٿ�ĳ���� ����� �ν��Ͻ� Ÿ���� üũ�Ѵ�
			Human human = (Human)animal; //�ٿ�ĳ���� ����
			human.think();
		}
		else if(animal instanceof Tiger) {
			Tiger tiger = (Tiger)animal;
			tiger.hunt();
		}
		else {
			System.out.println("�������� �ʴ� ����Դϴ�.");
		}
		
	}

}
