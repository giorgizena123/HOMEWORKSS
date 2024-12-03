public class car {
    String mark;
    String model;
    int age;
    String num;
    car(String mark1,String model1,int age1,String num1){
        mark=mark1;
        model=model1;
        age=age1;
        num=num1;
    };
    void printinfo(){
        System.out.println("car mark:"+mark+" ,car model:"+model+", car age:"+age+", car number:"+num);
    }


}


