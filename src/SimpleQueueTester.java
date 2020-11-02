import java.util.concurrent.ArrayBlockingQueue;

public class SimpleQueueTester {
    
    private static StringBuilder sb;
    
    public static void main(String[] args) {
        sb = new StringBuilder();

        testConstructors();
        testAddAndOffer();
        testClear();
        testContains();
        testElementAndPeek();
        testPollAndRemove();
    }
    
    private static void testConstructors() {
        try {
            ArrayBlockingQueue<String> queue = new ArrayBlockingQueue<>(10);

            sb.append("1. Initial contents of queue: " + queue);
            sb.append("\n   Initial size of queue: " + queue.size());
            sb.append("\n   Initial capacity of queue: " + queue.remainingCapacity());
        } catch (Exception e) {
            sb.append("1. Failed to create queue: ");
            sb.append(e.toString());
        }

        try {
            ArrayBlockingQueue<String> queue = new ArrayBlockingQueue<>(0);

            sb.append("\n2. Initial contents of queue: " + queue);
            sb.append("\n   Initial size of queue: " + queue.size());
            sb.append("\n   Initial capacity of queue: " + queue.remainingCapacity());
        } catch (Exception e) {
            sb.append("\n2. Failed to create queue: ");
            sb.append(e.toString());
        }
        
        try {
            ArrayBlockingQueue<String> queue = new ArrayBlockingQueue<>(-1);

            sb.append("\n3. Initial contents of queue: " + queue);
            sb.append("\n3. Initial size of queue: " + queue.size());
            sb.append("\n3. Initial capacity of queue: " + queue.remainingCapacity());
        } catch (Exception e) {
            sb.append("\n3. Failed to create queue: ");
            sb.append(e.toString());
        }


        String expected = sb.toString();
        sb.setLength(0);

        try {
            SimpleQueue simpleQueue = new SimpleQueue(10);

            sb.append("1. Initial contents of queue: " + simpleQueue);
            sb.append("\n   Initial size of queue: " + simpleQueue.size());
            sb.append("\n   Initial capacity of queue: " + simpleQueue.remainingCapacity());
        } catch (Exception e) {
            sb.append("1. Failed to create queue: ");
            sb.append(e.toString());
        }

        try {
            SimpleQueue simpleQueue = new SimpleQueue(0);

            sb.append("\n2. Initial contents of queue: " + simpleQueue);
            sb.append("\n   Initial size of queue: " + simpleQueue.size());
            sb.append("\n   Initial capacity of queue: " + simpleQueue.remainingCapacity());
        } catch (Exception e) {
            sb.append("\n2. Failed to create queue: ");
            sb.append(e.toString());
        }
        
        try {
            SimpleQueue simpleQueue = new SimpleQueue(-1);

            sb.append("\n3. Initial contents of queue: " + simpleQueue);
            sb.append("\n   Initial size of queue: " + simpleQueue.size());
            sb.append("\n   Initial capacity of queue: " + simpleQueue.remainingCapacity());
        } catch (Exception e) {
            sb.append("\n3. Failed to create queue: ");
            sb.append(e.toString());
        }

        String actual = sb.toString();
        sb.setLength(0);

        if (!expected.equals(actual)) {
            System.out.println("FAILED: testConstructors.\n");
            System.out.println(expected);
            System.out.println();
            System.out.println(actual + "\n");
        } else {
            System.out.println("PASSED: testConstructors.");
        }
    }
    
    private static void testAddAndOffer() {
        try {
            ArrayBlockingQueue<String> queue = new ArrayBlockingQueue<>(10);
            
            queue.add("first");
            queue.add("second");
            queue.add("third");

            sb.append("1. Initial contents of queue: " + queue);
            sb.append("\n   Initial size of queue: " + queue.size());
            sb.append("\n   Remaining capacity of queue: " + queue.remainingCapacity());
        } catch (Exception e) {
            sb.append("1. Failed to add to queue: ");
            sb.append(e.toString());
        }
        
        try {
            ArrayBlockingQueue<String> queue = new ArrayBlockingQueue<>(10);
            
            queue.add("first");
            queue.add(null);
            queue.add("third");

            sb.append("\n2. Initial contents of queue: " + queue);
            sb.append("\n   Initial size of queue: " + queue.size());
            sb.append("\n   Remaining capacity of queue: " + queue.remainingCapacity());
        } catch (Exception e) {
            sb.append("\n2. Failed to add to queue: ");
            sb.append(e.toString());
        }
        
        try {
            ArrayBlockingQueue<String> queue = new ArrayBlockingQueue<>(10);
            
            queue.add("first");
            queue.add("");
            queue.add("third");

            sb.append("\n3. Initial contents of queue: " + queue);
            sb.append("\n   Initial size of queue: " + queue.size());
            sb.append("\n   Remaining capacity of queue: " + queue.remainingCapacity());
        } catch (Exception e) {
            sb.append("\n3. Failed to add to queue: ");
            sb.append(e.toString());
        }
        
        try {
            ArrayBlockingQueue<String> queue = new ArrayBlockingQueue<>(3);
            
            queue.add("first");
            queue.add("second");
            queue.add("third");
            queue.add("fourth");
            
            sb.append("\n4. Initial contents of queue: " + queue);
            sb.append("\n   Initial size of queue: " + queue.size());
            sb.append("\n   Remaining capacity of queue: " + queue.remainingCapacity());
        } catch (Exception e) {
            sb.append("\n4. Failed to add to queue: ");
            sb.append(e.toString());
        }
        
        try {
            ArrayBlockingQueue<String> queue = new ArrayBlockingQueue<>(10);
            
            queue.offer("first");
            queue.offer("second");
            queue.offer("third");

            sb.append("\n5. Initial contents of queue: " + queue);
            sb.append("\n   Initial size of queue: " + queue.size());
            sb.append("\n   Remaining capacity of queue: " + queue.remainingCapacity());
        } catch (Exception e) {
            sb.append("\n5. Failed to add to queue: ");
            sb.append(e.toString());
        }
        
        try {
            ArrayBlockingQueue<String> queue = new ArrayBlockingQueue<>(10);
            
            queue.offer("first");
            queue.offer(null);
            queue.offer("third");

            sb.append("\n6. Initial contents of queue: " + queue);
            sb.append("\n   Initial size of queue: " + queue.size());
            sb.append("\n   Remaining capacity of queue: " + queue.remainingCapacity());
        } catch (Exception e) {
            sb.append("\n6. Failed to add to queue: ");
            sb.append(e.toString());
        }
        
        try {
            ArrayBlockingQueue<String> queue = new ArrayBlockingQueue<>(10);
            
            queue.offer("first");
            queue.offer("");
            queue.offer("third");

            sb.append("\n7. Initial contents of queue: " + queue);
            sb.append("\n   Initial size of queue: " + queue.size());
            sb.append("\n   Remaining capacity of queue: " + queue.remainingCapacity());
        } catch (Exception e) {
            sb.append("\n7. Failed to add to queue: ");
            sb.append(e.toString());
        }
        
        try {
            ArrayBlockingQueue<String> queue = new ArrayBlockingQueue<>(3);
            
            queue.offer("first");
            queue.offer("second");
            queue.offer("third");
            queue.offer("fourth");

            sb.append("\n8. Initial contents of queue: " + queue);
            sb.append("\n   Initial size of queue: " + queue.size());
            sb.append("\n   Remaining capacity of queue: " + queue.remainingCapacity());
        } catch (Exception e) {
            sb.append("\n8. Failed to add to queue: ");
            sb.append(e.toString());
        }
        
        String expected = sb.toString();
        sb.setLength(0);
        
        try {
            SimpleQueue simpleQueue = new SimpleQueue(10);
            
            simpleQueue.add("first");
            simpleQueue.add("second");
            simpleQueue.add("third");

            sb.append("1. Initial contents of queue: " + simpleQueue);
            sb.append("\n   Initial size of queue: " + simpleQueue.size());
            sb.append("\n   Remaining capacity of queue: " + simpleQueue.remainingCapacity());
        } catch (Exception e) {
            sb.append("1. Failed to add to queue: ");
            sb.append(e.toString());
        }
        
        try {
            SimpleQueue simpleQueue = new SimpleQueue(10);
            
            simpleQueue.add("first");
            simpleQueue.add(null);
            simpleQueue.add("third");

            sb.append("\n2. Initial contents of queue: " + simpleQueue);
            sb.append("\n   Initial size of queue: " + simpleQueue.size());
            sb.append("\n   Remaining capacity of queue: " + simpleQueue.remainingCapacity());
        } catch (Exception e) {
            sb.append("\n2. Failed to add to queue: ");
            sb.append(e.toString());
        }
        
        try {
            SimpleQueue simpleQueue = new SimpleQueue(10);
            
            simpleQueue.add("first");
            simpleQueue.add("");
            simpleQueue.add("third");

            sb.append("\n3. Initial contents of queue: " + simpleQueue);
            sb.append("\n   Initial size of queue: " + simpleQueue.size());
            sb.append("\n   Remaining capacity of queue: " + simpleQueue.remainingCapacity());
        } catch (Exception e) {
            sb.append("\n3. Failed to add to queue: ");
            sb.append(e.toString());
        }
        
        try {
            SimpleQueue simpleQueue = new SimpleQueue(3);
            
            simpleQueue.add("first");
            simpleQueue.add("second");
            simpleQueue.add("third");
            simpleQueue.add("fourth");

            sb.append("\n.4 Initial contents of queue: " + simpleQueue);
            sb.append("\n   Initial size of queue: " + simpleQueue.size());
            sb.append("\n   Remaining capacity of queue: " + simpleQueue.remainingCapacity());
        } catch (Exception e) {
            sb.append("\n4. Failed to add to queue: ");
            sb.append(e.toString());
        }
        
        try {
            SimpleQueue simpleQueue = new SimpleQueue(10);
            
            simpleQueue.offer("first");
            simpleQueue.offer("second");
            simpleQueue.offer("third");

            sb.append("\n5. Initial contents of queue: " + simpleQueue);
            sb.append("\n   Initial size of queue: " + simpleQueue.size());
            sb.append("\n   Remaining capacity of queue: " + simpleQueue.remainingCapacity());
        } catch (Exception e) {
            sb.append("\n5. Failed to add to queue: ");
            sb.append(e.toString());
        }
        
        try {
            SimpleQueue simpleQueue = new SimpleQueue(10);
            
            simpleQueue.offer("first");
            simpleQueue.offer(null);
            simpleQueue.offer("third");

            sb.append("\n6. Initial contents of queue: " + simpleQueue);
            sb.append("\n   Initial size of queue: " + simpleQueue.size());
            sb.append("\n   Remaining capacity of queue: " + simpleQueue.remainingCapacity());
        } catch (Exception e) {
            sb.append("\n6. Failed to add to queue: ");
            sb.append(e.toString());
        }
        
        try {
            SimpleQueue simpleQueue = new SimpleQueue(10);
            
            simpleQueue.offer("first");
            simpleQueue.offer("");
            simpleQueue.offer("third");

            sb.append("\n7. Initial contents of queue: " + simpleQueue);
            sb.append("\n   Initial size of queue: " + simpleQueue.size());
            sb.append("\n   Remaining capacity of queue: " + simpleQueue.remainingCapacity());
        } catch (Exception e) {
            sb.append("\n7. Failed to add to queue: ");
            sb.append(e.toString());
        }
        
        try {
            SimpleQueue simpleQueue = new SimpleQueue(3);
            
            simpleQueue.offer("first");
            simpleQueue.offer("second");
            simpleQueue.offer("third");
            simpleQueue.offer("fourth");

            sb.append("\n8. Initial contents of queue: " + simpleQueue);
            sb.append("\n   Initial size of queue: " + simpleQueue.size());
            sb.append("\n   Remaining capacity of queue: " + simpleQueue.remainingCapacity());
        } catch (Exception e) {
            sb.append("\n8. Failed to add to queue: ");
            sb.append(e.toString());
        }
        
        String actual = sb.toString();
        sb.setLength(0);

        if (!expected.equals(actual)) {
            System.out.println("FAILED: testAddAndOffer.\n");
            System.out.println(expected);
            System.out.println();
            System.out.println(actual + "\n");
        } else {
            System.out.println("PASSED: testAddAndOffer.");
        }
    }
    
    private static void testClear() {
        try {
            ArrayBlockingQueue<String> queue = new ArrayBlockingQueue<>(10);

            sb.append("1. Initial contents of queue: " + queue);
            sb.append("\n   Initial size of queue: " + queue.size());
            sb.append("\n   Initial capacity of queue: " + queue.remainingCapacity());
            
            queue.clear();
            
            sb.append("\n   Contents of queue after clearing: " + queue);
            sb.append("\n   Size of queue after clearing: " + queue.size());
            sb.append("\n   Remaining capacity of queue after clearing: " + queue.remainingCapacity());
        } catch (Exception e) {
            sb.append("1. Failed to clear queue: ");
            sb.append(e.toString());
        }
        
        try {
            ArrayBlockingQueue<String> queue = new ArrayBlockingQueue<>(10);
            
            sb.append("\n2. Initial contents of queue: " + queue);
            sb.append("\n   Initial size of queue: " + queue.size());
            sb.append("\n   Initial capacity of queue: " + queue.remainingCapacity());
            
            queue.add("A");
            queue.add("B");
            queue.add("C");
            queue.add("D");
            queue.add("F");
            
            sb.append("\n   Updated contents of queue: " + queue);
            sb.append("\n   Updated size of queue: " + queue.size());
            sb.append("\n   Updated remaining capacity of queue: " + queue.remainingCapacity());
            
            queue.clear();
            
            sb.append("\n   Contents of queue after clearing: " + queue);
            sb.append("\n   Size of queue after clearing: " + queue.size());
            sb.append("\n   Remaining capacity of queue after clearing: " + queue.remainingCapacity());
        } catch (Exception e) {
            sb.append("\n2. Failed to clear queue: ");
            sb.append(e.toString());
        }
        
        String expected = sb.toString();
        sb.setLength(0);
        
        try {
            SimpleQueue simpleQueue = new SimpleQueue(10);

            sb.append("1. Initial contents of queue: " + simpleQueue);
            sb.append("\n   Initial size of queue: " + simpleQueue.size());
            sb.append("\n   Initial capacity of queue: " + simpleQueue.remainingCapacity());
            
            simpleQueue.clear();
            
            sb.append("\n   Contents of queue after clearing: " + simpleQueue);
            sb.append("\n   Size of queue after clearing: " + simpleQueue.size());
            sb.append("\n   Remaining capacity of queue after clearing: " + simpleQueue.remainingCapacity());
        } catch (Exception e) {
            sb.append("1. Failed to clear queue: ");
            sb.append(e.toString());
        }
        
        try {
            SimpleQueue simpleQueue = new SimpleQueue(10);
            
            sb.append("\n2. Initial contents of queue: " + simpleQueue);
            sb.append("\n   Initial size of queue: " + simpleQueue.size());
            sb.append("\n   Initial capacity of queue: " + simpleQueue.remainingCapacity());
            
            simpleQueue.add("A");
            simpleQueue.add("B");
            simpleQueue.add("C");
            simpleQueue.add("D");
            simpleQueue.add("F");
            
            sb.append("\n   Updated contents of queue: " + simpleQueue);
            sb.append("\n   Updated size of queue: " + simpleQueue.size());
            sb.append("\n   Updated remaining capacity of queue: " + simpleQueue.remainingCapacity());
            
            simpleQueue.clear();
            
            sb.append("\n   Contents of queue after clearing: " + simpleQueue);
            sb.append("\n   Size of queue after clearing: " + simpleQueue.size());
            sb.append("\n   Remaining capacity of queue after clearing: " + simpleQueue.remainingCapacity());
        } catch (Exception e) {
            sb.append("\n2. Failed to clear queue: ");
            sb.append(e.toString());
        }
        
        String actual = sb.toString();
        sb.setLength(0);

        if (!expected.equals(actual)) {
            System.out.println("FAILED: testClear.\n");
            System.out.println(expected);
            System.out.println();
            System.out.println(actual + "\n");
        } else {
            System.out.println("PASSED: testClear.");
        }
    }
    
    private static void testContains() {
        try {
            ArrayBlockingQueue<String> queue = new ArrayBlockingQueue<>(10);

            sb.append("1. Initial contents of queue: " + queue);
            
            boolean contains = queue.contains("empty");
            
            sb.append("\n   Queue contains the value 'empty': " + contains);
        } catch (Exception e) {
            sb.append("1. Failed to check contents of queue: ");
            sb.append(e.toString());
        }
        
        try {
            ArrayBlockingQueue<String> queue = new ArrayBlockingQueue<>(10);

            sb.append("\n2. Initial contents of queue: " + queue);
            
            queue.add("A");
            queue.add("B");
            queue.add("C");
            boolean contains = queue.contains("F");
            
            sb.append("\n   Queue contains the value 'F': " + contains);
        } catch (Exception e) {
            sb.append("\n2. Failed to check contents of queue: ");
            sb.append(e.toString());
        }
        
        try {
            ArrayBlockingQueue<String> queue = new ArrayBlockingQueue<>(10);

            sb.append("\n3. Initial contents of queue: " + queue);
            
            queue.add("A");
            queue.add("B");
            queue.add("C");
            boolean contains = queue.contains("A");
            
            sb.append("\n   Queue contains the value 'A': " + contains);
        } catch (Exception e) {
            sb.append("\n3. Failed to check contents of queue: ");
            sb.append(e.toString());
        }
        
        try {
            ArrayBlockingQueue<String> queue = new ArrayBlockingQueue<>(10);

            sb.append("\n4. Initial contents of queue: " + queue);
            
            queue.add("A");
            queue.add("B");
            queue.add("C");
            boolean contains = queue.contains("");
            
            sb.append("\n   Queue contains the value '': " + contains);
        } catch (Exception e) {
            sb.append("\n4. Failed to check contents of queue: ");
            sb.append(e.toString());
        }
        
        try {
            ArrayBlockingQueue<String> queue = new ArrayBlockingQueue<>(10);

            sb.append("\n5. Initial contents of queue: " + queue);
            
            queue.add("A");
            queue.add("B");
            queue.add("C");
            boolean contains = queue.contains(null);
            
            sb.append("\n   Queue contains the value 'null': " + contains);
        } catch (Exception e) {
            sb.append("\n5. Failed to check contents of queue: ");
            sb.append(e.toString());
        }
        
        String expected = sb.toString();
        sb.setLength(0);
        
        try {
            SimpleQueue simpleQueue = new SimpleQueue(10);

            sb.append("1. Initial contents of queue: " + simpleQueue);
            
            boolean contains = simpleQueue.contains("empty");
            
            sb.append("\n   Queue contains the value 'empty': " + contains);
        } catch (Exception e) {
            sb.append("1. Failed to check contents of queue: ");
            sb.append(e.toString());
        }
        
        try {
            SimpleQueue simpleQueue = new SimpleQueue(10);

            sb.append("\n2. Initial contents of queue: " + simpleQueue);
            
            simpleQueue.add("A");
            simpleQueue.add("B");
            simpleQueue.add("C");
            boolean contains = simpleQueue.contains("F");
            
            sb.append("\n   Queue contains the value 'F': " + contains);
        } catch (Exception e) {
            sb.append("\n2. Failed to check contents of queue: ");
            sb.append(e.toString());
        }
        
        try {
            SimpleQueue simpleQueue = new SimpleQueue(10);

            sb.append("\n3. Initial contents of queue: " + simpleQueue);
            
            simpleQueue.add("A");
            simpleQueue.add("B");
            simpleQueue.add("C");
            boolean contains = simpleQueue.contains("A");
            
            sb.append("\n   Queue contains the value 'A': " + contains);
        } catch (Exception e) {
            sb.append("\n3. Failed to check contents of queue: ");
            sb.append(e.toString());
        }
        
        try {
            SimpleQueue simpleQueue = new SimpleQueue(10);

            sb.append("\n4. Initial contents of queue: " + simpleQueue);
            
            simpleQueue.add("A");
            simpleQueue.add("B");
            simpleQueue.add("C");
            boolean contains = simpleQueue.contains("");
            
            sb.append("\n   Queue contains the value '': " + contains);
        } catch (Exception e) {
            sb.append("\n4. Failed to check contents of queue: ");
            sb.append(e.toString());
        }
        
        try {
            SimpleQueue simpleQueue = new SimpleQueue(10);

            sb.append("\n5. Initial contents of queue: " + simpleQueue);
            
            simpleQueue.add("A");
            simpleQueue.add("B");
            simpleQueue.add("C");
            boolean contains = simpleQueue.contains(null);
            
            sb.append("\n   Queue contains the value 'null': " + contains);
        } catch (Exception e) {
            sb.append("\n5. Failed to check contents of queue: ");
            sb.append(e.toString());
        }
        
        String actual = sb.toString();
        sb.setLength(0);

        if (!expected.equals(actual)) {
            System.out.println("FAILED: testContains.\n");
            System.out.println(expected);
            System.out.println();
            System.out.println(actual + "\n");
        } else {
            System.out.println("PASSED: testContains.");
        }
    }
    
    private static void testElementAndPeek() {
        try {
            ArrayBlockingQueue<String> queue = new ArrayBlockingQueue<>(10);

            queue.add("A");
            queue.add("B");
            queue.add("C");
            queue.add("D");
            queue.add("F");
            
            sb.append("1. Initial contents of queue: " + queue);
            sb.append("\n   Initial size of queue: " + queue.size());
            sb.append("\n   Initial remaining capacity of queue: " + queue.remainingCapacity());
            
            String item = queue.element();
                        
            sb.append("\n   Head of queue is: " + item);
            sb.append("\n   Updated contents of queue: " + queue);
            sb.append("\n   Updated size of queue: " + queue.size());
            sb.append("\n   Updated remaining capacity of queue: " + queue.remainingCapacity());
        } catch (Exception e) {
            sb.append("1. Failed to get head of queue: ");
            sb.append(e.toString());
        }
        
        try {
            ArrayBlockingQueue<String> queue = new ArrayBlockingQueue<>(10);
            
            sb.append("\n2. Initial contents of queue: " + queue);
            sb.append("\n   Initial size of queue: " + queue.size());
            sb.append("\n   Initial remaining capacity of queue: " + queue.remainingCapacity());
            
            String item = queue.element();
                        
            sb.append("\n   Head of queue is: " + item);
            sb.append("\n   Updated contents of queue: " + queue);
            sb.append("\n   Updated size of queue: " + queue.size());
            sb.append("\n   Updated remaining capacity of queue: " + queue.remainingCapacity());
        } catch (Exception e) {
            sb.append("\n2. Failed to get head of queue: ");
            sb.append(e.toString());
        }
        
        try {
            ArrayBlockingQueue<String> queue = new ArrayBlockingQueue<>(10);

            queue.add("A");
            queue.add("B");
            queue.add("C");
            queue.add("D");
            queue.add("F");
            
            sb.append("\n3. Initial contents of queue: " + queue);
            sb.append("\n   Initial size of queue: " + queue.size());
            sb.append("\n   Initial remaining capacity of queue: " + queue.remainingCapacity());
            
            String item = queue.peek();
                        
            sb.append("\n   Head of queue is: " + item);
            sb.append("\n   Updated contents of queue: " + queue);
            sb.append("\n   Updated size of queue: " + queue.size());
            sb.append("\n   Updated remaining capacity of queue: " + queue.remainingCapacity());
        } catch (Exception e) {
            sb.append("\n3. Failed to get head of queue: ");
            sb.append(e.toString());
        }
        
        try {
            ArrayBlockingQueue<String> queue = new ArrayBlockingQueue<>(10);
            
            sb.append("\n4. Initial contents of queue: " + queue);
            sb.append("\n   Initial size of queue: " + queue.size());
            sb.append("\n   Initial remaining capacity of queue: " + queue.remainingCapacity());
            
            String item = queue.peek();
                        
            sb.append("\n   Head of queue is: " + item);
            sb.append("\n   Updated contents of queue: " + queue);
            sb.append("\n   Updated size of queue: " + queue.size());
            sb.append("\n   Updated remaining capacity of queue: " + queue.remainingCapacity());
        } catch (Exception e) {
            sb.append("\n4. Failed to get head of queue: ");
            sb.append(e.toString());
        }
        
        String expected = sb.toString();
        sb.setLength(0);
        
        try {
            SimpleQueue simpleQueue = new SimpleQueue(10);

            simpleQueue.add("A");
            simpleQueue.add("B");
            simpleQueue.add("C");
            simpleQueue.add("D");
            simpleQueue.add("F");
            
            sb.append("1. Initial contents of queue: " + simpleQueue);
            sb.append("\n   Initial size of queue: " + simpleQueue.size());
            sb.append("\n   Initial remaining capacity of queue: " + simpleQueue.remainingCapacity());
            
            String item = simpleQueue.element();
                        
            sb.append("\n   Head of queue is: " + item);
            sb.append("\n   Updated contents of queue: " + simpleQueue);
            sb.append("\n   Updated size of queue: " + simpleQueue.size());
            sb.append("\n   Updated remaining capacity of queue: " + simpleQueue.remainingCapacity());
        } catch (Exception e) {
            sb.append("1. Failed to get head of queue: ");
            sb.append(e.toString());
        }
        
        try {
            SimpleQueue simpleQueue = new SimpleQueue(10);
            
            sb.append("\n2. Initial contents of queue: " + simpleQueue);
            sb.append("\n   Initial size of queue: " + simpleQueue.size());
            sb.append("\n   Initial remaining capacity of queue: " + simpleQueue.remainingCapacity());
            
            String item = simpleQueue.element();
                        
            sb.append("\n   Head of queue is: " + item);
            sb.append("\n   Updated contents of queue: " + simpleQueue);
            sb.append("\n   Updated size of queue: " + simpleQueue.size());
            sb.append("\n   Updated remaining capacity of queue: " + simpleQueue.remainingCapacity());
        } catch (Exception e) {
            sb.append("\n2. Failed to get head of queue: ");
            sb.append(e.toString());
        }
        
        try {
            SimpleQueue simpleQueue = new SimpleQueue(10);

            simpleQueue.add("A");
            simpleQueue.add("B");
            simpleQueue.add("C");
            simpleQueue.add("D");
            simpleQueue.add("F");
            
            sb.append("\n3. Initial contents of queue: " + simpleQueue);
            sb.append("\n   Initial size of queue: " + simpleQueue.size());
            sb.append("\n   Initial remaining capacity of queue: " + simpleQueue.remainingCapacity());
            
            String item = simpleQueue.peek();
                        
            sb.append("\n   Head of queue is: " + item);
            sb.append("\n   Updated contents of queue: " + simpleQueue);
            sb.append("\n   Updated size of queue: " + simpleQueue.size());
            sb.append("\n   Updated remaining capacity of queue: " + simpleQueue.remainingCapacity());
        } catch (Exception e) {
            sb.append("\n3. Failed to get head of queue: ");
            sb.append(e.toString());
        }
        
        try {
            SimpleQueue simpleQueue = new SimpleQueue(10);
            
            sb.append("\n4. Initial contents of queue: " + simpleQueue);
            sb.append("\n   Initial size of queue: " + simpleQueue.size());
            sb.append("\n   Initial remaining capacity of queue: " + simpleQueue.remainingCapacity());
            
            String item = simpleQueue.peek();
                        
            sb.append("\n   Head of queue is: " + item);
            sb.append("\n   Updated contents of queue: " + simpleQueue);
            sb.append("\n   Updated size of queue: " + simpleQueue.size());
            sb.append("\n   Updated remaining capacity of queue: " + simpleQueue.remainingCapacity());
        } catch (Exception e) {
            sb.append("\n4. Failed to get head of queue: ");
            sb.append(e.toString());
        }
        
        String actual = sb.toString();
        sb.setLength(0);

        if (!expected.equals(actual)) {
            System.out.println("FAILED: testElementAndPeek.\n");
            System.out.println(expected);
            System.out.println();
            System.out.println(actual + "\n");
        } else {
            System.out.println("PASSED: testElementAndPeek.");
        }
    }
    
    private static void testPollAndRemove() {
        try {
            ArrayBlockingQueue<String> queue = new ArrayBlockingQueue<>(10);

            queue.add("A");
            queue.add("B");
            queue.add("C");
            queue.add("D");
            queue.add("F");
            
            sb.append("1. Initial contents of queue: " + queue);
            sb.append("\n   Initial size of queue: " + queue.size());
            sb.append("\n   Initial remaining capacity of queue: " + queue.remainingCapacity());
            
            String item = queue.poll();
                                    
            sb.append("\n   Removed head of queue: " + item);
            sb.append("\n   New head of queue is: " + queue.peek());
            sb.append("\n   Updated contents of queue: " + queue);
            sb.append("\n   Updated size of queue: " + queue.size());
            sb.append("\n   Updated remaining capacity of queue: " + queue.remainingCapacity());
        } catch (Exception e) {
            sb.append("1. Failed to get head of queue: ");
            sb.append(e.toString());
        }
        
        try {
            ArrayBlockingQueue<String> queue = new ArrayBlockingQueue<>(10);
            
            sb.append("\n2. Initial contents of queue: " + queue);
            sb.append("\n   Initial size of queue: " + queue.size());
            sb.append("\n   Initial remaining capacity of queue: " + queue.remainingCapacity());
            
            String item = queue.poll();
                                    
            sb.append("\n   Removed head of queue: " + item);
            sb.append("\n   New head of queue is: " + queue.peek());
            sb.append("\n   Updated contents of queue: " + queue);
            sb.append("\n   Updated size of queue: " + queue.size());
            sb.append("\n   Updated remaining capacity of queue: " + queue.remainingCapacity());
        } catch (Exception e) {
            sb.append("\n2. Failed to get head of queue: ");
            sb.append(e.toString());
        }
        
        try {
            ArrayBlockingQueue<String> queue = new ArrayBlockingQueue<>(10);

            queue.add("A");
            queue.add("B");
            queue.add("C");
            queue.add("D");
            queue.add("F");
            
            sb.append("\n3. Initial contents of queue: " + queue);
            sb.append("\n   Initial size of queue: " + queue.size());
            sb.append("\n   Initial remaining capacity of queue: " + queue.remainingCapacity());
            
            String item = queue.remove();
                                    
            sb.append("\n   Removed head of queue: " + item);
            sb.append("\n   New head of queue is: " + queue.peek());
            sb.append("\n   Updated contents of queue: " + queue);
            sb.append("\n   Updated size of queue: " + queue.size());
            sb.append("\n   Updated remaining capacity of queue: " + queue.remainingCapacity());
        } catch (Exception e) {
            sb.append("\n3. Failed to get head of queue: ");
            sb.append(e.toString());
        }
        
        try {
            ArrayBlockingQueue<String> queue = new ArrayBlockingQueue<>(10);
            
            sb.append("\n4. Initial contents of queue: " + queue);
            sb.append("\n   Initial size of queue: " + queue.size());
            sb.append("\n   Initial remaining capacity of queue: " + queue.remainingCapacity());
            
            String item = queue.remove();
                                    
            sb.append("\n   Removed head of queue: " + item);
            sb.append("\n   New head of queue is: " + queue.peek());
            sb.append("\n   Updated contents of queue: " + queue);
            sb.append("\n   Updated size of queue: " + queue.size());
            sb.append("\n   Updated remaining capacity of queue: " + queue.remainingCapacity());
        } catch (Exception e) {
            sb.append("\n   Failed to get head of queue: ");
            sb.append(e.toString());
        }
        
        try {
            ArrayBlockingQueue<String> queue = new ArrayBlockingQueue<>(10);

            queue.add("A");
            queue.add("B");
            queue.add("C");
            queue.add("D");
            queue.add("F");
            
            sb.append("\n5. Initial contents of queue: " + queue);
            sb.append("\n   Initial size of queue: " + queue.size());
            sb.append("\n   Initial remaining capacity of queue: " + queue.remainingCapacity());
            
            boolean removed = queue.remove("C");
                                    
            sb.append("\n   Removed item from of queue: " + removed);
            sb.append("\n   Updated contents of queue: " + queue);
            sb.append("\n   Updated size of queue: " + queue.size());
            sb.append("\n   Updated remaining capacity of queue: " + queue.remainingCapacity());
        } catch (Exception e) {
            sb.append("\n5. Failed to get head of queue: ");
            sb.append(e.toString());
        }
        
        try {
            ArrayBlockingQueue<String> queue = new ArrayBlockingQueue<>(10);
            
            sb.append("\n6. Initial contents of queue: " + queue);
            sb.append("\n   Initial size of queue: " + queue.size());
            sb.append("\n   Initial remaining capacity of queue: " + queue.remainingCapacity());
            
            boolean removed = queue.remove("C");
                                    
            sb.append("\n   Removed item from of queue: " + removed);
            sb.append("\n   Updated contents of queue: " + queue);
            sb.append("\n   Updated size of queue: " + queue.size());
            sb.append("\n   Updated remaining capacity of queue: " + queue.remainingCapacity());
        } catch (Exception e) {
            sb.append("\n6. Failed to get head of queue: ");
            sb.append(e.toString());
        }
        
        try {
            ArrayBlockingQueue<String> queue = new ArrayBlockingQueue<>(10);

            queue.add("A");
            queue.add("B");
            queue.add("C");
            queue.add("D");
            queue.add("F");
            
            sb.append("\n7. Initial contents of queue: " + queue);
            sb.append("\n   Initial size of queue: " + queue.size());
            sb.append("\n   Initial remaining capacity of queue: " + queue.remainingCapacity());
            
            boolean removed = queue.remove("X");
                                    
            sb.append("\n   Removed item from of queue: " + removed);
            sb.append("\n   Updated contents of queue: " + queue);
            sb.append("\n   Updated size of queue: " + queue.size());
            sb.append("\n   Updated remaining capacity of queue: " + queue.remainingCapacity());
        } catch (Exception e) {
            sb.append("\n7. Failed to get head of queue: ");
            sb.append(e.toString());
        }
        
        String expected = sb.toString();
        sb.setLength(0);
        
        try {
            SimpleQueue simpleQueue = new SimpleQueue(10);

            simpleQueue.add("A");
            simpleQueue.add("B");
            simpleQueue.add("C");
            simpleQueue.add("D");
            simpleQueue.add("F");
            
            sb.append("1. Initial contents of queue: " + simpleQueue);
            sb.append("\n   Initial size of queue: " + simpleQueue.size());
            sb.append("\n   Initial remaining capacity of queue: " + simpleQueue.remainingCapacity());
            
            String item = simpleQueue.poll();
                                    
            sb.append("\n   Removed head of queue: " + item);
            sb.append("\n   New head of queue is: " + simpleQueue.peek());
            sb.append("\n   Updated contents of queue: " + simpleQueue);
            sb.append("\n   Updated size of queue: " + simpleQueue.size());
            sb.append("\n   Updated remaining capacity of queue: " + simpleQueue.remainingCapacity());
        } catch (Exception e) {
            sb.append("1. Failed to get head of queue: ");
            sb.append(e.toString());
        }
        
        try {
            SimpleQueue simpleQueue = new SimpleQueue(10);
            
            sb.append("\n2. Initial contents of queue: " + simpleQueue);
            sb.append("\n   Initial size of queue: " + simpleQueue.size());
            sb.append("\n   Initial remaining capacity of queue: " + simpleQueue.remainingCapacity());
            
            String item = simpleQueue.poll();
                                    
            sb.append("\n   Removed head of queue: " + item);
            sb.append("\n   New head of queue is: " + simpleQueue.peek());
            sb.append("\n   Updated contents of queue: " + simpleQueue);
            sb.append("\n   Updated size of queue: " + simpleQueue.size());
            sb.append("\n   Updated remaining capacity of queue: " + simpleQueue.remainingCapacity());
        } catch (Exception e) {
            sb.append("\n2. Failed to get head of queue: ");
            sb.append(e.toString());
        }
        
        try {
            SimpleQueue simpleQueue = new SimpleQueue(10);
            
            simpleQueue.add("A");
            simpleQueue.add("B");
            simpleQueue.add("C");
            simpleQueue.add("D");
            simpleQueue.add("F");
            
            sb.append("\n3. Initial contents of queue: " + simpleQueue);
            sb.append("\n   Initial size of queue: " + simpleQueue.size());
            sb.append("\n   Initial remaining capacity of queue: " + simpleQueue.remainingCapacity());
            
            String item = simpleQueue.remove();
                                    
            sb.append("\n   Removed head of queue: " + item);
            sb.append("\n   New head of queue is: " + simpleQueue.peek());
            sb.append("\n   Updated contents of queue: " + simpleQueue);
            sb.append("\n   Updated size of queue: " + simpleQueue.size());
            sb.append("\n   Updated remaining capacity of queue: " + simpleQueue.remainingCapacity());
        } catch (Exception e) {
            sb.append("\n3. Failed to get head of queue: ");
            sb.append(e.toString());
        }
        
        try {
            SimpleQueue simpleQueue = new SimpleQueue(10);
            
            sb.append("\n4. Initial contents of queue: " + simpleQueue);
            sb.append("\n   Initial size of queue: " + simpleQueue.size());
            sb.append("\n   Initial remaining capacity of queue: " + simpleQueue.remainingCapacity());
            
            String item = simpleQueue.remove();
                                    
            sb.append("\n   Removed head of queue: " + item);
            sb.append("\n   New head of queue is: " + simpleQueue.peek());
            sb.append("\n   Updated contents of queue: " + simpleQueue);
            sb.append("\n   Updated size of queue: " + simpleQueue.size());
            sb.append("\n   Updated remaining capacity of queue: " + simpleQueue.remainingCapacity());
        } catch (Exception e) {
            sb.append("\n   Failed to get head of queue: ");
            sb.append(e.toString());
        }
        
        try {
            SimpleQueue simpleQueue = new SimpleQueue(10);
            
            simpleQueue.add("A");
            simpleQueue.add("B");
            simpleQueue.add("C");
            simpleQueue.add("D");
            simpleQueue.add("F");
            
            sb.append("\n5. Initial contents of queue: " + simpleQueue);
            sb.append("\n   Initial size of queue: " + simpleQueue.size());
            sb.append("\n   Initial remaining capacity of queue: " + simpleQueue.remainingCapacity());
            
            boolean removed = simpleQueue.remove("C");
                                    
            sb.append("\n   Removed item from of queue: " + removed);
            sb.append("\n   Updated contents of queue: " + simpleQueue);
            sb.append("\n   Updated size of queue: " + simpleQueue.size());
            sb.append("\n   Updated remaining capacity of queue: " + simpleQueue.remainingCapacity());
        } catch (Exception e) {
            sb.append("\n5. Failed to get head of queue: ");
            sb.append(e.toString());
        }
        
        try {
            SimpleQueue simpleQueue = new SimpleQueue(10);
            
            sb.append("\n6. Initial contents of queue: " + simpleQueue);
            sb.append("\n   Initial size of queue: " + simpleQueue.size());
            sb.append("\n   Initial remaining capacity of queue: " + simpleQueue.remainingCapacity());
            
            boolean removed = simpleQueue.remove("C");
                                    
            sb.append("\n   Removed item from of queue: " + removed);
            sb.append("\n   Updated contents of queue: " + simpleQueue);
            sb.append("\n   Updated size of queue: " + simpleQueue.size());
            sb.append("\n   Updated remaining capacity of queue: " + simpleQueue.remainingCapacity());
        } catch (Exception e) {
            sb.append("\n6. Failed to get head of queue: ");
            sb.append(e.toString());
        }
        
        try {
            SimpleQueue simpleQueue = new SimpleQueue(10);
            
            simpleQueue.add("A");
            simpleQueue.add("B");
            simpleQueue.add("C");
            simpleQueue.add("D");
            simpleQueue.add("F");
            
            sb.append("\n7. Initial contents of queue: " + simpleQueue);
            sb.append("\n   Initial size of queue: " + simpleQueue.size());
            sb.append("\n   Initial remaining capacity of queue: " + simpleQueue.remainingCapacity());
            
            boolean removed = simpleQueue.remove("X");
                                    
            sb.append("\n   Removed item from of queue: " + removed);
            sb.append("\n   Updated contents of queue: " + simpleQueue);
            sb.append("\n   Updated size of queue: " + simpleQueue.size());
            sb.append("\n   Updated remaining capacity of queue: " + simpleQueue.remainingCapacity());
        } catch (Exception e) {
            sb.append("\n7. Failed to get head of queue: ");
            sb.append(e.toString());
        }
        
        String actual = sb.toString();
        sb.setLength(0);

        if (!expected.equals(actual)) {
            System.out.println("FAILED: testPollAndRemove.\n");
            System.out.println(expected);
            System.out.println();
            System.out.println(actual);
        } else {
           System.out.println("PASSED: testPollAndRemove.");
        }
    }
}
