#include <stdio.h>

int main()
{
	int tc,n,m,sp,d1,d2,d3,prev,prev_price;
	int cost;

   scanf("%d",&tc);
   for(int i=0;i<tc;i++){
   	scanf("%d %d",&n,&m);
   	for(int j=0;j<n;j++)
   	{
   		for(int k=0;k<m;k++){
   		cost=1000;
   		scanf("%d %d %d",&d1,&d2,&d3);
   		int disc_price=((100-d1)*cost)/100;
   		disc_price=((100-d2)*disc_price)/100;
   			disc_price=((100-d3)*disc_price)/100;
   			if(k==0){
   			prev=k+1;
   			prev_price=disc_price;
   				
   			}
   			if(prev_price>disc_price){
   			 prev=k+1;
   			 	prev_price=disc_price;
   			}
   		}
   		printf("%d ",prev);
   	}
   	printf("\n");
   }
    return 0;
}
