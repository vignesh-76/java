package datastructure.sll;
class ArrayImplementation{
    int [] arr=new int[20];
    int size = 0;
    //insert at beginning
    public void insertAtBeginning(int data) {
        if (size == arr.length) {
            System.out.println("Array is full");
            return;
        }
        // Shift elements to right
        for (int i = size; i > 0; i--) {
            arr[i] = arr[i - 1];
        }
        arr[0] = data;
        size++;
    }
    //insert at end
    public void insertAtend(int data){
        if (size == arr.length) {
            System.out.println("Array is full");
            return;
        }
        arr[size] = data;
        size++;
    }
    //insert at midlle
    public void insertAtMiddle(int data, int pos) {

        if (size == arr.length) {
            System.out.println("Array is full");
            return;
        }

        if (pos < 0 || pos > size) {
            System.out.println("Invalid position");
            return;
        }

        // Shift elements to right
        for (int i = size; i > pos; i--) {
            arr[i] = arr[i - 1];
        }

        arr[pos] = data;
        size++;
    }

    //delete
    public void delete(int key) {

        if (size == 0) {
            System.out.println("Array is empty");
            return;
        }
        int i;
        for (i = 0; i < size; i++) {
            if (arr[i] == key) {
                break;
            }
        }
        if (i == size) {
            System.out.println("Element not found");
            return;
        }
        // Shift elements left
        for (int j = i; j < size - 1; j++) {
            arr[j] = arr[j + 1];
        }

        size--;
    }


    //display
    public void display() {
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

}
class TestArray {
    public static void main(String[] args) {

        ArrayImplementation a = new ArrayImplementation();

        // Insert at end
        a.insertAtend(10);
        a.insertAtend(20);
        a.insertAtend(30);

        System.out.println("After insert at end:");
        a.display();

        // Insert at beginning
        a.insertAtBeginning(5);

        System.out.println("After insert at beginning:");
        a.display();

        // Insert at middle
        a.insertAtMiddle(15, 2);

        System.out.println("After insert at middle (position 2):");
        a.display();

        // Delete element
        a.delete(20);

        System.out.println("After deleting 20:");
        a.display();
    }
}