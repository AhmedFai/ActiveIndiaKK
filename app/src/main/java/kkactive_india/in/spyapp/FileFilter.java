package kkactive_india.in.spyapp;

import java.io.File;

public class FileFilter implements java.io.FileFilter {

    private final String[] okFileExtensions =
            new String[] {"jpeg"};

    @Override
    public boolean accept(File file) {

        for (String extension : okFileExtensions)
        {
            if (file.getName().toLowerCase().endsWith(extension))
            {
                return true;
            }
        }

        return false;
    }
}
