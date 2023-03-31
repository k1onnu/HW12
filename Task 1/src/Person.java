public class Person {
    private String name;
    private String jobTitle;
    private String Job;
    private int age;
    private double salary;

    public Person() {
    }

    public Person(String name, String jobTitle, String placeWork, int age, double income) {
        this.name = name;
        this.jobTitle = jobTitle;
        this.Job = placeWork;
        this.age = age;
        this.salary = income;
    }
//1
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

//2
    public String getJobTitle() {
        return jobTitle;
    }
    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

//3
    public String getPlaceWork() {
        return Job;
    }
    public void setPlaceWork(String placeWork) {
        this.Job = placeWork;
    }

//4
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }

//5
    public double getIncome() {
        return salary;
    }
    public void setIncome(double income) {
        this.salary = income;
    }




}

