import java.util.Random;

public class QuickSort {


    /**
     * 정렬 부분
     * http://www.suwonsmartapp.com
     * @param array 정렬할 배열 (init 메서드를 통해 가져옴)
     * @param left 배열의 첫번째 시작 값 , 0 입력 하면 됨
     * @param right 배열의 마지막 값 , array.length - 1
     */
    public void sort(int[] array, int left, int right) {
        if (left >= right) {
            printArray(array);
            return;
        }
        int low = left + 1; // low 는 left 의 한칸 옆
        int high = right;   // high 는 right 와 동일함 (left , right 값은 고정)
        int pivot = array[left]; // 중심 점을 기준으로 좌 우로 나눠서 분할

        while (low <= high) {
            while (low <= right && array[low] <= pivot) {
                low++;
            }
            while (left + 1 <= high && pivot <= array[high]) {
                high--;
            }
            /**
             * low가 high보다 낮을때.
             * low와 high 값을 변경
             */
            if (low <= high) {
                int temp = array[low];
                array[low] = array[high];
                array[high] = temp;
            } else {
                array[left] = array[high];
                array[high] = pivot;
            }
        }
        sort(array, left, high - 1);
        sort(array, high + 1, right);
    }

    /**
     * 생성된 배열을 확인하기 위한 출력부분
     * http://www.suwonsmartapp.com
     * @param array 생성된 배열 (init의 arrange)
     */
    public void printArray(int[] array) {
        for (int value : array) {
            System.out.print(value);
            System.out.print(" ");
        }
        System.out.println();
    }

    /**
     * 무작위 int 배열 생성
     *
     * @param arraySize        배열의 사이즈 설정 ( 랜덤한 수의 갯수 )
     * @param randomRange ( 랜덤한 수의 범위 )
     * @return arrange
     */
    public int[] init(int arraySize, int randomRange) {
        int[] arrange = new int[arraySize];
        Random random = new Random();
        for (int i = 0; i < arraySize; i++)
            arrange[i] = random.nextInt(randomRange);
        return arrange;
    }
}