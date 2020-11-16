package com.karakays.leetcode.solutions;

import java.util.ArrayList;
import java.util.List;

public class S200 extends Base {
    public int numIslands(char[][] grid) {
        List<Integer>[] graph = construct(grid);
        boolean[] discovered = new boolean[graph.length];
        int islands = 0;
        for (int i = 0; i < graph.length; i++) {
            if (graph[i] != null && discovered[i] == false )  {
                dfs(graph, i, discovered);
                islands++;
            }
        }
        return islands;
    }

    public void dfs(List<Integer>[] graph, int root, boolean[] discovered) {
        List<Integer> edges = graph[root];

        for (Integer i : edges) {
            if (discovered[i] == false) {
                discovered[i] = true;
                dfs(graph, i, discovered);
            } else {
                // back-edge
            }
        }
        discovered[root] = true;
    }

    private List<Integer>[] construct(char[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        List<Integer>[] graph = new ArrayList[m * n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if(grid[i][j] == '1') {
                    int vertex = i * n + j;
                    log.info("Discovered new vertex {} ", vertex);
                    graph[vertex] = new ArrayList<>();
                    if (j + 1 < grid[i].length && grid[i][j + 1] == '1') {
                        // tree edge
                        log.info("Adding edge ({}, {})", vertex, (i * n + j + 1));
                        graph[vertex].add(i * n + j + 1);
                    }
                    if (j - 1 >= 0 && grid[i][j - 1] == '1') {
                        // tree edge
                        log.info("Adding edge ({}, {})", (i * n + j + 1), vertex);
                        graph[vertex].add(i * n + j - 1);
                    }
                    if (i + 1 < grid.length && grid[i + 1][j] == '1') {
                        // edge
                        log.info("Adding edge ({}, {})", vertex, ((i + 1) * n + j));
                        graph[vertex].add((i + 1) * n + j);
                    }
                    if (i - 1 >= 0 && grid[i - 1][j] == '1') {
                        // edge
                        log.info("Adding edge ({}, {})", ((i + 1) * n + j), vertex);
                        graph[vertex].add((i - 1) * n + j);
                    }
                }
            }
        }
        return graph;
    }

}
