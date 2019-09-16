import java.text.SimpleDateFormat;
import java.util.Date;



public class analysis {

    //Compares dates or date ranges
    private static boolean dateArr(String[] control_dates, String date_search ){
        return   dateConv(date_search).compareTo(dateConv(control_dates[0]))>=0 ==
                dateConv(control_dates[control_dates.length-1]).compareTo(dateConv(date_search)) >=0;
    }

        //Convert String data to just Date for future compare
    private static Date dateConv(String inpDate){

        SimpleDateFormat formatter = new SimpleDateFormat ("dd.MM.yyyy");
        Date date = new Date();

        try {date = formatter.parse(inpDate);}

        catch  (Exception ex){ex.printStackTrace();}

        finally {return date;}


    }

        //Convert String data to char array and then compare them for length of first input
    private static boolean comparData(String compWhat,String compTo){

        char[]str0 = compWhat.toCharArray();
        char[]str1 = compTo.toCharArray();


        for(int count =0;  count < str0.length; count++){
            if(str0[count]!='*'){
                try{
                    if (str0[count] != str1[count]){
                        return false;
                    }
                }

                catch (ArrayIndexOutOfBoundsException e){ //If "D" is longer than "C" then there is no reason to continue of comparating
                    return false;
                }
                catch(Exception e){e.printStackTrace();

                    }

            }

        }

        return true;
    }


    public static int comparData(Request compWhat,Respond compTo){


// It just compares data through a method "comparData"
    if(comparData(compWhat.service, compTo.service)){

        if(comparData(compWhat.question, compTo.question)){

            if(comparData(compWhat.rType, compTo.rType )){

                String[] arrDate = compWhat.rDate.split("-"); //for the date range generates 2 values, otherwise 1

                if(dateArr(arrDate,compTo.rDate)){
                    return compTo.getWaitingTime();

                }}}}

    return 0;
    }




}
