// import static org.junit.jupiter.api.Assertions.assertEquals;

// import org.junit.jupiter.api.Test;

class SummationPractice {
    public static void main(String[] args) {
      ArrayList<Integer> numbers = new ArrayList<>();
  
      int sum = calculateSum(numbers);
      System.out.println("Sum of numbers: " + sum);
  
    }
  
    public static int calculateSum(ArrayList<Integer> numbers) {
      int sum = 0;
      for (int number : numbers) {
        sum += number;
  
      }
      return sum;
    }
    // @Test
    // void addition() {
    // assertEquals(2, 1 + 1);
    // }
  }