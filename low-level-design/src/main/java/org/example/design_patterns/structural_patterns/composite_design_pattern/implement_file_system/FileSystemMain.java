package org.example.design_patterns.structural_patterns.composite_design_pattern.implement_file_system;

public class FileSystemMain {
    public static void main(String[] args) {
        // parent directory with some files
        Directory movies = new Directory("movies");
        movies.add(new File("test-movie-1"));
        movies.add(new File("test-movie-2"));
        movies.add(new File("test-movie-3"));
        // create two directory and add files
        Directory hollywood = new Directory("hollywood");
        Directory chinese = new Directory("chinese");
        hollywood.add(new File("hollywood-1"));
        hollywood.add(new File("hollywood-2"));
        chinese.add(new File("chinese-1"));
        chinese.add(new File("chinese-2"));
        // add these directory to parent directory
        movies.add(hollywood);
        movies.add(chinese);
        // display file system
        movies.ls();
    }
}
