//д����������������������в�����Ҫ�����֣��ҵ��˷����±꣬�Ҳ������� - 1.���۰���ң�
/*#include <stdio.h>
#include <stdlib.h>
int main() {
	int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
	//�����鳤��,Ȼ���ӡ�±�
	int num = 0;
	printf("������Ҫ���ҵ�����\n");
	scanf("%d", &num);
	int left = 0;
	int right = sizeof(arr) / sizeof(arr[0]) - 1;//�����������ұߵ��±�
	//�����������
	while (left <= right) {
		int mid = (left + right) / 2;
		if (num < arr[mid]){
			//��ʱӦ���������
			right = mid - 1;
			//��һ����Ϊ�м���mid�Ѿ����ҹ���,����ļ�һͬ��
		}
		else if (num > arr[mid]) {
			left = mid + 1;
			//��ʱӦ�����ұ߲���
		}
		else if (num = arr[mid]){
			printf("�ҵ���,Ԫ���±�Ϊ%d\n", mid);
			break;
		}
	}
	system("pause");
	return 0;
}*/