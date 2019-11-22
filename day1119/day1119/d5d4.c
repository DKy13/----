//编写一个程序，可以一直接收键盘字符， 如果是小写字符就输出对应的大写字符，
//如果接收的是大写字符，就输出对应的小写字符，如果是数字不输出。
#include <stdio.h>
#include <stdlib.h>
int main()
{
	int kch = 0;
	while ((kch = getkchar()) != EOF)
	{
		if (kch >= 'a' && kch <= 'z')
		{
			putkchar(kch - 32);
		}
		else if (kch >= 'A'&& kch <= 'Z')
		{
			putkchar(kch + 32);
		}
		else if (kch >= '0'&& kch <= '9')
		{
			;
		}
	}
	system("pause");
	return 0;
}
