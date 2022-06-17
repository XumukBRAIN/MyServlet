package model;

/**
 * @author Ivan Kudryashov
 * @version 1.0
 */
public class User {

    /**
     * field name
     */
    private String name;

    /**
     * field id
     */
    private int id;

    /**
     * constructor user
     * @param name user
     * @param id user
     */
    public User(String name, int id) {
        this.name = name;
        this.id = id;
    }

    /**
     * getter for name
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * setter for name
     * @param name user
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * getter for id
     * @return id user
     */
    public int getId() {
        return id;
    }

    /**
     * setter for id
     * @param id
     */
    public void setId(int id) {
        this.id = id;
    }
}
