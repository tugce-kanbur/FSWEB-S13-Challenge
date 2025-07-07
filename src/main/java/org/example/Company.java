package org.example;

import org.example.enums.Plan;

public class Company {
    private long id;
    private  String name;
    private double giro;
    private String[] developerNames;

    public Company (long id, String name, double giro, String[] developerNames) {
        this.id = id;
        this.name = name;
        this.giro = giro;
        this.developerNames = developerNames;
    }
    public long getId(){
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    public String getName(){
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public double getGiro(){
        return giro;
    }
    public void setGiro(double giro) {
        this.giro = Math.max(0,giro);
    }
    public String[] getDeveloperNames(){
        return developerNames;
    }
    public void addEmployee(int index, String name) {
        if(index < 0 || index >= developerNames.length){
            System.out.println("Index developerNames dizisi dışında.");
        }else if(developerNames[index] != null){
            System.out.println("Index " + index + " zaten dolu.");
        }else{
            developerNames[index] = name;
            System.out.println("Çalışan " + name + " index" + index + " konuma eklendi.");
        }
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Company{id=").append(id)
                .append(", name=").append(name).append("/ ")
                .append(", giro=").append(giro)
                .append(", developersNames = [");
        for(int i = 0; i < developerNames.length; i++) {
            if (developerNames[i] != null) {
                sb.append(developerNames[i]);
                if (i < developerNames.length - 1)
                    sb.append(", ");

            }
        }
        sb.append("]}");
        return sb.toString();
    }

}
