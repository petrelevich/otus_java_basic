class Box {
    double width;
    double height;
    double depth;

//    public Box() {
//
//    }
//
//    public Box(double width, double height, double depth) {
//        this.width = width;
//        this.height = height;
//        this.depth = depth;
//    }

    double volume() {
        // this -- ссылка на текущий экземпляр,
        // указывать необязательно,
        // но иногда без this никак - см. конструктор
        double volume = this.width * height * depth;
        return volume; // возврат значения из метода
    }
}

public class BoxDemo {
    public static void main(String[] args) {
        // Создание экземпляра (объекта)
        Box box1 = new Box();
        System.out.println(box1);
        // Значения полей везде 0
        System.out.printf(
                "width = %f, height = %f, depth = %f\n",
                box1.width, box1.height, box1.depth);
        System.out.println("volume() = " + box1.volume());

        // Зададим значения
        box1.width = 1;
        box1.height = 2;
        box1.depth = 3;
        System.out.printf(
                "width = %f, height = %f, depth = %f\n",
                box1.width, box1.height, box1.depth);
        System.out.println("volume() = " + box1.volume());

        // Создадим конструктор c с параметрами
        // И конструктор по умолчанию
//        System.out.println("=== box2");
//        Box box2 = new Box(2, 4, 8);
//        System.out.println(box2);
//        // Значения полей везде 0
//        System.out.printf(
//                "width = %f, height = %f, depth = %f\n",
//                box2.width, box2.height, box2.depth);
//        System.out.println("volume() = " + box2.volume());
//
//        // Ссылки
//        System.out.println("=== Ссылки");
//        Box box3 = box2;
//        System.out.println("box1 - " + box1);
//        System.out.println("box2 - " + box2);
//        System.out.println("box3 - " + box3);
//
//        // Изменяем box3, выводим box2 - объект один и тот же
//        box3.width = 1;
//        box3.height = 1;
//        box3.depth = 1;
//        System.out.printf(
//                "width = %f, height = %f, depth = %f\n",
//                box2.width, box2.height, box2.depth);
//        System.out.println("volume() = " + box1.volume());

        // Объекты передаются в методы "по ссылке" (по значению ссылки)
    }
}
