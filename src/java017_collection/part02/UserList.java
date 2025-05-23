package java017_collection.part02;

public class UserList {
	private Object[] sale;
	private int pointer;

	public UserList() {
		this(3);
	}

	public UserList(int cnt) {
		sale = new Object[cnt];

	}

	// append
	public void add(Object element) {
		if (sale.length == pointer) {
			Object[] arr = new Object[sale.length * 2];
			System.arraycopy(sale, 0, arr, 0, sale.length);
			sale = arr;
		}
		sale[pointer++] = element;

	}

	// insert
	public void add(int index, Object element) {
		for(int i =pointer;i>index;i--) {
			sale[i] = sale[i-1];
		}
		sale[index]=element;

	}

	// get
	public Object get(int index) {
		if(index<pointer)
			return sale[index];
		else
			throw new ArrayIndexOutOfBoundsException(index);
	}

	// remove
	public Object remove(int index) {
		Object data = sale[index];
		for(int i = index;i>pointer-1;i++) {
			sale[i]=sale[i+1];
		}
		pointer--;
		return data;
	}

	// 요소개수
	public int size() {
		return pointer;
	}

	// 메모리 크기
	public int capacity() {
		return sale.length;
	}

}
