#include <stdio.h>
#include <stdlib.h>
int main() {
int i = 1;
while (i <= 3) {
int password = 666666;//正确密码
int inPut = 0;//用户输入的密码
printf(“请输入密码:\n”);
scanf("%d", &inPut);
if (inPut != password){
printf(“您的输入有误\n”);
i++;
}
else {
printf(“登录成功!\n”);
break;
}	
}
if (i > 3) {
printf(“登陆失败,即将退出程序!\n”);
}
system(“pause”);
return 0;
}
