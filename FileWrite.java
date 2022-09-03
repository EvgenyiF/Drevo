import java.io.IOException;

public class FileWrite {
    public void write(Person a,GeoTree gt){
        if (a.gender.equals("мужской")) {
            try (java.io.FileWriter writer = new java.io.FileWriter("notes3.txt", false)) {
                writer.write(a.fullName + " " + a.age + " " + a.gender + '\n');
                writer.write(new Reserch(gt).spend(a,
                        Relationship.parent) + " родители " + a.fullName + '\n');
                writer.write(new Reserch(gt).spend(a,
                        Relationship.wife) + " жена " + a.fullName + '\n');
                writer.write(new Reserch(gt).spend(a,
                        Relationship.brother) + " брат " + a.fullName + '\n');
                writer.flush();
            } catch (IOException ex) {

                System.out.println(ex.getMessage());
            }
        }else {
            try (java.io.FileWriter writer = new java.io.FileWriter("notes3.txt", false)) {
                writer.write(a.fullName + " " + a.age + " " + a.gender + '\n');
                writer.write(new Reserch(gt).spend(a,
                        Relationship.parent) + " родители " + a.fullName + '\n');
                writer.write(new Reserch(gt).spend(a,
                        Relationship.wife) + " муж " + a.fullName + '\n');
                writer.write(new Reserch(gt).spend(a,
                        Relationship.brother) + " сестра " + a.fullName + '\n');
                writer.flush();
            } catch (IOException ex) {

                System.out.println(ex.getMessage());
            }
        }

    }
}
