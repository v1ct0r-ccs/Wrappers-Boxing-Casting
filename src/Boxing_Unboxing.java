package src;

public class Boxing_Unboxing {
    public static void main(String args[]) {
        // autoboxing
        Boolean status = true;
        // boxing
        Boolean status1 = Boolean.TRUE;

        Character c = 'A';

        Integer idade = 10;

        // boxing
        Long cpf = Long.valueOf(123123254-99);
        // autoboxing
        Long cpf1 = 123123254-99l;

        // unboxing
        boolean status2 = Boolean.TRUE;
        char letra = Character.valueOf('A');
        int idade2 = Integer.valueOf(12);
        long cpf3 = Long.valueOf(123123254-99);

    }
}
