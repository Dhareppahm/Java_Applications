/* 
* @Author:Dhareppa Metri
* File:StackImpl.java
* Date:14/10/2016
* Purpose:Stack implementation with resizeable type[push(),pop(),peek(),isEmpty(),getSize()].
**/
import com.bridgelabz.java.StackImpl;
class StackImpl{
	private Object mOb[];
	int mCpy,mTop;
	/*This default constrctor is used to create the Object type array and
	* initialize the stack  size.
	**/
	StackImpl(){
		mOb=new Object[10];
		mCpy=5;
		mTop=-1;
	}
	/*
	* This method is used to add the objects into the stack.
	* @param Object is the parameter for this method
	* @return boolean,true if the element is added to stack else false.
	**/
	public boolean push(Object mOb){
		if(mTop<mCpy-1){
			mTop++;
			mOb[mTop]=obj;
			return true;
		}
		else{
			mCpy=mCpy+5;
			Object nob[]=new Object[mCpy];
			for(int i=0;i<mOb.length;i++){
				nob[i]=mOb[i];
			}
			mOb=nob;
			mTop++;
			mOb[mTop]=obj;
			return true;
		}
	}
	/*
	* This method is used to remove the elements from the stack.
	* @retrun Object,if the stack is not empty,else null.
	**/
	public Object pop(){
		if(mTop>-1){
		return mOb[mTop--];
		}
		System.out.println("Stack under flow");
		return null;
	}
	/*
	* This method is used to fetch the top element from the stack.
	* @return Object,if the stack is not empty,else null
	**/
	public Object peek(){
		if(mTop>-1){
			return mOb[mTop];
		}
		else
		System.out.println("stack under flow");
		return null;
	}
	/*
	* @Overrided
	* This method overrided from Object the class,to dispaly the statck elements
	* @retrun String
	**/
	public String toString(){
		String st="[";
		for(int i=mTop;i>=0;i--){
			st=st+mOb[i]+",";
		}
		return st+"]";
	}
	/* 
	* This method is used to calculate the current size of the stack.
	* @return int,size of the stack.
	**/
	public int getSize(){
		return mTop+1;
	}
	/*
	* This method is used to 
	* @return int,capacity of the stack
	**/
	public int capacity(){
		return mCpy;
	}
	/*
	* This method is used to display all the stack elements.
	**/
	public void display(){
		for(int i=0;i<mOb.length;i++){
			System.out.println(mOb[i]);
		}
		}
	/*
	* This method is used to check whether the stack is empty or not. 
	**/
        public boolean isEmpty(){
		 if(mTop==-1){
		 return true;
		 }
		 else
		 return false;
	}
}
