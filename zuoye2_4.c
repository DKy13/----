#define _CRT_SECURE_NO_WARNINGS
#include<stdio.h>
#include<stdlib.h>
int main()
{
	system("color 0B");
	int a, b;
	printf("请输入两个数");
	scanf("%d,%d", &a, &b);
	int max, min;
	if (a > b) //比较两个数的大小，大数作为被除数，小数作为除数
	{
		max = a;
		min = b;
	}
	else
	{
		max = b;
		min = a;
	}
	int i, c;
	for (i = 1; i < max; i++) //不知道要进行多少次的求余，所以设置一个较大的循环次数
	{
		if (c = max %min) //如果结果不为0，
		{
			c = max%min; //继续求余
			max = min; //较小数作为被除数
			min = c; //余数作为除数
		}
		else
		{
			c = min; //如果为0，直接跳出循环，
			break;
		}
	}
	printf("%d是最大公约数", c);
	system("pause");
	return 0;
}