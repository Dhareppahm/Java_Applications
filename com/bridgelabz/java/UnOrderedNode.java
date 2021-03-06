/* 
* @Author:Dhareppa Metri
* File:UnOrderedNode.java
* Date:20/10/2016
* Purpose:Implementation of unordered linked list utility methods.
**/
import com.bridgelabz.java.UnOrderedNode;
import com.bridgelabz.java.UnOrderedNodeCreation;
import java.io.File;
class UnOrderedNode<T>{
	UnOrderedNodeCreation mHead,mTail,mNode,mTemp,mTemp2;
	FileUtility fu = new FileUtility();
	File file = new File("UnOrderedStringList.txt");
	/*
	* This method is used to add data to the linked list
	* @Param data,first parameter for this method.
	**/	
	public void addNode(T value){
		mNode = new UnOrderedNodeCreation();
		mNode.setData(value);
		if(mHead == null){
			mHead = mNode;
			mTail = mNode;
		}
		else{
			mTail.setNext(mNode);
			mTail = mNode;
		}	
	}//end of add method
        /*
	* This method is used to update the given file.
	**/
	public void fileUpdate(){
		mTemp = mHead;
		fu.clearFile(file);
		int total = 0;
		if(mTemp == null)
			System.out.println("List is Empty");
		else{
			while(mTemp != null){
				total++;
				String str = (String)mTemp.getData();
				fu.writeFile(file,str);
				mTemp = mTemp.getNext();
			}
		}
	}//end of fileUpdate
        /*
	* This method is used search the value in the linked list
	* @Param data,first parameter for this method.
	**/
	public void search(T value){
		int count = 0;
		mTemp = mHead;
		while(mTemp != null){
			if(value.equals(mTemp.getData())){
				count++;
				System.out.println("Search found, Element is removed");
				this.remove(value);
				System.out.print("New list is: ");
				this.fileUpdate();
				System.out.println(fu.readFile(file));
				System.out.println();
			}
			else
				mTemp = mTemp.getNext();
		}
		if(count == 0){
			System.out.println("Search not found, Element is added");
			this.addNode(value);
			System.out.print("New list is: ");
			this.fileUpdate();
			System.out.println(fu.readFile(file));
			System.out.println();
		}
	}//end of search

	/*
	* This method is used to remove data to the linked list
	* @Param data,first parameter for this method.
	**/
	public void remove(T value){
		mTemp = mHead;
		mTemp2 = mTemp.getNext();
		mNode = new UnOrderedNodeCreation();
		mNode.setData(value);
		if(value.equals(mHead.getData()))
			mHead = mHead.getNext();
		else{
			while(mTemp2 != null){
				if(value.equals(mTemp2.getData())){
					mTemp.setNext(mTemp2.getNext());
					break;			
				}
				else{
					mTemp = mTemp2;
					mTemp2 = mTemp2.getNext();
				}
			}
		}
	}//end of remove method
}
