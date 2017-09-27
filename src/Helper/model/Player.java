package Helper.model;

import java.util.ArrayList;

public class Player {

    private int id;
    private String name;
    private String sign;
    ArrayList<Integer> myValues;

    /**
     * Constructor of the Player class
     *
     * @param id
     * @param name
     */
    public Player(int id, String name, String sign) {
        this.id = id;
        this.name = name;
        this.sign = sign;
        this.myValues = new ArrayList<>();
    }

    /**
     * Getter Id
     *
     * @return id
     */
    public int getId() {
        return id;
    }

    /**
     * Setter id
     *
     * @param id
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Getter name
     *
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * Setter name
     *
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Function to add values to the player :
     *
     * @param values
     */
    public void registerValues(int values) {

        // Check if values entered are less than
        this.myValues.add(values);

    }

    /**
     * Function to empty the the list of integers
     */
    public void refreshValues() {
        // Check if the list of integer is empty :
        if (!myValues.isEmpty()) {
            myValues.clear();
        }
    }


}
