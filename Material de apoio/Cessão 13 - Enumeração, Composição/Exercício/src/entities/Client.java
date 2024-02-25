package entities;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Client {
    private static DateTimeFormatter fmr = DateTimeFormatter.ofPattern("dd/MM/yyy");

    private String name;
    private String email;
    private LocalDate birthDate;
    
    
    public Client(String name, String email, String birthDate) {
        this.name = name;
        this.email = email;
        this.birthDate = LocalDate.parse(birthDate, fmr);
    }


    public String getName() {
        return name;
    }


    public String getEmail() {
        return email;
    }


    public String getBirthDate() {
        return birthDate.format(fmr);
    }

    
    

}
