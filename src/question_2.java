import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class question_2 {
	public static void main( String[] args ) throws IOException
    {
        BufferedReader br = new BufferedReader(
                                new InputStreamReader( System.in ) );
//    	//練習問題2-1
          String  s;
//        s = br.readLine(); 
//        System.out.println(s);
//        
//        //練習問題2-2
          int x;
//        x = Integer.parseInt( br.readLine() );
//        System.out.println(x);
//        
//        //練習問題2-3
//        x = Integer.parseInt( br.readLine() );
//        System.out.println(x);
//        System.out.println(x*x);
//        System.out.println(x*x*x);
        
//        //練習問題2-4
          int y;
//        x = Integer.parseInt( br.readLine() );
//        y = Integer.parseInt( br.readLine() );
//        System.out.println("和=" + (x+y));
//        System.out.println("差=" + (x-y));
//        System.out.println("積=" + (x*y));
//        System.out.println("商=" + (x/y));
//        System.out.println("余り=" + (x%y));
//          
//        //練習問題2-5
//        x = Integer.parseInt( br.readLine() );
//        y = Integer.parseInt( br.readLine() );
//        System.out.println("平均値=" + (x+y)/2);
          
          //練習問題2-6
          System.out.println("年齢を入力してください");
          x = Integer.parseInt( br.readLine() );
          System.out.println("あなたの生まれてから現在までのおおよその日数は" + (x*365) + "日です");
          
    }
}
