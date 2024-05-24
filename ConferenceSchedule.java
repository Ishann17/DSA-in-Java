/*
A schedule maker has been released for an upcoming trip tech conference. The schedule provides the
start time and end time of each of the presentations. Once a presentation has begun,
no one can leave or enter the room. It takes no time to go from one presentation to another.
Determine the maximum number of presentations that can be attended by one person.

Example:
n = 3
scheduleStart = [1,1,2]
scheduleEnd = [3,2,4]

Using 0 based indexing, an attendee could attend any presentation alone, or both presentations 1 and 2.
Presentation 0 ends too late to be able to attend presentation 2 afterwards. The maximum number of presentation
one person can attend is 2.
*/

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ConferenceSchedule {
    public static int maxPresentations(List<Integer> scheduleStart,List<Integer> scheduleEnd ){
        //gets the number of presentation
        int n = scheduleStart.size();
        //create a list to store pairs of start and end times
        List<int[]> presentation = new ArrayList<>();
        //iterate over the range 0 to n-1 and adds pairs of start and end times to the presentations list
        for(int i=0; i<n; i++){
            presentation.add(new int []{scheduleStart.get(i), scheduleEnd.get(i)});
        }
        //sort the list based on the end time
        presentation.sort((a, b) -> Integer.compare(a[1], b[1]));

        int maxPresentations = 0;
        int lastEndTime = -1;

        //iterate over sorted list
        for(int [] meet : presentation ){
            if(meet[0] >= lastEndTime){
                maxPresentations++;
                lastEndTime = meet[1];
            }
        }
        return maxPresentations;
    }

    public static void main(String[] args) {
        List<Integer> scheduleStart = List.of(1, 1, 2);
        List<Integer> scheduleEnd = List.of(3, 2, 4);
        System.out.println(maxPresentations(scheduleStart,scheduleEnd));
    }

}
