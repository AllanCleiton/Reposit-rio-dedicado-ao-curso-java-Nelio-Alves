package pencionato;

public class Room {
    private int rent;
    private String name;
    private String email;
    private int room;
    private boolean status;

    public Room(int room){
        this.room = room;
    }

    public int getRent() {
        return rent;
    }

    public void setRent(int rent) {
        this.rent = rent;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getRoom() {
        return room;
    }

    public boolean getStatus(){
        return status;
    }

    public void setRoom(int room) {
        this.room = room;
    }

    public void registerRent(String name, String email){
        this.name = name;
        this.email = email;
        this.status = true;
    }

    public String toString(){
        return room+": " + name + ", " + email; 
    }
    
}
