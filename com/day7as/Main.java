package com.day7as;

public class Main {
public static void main(String[] args) {
	Animal[] a=new Animal[3];
	Dog d=new Dog();
	Cat c=new Cat();
	Tiger t=new Tiger();
	Animal f=new Dog();
	a[0]=d;
	a[1]=c;
	a[2]=t;
	a[0].eat();
	a[0].makeNoise();
	a[0].walk();
	
	
}
}
