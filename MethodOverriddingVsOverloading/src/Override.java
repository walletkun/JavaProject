public class Override {
    @java.lang.Override
    protected Object clone() throws CloneNotSupportedException{
        return super.clone();
    }
}


class Person {
    private String name;
    private String birthDate;

    public Person(String name, String birthDate) {
        this.name = name;
        this.birthDate = birthDate;
    }

    @java.lang.Override
    public Person clone() {
        return new Person(name, birthDate);
    }
}

class Main {
    public static void main(String[] args) {
        Person person = new Person("Eric" , "04/21/1990");
        System.out.println(person.clone());
    }
}
