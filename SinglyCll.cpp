//Singly Circular Linked List in C++ using Generic.
#include<iostream>
using namespace std;

template<class T>
struct node
{
    T data;
    struct node *next;
};

template<class T>
class SinglyCLL
{
    private:
    struct node<T> *Head;
    struct node<T> *Tail;
    int CountNode;
    public:
    SinglyCLL();
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
SinglyCLL<T>:: SinglyCLL()
{
    Head=NULL;
    Tail=NULL;
    CountNode=0;
}
template<class T>
void SinglyCLL<T>::InsertFirst(T no)
{
    struct node<T> *newn=NULL;
    newn=new node<T>;
    newn->data = no;
    newn->next = NULL;
    if((Head==NULL) &&(Tail==NULL))
    {
        Head=newn;
        Tail=newn;
    }
    else
    {
        newn->next=Head;
        Head=newn;
    }
    Tail->next=Head;
    CountNode++;
}

template<class T>
void SinglyCLL<T>::InsertLast(T no)
{
    struct node<T> *newn=NULL;
    newn= new node<T>;
    newn->next=NULL;
    newn->data=no;

    if((Head==NULL) && (Tail==NULL))
    {
        Head=newn;
        Tail=newn;
    }
    else
    {
        Tail->next=newn;
        Tail=newn;
    }
    Tail->next=Head;
    CountNode++;
}

template<class T>
void SinglyCLL<T>::InsertAtPos(T no,int pos)
{
    struct node<T> *newn=NULL;
    newn=new node<T>;
    newn->data=no;
    newn->next=NULL;
    if((pos<=0)||(pos > CountNode+1))
    {
        cout<<"Invalid position"<<endl;
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
            temp = temp->next;
        }
        newn->next=temp->next;
        temp->next=newn;

        CountNode++;
    }
    

}
template<class T>
void SinglyCLL<T>::DeleteFirst()
{
    if((Head==NULL) && (Tail==NULL))
    {
        return;
    }
    else if(Head==Tail)
    {
        delete Head;
        Head=NULL;
        Tail=NULL;
    }
    else
    {
        Head=Head->next;
        delete Tail->next;
        Tail->next=Head;
    }
    CountNode--;
}
template<class T>
void SinglyCLL<T>::DeleteLast()
{
    if((Head==NULL) && (Tail==NULL))
    {
        return;
    }
    else if(Head==Tail)
    {
        delete Head;
        Head=NULL;
        Tail=NULL;
    }
    else
    {
        struct node<T> *temp=Head;
        while(temp->next!=Tail)
        {
            temp=temp->next;
        }
        delete Tail;
        Tail=temp;
        Tail->next=Head;
    }
    CountNode--;
}
template<class T>
void SinglyCLL<T>::DeleteAtPos(int pos)
{
    if((pos < 1) || (pos > CountNode+1))
    {
        cout<<"Invalid Position "<<endl;
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
        struct node<T> *temp2=NULL;
        for(int i=1; i<=(pos-2); i++)
        {
            temp=temp->next;
        }
        temp2=temp->next;
        temp->next=temp2->next;
        delete temp2;

        CountNode--;
    }
    
}

template<class T>
void SinglyCLL<T>::Display()
{
    struct node<T> *temp=Head;

    if((Head==NULL) && (Tail==NULL))
    {
        return;
    }
    do
    {
        cout<<"|"<<temp->data<<"|-> ";
        temp=temp->next;
    }
    while(temp!=Head);
    
    cout<<endl;
    
}
template<class T>
int SinglyCLL<T>::Count()
{
return CountNode;
}




int main()
{
    SinglyCLL <int> obj1;
    obj1.InsertFirst(11);
    obj1.InsertFirst(21);
    obj1.InsertFirst(51);
    obj1.InsertLast(111);
    obj1.InsertLast(121);
    obj1.Display();
    cout<<"number of nodes are "<<obj1.Count()<<endl;

    obj1.InsertAtPos(75,3);
    obj1.Display();
    cout<<"number of nodes are "<<obj1.Count()<<endl;
    obj1.DeleteAtPos(3);
    obj1.Display();
    cout<<"number of nodes are "<<obj1.Count()<<endl;
    obj1.DeleteFirst();
    obj1.Display();
    cout<<"number of nodes are "<<obj1.Count()<<endl;
    obj1.DeleteLast();
    obj1.Display();
    cout<<"number of nodes are "<<obj1.Count()<<endl;

    SinglyCLL <float> obj2;
    obj2.InsertFirst(11.11);
    obj2.InsertFirst(21.21);
    obj2.InsertFirst(51.11);
    obj2.InsertLast(111.33);
    obj2.InsertLast(121.11);
    obj2.Display();
    cout<<"number of nodes are "<<obj2.Count()<<endl;

    obj2.InsertAtPos(75.21,3);
    obj2.Display();
    cout<<"number of nodes are "<<obj2.Count()<<endl;
    obj2.DeleteAtPos(3);
    obj2.Display();
    cout<<"number of nodes are "<<obj2.Count()<<endl;
    obj2.DeleteFirst();
    obj2.Display();
    cout<<"number of nodes are "<<obj2.Count()<<endl;
    obj2.DeleteLast();
    obj2.Display();
    cout<<"number of nodes are "<<obj2.Count()<<endl;

    SinglyCLL <string> obj3;
    obj3.InsertFirst("Jayashree");
    obj3.InsertFirst("shivansh");
    obj3.InsertFirst("Ashwni");
    obj3.InsertLast("Priyanka");
    obj3.InsertLast("Dnyanesh");
    obj3.Display();
    cout<<"number of nodes are "<<obj3.Count()<<endl;
   
    obj3.InsertAtPos("virat",3);
    obj3.Display();
    cout<<"number of nodes are "<<obj3.Count()<<endl;
    obj3.DeleteAtPos(3);
    obj3.Display();
    cout<<"number of nodes are "<<obj3.Count()<<endl;
    obj3.DeleteFirst();
    obj3.Display();
    cout<<"number of nodes are "<<obj3.Count()<<endl;
    obj3.DeleteLast();
    obj3.Display();
    cout<<"number of nodes are "<<obj3.Count()<<endl;
    
   
   
   


}