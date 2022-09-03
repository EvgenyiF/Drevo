public class Print {
    public void print(Person a,GeoTree gt){
        System.out.println(a.fullName+" " + a.age + " "+ a.gender);
        System.out.println(new Reserch(gt).spend(a,
                Relationship.parent) + " родители " + a.fullName);
        if (a.gender.equals("мужской")) {
            System.out.println(new Reserch(gt).spend(a,
                    Relationship.wife) + " жена " + a.fullName);
            System.out.println(new Reserch(gt).spend(a,
                    Relationship.brother) + " брат " + a.fullName);
        } else {
            System.out.println(new Reserch(gt).spend(a,
                    Relationship.husband) + " муж " + a.fullName);
            System.out.println(new Reserch(gt).spend(a,
                    Relationship.sister) + " сестра " + a.fullName);
        }
    }
}
