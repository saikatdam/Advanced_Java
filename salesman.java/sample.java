import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class sample {

    public static void main(String[] args) {
        int[][] distanceMatrix = {
                {0, 10, 15, 20},
                {10, 0, 35, 25},
                {15, 35, 0, 30},
                {20, 25, 30, 0}
        };

        int[] tour = solveTSP(distanceMatrix);
        System.out.println("Optimal Tour: " + Arrays.toString(tour));
        System.out.println("Optimal Tour Length: " + calculateTourLength(tour, distanceMatrix));
    }

    public static int[] solveTSP(int[][] distanceMatrix) {
        int n = distanceMatrix.length;
        int[] tour = new int[n];
        boolean[] visited = new boolean[n];

        tour[0] = 0; // Start from the first city
        visited[0] = true;

        tspHelper(1, n, tour, visited, distanceMatrix);

        return tour;
    }

    private static void tspHelper(int depth, int n, int[] tour, boolean[] visited, int[][] distanceMatrix) {
        if (depth == n) {
            return;
        }

        int currentCity = tour[depth - 1];
        int minDistance = Integer.MAX_VALUE;
        int nextCity = -1;

        for (int i = 0; i < n; i++) {
            if (!visited[i] && distanceMatrix[currentCity][i] < minDistance) {
                minDistance = distanceMatrix[currentCity][i];
                nextCity = i;
            }
        }

        tour[depth] = nextCity;
        visited[nextCity] = true;

        tspHelper(depth + 1, n, tour, visited, distanceMatrix);
    }

    public static int calculateTourLength(int[] tour, int[][] distanceMatrix) {
        int length = 0;
        int n = tour.length;

        for (int i = 0; i < n - 1; i++) {
            length += distanceMatrix[tour[i]][tour[i + 1]];
        }

        length += distanceMatrix[tour[n - 1]][tour[0]]; // Return to the starting city

        return length;
    }
}
