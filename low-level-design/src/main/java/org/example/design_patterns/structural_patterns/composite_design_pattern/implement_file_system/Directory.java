package org.example.design_patterns.structural_patterns.composite_design_pattern.implement_file_system;

import java.util.ArrayList;
import java.util.List;

public class Directory implements FileSystem {
    List<FileSystem> fileList = new ArrayList<>();
    String directoryName;
    public Directory(String directoryName) {
        this.directoryName = directoryName;
    }

    public void add(FileSystem fileSystem) {
        this.fileList.add(fileSystem);
    }
    @Override
    public void ls() {
        System.out.println("directory name is: "+ directoryName);
        for(FileSystem file:fileList) {
            file.ls();
        }
    }
}
