#include<stdio.h>
#include<conio.h>
int b;
int ea(int n,int m,int k)
{
	m=k;
    if(n==1)
    {
    	return b+1; 
    }
    else
    {
        b=b+n;
        n=n-(n*m/100);
        ea(n,m,k);
    }
}
void main()
{
int n,m,d,i,k;
scanf("%d %d",&n,&m);
k=m;
d=ea(n,m,k);
printf("%d\n",d);
}
