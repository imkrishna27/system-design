package org.example.design_patterns.structural_patterns.composite_design_pattern.implement_file_system;

public class File implements FileSystem{
    String fileName;
    public File(String fileName) {
        this.fileName = fileName;
    }
    @Override
    public void ls() {
        System.out.println("name of file is: "+ fileName);
    }
}
