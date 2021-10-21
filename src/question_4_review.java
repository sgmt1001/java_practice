import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class question_4_review {
	public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(
                new InputStreamReader( System.in ) );
//		System.out.println("練習問題4-1");
//			for(int i=0; i<10; i++) {
//				System.out.println("SPAM");
//			}
		
//		System.out.println("練習問題4-2");
//			int x=3;
//			for(int y=1; y<=9; y++) {
//				System.out.println(x*y);
//			}
		
//		System.out.println("練習問題4-3");
//			int x=1;
//			for(int y=1; y<=8; y++) {
//				x*=2;
//				System.out.println(x);
//			}
		
//		System.out.println("練習問題4-4");
//			int x=1;
//			for(int y=1; y<=7; y++) {
//				x*=y;
//			}
//			System.out.println(x);
		
//		System.out.println("練習問題4-5");
//		int sum=0;
//		int count=10;
//			for(int x=1; x<=count; x++) {
//				System.out.println("整数を入力してください（" + x + "回目）");
//				int y = Integer.parseInt( br.readLine() );
//				sum+=y;
//			}
//			System.out.println("入力された整数の平均値は" + sum/count);
			
//		System.out.println("練習問題4-6");
//		int count=10;
//		int win=0;
//			for(int x=1; x<=count; x++) {
//				System.out.println("0=負け、1=勝ち（" + x + "回目)");
//				int y = Integer.parseInt( br.readLine() );
//				if(y==1) {
//					win+=y;
//				}	
//			}
//			System.out.println("勝ち"+ win + "回、負け" +  (count-win) + "回");
        
//       System.out.println("練習問題4-7");
//       int kyojin=0;
//       int hansin=0;
//       for(int x=1; x<=9; x++) {
//        	System.out.println(x + "回表、巨人の得点は？");
//        	int k = Integer.parseInt( br.readLine() );
//        	kyojin+=k;
//        	System.out.println(x + "回裏、阪神の得点は？");
//        	int h = Integer.parseInt( br.readLine() );
//        	hansin+=h;
//        }
//        System.out.println("巨人：" + kyojin + "点、阪神：" + hansin + "点");
        
//        System.out.println("練習問題4-8");
//        int max=0;
//        for(int x=1; x<=10; x++) {
//        	System.out.println("数字を入力してください（" + x + "回目 )");
//        	int y = Integer.parseInt( br.readLine() );
//        	if(y>max) {
//        		max=y;
//        	}
//        }
//        System.out.println("最大値は" + max + "です");
        
//        System.out.println("練習問題4-9");
//		int max=0;
//		int min=0;
//		for(int x=1; x<=10; x++) {
//		  	System.out.println("数字を入力してください（" + x + "回目 )");
//		  	int y = Integer.parseInt( br.readLine() );
//		  	if(x==1) {
//		  		max=y;
//		  		min=y;
//		  	}
//		  	if(y>max) {
//		  		max=y;
//		  	}
//		  	else if(y<min) {
//		  		min=y;
//		  	}
//		  }
//		 System.out.println("最大値は" + max + "最小値は" + min + "です");
		 
//		 System.out.println("練習問題4-10");
//		 System.out.println("数字を入力してください");
//		 int x = Integer.parseInt( br.readLine() );
//		 for(int y=1;y<=x; y++) {
//			 System.out.print("*");
//		 }
        
//        System.out.println("練習問題4-11");
//        System.out.println("数字を入力してください");
//        int x = Integer.parseInt( br.readLine() );
//        for(int y=0; y<=x; y++) {
//        	System.out.print(y%10);
//        }
        
//        System.out.println("練習問題4-12");
//        int sum=0;
//        while(sum<=100){
//        	 System.out.println("数字を入力してください（現在の合計値" + sum + ")");
//        	 int y = Integer.parseInt( br.readLine() );
//        	 sum+=y;
//        }
//        System.out.println("合計値は" + sum);
        
//        System.out.println("練習問題4-13,14");
//        int strike=0;
//        int ball=0;
//        while(strike<3 && ball<4) {
//        //whileは条件がtrueの間処理を繰り返すため、ここでは3ストライク未満かつ4ボール未満がfalseになるまで繰り返す
//        	System.out.println("ストライク=1、ボール=2、ファウル=3（" + "ストライク" + strike + "、ボール" + ball + "）");
//       	 	int x = Integer.parseInt( br.readLine() );	
//       	 	if(x==1) {
//       	 		strike++;
//       	 	}
//       	 	else if(x==2) {
//       	 		ball++;
//       	 	}
//       	 	else if(x==3 && strike==2) {
//       	 	}
//       	 	else if(x==3) {
//       	 		strike++;
//       	 	}
//       	 	else {
//       	 		System.out.println("指定の数字を入力してください");
//       	 	}
//        }
//        System.out.println("ストライク" + strike + "、ボール" + ball + "、打者交代");
        
//        System.out.println("練習問題4-17");//4-15,16は省略
//        for(int x=1; x<=9; x++) {
//        System.out.println(x + "の段");
//        	for(int y=1; y<=9; y++) {
//        		System.out.print(x*y + " ");
//        	}
//        	System.out.println();
//        }
        
        System.out.println("練習問題4-18");
        int sum=0;
		for(;;) {
			System.out.println("入力した数字を足していきます。0を入力すると結果を表示します");
			int x = Integer.parseInt( br.readLine() );
			sum+=x;
			if(x==0) {
				break;
			}
		}
		System.out.println("入力された数値の合計は" +  sum + "です");	 
	}
}
