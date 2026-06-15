class equilibrium{
    public static void main(String[] args) {
        int[] arr = {-7, 1, 5, 2, -4, 3, 0};
        System.out.println(findEquilibriumIndex(arr));
    }

    public static int findEquilibriumIndex(int[] arr) {
        int totalSum = 0;
        for (int num : arr) {
            totalSum += num;
        }
        // int totalSum = 0;
        // for (int i = 0; i < arr.length; i++) {
        //     totalSum += arr[i];
        // }

        int leftSum = 0;
        for (int i = 0; i < arr.length; i++) {
            int rightSum = totalSum - leftSum - arr[i];
            if (leftSum == rightSum) {
                return i; // equilibrium index found
            }
            leftSum += arr[i];
        }

        return -1; // no equilibrium index
    }
}