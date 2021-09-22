public class Calculate_OEE {

    public static void main(String[] args) {

        // Item & data
        double shift_length = 450; // 7,5 hours = 450 minutes           // Correct
        double breaks = 30; // One break of 30 minutes
        double unplanned_downtime = 0;                                   // Correct
        double ideal_cycle_time = 1.5;
        double total_count = 5403;
        double reject_count = 108;


        double new_planned_production_time = shift_length - breaks;
        double operating_time = new_planned_production_time - unplanned_downtime;
        double new_availability = operating_time / new_planned_production_time;
        double capacity = (1/ideal_cycle_time) * operating_time;
        double new_performance = total_count / capacity;
        double new_quality = (total_count - reject_count) / total_count;
        double oee = new_availability * new_performance * new_quality;

        System.out.println("\n(Net) OEE: " + oee);


        // Calculate references
        double good_count = total_count - reject_count;
        double planned_production_time = shift_length - breaks; // Correct
        double run_time = planned_production_time - unplanned_downtime; // Correct


        // The three big ones
        double availability = run_time / planned_production_time;   // Correct
        double performance = (ideal_cycle_time * total_count) / run_time;
        double quality = good_count / total_count;


        // OEE calucations
        double oee_1 = (good_count * ideal_cycle_time) / planned_production_time;
        double oee_2 = availability * performance * quality;

        System.out.println("\n(Mine) OEE: " + oee_1);
        System.out.println("(Mine) OEE: " + oee_2);
    }
}
