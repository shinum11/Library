
package com.mycompany.library;

/**
 *
 * @author sidneigoes
 */
public class User {
    private String name;
    private String email;
    private Long cpf;
    private String address;
    private String number;
    
    public User(String name, String email, Long cpf, String address, String number){
     this.name = name;
     this.email = email;
     this.cpf = cpf;
     this.address = address;
     this.number = number;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Long getCpf() {
        return cpf;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }
       
}
