package Linked_List;

public class Polynomial {

	int power;
	float coefficient;

	Polynomial(float coefficient, int power) {
		this.power = power;
		this.coefficient = coefficient;
	}

	void display() {
		System.out.print(coefficient + "x^" + power + " + ");
	}
}
