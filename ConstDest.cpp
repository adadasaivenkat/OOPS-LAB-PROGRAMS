#include<iostream>
#include<string>
using namespace std;
class Student
{
    private:
        string S_fullName;
        int S_rollNum;
        double S_semPercentage;
        string S_collegeName;
        int S_collegeCode;
    public:
        //Constructor
        Student(string fullName,int rollNum,double semPercentage,string collegeName,int collegeCode)
        {
            S_fullName=fullName;
            S_rollNum=rollNum;
            S_semPercentage=semPercentage;
            S_collegeName=collegeName;
            S_collegeCode=collegeCode;

            cout<<"Student object created."<<endl;
        }
        //Destructor
        ~Student()
        {
            cout<<"Student object destroyed."<<endl;
        }
        void display()
        {
            cout<<"STUDENT DETAILS"<<endl;
            cout<<"Student full name : "<<S_fullName<<endl;
            cout<<"Student roll number : "<<S_rollNum<<endl;
            cout<<"Student sem percentage : "<<S_semPercentage<<endl;
            cout<<"Student college name : "<<S_collegeName<<endl;
            cout<<"Student college code : "<<S_collegeCode<<endl;
        }
};
int main()
{
    string fullName;
    int rollNum;
    double semPercentage;
    string collegeName;
    int collegeCode;
    cout<<"Enter student's full name : ";
    getline(cin,fullName);
    cout<<"Enter student's roll number : ";
    cin>>rollNum;
    cout<<"Enter student's sem percentage : ";
    cin>>semPercentage;
    cin.ignore();   //Ignore the newline character left in the input buffer
    cout<<"Enter student's college name : ";
    getline(cin,collegeName);
    cout<<"Enter student's college code : ";
    cin>>collegeCode;
    Student s1(fullName,rollNum,semPercentage,collegeName,collegeCode);
    s1.display();

    return 0;
}