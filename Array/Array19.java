public class Array19 {
    // Q2. check number is present or not in givn array 
    public static void main(String[] args) {
        float array[] = { 10.2f, 20.3f, 10.5f, 40.10f, 50.1f };
        float num = 10.2f;
        boolean isInArray = false;
        for (float elemant : array) {
            if (num == elemant) {
                isInArray = true;
                break;

            }

        }
        if (isInArray) {
            System.out.println("The number  is present in array .");

        } else {
            System.out.println("The number is not present in array . ");
        }

    }

}
