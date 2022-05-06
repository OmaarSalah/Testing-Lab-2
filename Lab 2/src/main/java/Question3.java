
public class Question3 {


    public String state = "NORMAL", state1 = "TIME";
    public int m = 0, h = 0, D = 1, M = 1, Y = 2000;


    public void Transition(char in) {

        switch (state) {
            case "NORMAL": {
                if (in == 'a') {
                    if (state1.equals("TIME") ) {
                        state1 = "DATE";
                        break;
                    } else {
                        state1 = "TIME";
                        break;
                    }

                }
                if (in == 'b') {
                    state = "ALARM";
                    state1 = "Alarm";
                    break;
                }
                if (in == 'c') {
                    state = "UPDATE";
                    state1 = "min";
                    break;
                }


            }
            break;

            case "ALARM": {
                if (in == 'a') {
                    state= "ALARM";
                    state1 = "Chime";
                    break;
                }
                if (in == 'd') {
                    state = "NORMAL";
                    state1 = "TIME";
                    break;
                }
            }
            break;
            case "UPDATE": {
                if (in == 'a') {
                    if (state1.equals("year")) {
                        state = "NORMAL";
                        state1 = "TIME";
                        break;
                    }

                    if (state1.equals("min")) {
                        state1 = "hour";
                        break;
                    }
                    if (state1.equals("hour")) {
                        state1 = "day";
                        break;
                    }
                    if (state1.equals("day")) {
                        state1 = "month";
                        break;
                    }
                    if (state1.equals("month")) {
                        state1 = "year";
                        break;
                    }

                }

                if (in == 'b') {
                    if (state1.equals("min")) {
                        m++;
                        if (m > 60) {
                            m = 0;
                        }
                    }
                    if (state1.equals("hour")) {
                        h++;
                        if (h > 24) {
                            h = 0;
                        }

                    }
                    if (state1.equals("day")) {
                        D++;
                        if (D > 31) {
                            D = 1;
                        }
                    }
                    if (state1.equals("month")) {
                        M++;
                        if (M > 12) {
                            M = 1;
                        }

                    }
                    if (state1.equals("year")) {
                        Y++;
                        if (Y > 2100) {
                            Y = 2000;
                        }
                    }


                }
                if (in == 'd') {
                    state = "NORMAL";
                    state1 = "TIME";
                }


            }
            break;


        }

    }
    public String getState(){
        return(state+","+state1);
    }
    public String getDate(){
        return (Y+"-"+M+"-"+D);
    }
    public String getTime(){
        return (h+":"+m);
    }


}




