public class Min {
    public static void main(String[] args) {
        int[] array = {2,3,4,5,6};
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < array.length; i++) {
            int  currentElement = array[i];
            if (min > currentElement) {;;
                min = currentElement;
            }
        }
        System.out.println("Най-ниската оценка е :" + min);
    }
}
