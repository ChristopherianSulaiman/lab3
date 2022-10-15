import static org.junit.Assert.*;
import org.junit.*;

public class ArrayTests {
// 	@Test 
// 	public void testReverseInPlace() {
//     int[] input1 = { 3 };
//  //  int[] input3 = { 3, 4, 7, 6, 4, 3 };
//     ArrayExamples.reverseInPlace(input1);
//    // ArrayExamples.reverseInPlace(input3);
//     assertArrayEquals(new int[]{ 3 }, input1);
//    // assertArrayEquals(new int[]{ 3, 4, 6, 7, 4, 3 }, input3);
// 	}

//   @Test 
// 	public void testReverseInPlace2() {
//     int[] input2 = { 3, 4, 6 };
//     ArrayExamples.reverseInPlace(input2);
//     assertArrayEquals(new int[]{ 6, 4, 3 }, input2);
//   }

//   @Test
//   public void testReversed() {
//     int[] input1 = { };
//    // int[] input3 = { 1, 2, 3, 6, 3, 2, 7 };
//     assertArrayEquals(new int[]{ }, ArrayExamples.reversed(input1));
//     //assertArrayEquals(new int[]{ 7, 2, 3, 6, 3, 2, 1 }, ArrayExamples.reversed(input3));
//   }

//    @Test
//   public void testReversed2() {
//     int[] input2 = { 1, 2, 3 };
//     assertArrayEquals(new int[]{ 3, 2, 1 }, ArrayExamples.reversed(input2));
//   }

  // @Test
  // public void testAverageWithoutLowest() {
  //   double[] input1 = { };
  //   assertEquals(0.0, ArrayExamples.averageWithoutLowest(input1), 1);
    
  // }

  // @Test
  // public void testAverageWithoutLowest2() {
  //   double[] input4 = { 2.1, 5.1, 3.3, 4.2};
  //   assertEquals(4.2, ArrayExamples.averageWithoutLowest(input4), 1);
  // }

  // @Test
  // public void testAverageWithoutLowest3() {
  //   double[] input3 = { 2.1, 5.1, 3.3, 4.2, 2.1};
  //   assertEquals(3.7, ArrayExamples.averageWithoutLowest(input3), 1);
  // }

  @Test
  public void testAverageWithoutLowest5() {
    double[] input5 = { 1.1, 1.1, 1.1, 1.1, 1.1};
    assertEquals(1.1, ArrayExamples.averageWithoutLowest(input5), 1);
  }

}

