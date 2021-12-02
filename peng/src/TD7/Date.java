package TD7;

import java.text.SimpleDateFormat;

import java.util.Date.*;
 
@SuppressWarnings("unused")

public class Date{
    public static void main(String[] args){

        SimpleDateFormat sdf = new SimpleDateFormat();
        sdf.applyPattern("yyyy-MM-dd HH:mm:ss a");
        Date date = new Date();
        System.out.println("现在时间：" + sdf.format(date)); 
    } 
}