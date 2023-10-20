public class Parallelogram {
//    int length;
//    int width;
//    int sideLength;
    int calculatePerimeter(int length, int width) {
        return length*2+width*2;
    }
    int calculatePerimeter(int sideLength) {
        int width=3;
       return sideLength*2+width*2;
    }

    double calculateArea(int length, double width) {
      return length*width ;
    }
    int calculateArea(int sideLength) {
        int width=3;
        return sideLength*width;
    }


}
