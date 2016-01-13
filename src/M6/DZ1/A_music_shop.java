package M6.DZ1;
import java.util.Scanner;
public class A_music_shop {
    public static void main(String[] args) {
        System.out.println("Введите сумму денег которые Вы расчитываете приобрести инструмент");
        Scanner scanner = new Scanner(System.in);
        final String userInput= scanner.next();
        try{final int sum = Integer.parseInt(userInput);
            if(sum<0){throw new NegativeSumException(sum);}
            if(sum<10) {throw new IllegalArgumentException(String.valueOf(sum));}
            System.out.println("На сумму "+sum+" в нашем магазине найдены товары. Удачной покупки!");
        }catch (NumberFormatException e1){
            System.out.print("[Error]: Некоректный ввод суммы, используйте цифры клавиатуры");}
        catch (NegativeSumException e2){
            System.out.print("[Error]: Сумма не должна быть отрицательной, пожалуйста укажите корректную, Вы ввели сумму \""+ e2.getSum()+ "\"");}
        catch (IllegalArgumentException e3){
        System.out.printf("[Error]: На данную сумму наличных вы не сможете приобрести товар, Вы ввели сумму \"" +e3.getMessage()+ "\"");}
    }
}
