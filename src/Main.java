/**
 * Created by donghaechoi on 2016. 5. 18..
 * MadeBy. http://www.suwonsmartapp.com
 */
public class Main {
    public static void main(String[] args) {

        int arraySize = 100;
        int randomRange = 100;
        QuickSort quickSort = new QuickSort();

        // 정렬 대상 생성
        int [] array = quickSort.init(arraySize, randomRange);
        quickSort.printArray(array);

        System.out.println("정렬 시작");

        quickSort.sort(array, 0, array.length - 1);

        System.out.println("정렬 완료");
    }
}
