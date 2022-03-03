import java.util.*;
public class Datatypeconversions {  
    public static void main(String[] args) {  
     String str = "45";
    
     
     int first = Integer.valueOf(str);
     float second = Integer.valueOf(str);
     long third = Integer.valueOf(str);
     double fourth = Integer.valueOf(str);
     byte five = Byte.parseByte(str);
     short six = Short.parseShort(str);
     char seven[] = str.toCharArray();
     boolean eight = Boolean.getBoolean(str);
     
     System.out.println(first);
     System.out.println(second);
     System.out.println(third);
     System.out.println(fourth);
     System.out.println(five);
     System.out.println(six);
     System.out.println(seven);
     System.out.println(eight);
     
    }  
} 

