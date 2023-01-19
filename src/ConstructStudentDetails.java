public class ConstructStudentDetails {
    int id;
    String name;
    ConstructStudentDetails(){
        System.out.println("Default Constructor");

    }
    ConstructStudentDetails(int i,String n){
        id = i;
        name = n;


    }
    public static void main(String[] args){
        ConstructStudentDetails s = new ConstructStudentDetails();
        System.out.println("Student Id : " +s.id);
        System.out.println("Student name : " +s.name);
        ConstructStudentDetails constructStudentDetails = new ConstructStudentDetails(24, "jay");
        System.out.println("Student Id : "+constructStudentDetails.id);
        System.out.println("Student Name : " +constructStudentDetails.name);
    }

}
