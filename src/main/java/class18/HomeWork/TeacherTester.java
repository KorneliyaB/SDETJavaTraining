package class18.HomeWork;

public class TeacherTester {
    public static void main(String[] args) {
        MathTeacher kate=new MathTeacher();
        kate.name="Kate Molins";
        kate.age=29;
        kate.gender="female";
        kate.solveTasks();
        kate.work();

        PianoTeacher molly=new PianoTeacher();
        molly.name="Molly Smith";
        molly.subject="piano";
        molly.age=36;
        molly.teach();
        molly.eating();
        molly.playPiano();

        ChemistryTeacher tom=new ChemistryTeacher();
        tom.name="Tom Johnson";
        tom.age=46;
        tom.subject="chemistry";
        tom.help();
        tom.experiment();

    }

}
