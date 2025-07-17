package April._25_04_;

public class NoDuplicates {
    public static void main(String[] args) {
        int[] nums = {1, 2, 2, 3, 3, 4, 5, 6, 7};

        no_duplicates(nums);

    }

    public static void no_duplicates(int[] nums) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < nums.length; i++) {
            boolean isDuplicate = false;
            for (int j = 0; j < i; j++) {
                if(nums[i] == nums[j]) {
                    isDuplicate = true;
                    break;
                }
            }

            if(!isDuplicate) {
                sb.append(nums[i] + " ");
            }

        }
        System.out.println(sb);
    }
}
