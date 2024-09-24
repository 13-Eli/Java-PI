package com.generation;

public class Employee {
    String firstName;
    String lastName;
    int age;
    String role;
    double salary;

    public Employee(String firstName, String lastName, int age, String role, double salary) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.role = role;
        this.salary = salary;
    }

    public void calculateCommission() {
        // Implementación del método
    }

    public void takeVacation(int days) {
        // Implementación del método
    }

	@Override
	public String toString() {
		return "Employee [firstName=" + firstName + ", lastName=" + lastName + ", age=" + age + ", role=" + role
				+ ", salary=" + salary + "]";
	}

   
}
