/**
 *  Java program to represent the undirected graph with a List.
 */

package com.mygraph;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// Main class.
public class Main {

    // JVM entry point.
    public static void main(String[] args) {

        // Creating Scanner instance.
        Scanner scanner = new Scanner(System.in);

        // Getting graph dimensions.
        int n = scanner.nextInt(); // Number of nodes.
        int m = scanner.nextInt(); // Number of edges.

        // Generation of a graph.
        List<List<Integer>> graph = new ArrayList<>();

        // Filling the graph.
        for (int i = 0; i <n ; i++) {
            graph.add(new ArrayList<>());
        }

        for (int i = 0; i < m; i++) {

            // Input.
            int u = scanner.nextInt();
            int v = scanner.nextInt();

            graph.get(u).add(v);
            graph.get(v).add(u);

        }

        // Printing the graph to the console.
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(graph.get(i).get(j) + " ");
            }
            System.out.println();
        }
    }
}