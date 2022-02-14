package ep_aed1;

public class PilhaIngenua2 {
	public int capacity;
	public static final int CAPACITY = 8;
	public int[] pilha;
	public int size;
	
	public PilhaIngenua2() {
		capacity = CAPACITY;
		pilha = new int[capacity];
		size = 0;
	}
	
	public void add(int newElement) {
		if(size == capacity) {
			capacity+=CAPACITY;
			int[] tmp = new int[capacity];
			for(int i=0; i<size; i++) {
				tmp[i]=pilha[i];
			}
			pilha = tmp;
		}
		pilha[size] = newElement;
		size++;
	}
	
	public int remove() {
		int tmp = pilha[size-1];
		size--;
		return tmp;
	}
}
