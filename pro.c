#include<stdio.h>
#include<stdlib.h>
struct node
{
	int phno;
	float bal;
	char name;
	struct node*next;
};
struct node*head;
void create()
{
	struct node*new,*temp;
	new=(struct node*)malloc(sizeof(struct node));
	printf("enter name");
	scanf("%c",new->name);
	printf("enter mobile no\n");
	scanf("%d",&new->phno);
	printf("enter amt to be recharged\n");
	scanf("%f",&new->bal);
	new->next=NULL;
	if(head==NULL)
	head=new;
	else
	{
		temp=head;
		while(temp->next!=NULL)
		{
			temp=temp->next;
		}
		temp->next=new;
	}
}
void recharge(mobno)
{
	int cash;
	printf("enter amt to be added\n");
	scanf("%d",&cash);
	struct node*temp;
	if(head==NULL)
	{
		printf("no entries yet\n");
  }
  else if(head->phno==mobno)
  {
  	head->bal=head->bal+cash;
  }
  else
  {
  	temp=head;
  	do
  	{
  		temp=temp->next;
	  }while(temp->phno==mobno);
	  temp->bal=temp->bal+cash;
  }
}
void ride1(mobno)
{
	int tic;
	printf("250 and mas tickets 20");
	printf("enter no of tickets to buy\n");
	scanf("%d",&tic);
	struct node*temp;
	if(head==NULL)
	{
		printf("no card entries yet\n");
  }
  else if(head->phno==mobno)
  {
  	if(head->bal>=tic*250)
  	{
  		head->bal=head->bal-(tic*250);
	  }
	  else
	  {
	  	printf("insuffiecient balance\n");
	  }
  }
  else
  {
  	temp=head;
  	do
  	{
  		temp=temp->next;
	  }while(temp->phno==mobno);
	  if(temp->bal>=tic*250)
	  {
	  	head->bal=head->bal-(tic*250);
	  }
	  else
	  {
	  	printf("insufficient balance\n");
	  }
  }
}
  void display(mobno)
  {
  	struct node*temp;
  	int phno;
  	if(head==NULL)
  	{
  		printf("no entries yet\n ");
	  }
	  else if(head->phno==phno)
	  {
	  	printf("%c\n%d\n%f\n",head->name,head->phno,head->bal);
	  }
	  else
	  {
	  	temp=head;
	  	do
	  	{
	  		temp=temp->next;
		  }while(temp->phno==phno);
		  printf("%c\n%d\n%f\n",head->name,head->phno,head->bal);
	  }
  }
  void main()
  {
  	int m1,m2,m3,m4,choice;
  	do
  	{
  		printf("1create card\n2recharge card\n3check balance\n4book ride1\n5exit\n");
  		printf("enter your choice\n");
  		scanf("%d",&choice);
  		switch(choice)
  		{
  			case 1:create();break;
  			case 2:printf("enter mob no");
  					scanf("%d",&m1);
  					recharge(m1);break;
  			case 3:printf("enter mob no");
  					scanf("%d",&m2);
  					display(m2);break;
  			case 4:printf("enter mob no");
  					scanf("%d",&m3);
  					ride1(m3);break;
  			case 5:exit(1);break;
  			default :printf("wrong choice");
  						break;
		  }
	  }while(1);
  }


