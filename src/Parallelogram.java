public class Parallelogram {
//    int length;
//    int width;
//    int sideLength;
    int calculatePerimeter(int length, int width) {
        return length*2+width*2;
    }
    int calculatePerimeter(int sideLength) {
       return sideLength*6;
    }

    double calculateArea(int length, double width) {
      return length*3+width*3 ;
    }
    int calculateArea(int sideLength) {
        return sideLength*sideLength;
    }


}
