import java.util.Scanner;
import java.util.Arrays;
class Task13{
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        String []stn=new String[100];
        int []rl=new int[100];
        float []math=new float[100];
        float []sci=new float[100];
        float []eng=new float[100];
        float []lang=new float[100];
        float []ss=new float[100];
        float []total=new float[100];
        float []avg=new float[100];
        char  []grade=new char[100];
        System.out.println("The number of students");
        int n=obj.nextInt();
        for(int i=0;i<n;i++){
        System.out.println("Enter the student name");
        stn[i]=obj.next();
        System.out.println("Enter the his/her Roll NUmber");
        rl[i]=obj.nextInt();
        System.out.println("Enter the his/her Marks in math");
        math[i]=obj.nextFloat();
        System.out.println("Enter the his/her Marks in Science");
        sci[i]=obj.nextFloat();
        System.out.println("Enter the his/her Marks in English");
        eng[i]=obj.nextFloat();
        System.out.println("Enter the his/her Marks in Language");
        lang[i]=obj.nextFloat();
        System.out.println("Enter the his/her Marks in Social Studies");
        ss[i]=obj.nextFloat(); 
        }
        System.out.println();
        for(int j=0;j<n;j++){
        total[j]=(math[j]+sci[j]+eng[j]+lang[j]+ss[j]);
        avg[j]=total[j]/5;
        if(avg[j]>=95)
          grade[j]='A';
         else if(avg[j]>=80&&avg[j]<95)
          grade[j]='B';
         else if(avg[j]>=70&&avg[j]<80)
          grade[j]='C';
         else if(avg[j]>=60&&avg[j]<70)
          grade[j]='D';
         else if(avg[j]>=50&&avg[j]<60)
          grade[j]='E';
         else 
          grade[j]='F';
        } 
        System.out.println("Student name\t\tGrade\tTotal Marks\t\tAverage Marks");
        for(int j=0;j<n;j++){
          if(grade[j]=='F')
         System.out.println(stn[j]+"     \t\t"+grade[j]+"\t"+total[j]+"\t\t\t"+avg[j]);
          }
        for(int j=0;j<n;j++){
          if(grade[j]=='E')
          System.out.println(stn[j]+"     \t\t"+grade[j]+"\t"+total[j]+"\t\t\t"+avg[j]);
          }
        for(int j=0;j<n;j++){
          if(grade[j]=='D')
          System.out.println(stn[j]+"     \t\t"+grade[j]+"\t"+total[j]+"\t\t\t"+avg[j]);
        }
        for(int j=0;j<n;j++){
          if(grade[j]=='C')
          System.out.println(stn[j]+"     \t\t"+grade[j]+"\t"+total[j]+"\t\t\t"+avg[j]);
          }
        for(int j=0;j<n;j++){
           if(grade[j]=='B')
           System.out.println(stn[j]+"     \t\t"+grade[j]+"\t"+total[j]+"\t\t\t"+avg[j]);
            }
        for(int j=0;j<n;j++){
            if(grade[j]=='A')
           System.out.println(stn[j]+"     \t\t"+grade[j]+"\t"+total[j]+"\t\t\t"+avg[j]);
              }
           System.out.println("\nscore card for a student:\n");
            for(int j=0;j<n;j++){
            System.out.println("Name: "+stn[j]+"       Roll number: "+rl[j]);
            System.out.println("Subject Name          Marks");
            System.out.println("Math                  "+math[j]);
            System.out.println("Science               "+sci[j]);
            System.out.println("English               "+eng[j]);
            System.out.println("Language              "+lang[j]);
            System.out.println("Social Studies        "+ss[j]);
            System.out.println("          Total Marks:"+total[j]+" Grade: "+grade[j]);
            System.out.println();
            }      
           }
      }

         
           
         