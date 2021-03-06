public class Main {

  // 1 Создать пустой проект и прописать метод main();
  public static void main(String[] args) {
    // 2. Создать переменные всех пройденных типов и инициализировать их значения
    // приметивные типы данных

    // Числовые
    byte bytes = 127; // целочисленное занимает 8 бит от -128 до 127
    short shorts = 32767; // целочисленное занимает 16 бит от -32768 до 32767
    int integer = 2147483647; // целочисленное занимает 32 бита от -2147483648 до 2147483647
    long longs = 922372036854775807L; // целочисленное занимает 64 бита от -922372036854775808 до 922372036854775807
    float floats = 3.4e+038F; // с плавующей точкой 32 бита значение от 3.4е-038 до 3,4е+038
    double doubles = 1.7e+308; // с плавующей точкой 64 бита значение от 1.7e-308 до 1.7e+308
    char cr = 'd'; // хранит один символ или цифру занимает 16 бит в кодировке Unicode
    // логические
    boolean booleans = true; // хранит 0 или 1 или true (правда) false (ложь)

    // ссылочные типы данных
    String string = "Создается ссылка на объект класса Стринг в которую заносится текст";
    Integer integer1 = Integer.MAX_VALUE; // Имеет тоже свойство что и примитив только ссылочного типа
    Byte byte1 = Byte.MAX_VALUE; // Имеет тоже свойство что и примитив только ссылочного типа
    Short short1 = Short.MAX_VALUE; // Имеет тоже свойство что и примитив только ссылочного типа
    Long longs1 = Long.MAX_VALUE; // Имеет тоже свойство что и примитив только ссылочного типа
    Float float1 = Float.MAX_VALUE; // Имеет тоже свойство что и примитив только ссылочного типа
    Double double1 = Double.MAX_VALUE; // Имеет тоже свойство что и примитив только ссылочного типа
    Character character1 = Character.MAX_VALUE; // Имеет тоже свойство что и примитив только ссылочного типа
    Boolean boolean1 = Boolean.TRUE; // Имеет тоже свойство что и примитив только ссылочного типа

    System.out.println(CalculatingSolution(10, 5, 10, 1.5));
    System.out.println(LimitOfNumber(16, 5));
    NegativeOrPositiveNumber(-10);
    System.out.println(NegativeNumberTrue(5));
    HelloName("Сергей");
    LeapOrNormal(2020);


  }
  // 3. Написать метод вычисляющий выражение a * (b + (c / d))
  // и возвращающий результат,где a, b, c, d – входные параметры этого метода

  // В задачи не указан тип входных данных поэтому буду просто использовать double
  static double CalculatingSolution(double a, double b, double c, double d) {
    double Solution = a * (b + (c / d));// Создаем переменную с уравнением
    double scale = Math.pow(10, 2); // Данным методом создаю число под округление
    return Math.ceil(Solution * scale) / scale; // Округляю и вывожу решение
  }

  // 4. Написать метод, принимающий на вход два числа, и проверяющий что их сумма лежит в пределах
  // от 10 до 20(включительно), если да – вернуть true, в противном случае – false;
  static boolean LimitOfNumber(int a, int b) {
    if ((a + b) >= 10
        && (a + b) <= 20) { // Если сумма двух чисел больше или равна 10 и меньше или ровна 20 то
      return true; // На выход с метода идет правда
    } else { // иначе
      return false; // ложь
    }
  }

  // 5. Написать метод, которому в качестве параметра передается целое число
  // , метод должен напечатать в консоль положительное ли число передали,
  // или отрицательное;
  // Замечание: ноль считаем положительным числом.
  static void NegativeOrPositiveNumber(int a) {
    if (a == 0 || a > 0) {
      System.out.println("Положительное");
    } else {
      System.out.println("Отрицательное");
    }
  }

 // 6. Написать метод, которому в качестве параметра передается целое число,
  // метод должен вернуть true, если число отрицательное;
  static boolean NegativeNumberTrue(int a) {
    if (a < 0)
      return true;
    else
      return false;
  }
 // 7. Написать метод, которому в качестве параметра передается строка,
  // обозначающая имя, метод должен вывести в консоль сообщение
  // «Привет, указанное_имя!»;
  static void HelloName(String name) {
    System.out.println("Привет, " + name + "!");
  }
  // 8. * Написать метод, который определяет является ли год високосным,
  // и выводит сообщение в консоль. Каждый 4-й год является високосным,
  // кроме каждого 100-го, при этом каждый 400-й – високосный.
  static void LeapOrNormal(int a) {
    System.out.println(a + " - " +
        (a % 400==0?"Високосный":a % 100==0? "Обычный":
        a%4==0?"Високосный": "Обычный"));
  }

}
