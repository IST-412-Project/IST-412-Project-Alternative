package ist412testproject;

public class PatientRecord 
{
    private String firstName;
    private String lastName;
    private Integer age;
    private String birthDate;
    private Double PatientVisit;

    public PatientRecord(String firstName, String lastName, Integer age, String birthDate, Double PatientVisit) 
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.birthDate = birthDate;
        this.PatientVisit = PatientVisit;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Integer getAge() {
        return age;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public Double getPatientVisit() {
        return PatientVisit;
    }

    
}
