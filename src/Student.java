class Student {

    private String name[];
    private String address[];
    private int age[];
    private double mathGrade[];
    private double englishGrade[];
    private double scienceGrade[];
    private double average;

    public Student(int jumlah) {
        name = new String[jumlah];
        address = new String[jumlah];
        age = new int[jumlah];
        mathGrade = new double[jumlah];
        scienceGrade = new double[jumlah];
        englishGrade = new double[jumlah];
    }

    public void setName(int i, String n) {
        name[i] = n;
    }

    public void setAddress(int i, String a) {
        address[i] = a;
    }

    public void setAge(int i, int ag) {
        age[i] = ag;
    }

    public void setMath(int i, int math) {
        mathGrade[i] = math;
    }

    public void setEnglish(int i, int english) {
        englishGrade[i] = english;
    }

    public void setScience(int i, int science) {
        scienceGrade[i] = science;
    }

    private double getAverage(int i) {
        double result = 0;
        result = (mathGrade[i] + scienceGrade[i] + englishGrade[i]) / 3;
        return result;
    }

    public void displayMessage(int i) {
        System.out.println("\nSiswa dengan nama " + name[i]);
        System.out.println("beralamat di " + address[i]);
        System.out.println("berumur " + age[i]);
        System.out.println("mempunyai nilai rata rata " + getAverage(i));

    }
}
