package day_31_MethodOverriding.statesTask;

public class TestStatesObject {
    public static void main(String[] args) {
        California ca = new California("California","CA","Democrat","Newsom","James",7000000,0.5);
        Florida flo = new Florida("Florida","FL","Republican","Antonio","Lily",6000000,0.2);
        Texas tx = new Texas("Texas","TX","Republican","Abbot","Ted",9000000,0.3);
        Virginia var = new Virginia("Virginia","VA","Democrat","David","Liza",5000000,0.1);

        System.out.println(ca);
        System.out.println(flo);
        System.out.println(tx);
        System.out.println(var);

        ca.weather();
        flo.weather();
        tx.weather();
        var.weather();
    }

}
