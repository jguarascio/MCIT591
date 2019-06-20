public class Letter
{
   public static void main(String[] args)
   {
      final double mm_per_inch = 25.4;

      // Define constants for paper size in inches
      final double PAPER_WIDTH_IN = 8.5;
      final double PAPER_LENGTH_IN = 11.0;

      // Define variables for millimeters and convert
  
      double width_in_mm = PAPER_WIDTH_IN * mm_per_inch;
      double length_in_mm = PAPER_LENGTH_IN * mm_per_inch;

      // Display (print to screen) the dimensions in mm
     
      System.out.println("Width: " + Double.toString(width_in_mm));
      System.out.println("Length: " + Double.toString(length_in_mm));

   
   }
}