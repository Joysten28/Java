/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author smv
 */
public class M3 {
    public static void reverse(String s1){
        String s2=" ";
        int len1=s1.length();
        for(int i=0;i<len1;i++){
            s2=s2+s1.substring(len1-(i+1),len1-i);
        }
        System.out.println(s2);
    }
    public static void main(String[] args){
        reverse("Joysten");
        reverse("Quadras");
    }
    
}
