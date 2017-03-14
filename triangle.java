class Triangle{
  public int mSide1;
  public int mSide2;
  public int mSide3;

  public Triangle(int side1, int side2, int side3) {
    mSide1 = side1;
    mSide2 = side2;
    mSide3 = side3;
  }


  public String isTriangle(int mSide1, int mSide2, int mSide3 ){

    if (mSide1== mSide2 && mSide2 == mSide3) {
      return "Equilateral triangle";
    } else if((mSide1> mSide2 + mSide3)|| (mSide2 > mSide1+ mSide3) || (mSide3 > mSide2 + mSide1)) {
      return "Not a Triangle";
    } else if ((mSide1== mSide2 )|| (mSide1== mSide3) || (mSide2 == mSide3)){
      return "Isoscelese triangle";
    } else {
      return "Scalene triangle";
    }
  }


}
// public String isTriangle(int sA, int sB, int sC){
//
//   if (sA == sB && sB == sC) {
//     return "Equilateral";
//   } else if((sA > sB + sC)|| (sB > sA + sC) || (sC > sB + sA)) {
//     return "Not a Triangle";
//   } else if ((sA == sB )|| (sA == sC) || (sB == sC)){
//     return "Isoscelese";
//   } else {
//     return "Scalene";
//   }
// }
