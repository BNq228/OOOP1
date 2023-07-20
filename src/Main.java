public class Main {
    public static void main(String[] args) {
        Gryffindor harry = new Gryffindor("Harry Potter", 100, 100, 100, 100, 100);
        //    System.out.println(harry);
        //  System.out.println(harry.calculateSpecificScore());
        //   System.out.println(harry.calculateGeneralScore());
        Gryffindor hermoine = new Gryffindor("Hermoine Granger", 85, 55, 68, 78, 30);
        Gryffindor ron = new Gryffindor("Ron Weasley", 50, 60, 70, 80, 40);

        Hufflepuff zakharia = new Hufflepuff("Zakharia Smith", 50, 80, 60, 50, 40);
        Hufflepuff cedrick = new Hufflepuff("Cedrick Diggory", 65, 40, 70, 50, 80);
        Hufflepuff justin = new Hufflepuff("Justin Finch-Fletchlie", 10, 20, 30, 40, 50);

        Slytherin draco = new Slytherin("Draco Malfoy", 85, 85,90,70, 90,80,100);
        //     System.out.println(draco.calculateSpecificScore());
        //    System.out.println(draco.calculateGeneralScore());
        Slytherin graham = new Slytherin(" Graham Montague", 60, 70, 30, 20, 75, 60, 20);
        Slytherin gregoryGoyle = new Slytherin("Gregory Goyle", 50, 50, 50, 80, 50, 50, 50);

        Ravenclaw cho = new Ravenclaw("Cho Chang", 90, 80, 70, 60, 50, 40);
        Ravenclaw padma = new Ravenclaw("Padma Patil", 60, 40, 50, 30, 70, 80);
        Ravenclaw marcus = new Ravenclaw("Marcus Belbie", 70, 70, 60, 60, 70, 70);







        gregoryGoyle.compare(draco);


    }
}
