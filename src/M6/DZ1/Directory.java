package M6.DZ1;

public class Directory {
File AudioFile;
File ImageFile;
File TextFile;

public void MyException(){
        try {   AudioFile.read();
                ImageFile.read();
                TextFile.read();}
        catch (IllegalArgumentException e) {
                System.out.println(e);
        }
}}

