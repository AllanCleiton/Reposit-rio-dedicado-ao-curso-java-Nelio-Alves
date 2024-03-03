package Services;

import java.time.LocalDate;

public final class ValidaData {

    public static boolean validar(String data){
        boolean dd = false;
        boolean MM = false;
        boolean yyyy = false;
        if (data.length() == 10){
            
            dd = data.substring(0,2).length()  == 2? true:false; 
            MM = data.substring(3,5).length()  == 2? true:false;
            yyyy = data.substring(6).length()  == 4? true:false;
            
        }
        boolean result_01 = dd == true && MM == true && yyyy == true ? true: false;
        
        boolean result_final = false;
        
        if(result_01 == true){
            String partOne = data.substring(0,2);
            String partTwo = data.substring(3,5);
            String partThree = data.substring(6);

            int numberDia = Integer.parseInt(partOne);
            int numberMes = Integer.parseInt(partTwo);
            int numberAno = Integer.parseInt(partThree);

            if(
                !(numberDia > 31) 
                && !(numberDia < 1)
                && !(numberMes > 12)
                && !(numberMes < 1) 
                && !(numberAno > LocalDate.now().getYear()) 
                && !(numberAno < 1950)){
                    result_final = true;
                }else{
                    result_final = false;
                }

        }
        
        if(result_final == false){
            char[] c = data.toCharArray();
            System.out.println(Color.ANSI_RED + "you entered an invalid date!" + Color.ANSI_RESET);
            System.out.print(Color.ANSI_GREEN + "---");
            for (char d : c) {
                System.out.printf("%c ",d);
            }
            System.out.println("---" + Color.ANSI_RESET);
        }
        return result_final;
    }
}
