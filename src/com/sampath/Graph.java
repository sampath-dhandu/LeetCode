package com.sampath;

import java.util.*;

public class Graph {
    private Map<String, Node> nodes = new HashMap<>();
    private Map<Node, List<Node>> adjecencyList = new HashMap<>();

    public void addNode(String label) {
        var node = new Node(label);
        nodes.putIfAbsent(label, node);
        adjecencyList.putIfAbsent(node, new ArrayList<>());
    }

    public void addEdge(String from, String to) {
        var fromNode = nodes.get(from);
        if (fromNode == null)
            throw new IllegalStateException();
        var toNode = nodes.get(to);
        if (toNode == null)
            throw new IllegalStateException();

        adjecencyList.get(fromNode).add(toNode);
        //adjecencyList.get(toNode).add(fromNode);

    }

    public void print() {
        for (var source : adjecencyList.keySet()) {
            var targets = adjecencyList.get(source);
            if (!targets.isEmpty()) {
                System.out.println(source + " is connected to " + targets);
            }
        }
    }

    public void removeNode(String label) {
        var node = nodes.get(label);
        if (node == null)
            return;
        for (var n : adjecencyList.keySet())
            adjecencyList.get(n).remove(node);
        adjecencyList.remove(node);
        nodes.remove(node);

    }

    public void removeEdge(String from, String to) {
        var fromNode = nodes.get(from);
        var toNode = nodes.get(to);
        if (fromNode == null || toNode == null)
            return;
        adjecencyList.get(fromNode).remove(toNode);
    }


    public void traversalDepthFirstRec(String root) {
        var node = nodes.get(root);
        if (node == null)
            return;
        traversalDepthFirst(node, new HashSet<Node>());
    }


    private void traversalDepthFirst(Node root, Set<Node> visited) {
        System.out.println(root);
        visited.add(root);
        for (var node : adjecencyList.get(root))
            if (!visited.contains(node))
                traversalDepthFirst(node, visited);
    }

    public void traversalDepthFirst(String root) {
        var node = nodes.get(root);
        if (node == null)
            return;
        Stack<Node> stack = new Stack<>();
        Set<Node> visited = new HashSet<>();
        stack.push(node);
        while (!stack.isEmpty()) {
            var currnet = stack.pop();
            if (visited.contains(currnet))
                continue;
            System.out.println(currnet);
            visited.add(currnet);

            for (var neighbor : adjecencyList.get(currnet))
                if (!visited.contains(neighbor))
                    stack.push(neighbor);
        }
        traversalDepthFirst(node, new HashSet<Node>());
    }


    public void traversalBredthFirst(String root) {
        var node = nodes.get(root);
        if (node == null)
            return;
        Queue<Node> queue = new ArrayDeque<>();
        Set<Node> visited = new HashSet<>();
        queue.add(node);
        while (!queue.isEmpty()) {
            var current = queue.remove();
            if (visited.contains(current))
                continue;
            System.out.println(current);
            visited.add(current);

            for (var neighbor : adjecencyList.get(current))
                if (!visited.contains(neighbor))
                    queue.add(neighbor);
        }
        //traversalDepthFirst(node, new HashSet<Node>());
    }

    public List<String> topological() {
        Stack<Node> stack = new Stack<>();
        Set<Node> visited = new HashSet<>();
        for (var node : nodes.values())
            topological(node, visited, stack);
        List<String> sortedList = new ArrayList<>();
        while (!stack.isEmpty())
            sortedList.add(stack.pop().label);
        return sortedList;
    }

    private void topological(Node node, Set<Node> visited, Stack<Node> stack) {
        if (visited.contains(node))
            return;
        visited.add(node);
        for (var neg : adjecencyList.get(node))
            topological(neg, visited, stack);

        stack.push(node);
    }

    private class Node {
        private String label;

        public Node(String label) {
            this.label = label;
        }

        @Override
        public String toString() {
            return label;

        }
    }
}
