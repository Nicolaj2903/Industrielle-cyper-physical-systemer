public class Calculate_OEE {

    // Item & data
    private double shift_length = 450; // 7,5 hours = 450 minutes
    private double breaks = 30; // One break of 30 minutes
    
    /* Downtime: The amount of time the production is stopped.
       In this case, downtime is equal to the length of the break */
    private double downtime = 30; // Minutes 
    private double idea_cycle_time = 0.025; // 1,5 seconds = 0,025 minutes
    private double total_count = 5403;
    private double reject_count = 108;


    // Calculate references
    private double good_count = total_count - reject_count;
    private double planned_production_time = shift_length - breaks;
    private double run_time = planned_production_time - downtime;


    // The three big ones
    private double availability = ;
    private double performance = (ideal_cycle_time * total_count) / run_time;
    private double quality = good_count / total_count;


    // OEE calucations
    private double oee_1 = (good_count * ideal_cycle_time) / planned_production_time ;
    private double ooe_2 = availability * performance * quality;

    public static void main(String[] args) {
        System.out.println(ooe_1);
        System.out.println(ooe_2);
    }
}
