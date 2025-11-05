import java.util.Scanner;

public class Diamond {
  public static void main(String[] args) {
    int diamondSize;
    int halfDiamondSize;
    int numSpaces;
    int numStars = 1;
    boolean isEven;

    Scanner input = new Scanner(System.in);

    System.out.print("Enter a number: ");
    diamondSize = input.nextInt();

    halfDiamondSize = diamondSize / 2;

    isEven = diamondSize % 2 == 0;

    numSpaces = isEven ? diamondSize : halfDiamondSize;

    for(int i = 0; i < diamondSize - halfDiamondSize + (isEven ? 1 : 0); i++) {
      for(int j = 0; j < numSpaces; j++) {
        System.out.print(" ");
      }

      if(i == 0 && isEven) {
        System.out.print("\b");
      }

      numSpaces -= isEven ? 2 : 1;

      for(int j = 0; j < numStars; j++) {
        System.out.print(isEven ? " *" : "*");
      }

      if(i == 0 && isEven) {
        numStars++;
      } else {
        numStars += 2;
      }

      System.out.println();
    }

    numStars -= 4;
    numSpaces = isEven ? 2 : 1;

    for(int i = 0; i < halfDiamondSize; i++) {
      for(int j = 0; j < numSpaces; j++) {
        System.out.print(" ");
      }

      numSpaces += isEven ? 2 : 1;

      for(int j = 0; j < numStars; j++) {
        System.out.print(isEven && i < (halfDiamondSize - 1) ? " *" : "*");
      }

      if(i == ((halfDiamondSize) - 2) && isEven) {
        numStars--;
      } else {
        numStars -= 2;
      }

      System.out.println();
    }

    input.close();
  }
}
