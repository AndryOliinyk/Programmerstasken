//Data is basically the same, so for them I implemented an abstract class, in the interface for 2 objects I see no sense
//just make the program more complicated for no reason

public abstract class dataClass {
    char type;
    String service;
    String question;
    String rType;
    String rDate;



    public dataClass(String[] arr) {
        this.type = arr[0].charAt(0);
        this.service = arr[1];
        this.question = arr[2];
        this.rType = arr[3];
        this.rDate = arr[4];

    }

    public char getType() {
        return type;
    }

    public String getService() {
        return service;
    }

    public String getQuestion() {
        return question;
    }

    public String getResponseTupe() {
        return rType;
    }

    public String getRespondDate() {
        return rDate;
    }


    //method to generate key for HashMap<String, String> Rq
    public String getObj() {

        return type + " " + service + " "+ service + " " + question + " " + rType + " " + rDate;
    }

}
