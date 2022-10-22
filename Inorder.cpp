#include<iostream>
//Left Threaded Binary Tree
using namespace std;
struct node {
   int data;
   struct node *left;
   struct node *right;
   bool rightThread;
};
struct node* leftmost(struct node* n)
{
   if(n==NULL)
   {
      return NULL;
   }
   while(n -> left != NULL)
   {
       n = n->left;
       
   }
   return n;
}
struct node *createNode(int val) {
   struct node *temp = (struct node *)malloc(sizeof(struct node));
   temp->data = val;
   temp->left = temp->right = NULL;
   return temp;
}
void inorder(struct node *root) {
   struct node* root1 = leftmost(root);
    while(root1 != NULL) {
      cout<<root1->data<<" ";
      if(root1 -> rightThread)
      {
      root1 = root1 -> right;
      }
      else{
         root1 =  leftmost(root1->right);
      }
      // inorder(root->left);
      
    
   }
}
struct node* insertNode(struct node* node, int val) {
   if (node == NULL) return createNode(val);
   if (val < node->data)
   node->left = insertNode(node->left, val);
   else if (val > node->data)
   node->right = insertNode(node->right, val);
   return node;
}
int main() {
   struct node *root = NULL;
   root = insertNode(root, 4);
   insertNode(root, 5);
   insertNode(root, 2);
   insertNode(root, 9);
   insertNode(root, 1);
   insertNode(root, 3);
   cout<<"In-Order traversal of the Binary Search Tree is: ";
   inorder(root);
   return 0;
}


