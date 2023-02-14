#include <iostream>
using namespace std;

int main(){
    int x,y,m;

    cout<<"Enter 1st Number \n";
    cin>>x;
    cout<<"Enter 2st Number \n";
    cin>>y;

    cout<<"Enter the Operator +,- \n";
    char ch = ' ';
    cin>>ch;

    switch(ch)
    {
        case '+':
        {
               int sum = x+y;
               cout<<"Enter the Divisor \n";
               cin >> m;
               int flag=0;
               if(sum<0){
                flag=1;
               }
               int remainder = abs(sum);
              
               while(remainder >= m){
                        remainder = remainder - m;
               }
               if(flag==1){
                cout<<"Remainder of (x+y) % m = -"<<remainder<<endl;
                break;
               }
               cout<<"Remainder of (x+y) % m = "<<remainder<<endl;
               break;
        };

        case '-':
        {      int min = x-y;
               cout<<"Enter the Divisor \n";
               cin >> m;
               int flag=0;
               if(min<0){
                flag=1;
               }
               int remainder = abs(min);
               while(remainder >= m){
                        remainder -= min;
               }
               if(flag==1){
                cout<<"Remainder of (x-y) % m = -"<<remainder<<endl;
                break;
               }
               cout<<"Remainder of (x-y) % m = "<<remainder<<endl;
               break;
        };

        default:
        {
            cout<<"wrong input";
        }
    }
}
