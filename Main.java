import java.io.FileWriter;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {
        Person irina = new Person("Ирина", 25, "женский");
        Person vasya = new Person("Вася", 15, "мужской");
        Person masha = new Person("Маша", 10, "женский");
        Person jane = new Person("Женя", 35, "женский");
        Person ivan = new Person("Ваня", 35, "мужской");
        GeoTree gt = new GeoTree();
        gt.append(irina, vasya);
        gt.append(irina, masha);
        gt.append(vasya, jane);
        gt.append(vasya, ivan);

        gt.appMarriage(ivan, irina);
        gt.appMarriage(vasya, jane);

        gt.appBrother(vasya, ivan);

        gt.appSister(irina, masha);

        Person a = irina;
        FileWrite writer = new FileWrite();
        writer.write(a,gt);
        Print print = new Print();
        print.print(a,gt);


    }
}
