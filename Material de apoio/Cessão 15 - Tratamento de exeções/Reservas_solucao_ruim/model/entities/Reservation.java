package model.entities;

import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.concurrent.TimeUnit;

public class Reservation {
    private Integer roomNumber;
    private Date checkIn;
    private Date checkOut;
    
    public Reservation(Integer roomNumber, Date checkIn, Date checkOut) {
        this.roomNumber = roomNumber;
        this.checkIn = checkIn;
        this.checkOut = checkOut;
    }

    private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

    public Integer getRunNumber() {
        return roomNumber;
    }

    public void setRunNumber(Integer runNumber) {
        this.roomNumber = runNumber;
    }

    public Date getCheckIn() {
        return checkIn;
    }

    public Date getCheckOut() {
        return checkOut;
    }

   
    public long duration(){
        
        long diff = checkOut.getTime() - checkIn.getTime();  //getTime() retorna a quantidade de milissegundos de uma data.

        return TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS);
    }
    
    public String updateDates(Date checkIn, Date checkOut){
        Date now = new Date();
            
        if (checkIn.before(now) || checkOut.before(now)){
            return  "Reservation dates for update must be future dates";
        }
        if (!checkOut.after(checkIn)){
            return "Check-out date must be after check-in date";
        }
        this.checkIn = checkIn;
        this.checkOut = checkOut;
        return null; 
        
        
    }
    
    @Override
    public String toString(){
        return "Room "
                + roomNumber
                + ", check-in:"
                + sdf.format(checkIn)
                + ", check-out: "
                + sdf.format(checkOut)
                + ", "
                + duration()
                + " nights";

    }
}
