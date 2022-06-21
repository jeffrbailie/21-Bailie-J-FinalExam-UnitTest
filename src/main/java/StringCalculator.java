public class StringCalculator {
    public static int add(final String numbers) throws Exception{
        int returnValue = 0;
        String[] numbersArray = numbers.split(",|\n");
        for (String number : numbersArray) {
            if (!number.trim().isEmpty()) {
                if(Integer.parseInt(number.trim()) < 0){
                    throw new Exception("negatives not allowed");
                }
                if(Integer.parseInt(number.trim()) >= 1000){
                    return 1;
                }
                returnValue += Integer.parseInt(number.trim());
            }
        }
        return returnValue;
    }
}
//1. write tests for the new requirements
//
//2. implement the functionality
//
//3. run tests, debug/rewrite implementations until tests pass