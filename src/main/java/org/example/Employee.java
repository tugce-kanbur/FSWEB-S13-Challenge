package org.example;

public class Employee {
    private long id;
    private String fullName;
    private String email;
    private String password;
    private String[] healthPlans;

    public Employee(long id, String fullName, String email, String password, String[] healthPlans){
        this.id = id;
        this.fullName = fullName;
        this.email = email;
        this.password = password;
        this.healthPlans = healthPlans;
    }
    public void addHealthPlan(int index, String name) {
        if(index < 0 || index >= healthPlans.length) {
            System.out.println("Index dizide mevcut değil.");
        }else if(healthPlans[index] != null){
            System.out.println("Index " + index + " zaten dolu, mevcut bir planınız var.");
        }else{
            healthPlans[index] = name;
            System.out.println("Plan " + index + ". index'e eklendi.");
        }
    }
    public long getId(){
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    public String getFullName(){
        return fullName;
    }
    public void setFullName(String fullName){
        this.fullName = fullName;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getPassword() {
        return password;
    }
    public String[] getHealthPlans() {
        return healthPlans;
    }
    public void setPassword(String password){
        this.password = password;
    }
    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("Employee{id = ").append(id)
                .append(", Full Name = ").append(fullName)
                .append(", Email = ").append(email)
                .append(", Password = ").append(password)
                .append(", healthPlans=[");
        for(int i = 0; i < healthPlans.length; i++){
            if(healthPlans[i] != null) {
                sb.append(healthPlans[i]);
            }
            if (i < healthPlans.length - 1) sb.append(", ");
        }
        sb.append("]}");
        return sb.toString();
    }
}
