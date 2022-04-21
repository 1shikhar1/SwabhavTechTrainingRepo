package lsp.solution.test;

import lsp.solution.*;

public class LspSolution {
	public static void main(String args[]) {
		Rectangle rect = new Rectangle(30,10); 
		Square sqr = new Square(25);
		
		shouldNotChangeHeightIfHeightIsChanged(rect);
		
		shouldNotChangeHeightIfHeightIsChanged(sqr);
	}
	
	public static void shouldNotChangeHeightIfHeightIsChanged(Rectangle rectangle) {
			
		int widthBefore = rectangle.getWidth();
		
		rectangle.setHeight(rectangle.getWidth()+10);
		
		int widthAfter = rectangle.getWidth();
		
		System.out.println(widthBefore == widthAfter);
		System.out.println("Width before: "+widthBefore);
		System.out.println("Width after: "+widthAfter);
	}
	
	public static void shouldNotChangeHeightIfHeightIsChanged(Square square) {
		
//		int widthBefore = square.getWidth();
//		
//		square.setHeight(square.getWidth()+10);
//		
//		int widthAfter = square.getWidth();
//		
//		System.out.println(widthBefore == widthAfter);
//		System.out.println("Width before: "+widthBefore);
//		System.out.println("Width after: "+widthAfter);
	}
}
