/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conceptpractice_java_3;

/**
 *
 * @author Kauru99
 */
public class Toyota extends Car{
    private String make;
    private String model;
    
    public Toyota(){
        super();
        setMake("Unknown");
        setModel("Unknown");
    }
    
    public Toyota(int year, float mpg, String engine, String make, String model){
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
        this.make = "Toyota " + make;
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
