//stack in C++ in Generic
#include<iostream>
using namespace std;
template<class T>
struct node
{
    T data;
    struct node *next;
};
template<class T>
class Stack
{
    private:
    struct node<T> *Head;
    int CountNode;
    public:
    Stack();
    void Push(T);
    void Pop();
    void Display();
    int Count();
};
template<class T>
Stack<T>::Stack()
{
    Head=NULL;
    CountNode=0;
}
template<class T>
void Stack<T>::Push(T no)
{
    struct node<T> *newn=NULL;
    newn=new node<T>;

    newn->data=no;
    newn->next=NULL;

    newn->next=Head;
    Head=newn;
    CountNode++;
}

template<class T>
void Stack<T>::Pop()
{
    T no;
    if(CountNode==0)
    {
        cout<<"Stack is empty"<<endl;
        return;
    }
   
   no = Head->data;
   struct node<T>*temp=Head;
   Head=Head->next;
   delete temp;
   cout<<"Removed element is :"<<no<<endl;

   CountNode--;
}
template<class T>
void Stack<T>::Display()
{
    struct node<T>*temp=Head;
    while(temp!=NULL)
    {
        cout<<"|"<<temp->data<<"|->";
        temp=temp->next;
    }
    cout<<"\n";

}
template<class T>
int Stack<T>::Count()
{
    return CountNode;
}

int main()
{
    Stack <int> obj1;
    obj1.Push(11);
    obj1.Push(21);
    obj1.Push(51);
    obj1.Push(111);
    obj1.Display();
    cout<<"Number of Nodes in Stack "<<obj1.Count()<<endl;

    obj1.Pop();
    obj1.Pop();
    obj1.Display();
     cout<<"Number of Nodes in Stack "<<obj1.Count()<<endl;

    obj1.Push(75);
    obj1.Pop();
     obj1.Display();
      cout<<"Number of Nodes in Stack "<<obj1.Count()<<endl;



}

