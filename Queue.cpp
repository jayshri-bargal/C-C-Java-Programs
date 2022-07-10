//Queue in c++ in Generic
#include<iostream>
using namespace std;

template<class T>
struct node
{
    T data;
    struct node<T> *next;
};

template<class T>
class Queue
{
    private:
    struct node<T> *Head;
    int CountNode;
    public:
    Queue();
    void Enqueue(T);
    void Dequeue(); 
    void Display();
    int Count();
};

template<class T>
Queue<T>::Queue()
{
    Head=NULL;
    CountNode=0;
}
template<class T>
void Queue<T>::Enqueue(T no)
{
    struct node<T> *newn=NULL;
    newn=new node<T>;
    newn->data=no;
    newn->next=NULL;

    if(Head==NULL)
    {
        Head=newn;
    }
    else
    {
    struct node<T> *temp=Head;
    while(temp->next!=NULL)
    {
        temp=temp->next;
    }
    temp->next=newn;
    
    }
    CountNode++;
}

template<class T>
void Queue<T>::Dequeue()
{
    T no;
    if(CountNode==0)
    {
        cout<<"Queueis empty\n";
        return;
    }

    no=Head->data;
    struct node<T> *temp=Head;
    Head=Head->next;
    delete temp;
    CountNode--;
    cout<<"Removed element is "<<no<<endl;
}

template<class T>
void Queue<T>::Display()
{
    struct node<T> *temp=Head;
    while(temp!=NULL)
    {
        cout<<temp->data<<" ";
        temp=temp->next;
    }
    cout<<"\n";
}

template<class T>
int Queue<T>::Count()
{
    return CountNode;
}

int main()
{
    Queue <int> obj1;
    obj1.Enqueue(11);
    obj1.Enqueue(12);
    obj1.Enqueue(13);
    obj1.Enqueue(14);

    obj1.Display();
    cout<<"Number of nodes in Queue "<<obj1.Count()<<endl;
    obj1.Dequeue();
    obj1.Dequeue();
    obj1.Display();


}