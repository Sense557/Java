class Solution {

    public class Point implements Comparable<Point>{
        int x;
        int y;
        int distance;
        int i;

        //constructor
        public Point(int x, int y, int distance, int i){
            this.x = x;
            this.y = y;
            this.distance = distance;
            this.i = i;
        }

        @Override
        public int compareTo(Point p1){
            //sort the distance value in the ascending order
            return this.distance - p1.distance;
        }
    }
    public int[][] kClosest(int[][] points, int k) {
        PriorityQueue<Point> minheap = new PriorityQueue<Point>();

        //creation of minheap on the basis of distance value
        for(int i = 0; i<points.length; i++){
            //distance = x^2 + y^2
            //points[i][0] = x
            //points[i][1] = y

            int distance = (points[i][0] * points[i][0] + points[i][1] * points[i][1]);
            minheap.add(new Point(points[i][0], points[i][1], distance, i));
        }

        //deletion until k times to get the k closest elements in minheap
        int[][] result = new int[k][];
        for(int i = 0; i<k; i++){
            Point point = minheap.remove();
            result[i] = new int[]{points[point.i][0], points[point.i][1]};
        }

        return result;
    }
}
