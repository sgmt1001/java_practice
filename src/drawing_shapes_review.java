
public class drawing_shapes_review {
	public static void main(String[] args) {
		System.out.println("練習問題「三角形」");
		int triangle=5;
		for(int x=1; x<=triangle; x++) {
			for(int y=1; y<=x; y++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println("練習問題「逆三角形」");
		int triangleReverse=5;
		for(int x=0; x<triangleReverse; x++) {
			for(int y=0; y<triangleReverse-x; y++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println("練習問題「ピラミッド」");
		int pyramid=5;
		for(int x=1; x<=pyramid; x++) {
			for(int y=0; y<pyramid-x; y++) {
				System.out.print(" ");
			}
			for(int z=0;z<(x*2)-1;z++) {
				System.out.print("*");
			}
			System.out.println();
		}	
		
		System.out.println("練習問題「逆ピラミッド」");
		int pyramidReverse=5;
		for(int x=0; x<pyramidReverse; x++) {
			for(int y=0; y<x; y++) {
				System.out.print(" ");
			}
			for(int z=0; z<(pyramidReverse-x)*2-1; z++) {
				System.out.print("*");
			}
			System.out.println();
		}	
	}
}
