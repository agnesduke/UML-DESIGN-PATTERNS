package Patronsdestructuration.Adapter.Pile.Heritage;

import Patronsdestructuration.Adapter.Pile.association.Stack;

public class DListImpStack extends DList implements Stack, Patronsdestructuration.Adapter.Pile.Heritage.Stack{
    @Override
    public void push(Object o){
        insertHead(o);
    }

    @Override
    public Object pop(){
        return removeHead();
    }

    @Override
    public Object top(){
        return this.getHead();
    }
}
