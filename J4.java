/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author smv
 */
class MyPoint1{
    private int x;
    private int y;
    public MyPoint1(){
        this.x=0;
        this.y=0;}
    public MyPoint1(int x,int y){
        this.x=x;
        this.y=y;}
    public void setXY(int x,int y){
        this.x=x;
        this.y=y;}
    public int[] getXY(){
        int[] points={x,y};
        return points;}
    public double distance(int x,int y){
        int xDiff=this.x-x;
        int yDiff=this.y-y;
        return Math.sqrt(xDiff*xDiff + yDiff*yDiff);}
    public double distance(){
        return Math.sqrt(x*x +y*y);}}


 public class J4 {
     public static void main(String[] args){
         MyPoint1 point1=new MyPoint1();
         MyPoint1 point2=new MyPoint1(3,4);
         point1.setXY(1,2);
         int[]points=point1.getXY();
         System.out.println("Point1 coordinates are ");
         System.out.println(points[0]+","+points[1]+"\n");
         System.out.println(point1.distance(5,6));
         System.out.println(point1.distance());}}
     
    

