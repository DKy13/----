//写代码可以在整型有序数组中查找想要的数字，找到了返回下标，找不到返回 - 1.（折半查找）
/*#include <stdio.h>
#include <stdlib.h>
int main() {
	int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
	//求数组长度,然后打印下标
	int num = 0;
	printf("请输入要查找的数字\n");
	scanf("%d", &num);
	int left = 0;
	int right = sizeof(arr) / sizeof(arr[0]) - 1;//定义数组最右边的下标
	//定义查找区间
	while (left <= right) {
		int mid = (left + right) / 2;
		if (num < arr[mid]){
			//此时应该往左查找
			right = mid - 1;
			//减一是因为中间数mid已经查找过了,下面的加一同理
		}
		else if (num > arr[mid]) {
			left = mid + 1;
			//此时应该往右边查找
		}
		else if (num = arr[mid]){
			printf("找到了,元素下标为%d\n", mid);
			break;
		}
	}
	system("pause");
	return 0;
}*/