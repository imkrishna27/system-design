package org.example.design_patterns_interview.lru_cache;

import java.util.HashMap;
import java.util.Map;

public class LRUCache {
    private final int capacity;
    private Map<Integer, Node> cache;
    private Node head;
    private Node tail;

    public LRUCache(int capacity) {
        this.capacity = capacity;
        // define empty map
        this.cache = new HashMap<>(capacity);
        // create initial dummy head and tail nodes
        Node head = new Node(0,0);
        Node tail = new Node(0,0);
        // point to each other
        head.next = tail;
        tail.prev = head;
    }

    private void moveToHead(Node node) {
        this.removeNode(node);
        addToHead(node);
    }

    private void removeNode(Node node) {
        node.prev.next = node.next;
        node.next.prev = node.prev;
    }

    private void addToHead(Node node) {
        // curr node operations
        node.next = head.next;
        node.prev = head;
        // head operation
        head.next.prev = node;
        head.next = node;
    }

    public int get(int key) {
        if (!cache.containsKey(key)) {
            return -1;
        }
        moveToHead(cache.get(key));
        return cache.get(key).value;
    }

    public void put(int key,int value) {
        // if key exists update it and move to front
        if(cache.containsKey(key)) {
            Node node = cache.get(key);
            node.value = value;
            moveToHead(node);
        } else {
            // if cache is full remove least used item tail.prev
            removeNode(tail.prev);
            cache.remove(tail.prev.key);
            // create new node add it to cache and to front
            Node newNode = new Node(key,value);
            addToHead(newNode);
            cache.put(newNode.key, newNode);

        }
    }
}
