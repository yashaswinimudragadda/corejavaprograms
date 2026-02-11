package corejavaprograms;

public class Person {
    String email, name, course, role, techcourse, idno;
    int pass, rollno;
    static String collegename;
    static int stdcount = 0;
    static int teachercount = 0;
    static int totalcount = 0;

    // 1. General Constructor (The Base)
    Person(int pass, String email, String name, String role) {
        this.pass = pass;
        this.email = email;
        this.name = name;
        this.role = role;
        totalcount++;
    }

    // 2. Constructor for Student
    Person(int pass, String email, String name, int rollno, String role, String course) {
        this(pass, email, name, role); // Calls the General Constructor
        this.rollno = rollno;
        this.course = course;
        stdcount++; 
    }

    // 3. Constructor for Teacher
    Person(int pass, String email, String name, String idno, String role, String techcourse) {
        this(pass, email, name, role); // Calls the General Constructor
        this.idno = idno;
        this.techcourse = techcourse;
        teachercount++; 
    }

    static void displaymenu() {
        System.out.println("\nWelcome to " + (collegename != null ? collegename : "College of Science"));
        System.out.println("Enter the code:");
        System.out.println(" 1. Master\n 2. Details\n 3. Attendance\n 4. Attendance Details\n 5. Update Details\n 6. Fee Details\n 7. About\n 0. Exit");
    }

    public static void handlechoice(int choice) {
        switch(choice) {
            case 1: Master.showmastermenu(); break;
            case 2: Details.showdetailsmenu(); break;
            case 3: Attendance.showattendancemenu(); break;
            case 4: Attendancedetailsmenu.showattendancedetailsmenu(); break;
            case 5: Updatedetails.showupdatedetailsmenu(); break;
            case 6: Fee.showfeedetailsmenu(); break;
            case 7: Aboutus.aboutus(); break;
            case 0: 
                System.out.println("Exiting System...");
                System.exit(0); 
                break;
            default:
                System.out.println("Invalid choice. Try again.");
        }
        // After an action is finished, show menu again
        displaymenu();
    }
}