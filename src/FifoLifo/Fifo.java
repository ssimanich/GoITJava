package FifoLifo;

public class Fifo {
    String[] arr;
    public Fifo(String[] arr) {
        this.arr = arr;
    }
//------------------------------------------------Вывод данных пользователю---------------------------------------------
    public void print(){
        for (String anArr : arr) {
            System.out.println(anArr);
        }
    }
//-----------------------------------------Определение количества элементов в очереди-----------------------------------
    public int size(){
        int elements = 0;
        for (String anArr : arr) {
            if (anArr != null) {
                elements++;
            }
        }
        return elements;
    }
//---------------------------------------------Удаляет последний добавленый элемент------------------------------------
    public String pop(){
        String firstElement = arr[0];
        for (int i = 0; i<arr.length; i++){
            if(i!=arr.length-1){
                arr[i] = arr[i+1];
                }
            else arr[i]=null;
            }
        return firstElement;
    }
//------------------------------Возвращает элемент, находящийся в голове очереди, не удаляя его-------------------------
    public String front(){
        if(arr[0]==null) System.out.println("Массив пуст");
        return arr[0];
    }
//------------------------------Добавление элемента в массив и расширяет массив при переполнении------------------------
    public void push(String element){
        if (size() < arr.length) {
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == null) {
                    arr[i] = element;
                    break;
                }
            }
        } else {
            String[] arrNew = new String[(int) (arr.length * 2)];
            for (int i = 0; i < arrNew.length; i++) {
                if (i < arr.length) {
                    arrNew[i] = arr[i];
                }
                if (arrNew[i] == null) {
                    arrNew[i] = element;
                    arr = arrNew;
                    break;
                }
            }
        }
    }
//----------------------------------Метод для предотвращениея отображения "null"--------------------------------------------------------------
    public void clear() {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == null) {
                break;
            } else {
                arr[i] = null;
            }
        }
    }
//------------------------------Указывает, есть ли элементы(FALSE) или нет (TRUE) в стеке-------------------------------
    public boolean empty() {
        return size() != 0;
    }
}
