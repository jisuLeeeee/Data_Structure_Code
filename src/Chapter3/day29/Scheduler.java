package Chapter3.day29;

import java.util.Scanner;

public class Scheduler {

    private int capacity = 10;
    public Event[] events = new Event[10];
    public int n = 0; // 배열의 입력 개수
    private Scanner kb;

    public void processCommand(){
        kb = new Scanner(System.in);
        while(true){
            System.out.print("$ ");
            String command = kb.next();
            if(command.equals("addevent")){
                String type = kb.next(); // oneday or duration or deadline
                if(type.equalsIgnoreCase("oneday"))
                    handleAddOneDayEvent();
                else if(type.equalsIgnoreCase("duration"))
                    handleAddDurationEvent();
                else if(type.equalsIgnoreCase("deadline"))
                    handleAddDeadlinedEvent();
            } else if(command.equals("list")){
                handleList();
            } else if(command.equals("show")){


            } else if(command.equals("exit")){
                break;
            }
        }
        kb.close();
    }

    private void handleList() {
        for(int i=0; i<n; i++)
            System.out.println("     " + events[i].toString());
    }

    private void handleAddDeadlinedEvent() {
    }

    private void handleAddDurationEvent() {
    }

    private void handleAddOneDayEvent() {
        System.out.print(" When: ");
        String dateString = kb.next(); // "2017/1/20"
        System.out.print(" title: ");
        String title = kb.next();

        MyDate date = parseDateString(dateString);
        OneDayEvent ev = new OneDayEvent(title, date);
//        System.out.println(ev.toString());
        addEvent(ev);
    }

    private void addEvent(OneDayEvent ev) {
        if(n >= capacity)
            rellocate();
        events[n++] = ev;
    }

    private void rellocate() {
        Event[] tmp = new Event[capacity * 2];
        for(int i=0; i<n; i++){
            tmp[i] = events[i];
        }
        events = tmp;
        capacity *= 2;
    }

    private MyDate parseDateString(String dateString) {
        String[] tokens = dateString.split("/");
        int year = Integer.parseInt(tokens[0]);
        int month = Integer.parseInt(tokens[1]);
        int day = Integer.parseInt(tokens[2]);

        MyDate d = new MyDate(year, month, day);
        return d;
    }

    public static void main(String[] args) {

        Scheduler app = new Scheduler();
        app.processCommand();
    }
}
