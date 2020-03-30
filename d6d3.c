//用一个函数判断year是不是闰年
/*#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>
#include <stdlib.h>
//闰年:一种是能被4整除,但不能被100整除的是闰年,还有一种是400的倍数肯定是闰年
void Isleapyear() {
	int year =0 ;
	printf("请输入要判断的年份\n");
	scanf("%d", &year);
	if (year % 100 != 0) {
		if (year % 4 == 0) {
			printf("闰年\n");
		}
		printf("平年\n");
	}
	else {
		if (year % 400 == 0){
			printf("闰年\n");
		}
	}
}
int main(){
	Isleapyear();
	system("pause");
	return 0;
}*/