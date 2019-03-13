
class Student {
    public int averageMark;
    private boolean hasDiploma = true;

    public Student(int averageMark) {
        this.averageMark = averageMark;
                                      }

    public void isGraduated() {
        if (averageMark >= 5) {
            hasDiploma = true;
            System.out.println("Is graduated");
        }
        else
        {
            hasDiploma=false;
            System.out.println("Is not graduated");
        }
    }
}

class HighSchoolStudent extends Student {
    public HighSchoolStudent(int averageMark) {
        super(averageMark);
    }
    public void isGraduated() {
        if (averageMark >= 5)
          //  hasDiploma = true;
            System.out.println("Is graduated");
        else
          //  hasDiploma=false;
            System.out.println("Is not graduated");
    }
    }

class Main {
    public static void main(String args[])
    {
        Student highschool  = new HighSchoolStudent(10);
        highschool.isGraduated();
    }
}