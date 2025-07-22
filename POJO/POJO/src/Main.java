public class Main {

    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            LPAStudent s = new LPAStudent(
                    "71000" + i,
                    switch (i) {
                        case 1 -> "Marry";
                        case 2 -> "Carol";
                        case 3 -> "Dev";
                        case 4 -> "Harry";
                        case 5 -> "Lisa";
                        default -> "Anonymous";
                    },
                    "2004/10/10",
                    "Java MasterClass");
            System.out.println(s);
        }
        Student pojoStudent = new Student("70096",
                "Biku",
                "2011/11/11",
                "Java Masterclass");

        LPAStudent recordStudent = new LPAStudent("71100",
                "Lakxay",
                "2005/06/06",
                "Java Masterclass");

        System.out.println(pojoStudent);
        System.out.println(recordStudent);

        pojoStudent.setClassList(pojoStudent.getClassList()+", Java OCP Exam 829");
//        recordStudent.classList(recordStudent.classList()+"Java, OCP Exam 829");

        System.out.println(pojoStudent.getName()+" is taking "+pojoStudent.getClassList());
        System.out.println(recordStudent.name()+" is taking "+recordStudent.classList());
    }

}
