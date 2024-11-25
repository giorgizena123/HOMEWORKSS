public class book {
    String aut;
    String title;
    int num;
    book(){
    }
   book(String author,String tit,int numb){
        aut=author;
        title=tit;
        num=numb;

    }
    void displayBookInfo(){
        System.out.println("page number:"+num+" title:"+title+" author:"+aut);
    }
}
