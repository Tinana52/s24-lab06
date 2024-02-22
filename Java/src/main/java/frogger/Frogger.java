package frogger;

/**
 * Refactor Task 1 & 2: Frogger
 *
 * @author Zishen Wen (F22), Deyuan Chen (S22), Duan Liang (F23)
 */
public class Frogger {

    // Field for task 1.
    private final Road road;
    private int position;
    
    // Field for task 2. Anything to add/change? -> Long parameter list
    private final Records records;
    //private String firstName, lastName, phoneNumber, zipCode, state, gender;
    private final FroggerID froggerID;


    // Task 2
    public Frogger(Road road, int position, Records records, FroggerID froggerID) {
        this.road = road;
        this.position = position;
        this.records = records;
        this.froggerID = froggerID;
    }
    // public Frogger(Road road, int position, Records records, String firstName, String lastName, String phoneNumber,
    // String zipCode, String state, String gender) {
    //     this.road = road;
    //     this.position = position;
    //     this.records = records;
    //     this.firstName = firstName;
    //     this.lastName = lastName;
    //     this.phoneNumber = phoneNumber;
    //     this.zipCode = zipCode;
    //     this.state = state;
    //     this.gender = gender;
    // }

    /**
     * Moves Frogger.
     *
     * @param forward true is move forward, else false.
     * @return true if move successful, else false.
     */
    public boolean move(boolean forward) {
        int nextPosition = this.position + (forward ? 1 : -1);
        if (!road.isValid(nextPosition) || road.isOccupied(nextPosition)) {
            return false;
        }
        this.position = nextPosition;
        return true;
    }

    // TODO: Do you notice any issues here? -> Feature envy & High coupling
    // public boolean isOccupied(int position) {
    //     boolean[] occupied = this.road.getOccupied();
    //     return occupied[position];
    // }
    
    // public boolean isValid(int position) {
    //     if (position < 0) return false;
    //     boolean[] occupied = this.road.getOccupied();
    //     return position < occupied.length;
    // }


    // Task 2
    public boolean recordMyself() {
        return records.addRecord(froggerID);
    }
    // /**
    //  * Records Frogger to the list of records.
    //  * 
    //  * @return true if record successful, else false.
    //  */
    // public boolean recordMyself() {
    //   boolean success = records.addRecord(firstName, lastName, phoneNumber, zipCode, state, gender);
    //   return success;
    // }

}
