package com.atguigu.bean;

import java.util.ArrayList;

/**
 * @author xuwg
 * @create 2019-06-21-20:58
 */
public class TemplateTest {
    //模板6：prsf:可生成private static final
    private static final String A_B = "sdf";
    //psf
    public static final String E_E = "";
    //psfi
    public static final int II = 1;
    //psfs
    public static final String ASD_AS = "sdf";
    /**
     * 客户号
     */
     private int id = 123123;


    //main
    public static void main(String[] args) {
        System.out.println();
        String a = "sdfsfsfdsf";
        //sout
        System.out.println();
        //变形:soutp/soutm/soutv/xxx.sout
        System.out.println(a);
        System.out.println("a = " + a);

        //fori
        String[] straar = new String[10];
        for (int i = 0; i < straar.length; i++) {
            System.out.println(i);
        }
        //变形：iter
        for (String s : straar) {
            System.out.println(s);
        }
        //变形：itar
        for (int i = 0; i < straar.length; i++) {
            String s = straar[i];
        }

        //list.for
        ArrayList<String> list = new ArrayList<>();
        for (String string : list) {

        }
        //list.fori
        for (int i = 0; i < list.size(); i++) {

        }
        //list.forr
        for (int i = list.size() - 1; i >= 0; i--) {

        }

        //ifn
        if (list == null) {

        }
        //inn
        if (list != null) {
            
        }
        //xxx.nn
        if (list != null) {

        }
        //xxx.null
        if (list == null) {

        }
        //












    }

}
