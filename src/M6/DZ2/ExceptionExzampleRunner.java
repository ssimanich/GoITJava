package M6.DZ2;import java.util.Scanner;
public class ExceptionExzampleRunner {
    public static void main(String[] args) {
        System.out.print("Hello! Please enter your age: ");
        final Scanner scanner=new Scanner(System.in);
        final String userInput= scanner.next();
        try{
            final int age = Integer.parseInt(userInput);
            if(age<0){throw new NegativeAgeException(age);}
            if(age>100){throw new AnOldManException(age);}
            System.out.print("Your age is:" + age);}
        catch (NumberFormatException ex){
            System.out.print("[Error:]Age should be an integer number!");}
        catch (NegativeAgeException e){
            System.out.print("[Error:] Enter Age is: "+ e.getAgeValue()+" Age should be >=0!" );}
        catch (AnOldManException e){
            System.out.print("You are the oldest people you "+ e.getBigAge() + " years");}
}}