public class Main {

    public static void main(String[] args) {
        for(int i = 1; i <= 5; i++){
            LPAStudent s = new LPAStudent("S92300" +  i ,
                    switch (i){
                        case 1 -> "Mary";
                        case 2 -> "Carol";
                        case 3 -> "Tim";
                        case 4 -> "Harry";
                        case 5 -> "Lisa";
                        default -> "Anonymous";
                    },
                    "05/11/1985" ,
                    "Java MasterClass");
            System.out.println(s);
        }
        Student POJOStudent = new Student("S293006" , "Ann" ,
                "5/11/1985" , "Java MasterClass");
        LPAStudent LPAStudent = new LPAStudent("S293006" , "Bill" ,
                "5/11/1985" , "Java MasterClass");

        System.out.println(POJOStudent);
        System.out.println(LPAStudent);
        System.out.println(POJOStudent.getName() + " is taking " +
                            POJOStudent.getClassList());
        POJOStudent.setClassList(POJOStudent.getClassList() + ", Java OCP Exam 829");

        //Record Class does not have a record class since the header is immutable!
        //  LPAStudent.setClassList(LPAStudent.classList() + ", Java OCP Exam 829");

        //We can see that the Record Class does not have getter methods
//        System.out.println(LPAStudent.getName() + " is taking " +
//                LPAStudent.getClassList());
        //Instead we can use just call it as the parameter
        System.out.println(LPAStudent.name() + " is taking " +
                LPAStudent.classList());
    }
}
