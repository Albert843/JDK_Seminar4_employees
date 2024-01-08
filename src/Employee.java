public class Employee {
    private String name;
    private int serviceNumber;
    private int phoneNumber;
    private int workExperience;

    public Employee(int serviceNumber, int phoneNumber, String name, int workExperience) {
        this.name = name;
        this.serviceNumber = serviceNumber;
        this.phoneNumber = phoneNumber;
        this.workExperience = workExperience;
    }

    public String getName() {
        return name;
    }
    public int getServiceNumber() {
        return serviceNumber;
    }
    public int getPhoneNumber() {
        return phoneNumber;
    }
    public int getWorkExperience() {
        return workExperience;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setServiceNumber(int serviceNumber) {
        this.serviceNumber = serviceNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setWorkExperience(int workExperience) {
        this.workExperience = workExperience;
    }

    @Override
    public String toString() {
        return "\n" +
                "{" +
                "Табельный номер = " + serviceNumber +
                ", Номер телефона = " + phoneNumber +
                ", Имя = '" + name + '\'' +
                ", Стаж = " + workExperience +
                '}';
    }
}
