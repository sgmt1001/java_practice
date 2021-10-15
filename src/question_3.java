import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class question_3 {
	public static void main(String[] args)  throws IOException{
		 BufferedReader br = new BufferedReader(
                 new InputStreamReader( System.in ) );
		 int x;
		 int y;
		 
//		 System.out.println("練習問題3-1");
//		 x = Integer.parseInt( br.readLine() );
//		 y = Integer.parseInt( br.readLine() );
//		 if(x>y) {
//			 System.out.println("xはyより大きい");
//		 }
		 
//		 System.out.println("練習問題3-2");
//		 x = Integer.parseInt( br.readLine() );
//		 y = Integer.parseInt( br.readLine() );
//		 if(x>y){
//			 System.out.println(x);
//		 }
//		 else {
//			 System.out.println(y);
//		 }
//		 
//		 System.out.println("練習問題3-3,3-4");
//		 x = Integer.parseInt( br.readLine() );
//		 y = Integer.parseInt( br.readLine() );
//		 if(x>y) {
//			 System.out.println("xはyより大きい");
//		 }
//		 else if(x<y) {
//			 System.out.println("xはyより小さい");
//		 }
//		 else {
//			 System.out.println("xとyは等しい");
//		 }
		 
//		 System.out.println("練習問題3-5");
//		 System.out.println("正の整数を入力してください");
//		 x = Integer.parseInt( br.readLine() );
//		 if(x%2 == 0) {
//			 System.out.println("入力された数値は偶数です");
//		 }
//		 else {
//			 System.out.println("入力された数値は奇数です");
//		 }
		 
//		 System.out.println("練習問題3-6");
//		 System.out.println("整数を入力してください");
//		 x = Integer.parseInt( br.readLine() );
//		 if(x%2==0 && x>=0) {
//			 System.out.println("正の偶数");
//		 }
//		 else if(x%2==0 && x<0) {
//			 System.out.println("負の偶数");
//		 }
//		 else if(x%2!=0 && x>0) {
//			 System.out.println("正の奇数");
//		 }
//		 else if(x%2!=0 && x<0) {
//			 System.out.println("負の奇数"); 
//		 }
		 
//		 System.out.println("練習問題3-7");
//		 System.out.println("ケース1：試験の点数を入力してください");
//		 x = Integer.parseInt( br.readLine() );
//		 if(x>60) {
//			 System.out.println("合格");
//		 }
//		 else {
//			 System.out.println("不合格");
//		 }
//		 System.out.println("ケース2：試験の点数を入力してください");
//		 x = Integer.parseInt( br.readLine() );
//		 if(x>=80) {
//			 System.out.println("たいへんよくできました");
//		 }
//		 else if(x>=60 && x<80) {
//			 System.out.println("よくできました");
//		 }
//		 else {
//			 System.out.println("ざんねんでした");
//		 }
//		 System.out.println("ケース3：試験の点数を入力してください");
//		 x = Integer.parseInt( br.readLine() );
//		 if(x>=80) {
//			 System.out.println("優");
//		 }
//		 else if(x>=70 && x<80) {
//			 System.out.println("良");
//		 }
//		 else if(x>=60 && x<70) {
//			 System.out.println("可");
//		 }
//		 else {
//			 System.out.println("不可");
//		 }
//		 System.out.println("練習問題3-8");
//		 System.out.println("中間試験の点数を入力してください");
//		 x = Integer.parseInt( br.readLine() );
//		 System.out.println("期末試験の点数を入力してください");
//		 y = Integer.parseInt( br.readLine() );
//		 if(x>=60 && y>=60) {
//			 System.out.println("合格");
//		 }
//		 else if(x+y==130) {
//			 System.out.println("合格");
//		 }
//		 else if(x+y>=100 && (x>=90 || y>=90)) {
//			 System.out.println("合格");
//		 }
//		 else {
//			 System.out.println("不合格");
//		 }
		 
//		 System.out.println("練習問題3-9");
//		 System.out.println("曜日を選択してください");
//		 System.out.println("0=日曜、1=月曜、2=火曜、3=水曜、4=木曜、5=金曜、6=土曜");
//		 x = Integer.parseInt( br.readLine() );
//		 System.out.println("0=午前、1=午後、2=夜間");
//		 y = Integer.parseInt( br.readLine() );
//		 boolean z = true;
//		 if(x==0) {
//			 z = false; 
//		 }
//		 else if(x==2 && y==0) {
//			 z = false;
//		 }
//		 else if(x==3 && y==3) {
//			 z = false;
//		 }
//		 else if(x==5 && y==0) {
//			 z = false;
//		 }
//		 else if(x==6 && (y==0 || y==1)) {
//			 z = false;
//		 }
//		 else {
//			 z = true;
//		 }
//		 if(z == false) {
//			 System.out.println("休診");
//		 }
//		 else {
//			 System.out.println("開院"); 
//		 }
		
//		 System.out.println("練習問題3-10");
//		 System.out.println("整数を2つ入力してください");
//		 x = Integer.parseInt( br.readLine() );
//		 y = Integer.parseInt( br.readLine() );
//		 if(x>y && x%2==0 && y%2==0) {
//			 System.out.println( "xはyより小さく、かつ、xとyは共に偶数である。");
//		 }
//		 if(x==y && x<0) {
//			 System.out.println("xとyは等しく、かつ、負の数である。");
//		 }
//		 if(x<y || x%2==0) {
//			 System.out.println( "xはyより小さい、または、xは偶数である。");
//		 }
//		 if((x<10 || x>=100) && (y>10 && y<100) ) {
//			 System.out.println("xは10以下または100以上で、かつ、yは10以上かつ100以下である。");
//		 }
//		 if(!(x<0 && y<0)) {
//			 System.out.println("xもyも負の数である、ではない。" );
//		 }
		 
//		 System.out.println("練習問題3-11");
//		 System.out.println("月を入力してください");
//		 x = Integer.parseInt( br.readLine() );
//		 switch(x) {
//		 case 1:
//			 System.out.println("１月：元日、成人の日");
//			 break;
//		 case 2:
//			 System.out.println("２月：建国記念の日");
//			 break;
//		 case 3:
//		 	System.out.println("３月：春分の日");
//		 	break;
//		 case 4:
//			 System.out.println("４月：昭和の日");
//			 break;
//		 case 5:
//			 System.out.println("５月：憲法記念日、みどりの日、こどもの日");
//			 break;
//		 case 6:
//			 System.out.println("6月：祝日なし");
//			 break;
//		 case 7:
//			 System.out.println("７月：海の日");
//			 break;
//		 case 8:
//			 System.out.println("8月：祝日なし");
//			 break;
//		 case 9:
//			 System.out.println("９月：敬老の日、秋分の日");
//			 break;
//		 case 10:
//			 System.out.println("１０月：体育の日");
//			 break;
//		 case 11:
//			 System.out.println("１１月：文化の日、勤労感謝の日");
//			 break;
//		 case 12:
//			 System.out.println("１２月：天皇誕生日");
//			 break;
//		 default:
//			 System.out.println("1から12までの数値を入力してください");
//			 break;
//		 }
		
//		 System.out.println("練習問題3-12");
//		 System.out.println("【寿司占い】以下から好きな寿司を数値で選択してください");
//		 System.out.println("1:まぐろ 2:えび 3:こはだ 4:あなご 5:いくら");
//		 x = Integer.parseInt( br.readLine() );
//		 switch(x) {
//		 case 1:
//			 System.out.println("凶");
//			 break;
//		 case 2:
//			 System.out.println("末吉");
//			 break;
//		 case 3:
//			 System.out.println("吉");
//			 break;
//		 case 4:
//			 System.out.println("小吉");
//			 break;
//		 case 5:
//			 System.out.println("中吉");
//			 break;
//		 default:
//			 System.out.println("対応する数値を選択してください");
//			 break;
//		 }
		 
		 System.out.println("練習問題3-13");
		 System.out.println("月を入力してください");
		 x = Integer.parseInt( br.readLine() );
		 switch(x) {
		 case 1:
			 System.out.println("31日");
			 break;
		 case 2:
			 System.out.println("28日");
			 break;
		 case 3:
			 System.out.println("31日");
			 break;
		 case 4:
			 System.out.println("30日");
			 break;
		 case 5:
			 System.out.println("31日");
			 break;
		 case 6:
			 System.out.println("30日");
			 break;
		 case 7:
			 System.out.println("31日");
			 break;
		 case 8:
			 System.out.println("31日");
			 break;
		 case 9:
			 System.out.println("30日");
			 break;
		 case 10:
			 System.out.println("31日");
			 break;
		 case 11:
			 System.out.println("30日");
			 break;
		 case 12:
			 System.out.println("31日");
			 break;
		 default:
			 System.out.println("入力が間違っています");
			 break;
		 }
		 
	}
}
