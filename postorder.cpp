#include <iostream>
#include <vector>
#include <stack>

using namespace std;
int main() 
{
  stack< int, vector<int> > stckk; 
  stckk.push(2);
  stckk.push(21);
  stckk.push(45);
  stckk.push(76);
  cout <<"Top Element is "<<stckk.top() << endl;
  
  while(!stckk.empty())
   { stckk.pop();
     if(stckk.empty())
     cout << "The Stack is now Empty." << endl;
   } 
  return 0;
}
