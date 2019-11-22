//实现一个函数，打印乘法口诀表，口诀表的行数和列数自己指定,输入9，输出9 * 9口诀表，输入12，输出12 * 12的乘法口诀表
/*#define  _CRT_SECURE_NO_WARNINGS
#include <stdio.h>
#include <stdlib.h>
void mulTable() {
	int k = 1;
	printf("请输入一个数字表示您所需要的乘法表的大小\n");
	scanf("%d", &k);
	printf("您所需要的乘法表如下;\n");
	for (int i = 1; i <= k; i++) {
		for (int j = 1; j <= i; j++) {
			printf("%d * %d = %d\t", j, i, i*j);
			if (i == j) {
				printf("\n");//当输入到i=j时换行
			}
		}
	}
}
int main() {
	mulTable();
	system("pause");
	return 0;
}*/