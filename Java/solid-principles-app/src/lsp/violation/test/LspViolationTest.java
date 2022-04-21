package lsp.violation.test;

import lsp.violation.*;

public class LspViolationTest {
	public static void main(String args[]) {
		Rectangle rect = new Rectangle(30,10); 
		Square sqr = new Square(25);
		
		shouldNotChangeHeightIfHeightIsChanged(rect);
		
		shouldNotChangeHeightIfHeightIsChanged(sqr);
	}
	
	public static void shouldNotChangeHeightIfHeightIsChanged(Rectangle rectangle) {
		
		if(rectangle instanceof Square)
			rectangle = (Square)rectangle;
			
		int widthBefore = rectangle.getWidth();
		
		rectangle.setHeight(rectangle.getWidth()+10);
		
		int widthAfter = rectangle.getWidth();
		
		System.out.println(widthBefore == widthAfter);
		System.out.println("Width before: "+widthBefore);
		System.out.println("Width after: "+widthAfter);
	}
}
