package com.tnsif.nonaccessmodifiers;

class FinalDemo {
	
	final int Max = 100;
	private int Min;
	
	final void display() {
		System.out.println("show the value of max: "+Max);
	}

	public static void main(String[] args) {
		FinalDemo fd = new FinalDemo();
		fd.display();
		fd.Min = 200;

	}

}

class Child extends FinalDemo{
	void show() {
		System.out.println("show the value of max: "+Max);
	}
}