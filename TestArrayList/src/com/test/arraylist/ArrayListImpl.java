package com.test.arraylist;
import java.io.Serializable;
import java.util.Arrays;


public class ArrayListImpl<E> implements Cloneable, Serializable{
	
	public ArrayListImpl(int initialcap) {
		System.out.println("lakshmi constructor");
		this.elementData = new Object[initialcap];
	}
	private  int size = 0;
	 private static final int  DEFAULT_CAPACITY = 10;
	 private static final Object[] DEFAULT_CAPACITY_EMPTY_ELEMENT_DATA = {};
	 private static final Object[] EMPTY_ELEMENT_DATA = {};
	 public transient Object[] elementData;
	
	 public void grow(int i) {
		 int minCapacity  = elementData.length;
		 if(minCapacity != 0 || elementData!= (DEFAULT_CAPACITY_EMPTY_ELEMENT_DATA)) {
			 int newCapacity = i;
			 elementData = Arrays.copyOf(elementData, newCapacity) ;
		 } else
			 
			 elementData = new Object[Math.max(DEFAULT_CAPACITY, minCapacity)];
		 
	 }
	 public boolean add(E e) {
		 System.out.println("lakshmi e"+ e);
		 System.out.println("lakshmi elementData"+ elementData);
		 System.out.println("lakshmi size"+size);
		 
		  add(e, elementData, size);
		  return true;
	 }
	private void add(E e, Object[] elementData, int size1) {
		System.out.println("lakshmi elementData.length::::"+ elementData.length);
		if(elementData.length == size1) {
			System.out.println("lakshmi grow size equal");
		     grow(size1+1);
			
		} 
			elementData[size1] = e;
			size =size +1;	

	}
	public  int length() {
		System.out.println("lakshmi size::::"+ size);
		return this.size;
	}
	
	private Object get (int index) {
		
		return elementData[index];
	}
	public static void main(String args[]) {
		
		try {
		ArrayListImpl<Integer> arr = new ArrayListImpl<>(10);
		arr.add(1);
		System.out.println(arr.length());
		for(int i=0; i < arr.length(); i++) {
			
			System.out.println(arr.get(i));
		}
		} catch(Exception e) {
			System.out.println(e);
		}
	}

}
