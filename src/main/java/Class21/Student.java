package Class21;

public class Student {

    void study(){
        System.out.println("the student studies");
    }
    void party(){
        System.out.println("students like to party");
    }
    void eatJunk(){
        System.out.println("they eat junk");
    }

}

class SyntaxStudent extends Student{

    @Override
    void study(){
        System.out.println("studies alot");
    }
    @Override
    void party(){
        System.out.println("do not party");
    }
    @Override
    void eatJunk() {
        System.out.println("sometimes eat junk");
    }
    void works(){
        System.out.println("goes to work");
    }
}
class collegeStudent extends Student{


    @Override
    void study(){
        System.out.println("studies alot");
    }
    @Override
    void party(){
        System.out.println("do not party");
    }
    @Override
    void eatJunk() {
        System.out.println("sometimes eat junk");
    }

}
class SchoolStudent extends Student{
    @Override
    void study(){
        System.out.println("studies some");
    }
    @Override
    void party(){
        System.out.println("party");
    }
    @Override
    void eatJunk() {
        System.out.println("do eat junk");
    }
    void walkToSchool(){
        System.out.println("walk to school");

    }

}

class StudentTester{
    public static void main(String[] args) {

        Student student []={new SyntaxStudent(), new collegeStudent(), new SchoolStudent()};

        for(Student newStu : student){

            if (newStu instanceof SyntaxStudent){
                ((SyntaxStudent)newStu).works();

            }else if(newStu instanceof SchoolStudent){
                ((SchoolStudent) newStu).walkToSchool();
            }
            newStu.eatJunk();
            newStu.party();
            newStu.study();
        }

        Student syntax = new SyntaxStudent();
        if (syntax instanceof SyntaxStudent){//checking if the variable there contains the object of the class or not
            ((SyntaxStudent)syntax).works();
        }else{
            System.out.println("wrong type of object is present in syntax var casting will fail");
        }


        Student school = new SchoolStudent();
        ((SchoolStudent)school).walkToSchool();


    }

}

