//ʵ��һ���������ж�һ�����ǲ�������
#define _CRT_SECURE_NO_WARNINGS
#include<stdio.h>
#include<stdlib.h>
int Isprime(int num){
	//�ж�һ����num�ǲ��������ķ���;
	//��2��ʼ,��num���������ν���ȡģ,ֻҪ��2��num֮����һ������numȡģ��ֵΪ0,�����Ͳ�������,��֮��Ϊ����.
	for (int i = 2; i < num; i++) {
		if (num % i == 0) {
			return 1;
			//��ʾ����
		}
		return 0;
		//��ʾ����
	}
}
int main(){
	int n = 0;
	int result = 0;
	printf("������һ����:\n");
	scanf("%d", &n);
	result = Isprime(n);
	if (result == 0) {
		printf("%d����\n", n);
	}else{
		printf("����%d", n);
	}
	system("pause");
	return 0;
}