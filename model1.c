#include <stdio.h>
#include <stdlib.h>
#include <conio.h>


typedef struct person{
	char name[20];
	struct person *father;
	struct person *son[10];
	int num;
//	int age;
}person;

int TransInTxt(void *MemoryBlock){
	FILE *fp;
	if((fp=fopen("person.txt","r")) == NULL){
		printf("不能打开文件  ！\n");
		// getch();
		// exit(1);
		return(0);
	}

	int i=0;
	int temp=0,temp1=0;
	int CheckTheData=0;
	person *index=(person *)MemoryBlock;

	char CheckTheTxt;
	CheckTheTxt=fgetc(fp);
	if(CheckTheTxt==EOF){    
		printf("the txt is empty!!\n");
		return(2);
	}
	rewind(fp);
	fscanf(fp,"%s %d\n",index[i].name,&index[i].num);
	index[i].father=NULL;
	for(int k=0;k<10;k++){index[i].son[k]=NULL;}
	CheckTheData=index[i].num;

	while(!feof(fp)){
	//	fscanf(fp,"%s %d %d %s\n",index[i].name,&index[i].num);
		for(temp=0;temp<index[i].num;temp++){
			if(feof(fp)){
				printf("the data was broken!!\n");
				return(0);
			}
			fscanf(fp,"%s %d\n",index[i+temp+temp1+1].name,&index[i+temp+temp1+1].num);
			index[i+temp+temp1+1].father=&index[i];
			for(int j=0;j<10;j++){index[i+temp+temp1+1].son[j]=NULL;}
			CheckTheData=CheckTheData+index[i+temp+temp1+1].num-1;    // check the son's num 
			for(int s=0;s<10;s++){
				if(index[i].son[s]==NULL){
					index[i].son[s]=&index[i+temp+temp1+1];
					break;
				}
			}
		}
		temp1=temp1+index[i].num-1;
		i++;
	}
	if(CheckTheData!=0){
		printf("the txt's data maybe is wrong!!\n");
	}
	fclose(fp);
	return(1);
}
// void InitPoint(person *p){
// 	for(int i=0;i<10;i++,p++){
// 		p=NULL;
// 	}
// }
int  TransOutTxtRecursion(FILE *fp,person *father);
int TransOutTxt(person *root){
	FILE *fp;
	if((fp=fopen("person.txt","wb+")) == NULL){
		printf("不能打开文件 ，按任意键退出 ！");
		getch();
		exit(1);
	}
	if(root==NULL){
		printf("this is a txt with no data!\n");
		return(2);
	}
	fprintf(fp,"%s %d\n",root->name,root->num);
	TransOutTxtRecursion(fp,root);
	fclose(fp);
	return(1);
}
int  TransOutTxtRecursion(FILE *fp,person *father){
	if(father==NULL){
		return(0);
	}
//	fprintf(fp,"%s %d\n",father->name,father->num);
	int s;
	for(s=0;s<10;s++){
		if(father->son[s]!=NULL){
			fprintf(fp,"%s %d\n",father->son[s]->name,father->son[s]->num);   //   this  maybe has some problems:son[s]->num 
		}
	}
	for(s=0;s<10;s++){
		if(father->son[s]!=NULL){
			TransOutTxtRecursion(fp,father->son[s]);
		}
	}
	return(1);
}
void main(){

	person tree[100];
	person *root;
	int OpenStatus=-1;
	OpenStatus=TransInTxt(tree);
	switch(OpenStatus){
		case -1: printf("the program's function isn't returned with worth value!\n");
				 printf("按任意键退出 ！\n"); 
				 getch();
				 exit(1);
		case 0:  printf("the txt isn't exist!!\n");
				 break;
	    case 1: root=tree;
	    		TransOutTxt(root);
	    		printf("flag\n");
	    		break;
	    case 2:  printf("the txt is empty!!\n");
	            break;
	}


}