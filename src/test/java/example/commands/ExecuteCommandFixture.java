package example.commands;

import example.ConcordionFixture;

public class ExecuteCommandFixture extends ConcordionFixture {

    private String currentTime;

    public void setCurrentTime(String time) throws Exception {

        currentTime = time;
    }

    public String getCurrentTime() throws Exception {

        return currentTime;
    }

    public String getGreeting() throws Exception {

        // You would probably perform some kind of logic here based on current time
        return "Good Morning World!";
    }

}
