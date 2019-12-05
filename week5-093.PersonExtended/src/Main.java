public class Main {
    public static void main(String[] args) {
        Person pekka = new Person("Pekka", 15, 2, 1993);
        Person steve = new Person("Thomas", 1, 3, 1955);
        Person justin = new Person("Justin",29, 12, 1996);
          Person jonno = new Person("Jonno", new MyDate(5, 12, 2018));
        Person steven = new Person("Steven");

        System.out.println( jonno+" "+jonno.age() );
        System.out.println( steven +" "+ steven.age());
        System.out.println( steve.getName() + " age " + steve.age() + " years");
        System.out.println( pekka.getName() + " age " + pekka.age() + " years");
        System.out.println(justin.getName() + " age " + justin.age() + " years");
        System.out.println("is "+ justin.getName() +" older than "+pekka.getName()+" ?" + justin.olderThan(pekka));
    }
}
