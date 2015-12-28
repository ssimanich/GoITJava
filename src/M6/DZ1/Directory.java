package M6.DZ1;

public class Directory {
    File AudioFile;
    File TextFile;
    File ImageFile;

    try{ //my code
        throws new IllegalStateException(AudioFile);}
    catch(IllegalStateException e){
        System.out.print("No this file" +e);}

    try{ //my code
        throws new IllegalStateException(TextFile);
    }
    catch(IllegalStateException e1){
        System.out.print("No this file" +e1);}

    try{ //my code
        throws new IllegalStateException(ImageFile);
    }
    catch(IllegalStateException e2){
        System.out.print("No this file" +e2);}

}