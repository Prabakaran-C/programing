#include<stdio.h>
int main()
{
  int test;
  int pf;
  int hra;
  int da;
  int basic;
  int grade;
  int allowance;
  int total_salary;

  scanf("%d",&test);
  while(test--)
  {
    scanf("%d %d",&basic,&grade);
    hra=(basic*20)/100;
    da=(basic*250)/100;
    pf=(basic*11/100);

    switch (grade)
    {
      case 65:
        allowance=1700;
        break;
      case 66:
        allowance=1500;
        break;
      case 67:
        allowance=1300;
        break;
      default:
        allowance=0;
        break;
    }
    total_salary=basic+hra+da+(allowance-pf);
    printf("%d\n",total_salary);
  }
  return 0;
}