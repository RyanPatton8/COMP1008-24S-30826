package Assignment;

public class House {
    public short squareFootage = 2380;
    protected byte washroomAmount = 1;
    private String safeLocation = "Bedroom";

    /**
     * Allows user to view the square footage of an instantiated house object
     * @return square footage of home
     */
    public short getSquareFootage() {
        return squareFootage;
    }

    /**
     * Allows user to set the square footage of a house object
     * @param squareFootage square footage of home
     */
    public void setSquareFootage(short squareFootage) {
        if(squareFootage > 3)
            this.squareFootage = squareFootage;
    }

    /**
     * Allows user to view the amount of washrooms in the instantiated house object
     * @return washroom amount
     */
    public byte getWashroomAmount() {
        return washroomAmount;
    }

    /**
     * Allows user to set the number of washrooms in a home
     * @param washroomAmount number of washrooms
     */
    public void setWashroomAmount(byte washroomAmount) {

        if(washroomAmount > -1)
            this.washroomAmount = washroomAmount;
    }

    /**
     * Allows user to view the location of the homeowners safe (bit of an invasion of privacy tbh)
     * @return the location of the homeowners safe
     */
    public String getSafeLocation() {
        return safeLocation;
    }

    /**
     * Allows user to alter the safe location in an instantiated House
     * @param safeLocation the location of the safe
     */
    public void setSafeLocation(String safeLocation) {
        if(safeLocation.length() > 2 && validateSafeLocation(safeLocation))
            this.safeLocation = safeLocation;
    }

    /**
     * Validates whether the location of the safe
     * @param safeLocation value to be evaluated
     * @return if location is valid
     */
    //used same validation conditions from lecture I don't want user to start inputting numbers and stuff
    private boolean validateSafeLocation(String safeLocation) {
        for(char letter : safeLocation.toUpperCase().toCharArray()) {
            if (letter >= 'A' && letter <= 'Z' || letter == '-'|| letter == ' '){continue;}
            else{
                return false;
            }
        }
        return true;
    }

    //default constructor
    public House(){}

    //six other constructors
    public House(short squareFootage, byte washroomAmount, String safeLocation) {
        setSquareFootage(squareFootage);
        setWashroomAmount(washroomAmount);
        setSafeLocation(safeLocation);
    }

    public House(short squareFootage, String safeLocation, byte washroomAmount) {
        this(squareFootage,washroomAmount,safeLocation);
    }

    public House(String safeLocation, byte washroomAmount, short squareFootage) {
        this(squareFootage,washroomAmount,safeLocation);
    }

    public House( byte washroomAmount, short squareFootage, String safeLocation) {
        this(squareFootage,washroomAmount,safeLocation);
    }

    public House(byte washroomAmount, String safeLocation, short squareFootage) {
        this(squareFootage,washroomAmount,safeLocation);
    }

    public House(String safeLocation, short squareFootage, byte washroomAmount) {
        this(squareFootage,washroomAmount,safeLocation);
    }

}
