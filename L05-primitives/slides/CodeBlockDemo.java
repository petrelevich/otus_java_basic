package slides;

class CodeBlockDemo {
    public static void main(String[] args){
        int y = 20;

        for(int i=0; i < 10; i++){
            System.out.println("i = " + i);
            System.out.println("y = " + y);
            y = y - 2;
        }

        System.out.println(y);
       // System.out.println(i); // Будет ошибка, i недоступна
    }
}