package bite_java;

class TestDemo {
    //冒泡排序
    public static void maopao(int[] arr) {
        //升序排序
        for (int bound = 0; bound < arr.length; bound++) {
            //表示要进行排序的趟数
            for (int cur = 0; cur < arr.length - bound - 1; cur++) {
                //表示每一趟所要进行的操作
                if (arr[cur] > arr[cur + 1]) {
                    arr[cur] = arr[cur + 1] + arr[cur];
                    arr[cur + 1] = arr[cur] - arr[cur + 1];
                    arr[cur] = arr[cur] - arr[cur + 1];
                }
            }
        }
    }
}
