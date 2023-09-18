import java.util.Stack;

public class LargestRectangle {
    static int getMaxArea(int hist[], int n) {
        Stack<Integer> s = new Stack<>();
        int max_area = 0;    // initialize max area
        int tp;    // to store top of stack
        int area_with_top;    // to store area with top bar as the smallest bar

        int i = 0;
        while (i < n) {
            // if this is higher than the bar on top of the stack, push it to stack
            if (s.isEmpty() || hist[s.peek()] <= hist[i]) {
                s.push(i++);
            } else {
                tp = s.peek();    // store the top index
                s.pop();
                area_with_top = hist[tp] * (s.isEmpty() ? i : i - s.peek() - 1);

                // update max_area, if needed
                if (max_area < area_with_top)
                    max_area = area_with_top;
            }
        }

        while (!s.isEmpty()) {
            tp = s.peek();
            s.pop();
            area_with_top = hist[tp] * (s.isEmpty() ? i : i - s.peek() - 1);
            if (max_area < area_with_top)
                max_area = area_with_top;
        }
        
        return max_area;
    }

    // Driver's Code
    public static void main(String[] args) {
        int hist[] = {6, 2, 5, 4, 5, 1, 6};

        // function call
        System.out.println("Maximum area is " + getMaxArea(hist, hist.length));
    }
}
