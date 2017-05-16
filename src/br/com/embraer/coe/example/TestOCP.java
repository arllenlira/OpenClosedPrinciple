package br.com.embraer.coe.example;

import java.util.ArrayList;
import java.util.List;

public class TestOCP {

	public static void main(String args[]) {

		Circle circle = new Circle();
		Rectangle rectangle = new Rectangle();

		circle.setRadius(2);

		rectangle.setHeight(2);
		rectangle.setWidth(3);

		List<Shape> shapes = new ArrayList<Shape>();

		// lsp
		// De acordo com o LSP, funções que usam referências a classes base
		// devem ser capazes de usar objetos da classe derivada sem conhecê-lo.
		shapes.add(circle);
		shapes.add(rectangle);

		double areaTotal = 0;

		for (Shape s : shapes) {
			areaTotal += s.area();
		}

		System.out.println(areaTotal);
	}
}
