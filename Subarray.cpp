#include <iostream>
using namespace std;

int main(){
  int size;
  cout<<"Enter the size \n";
  cin>>size;
  int numbers[size];

  cout << "Enter the numbers: " << endl;
  for (int i = 0; i < size; ++i) {
    cin >> numbers[i];
  }

  int maxsum = numbers[0];
  int current_sum = 0;
  int start_index = 0;
  int end_index = 0;

  for( int i=0; i<size ; i++){
    current_sum = 0;
    for( int j = i ; j<size;j++){
      current_sum += numbers[j];
      if (maxsum < current_sum){
        maxsum = current_sum;
        start_index = i;
        end_index = j;
      }
    }
  }
  
  cout << "The maximum subarray is: ";
  for(int i=start_index; i<=end_index ; i++){
      cout<< numbers[i]<<" ";
  }
  cout<<"with sum = "<<maxsum<<endl;

  int m;
  cout<<"Enter the divisor: ";
  cin>>m;
  cout<<"The remainder is "<<(maxsum - m * (maxsum / m))<<endl;

  return 0;
}
