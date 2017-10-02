import org.apache.hadoop.hive.ql.exec.UDF;

public class conct_ws extends UDF{

      public String evaluate( String str, string[] a ){
    
    String b ;
    for(int c= 0 ; c < a.lenght-1;c++)
    {
         b = b + a[c]+str;
    }
    
    b = b+ a[lenght-1];
    return b;
  }
}