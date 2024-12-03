public class student {
    private String name;
    private String surname;
    private int age;
    private int kurs;
    private double score;
    student(String name,String surname,int age,int kurs,double score){
this.setname(name);
this.setSurname(surname);
this.setAge(age);
this.setKurs(kurs);
this.setScore(score);
    }
    public String getName(){
        return name;
    }
    public String getSurname(){
        return surname;
    }
    public int getAge(){
        return age;
    }
    public int getKurs(){
        return kurs;
    }
    public double getScore(){
        return score;
    }
    public void setname(String name){
        this.name=name;
    }
    public void setSurname(String surname){
        this.surname=surname;
    }
    public void setAge(int age){
        this.age=age;
    }
    public void setKurs(int kurs){
        this.kurs=kurs;
    }
    public void setScore(double score){
        this.score=score;
    }
    public void printStudentInfo() {
        System.out.println("Student Info:");
        System.out.println("Name: " + name + " " + surname);
        System.out.println("Age: " + age);
        System.out.println("Course: " + kurs);
        System.out.println("Average Grade: " + score);
    }
}
