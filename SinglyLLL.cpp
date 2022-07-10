//Singly linear linked list in C++ using Generic
#include<iostream>
using namespace std;
template <class T>
struct node
{
    T data;
    struct node *next;
};

template<class T>
class SinglyLL
{
    private:
    struct node<T> * Head;
    int CountNode;
    public:
    SinglyLL();
    void InsertFirst(T);
    void InsertLast(T);
    void Display();
    int Count();
    void InsertAtPos(T,int);
    void DeleteFirst();
    void DeleteLast();
    void DeleteAtPos(int);     
    
};
template<class T>
SinglyLL<T>::SinglyLL()
{
    Head = NULL;
    CountNode = 0;
}
template<class T>
void SinglyLL<T>::InsertFirst(T no)
{
    struct node<T> *newn=NULL;
    newn = new  node<T>;
    newn->data=no;
    newn->next=NULL;

    if(Head==NULL)
    {
        Head = newn;
    }
    else
    {
        newn->next = Head;
        Head = newn;
    }
    CountNode++;
}

template<class T>
void SinglyLL<T>::InsertLast(T no)
{
    struct node<T> *newn=NULL;
    newn = new node<T>;
    newn->data = no;
    newn->next = NULL;
    if(Head == NULL)
    {
        Head=newn;
    }
    else
    {
        struct node<T> * temp =Head;
        while(temp->next!=NULL)
        {
            temp = temp->next;
        }
        temp->next=newn;
        newn->next = NULL;
    }
    CountNode++;
}
template<class T>
void SinglyLL<T>::Display()
{
    struct node<T> *temp=Head;
    cout<<"Elements form the Linked list are  "<<endl;
    while(temp!=NULL)
    {
        cout<<"|"<<temp->data<<"|-> ";
        temp=temp->next;
    }
    cout<<"NULL"<<endl;
}
template<class T>
int SinglyLL<T>::Count()
{
    return CountNode;
}
template<class T>
void SinglyLL<T>::InsertAtPos(T no,int pos)
{
    struct node<T> *newn =NULL;
    newn = new node<T>;
    newn->data = no;
    newn->next =NULL;

    if((Head==NULL) || (pos<=0)||(pos>CountNode+1))
    {
        return;
    }
    else if(pos==1)
    {
        InsertFirst(no);
    }
    else if(pos==CountNode+1)
    {
        InsertLast(no);
    }
    else
    {
        struct node<T> *temp=Head;
        for(int i=1; i<=(pos-2); i++)
        {
            temp=temp->next;
        }
        newn->next =temp->next;
        temp->next=newn;

        CountNode++;
    }

}
template<class T>
void SinglyLL<T>::DeleteFirst()
{
    if(Head==NULL)
    {
        return;
    }
    else
    {
        struct node<T>*temp=Head;
        Head=temp->next;
        delete temp;
    }
    CountNode--;
}
template<class T>
void SinglyLL<T>::DeleteLast()
{
    if(Head==NULL)
    {
        return;
    }
    else if(Head->next==NULL)
    {
        delete Head;
        Head=NULL;
    }
    else
    {
        struct node<T> *temp=Head;
        struct node<T> *temp2= NULL;
        while(temp->next->next!=NULL)
        {
            temp=temp->next;
        }
        temp2 = temp->next;
        temp->next=NULL;
        delete temp2;
    CountNode--;
    }
}
template<class T>
void SinglyLL<T>::DeleteAtPos(int pos)
{
    if((pos<=0)||( pos > CountNode))
    {
        return;
    }
    else if(pos==1)
    {
        DeleteFirst();
    }
    else if(pos==CountNode)
    {
        DeleteLast();
    }
    else
    {
        struct node<T> *temp=Head;
        struct node<T> *temp1=NULL;

        for(int i=1; i<= (pos-2); i++)
        {
            temp=temp->next;
        }
        temp1=temp->next;
        temp->next=temp->next->next;
        delete temp1;
        CountNode--;
    }
}

int main()
{
    SinglyLL <int> obj1;
    obj1.InsertFirst(11);
    obj1.InsertFirst(21);
    obj1.InsertFirst(51);
    obj1.InsertLast(101);
    obj1.InsertLast(111);
    obj1.Display();
    cout<<"Number of nodes are  "<<obj1.Count()<<endl;

    obj1.InsertAtPos(121,2);
    obj1.Display();
    cout<<"Number of nodes are  "<<obj1.Count()<<endl;

    obj1.DeleteFirst();
    obj1.DeleteLast();
    obj1.Display();
    cout<<"Number of nodes are  "<<obj1.Count()<<endl;
    obj1.DeleteAtPos(2);
     obj1.Display();
    cout<<"Number of nodes are  "<<obj1.Count()<<endl;
    
     SinglyLL <float> obj2;
    obj2.InsertFirst(11.11);
    obj2.InsertFirst(21.11);
    obj2.InsertFirst(51.21);
    obj2.InsertLast(101.33);
    obj2.InsertLast(111.32);
    obj2.Display();
    cout<<"Number of nodes are  "<<obj2.Count()<<endl;

    obj2.InsertAtPos(121.33,2);
    obj2.Display();
    cout<<"Number of nodes are  "<<obj2.Count()<<endl;

    obj2.DeleteFirst();
    obj2.DeleteLast();
    obj2.Display();
    cout<<"Number of nodes are  "<<obj2.Count()<<endl;
    obj2.DeleteAtPos(2);
     obj2.Display();
    cout<<"Number of nodes are  "<<obj2.Count()<<endl;

    SinglyLL <char> obj3;
    obj3.InsertFirst('A');
    obj3.InsertFirst('B');
    obj3.InsertFirst('C');
    obj3.InsertLast('D');
    obj3.InsertLast('E');
    obj3.Display();
    cout<<"Number of nodes are  "<<obj3.Count()<<endl;

    obj3.InsertAtPos('F',2);
    obj3.Display();
    cout<<"Number of nodes are  "<<obj3.Count()<<endl;

    obj3.DeleteFirst();
    obj3.DeleteLast();
    obj3.Display();
    cout<<"Number of nodes are  "<<obj3.Count()<<endl;
    obj3.DeleteAtPos(2);
    obj3.Display();
    cout<<"Number of nodes are  "<<obj3.Count()<<endl;





}