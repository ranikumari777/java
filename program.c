#include<stdio.h>

void f(&x)
{
    if(x>=3)
    {
        printf("%d",x);
        return;
    }
    x++;
    f(x);
    x++;
    f(x);
}
int main(){
    f(0);
    return 0;
}