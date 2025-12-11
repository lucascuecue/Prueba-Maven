package com.cuervacuencalucas;

/**
 * Clase persona con 4 atributos
 */
public class Persona {
    private String name;
    private String surname;
    private String email;
    private int age;

    // Constructores

    /**
     * Constructor de persona con parámetros
     * @param name nombre
     * @param surname apellidos
     * @param email E-Mail
     * @param age edad
     */
    public Persona (String name, String surname, String email, int age){
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.age = age;
    }

    // Getters

    /**
     * getter de la edad
     * @return edad
     */
    public int getAge() {
        return age;
    }

    public String getEmail() {
        return email;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    // Setters
    public void setAge(int age) {
        this.age = age;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }
    
    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }
}
