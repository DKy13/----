//实现一个函数，判断一个数是不是素数
#define _CRT_SECURE_NO_WARNINGS
#include<stdio.h>
#include<stdlib.h>
int Isprime(int num){
	//判断一个数num是不是素数的方法;
	//从2开始,用num对它们依次进行取模,只要从2到num之间有一个数被num取模的值为0,则它就不是素数,反之则为素数.
	for (int i = 2; i < num; i++) {
		if (num % i == 0) {
			return 1;
			//表示素数
		}
		return 0;
		//表示合数
	}
}
int main(){
	int n = 0;
	int result = 0;
	printf("请输入一个数:\n");
	scanf("%d", &n);
	result = Isprime(n);
	if (result == 0) {
		printf("%d素数\n", n);
	}else{
		printf("合数%d", n);
	}
	system("pause");
	return 0;
}