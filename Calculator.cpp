#include<iostream>
int main()
{
    double n1,n2;
    std::cout<<"Enter two numbers : "<<std::endl;
    std::cin>>n1>>n2;
    std::cout<<"1.Addition\n2.Subtraction\n3.Multiplication\n4.Division"<<std::endl;
    int choice;
    std::cout<<"Enter your choice(1-4) : "<<std::endl;
    std::cin>>choice;
    switch(choice)
        {
            case 1:
                std::cout<<"Addition of "<<n1<<" and "<<n2<<" is "<<(n1+n2)<<std::endl;
                break;
            case 2:
                std::cout<<"Subtraction of "<<n1<<" and "<<n2<<" is "<<(n1-n2)<<std::endl;
                break;
            case 3:
                std::cout<<"Multiplication of "<<n1<<" and "<<n2<<" is "<<(n1*n2)<<std::endl;
                break;
            case 4:
                switch((int)n2)
                {
                    case 0:
                        std::cout<<"Can't divide by zero!"<<std::endl;
                        break;
                    default:
                        std::cout<<"Division of "<<n1<<" and "<<n2<<" is "<<(n1/n2)<<std::endl;
                        break;
                }
                break;
            default:
                std::cout<<"Enter a valid choice!"<<std::endl;
                break;
        }
}