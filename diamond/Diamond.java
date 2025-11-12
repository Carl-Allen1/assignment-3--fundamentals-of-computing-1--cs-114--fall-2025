import java.util.Scanner;

public class Diamond {
  public static void main(String[] args) {
    int diamondSize;
    boolean isEven;
    int starChange = 2;
    StringBuilder finalStringBuilder = new StringBuilder();

    final String EVEN_STRING = " *";
    final String ODD_STRING = "*";

    Scanner input = new Scanner(System.in);

    System.out.print("Enter a number: ");
    diamondSize = input.nextInt();

    isEven = diamondSize % 2 == 0;

    for(int i = 0, numStars = 1; numStars > 0; i++, numStars += starChange) {
      if(i == 1 && isEven) { numStars--; }

      if(numStars == diamondSize) { starChange *= -1; }

      int numSpaces = diamondSize - numStars;
      numSpaces = !isEven ? numSpaces / 2 : numSpaces;

      for(int j = 0; j < numSpaces; j++) {
        finalStringBuilder.append(" ");
      }

      for(int j = 0; j < numStars; j++) {
        finalStringBuilder.append(isEven ? EVEN_STRING : ODD_STRING);
      }

      finalStringBuilder.append("\n");

      if(i == (diamondSize - 1) && isEven) { numStars++; }
    }

    System.out.println(finalStringBuilder.toString());

    input.close();
  }
}
