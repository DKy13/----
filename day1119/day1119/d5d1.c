//��ɲ�������Ϸ
/*#include <stdio.h>
#include <stdlib.h>
//#define _CRT_SECURE_NO_WARNINGS 
int Menu() {
	printf("��Ϸ��ʼ\n");
	printf("1.��ʼ��Ϸ\n");
	printf("0.������Ϸ\n");
	printf("����������ѡ��:\n");
	int choice = 0;
	scanf("%d", &choice);
	return choice;
}
void Game() {
	//1.����rand��������һ�������(1~100)
	int toGuess = rand() % 100 + 1;
	//rand���ɵ����Ƚϴ�
	while (1) {
			//2.��ʾ�û���һ����
			printf("���������²������(1~100):\n");
			int num = 0;
			scanf("%d", &num);
			//3.�����û��µ���,��ʾ���ǲ¸���,���ǲµ���
			if (num < 1 || num>100) {
				printf("������������,���ַ�Χ��1~100Ӵ\n");
			}else if (num < toGuess) {
				printf("����\n");
			}
			else if (num > toGuess){
				printf("����\n");
			}
			else if (num == toGuess){
				printf("�¶���\n");
				break;
			}
		}
	}
	
int main() {
	srand(time(0));//srand���������Ϊ�����,rand��ʵΪα���
	while (1){
		int choice = Menu();
		if (choice == 1){
			//��ʼһ����Ϸ
			Game(); 
		}else if (choice == 0) {
			printf("GoodBye!\n");
			break;
		}else {
			printf("������������!");
			
		}
	}
	system("pause");
	return 0;
}*/