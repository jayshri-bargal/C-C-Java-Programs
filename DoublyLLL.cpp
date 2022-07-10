//Doubly linear linked list in C++ using generic
#include<iostream>
using namespace std;
template<class T>
struct node
{
    T data;
    struct node *next;
    struct node *Prev;
};
template<class T>
class DoublyLL
{
    private:
    struct node<T>*Head;
    //struct node<T> *Prev;
    int CountNode;

    public:
    DoublyLL();
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
DoublyLL<T>::DoublyLL()
{
    Head=NULL;
    CountNode=0;
}
template<class T>
void DoublyLL<T>::InsertFirst(T no)
{
    struct node<T> *newn=NULL;
    newn=new node<T>;
    newn->data =no;
    newn->next=NULL;
    newn->Prev=NULL;

    if(Head==NULL)
    {
        Head=newn;
    }
    else
    {
        Head->Prev = newn;
        newn->next = Head;
        Head=newn;
    }
    CountNode++;
}
template<class T>
void DoublyLL<T>::InsertLast(T no)
{
    struct node<T> *newn=NULL;
    newn = new node<T>;
    newn->next=NULL;
    newn->data=no;
    newn->Prev=NULL;
    if(Head==NULL)
    {
        Head=newn;
    }
    else 
    {
        struct node<T>*temp=Head;
        while(temp->next!=NULL)
        {
            temp=temp->next;
        }
        temp->next=newn;
        newn->Prev=temp;
    }
    CountNode++;
}
template<class T>
void DoublyLL<T>::Display()
{
    struct node<T>*temp=Head;
    while(temp!=NULL)
    {
        cout<<"|"<<temp->data<<"|->";
        temp=temp->next;
    }
    cout<<"NULL"<<endl;
}
template<class T>
int DoublyLL<T>::Count()
{
    return CountNode;
}
template<class T>
void DoublyLL<T>::InsertAtPos(T no,int pos)
{
    struct node<T>*newn=NULL;
    newn=new node<T>;
    newn->next=NULL;
    newn->Prev=NULL;
    newn->data=no;

    if(Head==NULL)
    {
        return;
    }
    else if((pos<1) || (pos > CountNode+1))
    {
        cout<<"Invalid position"<<endl;
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
        if(newn==NULL)
        {
            return;
        }
        struct node<T>*temp=Head;
        for(int i=1; i<=(pos-2); i++)
        {
            temp = temp->next;
        }
        newn->next=temp->next;
        temp->next->Prev=newn;
        temp->next=newn;
        newn->Prev=temp;

        CountNode++;
    }
    
}
template<class T>
void DoublyLL<T>::DeleteFirst()
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
        struct node<T>*temp=Head;
        Head = Head->next;
        delete temp;
        Head->Prev=NULL;
    }
    CountNode--;
}
template<class T>
void DoublyLL<T>::DeleteLast()
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
        struct node<T>*temp=Head;
        while(temp->next!=NULL)
        {
            temp=temp->next;
        }
        temp->Prev->next=NULL;
        delete temp;
    }
    CountNode--;
}
template<class T>
void DoublyLL<T>::DeleteAtPos(int pos)
{
    if((Head==NULL) ||(pos > CountNode) || (pos < 1))
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
        struct node<T>*temp=Head;
        for(int i=1; i<=(pos-2); i++)
        {
            temp=temp->next;
        }
        temp->next=temp->next->next;
        delete temp->next->Prev;
        temp->next->Prev=temp;

         CountNode--;
    }

}
int main()
{
    DoublyLL <int> obj1;
    obj1.InsertFirst(51);
    obj1.InsertFirst(21);
    obj1.InsertFirst(11);
    obj1.InsertLast(110);
    obj1.InsertLast(111);
    obj1.Display();
    cout<<"Number of Nodes are: "<<obj1.Count()<<endl;
    obj1.InsertAtPos(75,4);
    obj1.Display();
    cout<<"Number of Nodes are: "<<obj1.Count()<<endl;

    obj1.DeleteFirst();
     obj1.Display();
    cout<<"Number of Nodes are: "<<obj1.Count()<<endl;

    obj1.DeleteLast();
    obj1.Display();
    cout<<"Number of Nodes are: "<<obj1.Count()<<endl;

    obj1.DeleteAtPos(3);
    obj1.Display();
    cout<<"Number of Nodes are: "<<obj1.Count()<<endl;

    
    DoublyLL <float> obj2;
    obj2.InsertFirst(51.11);
    obj2.InsertFirst(21.11);
    obj2.InsertFirst(11.11);
    obj2.InsertLast(110.11);
    obj2.InsertLast(111.11);
    obj2.Display();
    cout<<"Number of Nodes are: "<<obj2.Count()<<endl;
    obj2.InsertAtPos(75.11,4);
    obj2.Display();
    cout<<"Number of Nodes are: "<<obj2.Count()<<endl;

    obj2.DeleteFirst();
    obj2.Display();
    cout<<"Number of Nodes are: "<<obj2.Count()<<endl;

    obj2.DeleteLast();
    obj2.Display();
    cout<<"Number of Nodes are: "<<obj2.Count()<<endl;

    obj2.DeleteAtPos(3);
    obj2.Display();
    cout<<"Number of Nodes are: "<<obj2.Count()<<endl;

    
    DoublyLL <char> obj3;
    obj3.InsertFirst('A');
    obj3.InsertFirst('B');
    obj3.InsertFirst('C');
    obj3.InsertLast('D');
    obj3.InsertLast('E');
    obj3.Display();
    cout<<"Number of Nodes are: "<<obj3.Count()<<endl;
    obj3.InsertAtPos('F',4);
    obj3.Display();
    cout<<"Number of Nodes are: "<<obj3.Count()<<endl;

    obj3.DeleteFirst();
     obj3.Display();
    cout<<"Number of Nodes are: "<<obj3.Count()<<endl;

    obj3.DeleteLast();
    obj3.Display();
    cout<<"Number of Nodes are: "<<obj3.Count()<<endl;

    obj3.DeleteAtPos(3);
    obj3.Display();
    cout<<"Number of Nodes are: "<<obj3.Count()<<endl;



 return 0;
    

}