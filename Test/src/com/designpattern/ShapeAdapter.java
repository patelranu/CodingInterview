package com.designpattern;

public class ShapeAdapter implements Shape {
	ShapDetails obj;

	public ShapeAdapter(ShapDetails obj) {
		this.obj = obj;
	}

	@Override
	public void draw() {
		obj.draw();

	}

	@Override
	public String description() {

		return obj.description();
	}

}
