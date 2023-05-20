package com.trie;

import java.util.Arrays;

public class Trie {
    static final int ALPHABET_SIZE=26;
    static class TrieNode{
        TrieNode[] children = new TrieNode[ALPHABET_SIZE];
        boolean isEndOfWord;

        public TrieNode() {
            isEndOfWord=false;
            Arrays.fill(children,null);
        }
    }
    static TrieNode root;
    static void insert(String key){
        int level;
        int length=key.length();
        int index;
        TrieNode crwl=root;
        for (level = 0; level <length ; level++) {
            index=key.charAt(level)-'a';
            if(crwl.children[index]==null){
                crwl.children[index]=new TrieNode();
            }
            crwl=crwl.children[index];
        }
        crwl.isEndOfWord=true;
    }
    static boolean search(String key){
        int level;
        int length=key.length();
        int index;
        TrieNode crwl=root;
        for (level = 0; level <length ; level++) {
            index=key.charAt(level)-'a';
            if(crwl.children[index]==null){
                return false;
            }
            crwl=crwl.children[index];
        }
        return crwl.isEndOfWord;
    }

    public static void main(String args[])
    {
        // Input keys (use only 'a' through 'z' and lower case)
        String keys[] = {"the", "a", "there", "answer", "any",
                "by", "bye", "their"};

        String output[] = {"Not present in trie", "Present in trie"};


        root = new TrieNode();

        // Construct trie
        int i;
        for (i = 0; i < keys.length ; i++)
            insert(keys[i]);

        // Search for different keys
        if(search("the") == true)
            System.out.println("the --- " + output[1]);
        else System.out.println("the --- " + output[0]);

        if(search("these") == true)
            System.out.println("these --- " + output[1]);
        else System.out.println("these --- " + output[0]);

        if(search("their") == true)
            System.out.println("their --- " + output[1]);
        else System.out.println("their --- " + output[0]);

        if(search("thaw") == true)
            System.out.println("thaw --- " + output[1]);
        else System.out.println("thaw --- " + output[0]);

    }
}
