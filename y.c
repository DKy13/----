//#include <stdio.h>
//extern int main(){
//	for (int i = 1000; i < 2001; i++){
//		if (i % 4 == 0 && i % 100 != 0 || i % 400 == 0)
//			printf("%dΪ����\n", i);
//		else
//			printf("%dΪƽ��\n", i);
//	}
//	system("pause");
//	return 0;
//}
//շת���:a= b;    b=c;    c=a%b;
#include <stdio.h>
int main(){
	int n = 100;
	int i;
	int sum = 1;
	for (i = 1; i <= n; i++){
		sum *= i;
	}
}
