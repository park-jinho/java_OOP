package com.bit2015.paint.shape;

import com.bit2015.paint.i.Drawable;

public class Circle extends Shape implements Drawable{

	@Override
	public void draw() {
		System.out.println("원을 그린다.");

	}

}
