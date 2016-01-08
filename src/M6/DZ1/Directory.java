package M6.DZ1;

public class Directory {

    public static void main(String[] args)
    {   File AudioFile = new AudioFile();
        File ImageFile = new ImageFile();
        File TextFile = new TextFile();
    try{
        TextFile.read();
        AudioFile.read();
        ImageFile.read();
        System.out.print("File ok");}
    catch(IllegalStateException e){
        System.err.print("No this file");}
    }}

