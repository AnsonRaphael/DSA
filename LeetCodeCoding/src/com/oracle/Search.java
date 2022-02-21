package com.oracle;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Search {

    public static void main(String[] args){
        List<String> titles = new ArrayList<>();
        titles.add("Applications Programming with Java");
        titles.add("Python Applications");
        titles.add("An Introduction to Data Structures with Applications");
        titles.add("Computer Architechture");
        titles.add("Java Introduction");
        titles.add("REST Introduction");
        titles.add("Webservices");
        HashMap<String,List<String>> wordMapTitle = new HashMap<>();
        for (int i = 0; i < titles.size(); i++) {
            String title=titles.get(i);
            String[] words = title.split(" ");
            for (int j = 0; j < words.length; j++) {
                if(wordMapTitle.containsKey(words[j].toLowerCase())){
                    wordMapTitle.get(words[j].toLowerCase()).add(title);
                }else{
                    List<String> mappedTitle= new ArrayList<String>();
                    mappedTitle.add(title);
                    wordMapTitle.put(words[j].toLowerCase(),mappedTitle );
                }
            }
        }

        String searchString="java applications";
        List<String> searchResults = search(titles,searchString,wordMapTitle);
        System.out.print(searchResults);
    }

    public static List<String>  search(List<String> titles,String searchString, HashMap<String,List<String>> wordMapTitle){
        String[] searchWords = searchString.split(" ");
        List<String> searchResult= new ArrayList<String>();

        for (int i = 0; i < searchWords.length; i++) {
            String searchWord=searchWords[i].toLowerCase();
            if(wordMapTitle.containsKey(searchWord)){
                List<String>resultTitles= wordMapTitle.get(searchWord);
                searchResult.addAll(resultTitles);
            }
        }
        return searchResult;
    }
}
