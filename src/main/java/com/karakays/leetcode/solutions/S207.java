package com.karakays.leetcode.solutions;

import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Stack;

public class S207 extends Base {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        DAG dag = new DAG(numCourses, prerequisites);
        for (int i = 0; i < numCourses; i++) {
            if(dag.vstates[i] == DAG.VState.UNDISC) {
                dfs(dag, i);
            }
        }
        log.info("Resulted stack {}", dag.stack);
        int[] courses = new int[numCourses];
        while(!dag.stack.isEmpty()) {
            courses[dag.stack.pop()] = 1;
        }
        for (int i = 0; i < numCourses; i++) {
            if (courses[i] == 0) {
                return false;
            }
        }
        return true;
    }

    static class DAG {
        private Edge[] edges;
        private VState[] vstates;
        private Deque<Integer> stack;

        enum VState {UNDISC, DISC, PROC;}

        DAG(int courses, int[][] prerequisites) {
            edges = new Edge[courses];
            vstates = new VState[courses];
            stack = new LinkedList<Integer>();
            Arrays.fill(vstates, VState.UNDISC);
            for (int[] e : prerequisites) {
                insertEdge(e[0], e[1]);
            }
        }
        void insertEdge(int x, int y) {
            Edge head = edges[x];
            Edge newEdge = new Edge(y, head);
            edges[x] = newEdge;
        }
    }

    static class Edge {
        private int y;
        private Edge next;
        public Edge(int y, Edge next) {
            this.y = y;
            this.next = next;
        }
    }

    private void dfs(DAG g, int root) {
        Edge current = g.edges[root];
        g.vstates[root] = DAG.VState.DISC;
        while(current != null) {
            if(g.vstates[current.y] == DAG.VState.UNDISC) {
                g.vstates[current.y] = DAG.VState.DISC;
                dfs(g, current.y);
            } else if(g.vstates[current.y] != DAG.VState.PROC) {
                // cycle

                log.warn("cycle found ({}, {}), stop", root, current.y);
                return;
            }
            current = current.next;
        }
        g.stack.push(root);
        g.vstates[root] = DAG.VState.PROC;
    }

}
