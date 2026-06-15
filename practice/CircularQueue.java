// package practice;

// public class que {
//     static int[] queue = new int[4];
//     static int rear = -1;
//     static int front = 0;

//     public static void enqueue(int value) {
//         if (rear == queue.length - 1) {
//             System.out.println("Queue is Full");
//             return;
//         }

//         rear++;
//         queue[rear] = value;
//         System.out.println(value + " inserted");
//     }

//     public static void dequeue() {
//         if (front > rear) {
//             System.out.println("Queue is Empty");
//             return;
//         }

//         System.out.println("Removed element: " + queue[front]);
//         front++;
//     }

//     public static void display() {
//         if (front > rear) {
//             System.out.println("Queue is Empty");
//             return;
//         }

//         System.out.print("Queue: ");
//         for (int i = front; i <= rear; i++) {
//             System.out.print(queue[i] + " ");
//         }
//         System.out.println();
//     }

//     public static void main(String[] args) {
//         enqueue(10);
//         enqueue(20);
//         enqueue(30);

//         display();

//         dequeue();

//         display();

//         enqueue(40);

//         display();
//     }
// }
package practice;

public class CircularQueue {

    static int[] queue = new int[5];
    static int front = -1;
    static int rear = -1;
 
    public static void enqueue(int value) {
        if ((rear + 1) % queue.length == front) {
            System.out.println("Queue is Full");
            return;
        }

        if (front == -1) {
            front = rear = 0;
        } else {
            rear = (rear + 1) % queue.length;
        }

        queue[rear] = value;
        System.out.println(value + " inserted");
    }

    public static void dequeue() {
        if (front == -1) {
            System.out.println("Queue is Empty");
            return;
        }

        System.out.println("Removed: " + queue[front]);

        if (front == rear) {
            front = rear = -1;
        } else {
            front = (front + 1) % queue.length;
        }
    }

    public static void display() {
        if (front == -1) {
            System.out.println("Queue is Empty");
            return;
        }

        System.out.print("Queue: ");

        int i = front;

        while (true) {
            System.out.print(queue[i] + " ");

            if (i == rear)
                break;

            i = (i + 1) % queue.length;
        }

        System.out.println();
    }

    public static void main(String[] args) {

        // Fill queue
        enqueue(10);
        enqueue(20);
        enqueue(30);
        enqueue(40);
        enqueue(50);

        display();

        // Remove 2 elements
        dequeue();
        dequeue();

        display();

        // Insert only 1 element
        enqueue(60);

        display();
    }
}