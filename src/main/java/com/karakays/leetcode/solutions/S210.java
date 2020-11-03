package com.karakays.leetcode.solutions;

import java.util.*;

public class S210 extends Base {
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        List<Integer>[] graph = new ArrayList[numCourses];
        int[] states = new int[numCourses];
        List<Integer> courseAgenda = new LinkedList();
        for (int i = 0; i < numCourses; i++) {
            graph[i] = new ArrayList<>();
        }
        for (int i = 0; i < prerequisites.length; i++) {
            graph[prerequisites[i][0]].add(prerequisites[i][1]);
        }
        for (int i = 0; i < numCourses; i++) {
            if (states[i] == 0 && !dfs(graph, courseAgenda, states, i)) {
                return new int[]{};
            }
        }
        log.info("Course order {}", courseAgenda);
        return courseAgenda.stream().mapToInt(i -> i.intValue()).toArray();
    }

    public boolean dfs(List<Integer>[] graph, List<Integer> courseAgenda, int states[], int course) {
        List<Integer> list = graph[course];
        states[course] = 1;
        for (Integer edge : list) {
            if (states[edge] == 0) {
                states[edge] = 1;
                if (!dfs(graph, courseAgenda, states, edge)) {
                    return false;
                }
            } else if (states[edge] == 1) {
                return false;
            }
        }
        courseAgenda.add(course);
        states[course] = 2;
        return true;
    }
}
