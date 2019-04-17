public class EqualC {

    // the array of numbers
    private int[] numbers = {2, 4, 5, 3, 4};
    // The number that the adder should equal to
    public int equalTONumber = 9;

    public void Adder(){

        for (int i =0; i < numbers.length;i++){

            for (int j = i+1; j < numbers.length; j++){
                System.out.println(numbers[i]);
                System.out.println(numbers[j]);
                int sum = numbers[i] + numbers[j];

                if (sum == equalTONumber){
                    System.out.println("found number : " + sum);
                }

                System.out.println("===========");      // SPACER
            }
        }

    }


    public static void main(String[] args) {
        EqualC run = new EqualC();
        run.Adder();
    }
}
/*
Needs to find two numbers that adds up to 9
*/