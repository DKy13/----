//��дһ�����򣬿���һֱ���ռ����ַ��� �����Сд�ַ��������Ӧ�Ĵ�д�ַ���
//������յ��Ǵ�д�ַ����������Ӧ��Сд�ַ�����������ֲ������
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
