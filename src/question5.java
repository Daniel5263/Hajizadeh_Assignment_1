public class question5 {
    public static void main(String[] args) {
        question5 main = new question5();

        int[] nums = {3, 4, 2, 3, 2, 5};
        int val = 3;
        int k = main.removeElement(nums, val);

        System.out.println("Number of elements: " + k);
        System.out.print("Modified array: {");

        for (int i = 0; i < nums.length; i++) {
            if (i != 0) {
                System.out.print(", ");
            }
            System.out.print(nums[i]);
        }
        System.out.println("}");
    }

    public int removeElement(int[] nums, int val) {
        int i = 0;

        for (int j = 0; j < nums.length; j++) {
            if (nums[j] != val) {
                nums[i] = nums[j];
                i++;
            }
        }

        for (int j = i; j < nums.length; j++) {
            nums[j] = val;
        }

        return i;
    }
}