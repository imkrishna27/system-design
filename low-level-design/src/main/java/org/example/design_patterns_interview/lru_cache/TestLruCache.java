package org.example.design_patterns_interview.lru_cache;

public class TestLruCache {
    public static void main(String[] args) {
        LRUCache lruCache = new LRUCache(5);
        lruCache.put(1,12);
        lruCache.put(2,14);
        lruCache.put(3,16);

    }
}
