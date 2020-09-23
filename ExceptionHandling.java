import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ExceptionHandling
{
  public static void main(String args[])throws Exception
  {
    int intArray[] = new int[getNumberofIntegers()];
    String input[] = new String[]{"1.5","2","3","4","4.5","5.0","6","7","8","9","10.3","11","12","13","14","15","16.2","17","18","19","20","21","22",
      "23.6","25","26","27","28.1","29","29.9","30","31","32","33","34","35","35.8","36","37","37.6","38","38.1","38.2","38.3","39","39.3",
      "40","41","42","43","43.7","44","44.3","44.9","45","46","46.4","46.8","47.1","48"};

    getIntegers(input, intArray);
    displayIntegers(intArray);
  } // end main methood

  private static int getNumberofIntegers() throws Exception
  {
    BufferedReader keyIn = new BufferedReader(new InputStreamReader(System.in)); int elementNumber = 0;

    System.out.print("Enter the number of integer values to place in the integer array(Maximum 40): ");
    elementNumber = Integer.parseInt(keyIn.readLine()); return elementNumber;
  } // end method getNumberOfElements

  private static void getIntegers(String stringsIn[], int intsOut[])
  {
    for(int strIndex = 0, intIndex = 0; intIndex < intsOut.length;intIndex++, strIndex++)
      intsOut[intIndex] = Integer.parseInt(stringsIn[strIndex]);
  } // end method getIntegers

  private static void displayIntegers(int ints[])
  {
    for(int element : ints)
      System.out.println(element);
  } // end method displayIntegers
} // end class ExceptionHandling