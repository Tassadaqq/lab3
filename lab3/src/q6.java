import java.util.ArrayList;

class Stack<T> {
    private ArrayList<T> elements;

    public Stack() {
        this.elements = new ArrayList<>();
    }

    public void push(T element) {
        elements.add(element);
    }

    public T pop() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty. Cannot pop.");
        }
        int lastIndex = elements.size() - 1;
        T poppedElement = elements.get(lastIndex);
        elements.remove(lastIndex);
        return poppedElement;
    }

    public boolean isEmpty() {
        return elements.isEmpty();
    }

    public T peek() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty. Cannot peek.");
        }
        return elements.get(elements.size() - 1);
    }

    public int size() {
        return elements.size();
    }
}

public class q6 {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        stack.push(1);
        stack.push(2);
        stack.push(3);

        System.out.println("Is stack empty? " + stack.isEmpty());

        System.out.println("Top element: " + stack.peek());

        while (!stack.isEmpty()) {
            System.out.println("Popped: " + stack.pop());
        }

        System.out.println("Is stack empty? " + stack.isEmpty());
    }
}
