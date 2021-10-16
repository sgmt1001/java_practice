import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class question_4 {
	public static void main(String[] args) throws IOException{
		
//		System.out.println("練習問題4-1");
//		for(int i =0; i<10; i++) {
//			System.out.println("SPAM");
//		}
		
//		System.out.println("練習問題4-2");
//		for(int i =1; i<=9; i++) {
//			System.out.println(i*3);
//		}
		
//		System.out.println("練習問題4-3");
//		int x = 1;
//		for(int i =1; i<=8; i++) {
//			x = x*2;
//			System.out.println("2の" + i + "乗="  + x );
//			//1回目の繰り返し、1*2==2
//			//2回目の繰り返し、2*2==4
//			//3回目の繰り返し、4*2==8
//			//以降繰り返し
//		}
		
//		System.out.println("練習問題4-4");
//		int x = 1;
//		for(int i =2; i<=7; i++) {
//			x  = x*i;
//		}
//		//1回目の繰り返し処理X=1*7==7
//		//2回目の繰り返し処理X=7*6==42
//		//2回目の繰り返し処理X=42*5==210
//		//以降繰り返し
//		System.out.println(x);
		
//		System.out.println("練習問題4-5");
//		BufferedReader br = new BufferedReader(
//              new InputStreamReader( System.in ) );
//		int sum = 0;
//		for(int i=1; i<=10; i++) {
//			System.out.println("数値を入力してください(" + i + "回目)");
//			int x = Integer.parseInt( br.readLine() );
//			sum += x;
//		}
//		System.out.println("入力された数値の平均値は" + sum/10 + "です");
		
//		System.out.println("練習問題4-6");
//		BufferedReader br = new BufferedReader(
//                new InputStreamReader( System.in ) );
//		int wins = 0;
//		for(int i=1; i<=10; i++) {
//			System.out.println("0か1を入力してください(" + i + "回目)");
//			int x = Integer.parseInt( br.readLine() );
//			if(x==1) {
//				wins ++;
//			}
//		}
//		System.out.println("勝ち" + wins + "回、" + "負け" + (10 - wins) + "回" );
		
//		System.out.println("練習問題4-7");
//		BufferedReader br = new BufferedReader(
//              new InputStreamReader( System.in ) );
//		int kyojin = 0;
//		int hanshin = 0;
//		for(int i=1; i<=9; i++) {
//			System.out.print(i + "回表、巨人の得点は？");
//			int x = Integer.parseInt( br.readLine() );
//			kyojin += x;
//			System.out.print(i + "回表、阪神の得点は？");
//			int y = Integer.parseInt( br.readLine() );
//			hanshin += y;
//		}
//		System.out.println("巨人：" + kyojin + "点、阪神：" + hanshin + "点");
//		if(kyojin>hanshin) {
//			System.out.println("巨人の勝ち");
//		}
//		else if(kyojin<hanshin) {
//			System.out.println("阪神の勝ち");
//		}
//		else {
//			System.out.println("引き分け");
//		}
		
//		System.out.println("練習問題4-8");
//		BufferedReader br = new BufferedReader(
//              new InputStreamReader( System.in ) );
//		int max = 0;
//		for(int i=1; i<=10; i++) {
//			System.out.println("正の整数を入力してください（" + i + "回目）");
//			int x = Integer.parseInt( br.readLine() );
//			if(max<x) {
//				max=x;
//			}
//		}
//		System.out.println("最大値は" + max);
		
//		System.out.println("練習問題4-9");
//		BufferedReader br = new BufferedReader(
//              new InputStreamReader( System.in ) ); 
//		int max = 0;
//		int min = 0;
//		for(int i=1; i<=10; i++) {
//			System.out.println("正の整数を入力してください（" + i + "回目）");
//			int x = Integer.parseInt( br.readLine() );
//			if(i==1) {
//				max = x;
//				min = x;
//			}
//			else if(max<x) {
//				max=x;
//			}
//			else if(min>x) {
//				min=x;
//			}
//		}
//		System.out.println("最大値は" + max + "、最小値は" + min + "です");

//		System.out.println("練習問題4-10");
//		System.out.println("*の個数を入力してください");
//		BufferedReader br = new BufferedReader(
//              new InputStreamReader( System.in ) ); 
//		int x = Integer.parseInt( br.readLine() );
//		for(int i=1; i<=x; i++) {
//			System.out.print("*");
//		}
		
//		System.out.println("練習問題4-11");
//		BufferedReader br = new BufferedReader(
//              new InputStreamReader( System.in ) );
//		System.out.println("入力された数値の数だけ0~9数字を出力します");
//		int x = Integer.parseInt( br.readLine() );
//		for(int i=0; i<x; i++) {
//			System.out.print(i%10);
//		}
		
		System.out.println("練習問題4-11");
		BufferedReader br = new BufferedReader(
              new InputStreamReader( System.in ) );
		int sum=0;
		while(sum<=100) {
			System.out.println("合計が100を超えるまで数字を入力してください(現在の合計は" + sum  + "です）");
			sum += Integer.parseInt( br.readLine() );
			if(sum>100) {
				System.out.println("合計が100を超えました(現在の合計は" + sum + ")です");
			}
		}
		
		
	}
}
