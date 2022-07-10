//Doubly Circular Linked list in c++ in Generic
#include<iostream>
using namespace std;

template<class T>
struct node
{
  T data;
  struct node *next;
  struct node *prev;
};
template<class T>
class DoublyCLL
{
    private:
    struct node<T>*Head;
    struct node<T>*Tail;
    int CountNode;
    public:
    DoublyCLL();
    void InsertFirst(T);
    void InsertLast(T);
    void InsertAtPos(T,int);
    void Display();
    int Count();
    void DeleteFirst();
    void DeleteLast();
    void DeleteAtPos(int);
};
template<class T>
DoublyCLL<T>::DoublyCLL()
{
    Head=NULL;
    Tail=NULL;
    CountNode=0;
}

template<class T>
void DoublyCLL<T>::InsertFirst(T no)
{
    struct node<T>*newn=NULL;
    newn=new node<T>;
    newn->next=NULL;
    newn->prev=NULL;
    newn->data=no;

    if(CountNode==0)
    {
        Head=newn;
        Tail=newn;
    }
    else
    {
        newn->next=Head;
        Head->prev=newn;
        Head=newn;
    }

    Head->prev=Tail;
    Tail->next=Head;
    CountNode++;
}

template<class T>
void DoublyCLL<T>::InsertLast(T no)
{
     struct node<T>*newn=NULL;
    newn=new node<T>;

    newn->next=NULL;
    newn->prev=NULL;
    newn->data=no;

    if(CountNode==0)      //if (CountNode==0)
    {
        Head=newn;
        Tail=newn;
    }
    else
    {
        Tail->next=newn;
        newn->prev=Tail;
        Tail=newn;
    }
    
    Head->prev=Tail;
    Tail->next=Head;

    CountNode++;
}
template<class T>
void DoublyCLL<T>::InsertAtPos(T no,int pos)
{
    if((CountNode==0) || (pos<1)||(pos > CountNode+1))
    {
        return;
    }
    else if(pos==1)
    {
        InsertFirst(no);
    }
    else if(pos==CountNode)
    {
        InsertLast(no);
    }
    else
    {
    struct node<T>*newn=NULL;
    newn=new node<T>;

    newn->next=NULL;
    newn->prev=NULL;
    newn->data=no;

    struct node<T>*temp=Head;
    for(int i=1; i<=(pos-2); i++)  //i<pos-1
    {
        temp=temp->next;
    }
    newn->next=temp->next;
    temp->next->prev=newn;
    temp->next=newn;
    newn->prev=temp;
   
    CountNode++;

    }
}

template<class T>
void DoublyCLL<T>::DeleteFirst()
{
    if(CountNode==0)
    {
        return;
    }
    else if(Head->next==Tail)
    {
        delete Head;
        Head=NULL;
        Tail=NULL;
    }
    else
    {
        Head=Head->next;
        delete Tail->next;
    }

    Tail->next=Head;
    Head->prev=Tail;

    CountNode--;
}

template<class T>
void DoublyCLL<T>::DeleteLast()
{
    if(CountNode==0)
    {
        return;
    }
    if(CountNode==1)
    {
        delete Head;
        Head=NULL;
        Tail=NULL;
    }
    else
    {
        Tail=Tail->prev;
        delete Tail->next;
    }
    Head->prev=Tail;
    Tail->next=Head;

    CountNode--;
}

template<class T>
void DoublyCLL<T>::DeleteAtPos(int pos)
{
    if((pos < 1) || (pos > CountNode))
    {
        cout<<"Invalid Position\n";
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
        delete temp->next->prev;
        temp->next->prev=temp;
        CountNode--;
    }

}

template<class T>
void DoublyCLL<T>::Display()
{
    struct node<T>*temp=Head;
    for(int i=1; i<=CountNode; i++,temp=temp->next)
    {
        cout<<"|"<<temp->data<<"|->";
    }
    cout<<endl;
}
template<class T>
int DoublyCLL<T>::Count()
{
    return CountNode;
}


int main()
{
    DoublyCLL <int> obj1;
    obj1.InsertFirst(11);
    obj1.InsertFirst(21);
    obj1.InsertFirst(51);
    obj1.InsertLast(101);
    obj1.InsertLast(121);
    obj1.Display();
    cout<<"Number of Nodes Are :"<<obj1.Count()<<endl;

    obj1.InsertAtPos(75,3);
    obj1.Display();
    cout<<"Number of Nodes Are :"<<obj1.Count()<<endl;

    obj1.DeleteFirst();
    obj1.Display();
    cout<<"Number of Nodes Are :"<<obj1.Count()<<endl;

    obj1.DeleteLast();
    obj1.Display();
    cout<<"Number of Nodes Are :"<<obj1.Count()<<endl;

    obj1.DeleteAtPos(3);
    obj1.Display();
    cout<<"Number of Nodes Are :"<<obj1.Count()<<endl;

     DoublyCLL <float> obj2;
    obj2.InsertFirst(11.11);
    obj2.InsertFirst(21.11);
    obj2.InsertFirst(51.11);
    obj2.InsertLast(101.11);
    obj2.InsertLast(121.11);
    obj2.Display();
    cout<<"Number of Nodes Are :"<<obj2.Count()<<endl;

    obj2.InsertAtPos(75,3);
    obj2.Display();
    cout<<"Number of Nodes Are :"<<obj2.Count()<<endl;

    obj2.DeleteFirst();
    obj2.Display();
    cout<<"Number of Nodes Are :"<<obj2.Count()<<endl;

    obj2.DeleteLast();
    obj2.Display();
    cout<<"Number of Nodes Are :"<<obj2.Count()<<endl;

    obj2.DeleteAtPos(3);
    obj2.Display();
    cout<<"Number of Nodes Are :"<<obj2.Count()<<endl;

     DoublyCLL <char> obj3;
    obj3.InsertFirst('w');
    obj3.InsertFirst('E');
    obj3.InsertFirst('R');
    obj3.InsertLast('S');
    obj3.InsertLast('F');
    obj3.Display();
    cout<<"Number of Nodes Are :"<<obj3.Count()<<endl;

    obj3.InsertAtPos(75,3);
    obj3.Display();
    cout<<"Number of Nodes Are :"<<obj3.Count()<<endl;

    obj3.DeleteFirst();
    obj3.Display();
    cout<<"Number of Nodes Are :"<<obj3.Count()<<endl;

    obj3.DeleteLast();
    obj3.Display();
    cout<<"Number of Nodes Are :"<<obj3.Count()<<endl;

    obj3.DeleteAtPos(3);
    obj3.Display();
    cout<<"Number of Nodes Are :"<<obj3.Count()<<endl;






    return 0; 

}