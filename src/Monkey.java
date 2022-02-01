public class Monkey extends RescueAnimal {

    private String species;
    private double tailLength;
    private double height;
    private double bodyLength;


    public Monkey(String name, String species, double tailLength, double height, double bodyLength, String gender,
                  String age, String weight, String acquisitionDate,
                  String acquisitionCountry, String trainingStatus, boolean reserved, String inServiceCountry) {

        setName(name);
        setSpecies(species);
        setTailLength(tailLength);
        setHeight(height);
        setBodyLength(bodyLength);
        setGender(gender);
        setAge(age);
        setWeight(weight);
        setAcquisitionDate(acquisitionDate);
        setAcquisitionLocation(acquisitionCountry);
        setTrainingStatus(trainingStatus);
        setReserved(reserved);
        setInServiceCountry(inServiceCountry);

    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public double getTailLength() {
        return tailLength;
    }

    public void setTailLength(double tailLength) {
        this.tailLength = tailLength;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getBodyLength() {
        return bodyLength;
    }

    public void setBodyLength(double bodyLength) {
        this.bodyLength = bodyLength;
    }
}
