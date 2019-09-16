/* Hello, ty for your task.
* Unfortunately due to lack of time I physically can't realize everything I wanted
* (full analysis of input data, perform all tests, and register the rudiments of AI).
* I would be stuck for a loooong time = (
*/


import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;



public class Programmerstasken {

    //it's a simple task, so I didn't want it occupied all main
    public static void main(String[] args) {
        dataAnalyze();
    }


    private static void dataAnalyze() {

        ArrayList<Respond> listRes = new ArrayList<>(); //ArrayList for C (waiting time line)
        ArrayList<Request> listRq = new ArrayList<>(); //ArrayList for D (query)
        HashMap<String, String> Rq = new HashMap<>(); //for key D (query) and  Value Time in minutes represent waiting time.

        String datafile = fileWork.datafromfile();
        String text = datafile;
        File file = new File(text); //Get file with 0-data
        String finalValue;
        int wTime, count, val;

        //I decide to choose scanner because it's can be easily converted for SQL of data from fields or console
        try (Scanner in = new Scanner(file)) {

            while (in.hasNextLine()) {

                String[] texti = in.nextLine().split(" ");
                if (texti[0].contains("C"))
                    listRes.add(new Respond(texti));
                if (texti[0].contains("D")) {

                    wTime = count = val = 0; //reset the variables

                    listRq.add(new Request(texti));

                    for (Respond var : listRes) {

                        wTime = analysis.comparData(listRq.get(listRq.size() - 1), var); // Compares the query with all previous data
                        if (wTime != 0) {

                            val += wTime;
                            count++;
                        }
                    }
                    try {
                        finalValue = String.valueOf((double) (val / count));
                    } catch (ArithmeticException e) {
                        finalValue = "-";
                    }
                    Rq.put(listRq.get(listRq.size() - 1).getObj(), finalValue);
                }
            }

            //Put comparData here, if you need to compare the query with the whole C (waiting time line) in file

        } catch (Exception ex) {
            ex.printStackTrace();
        }

        //Save results in txt
        StringBuilder sb = new StringBuilder();


        Rq.entrySet().forEach(entry -> {
            sb.append(System.getProperty("line.separator"));
            sb. append(entry.getValue());});



        fileWork.saveFile(sb);
    }
}






