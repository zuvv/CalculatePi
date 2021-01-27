import java.util.*; 

class Main {
public static double myPi(int num){
  double squareArea=0;
  double circleArea=0;
  for (int i=0; i<num;i++){
      double x = Math.random()*1;
      double y = Math.random()*1;    
      //square root of x^2 and y^2  
      double equ = Math.sqrt(x*x+y*y);
      //if its within the circle area put into circle area else square area
      if(equ<=1){
        circleArea++;
      }
      squareArea++;
      System.out.println(equ);

    }
    //4 is form the 4 quadrants
    return 4*circleArea/squareArea;
}
  public static void main(String[] args) {
    System.out.print(myPi(10));


  }
}