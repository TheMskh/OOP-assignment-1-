package assignment2.organizations.party;

/**
 * Represents an Election.
 * TODO finish this class. (0.25 points)
 */
public class Election {
    private int votersNumber;
    private boolean fair;
    private String description;

    /**
     * Constructs an Election object with the specified number of voters,
     * fairness status, and description.
     * @param votersNumber The number of voters participating in the election.
     * @param fair The fairness status of the election.
     * @param description A description of the election.
     */
    public Election(int votersNumber, boolean fair, String description) {
        this.votersNumber = votersNumber;
        this.fair = fair;
        this.description = description;
    }

    /**
     * Retrieves the number of voters participating in the election.
     * @return The number of voters.
     */
    public int getVotersNumber() {
        return votersNumber;
    }

    /**
     * Sets the number of voters participating in the election.
     * @param votersNumber The number of voters.
     */
    public void setVotersNumber(int votersNumber) {
        this.votersNumber = votersNumber;
    }

    /**
     * Checks if the election is fair.
     * @return true if the election is fair, false otherwise.
     */
    public boolean isFair() {
        return fair;
    }

    /**
     * Sets the fairness status of the election.
     * @param fair The fairness status.
     */
    public void setFair(boolean fair) {
        this.fair = fair;
    }

    /**
     * Retrieves the description of the election.
     * @return The description.
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the description of the election.
     * @param description The description.
     */
    public void setDescription(String description) {
        this.description = description;
    }
}

