/*
Write a C++ program to demonstrate the usage of data manipulators(endl, ends, ws, flush, setw, setfill, setprecision)
*/
#include<iostream>
#include<iomanip>
#include<string>
void endluse()
{
    std::cout<<"endl use"<<std::endl;
    std::cout<<"Hi"<<std::endl;
    std::cout<<"Linux"<<std::endl;
    std::cout<<"            "<<std::endl;
}
void endsuse()
{
    std::cout<<"ends use"<<std::endl;
    std::cout<<"Hello"<<std::ends;
    std::cout<<"cpp this is venkat!"<<std::ends;
    std::cout<<"            "<<std::endl;
    std::cout<<"            "<<std::endl;
}
void wsuse()
{
    std::cout<<"ws use"<<std::endl;
    std::string name;
    std::cout<<"Enter your name : "<<std::endl;
    std::cin>>std::ws>>name;
    std::cout<<"Entered name is "<<name<<std::endl;
    std::cout<<"            "<<std::endl;
}
void flushuse()
{
    std::cout<<"flush use"<<std::endl;
    std::cout<<"Example of a flush"<<std::flush;
    std::cout<<"            "<<std::endl;
    std::cout<<"            "<<std::endl;
}
void setwuse()
{
    std::cout<<"setw use"<<std::endl;
    std::cout<<std::setw(5)<<1<<std::endl;
    std::cout<<std::setw(5)<<10<<std::endl;
    std::cout<<std::setw(5)<<100<<std::endl;
    std::cout<<"            "<<std::endl;
}
void setfilluse()
{
    std::cout<<"setfill use"<<std::endl;
    std::cout<<std::setfill('*')<<std::setw(5)<<1<<std::endl;
    std::cout<<std::setfill('#')<<std::setw(5)<<10<<std::endl;
    std::cout<<std::setfill('@')<<std::setw(5)<<100<<std::endl;
    std::cout<<"            "<<std::endl;
}
void setprecisionuse()
{
    std::cout<<"setprecision use"<<std::endl;
    std::cout<<std::setprecision(2)<<1.56788543334<<std::endl;
    std::cout<<std::setprecision(4)<<10.9366487<<std::endl;
    std::cout<<std::setprecision(5)<<100.8356458965<<std::endl;
    std::cout<<"            "<<std::endl;
}
int main()
{
    endluse();
    endsuse();
    wsuse();
    flushuse();
    setwuse();
    setfilluse();
    setprecisionuse();
    return 0;
}