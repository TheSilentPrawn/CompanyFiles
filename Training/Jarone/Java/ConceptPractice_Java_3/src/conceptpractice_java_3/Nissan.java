
package conceptpractice_java_3;


public class Nissan extends Car{
    private String make;
    private String model;
    
    public Nissan(){
        super();
        setMake("Unknown");
        setModel("Unknown");
    }
    
    public Nissan(int year, float mpg, String engine, String make, String model){
        super(year, mpg, engine);
        setMake(make);
        setModel(model);
    }

    /**
     * @return the make
     */
    public String getMake() {
        return make;
    }

    /**
     * @param make the make to set
     */
    public void setMake(String make) {
        this.make = "Nissan " + make;
    }

    /**
     * @return the model
     */
    public String getModel() {
        return model;
    }

    /**
     * @param model the model to set
     */
    public void setModel(String model) {
        this.model = model;
    }
    
    @Override
    public void output(){
        System.out.printf("Make: %s\n"
                + "Model: %s\n"
                + "Year: %d\n"
                + "Mpg: %.02f\n"
                + "Engine: %s\n",
                getMake(), getModel(), getYear(), getMpg(), getEngine());
    }
    
}
