//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
//1)
        weather a = new weather("tbilisi", 30, 40, true, true, false);
        System.out.println(a.getName());
        System.out.println(a.getSpeed());
        System.out.println(a.getPercent());
        System.out.println(a.getRain());
        System.out.println(a.getCloud());
        System.out.println(a.getSun());
        if (a.getPercent() > 20 && a.getRain() == true && a.getSun() == false) {
            System.out.println("გარეთ გასვლას არ გირჩევთ");
        } else {
            System.out.println("გარეთ გადი მოეშვი ტელეფონს");

        }

//2)

        student[] arr=new student[5];
        arr [0]=new student("gio","kividze",23,3,6);
        arr [1]=new student("saba","wylisshvili",27,4,1);
        arr [2]=new student("luka","miwisshvili",28,5,2);
        arr [3]=new student("oto","cecxlishvili",20,1,4);
        arr [4]=new student("jorj","haerishvili",21,2,10);
        for (int i=0;i<5;i++) {
            arr[i].printStudentInfo();
            System.out.println("------------------------------");
        }

//3)
        for(int i=0;i<4;i++){
            if(arr[i].getScore()<arr[i+1].getScore()){
                double l=arr[i].getScore();
                arr[i].getScore()=arr[i+1].getScore();
                arr[i+1].getScore()=l;
            }

        }
       for(int i=0;i<5;i++){
           System.out.println(arr[0].getName());
           System.out.println(arr[0].getSurname());
       }
    }
}
