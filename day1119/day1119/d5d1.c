//完成猜数字游戏
/*#include <stdio.h>
#include <stdlib.h>
//#define _CRT_SECURE_NO_WARNINGS 
int Menu() {
	printf("游戏开始\n");
	printf("1.开始游戏\n");
	printf("0.结束游戏\n");
	printf("请输入您的选择:\n");
	int choice = 0;
	scanf("%d", &choice);
	return choice;
}
void Game() {
	//1.利用rand函数生成一个随机数(1~100)
	int toGuess = rand() % 100 + 1;
	//rand生成的数比较大
	while (1) {
			//2.提示用户猜一个数
			printf("请输入您猜测的数字(1~100):\n");
			int num = 0;
			scanf("%d", &num);
			//3.根据用户猜的数,提示他是猜高了,还是猜低了
			if (num < 1 || num>100) {
				printf("您的输入有误,数字范围是1~100哟\n");
			}else if (num < toGuess) {
				printf("低了\n");
			}
			else if (num > toGuess){
				printf("高了\n");
			}
			else if (num == toGuess){
				printf("猜对了\n");
				break;
			}
		}
	}
	
int main() {
	srand(time(0));//srand的随机种子为真随机,rand其实为伪随机
	while (1){
		int choice = Menu();
		if (choice == 1){
			//开始一局游戏
			Game(); 
		}else if (choice == 0) {
			printf("GoodBye!\n");
			break;
		}else {
			printf("您的输入有误!");
			
		}
	}
	system("pause");
	return 0;
}*/