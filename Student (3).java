class Student

  {

    String studentName;

    int studentRollno;

    static String clgname="kbn";


    public static void main(String args[])

    {

     Student st=new Student();

      st.studentName="susmitha";

      st.studentRollno=123;

      Student st1=new Student();

      st1.studentName="lakshmi";

      st1.studentRollno=345;

      System.out.println(st.studentName+" "+st.studentRollno+" "+clgname);

      System.out.println(st1.studentName+" "+st1.studentRollno+" "+clgname);


    }

  }
