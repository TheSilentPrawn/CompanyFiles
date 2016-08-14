
package conceptpractice_java_3;

public abstract class Car {
    private int year;
    private float mpg;
    private String engine;

    public Car(){
        setYear(1);
        setMpg(1);
        setEngine("Automatic");
    }
    
    public Car(int year, float mpg, String engine){
        setYear(year);
        setMpg(mpg);
        setEngine(engine);
    }
    
    /**
     * @return the year
     */
    public int getYear() {
        return year;
    }

    /**
     * @param year the year to set
     */
    public void setYear(int year) {
        if(year > 0)
            this.year = year;
    }

    /**
     * @return the mpg
     */
    public float getMpg() {
        return mpg;
    }

    /**
     * @param mpg the mpg to set
     */
    public void setMpg(float mpg) {
        if (mpg > 0)
            this.mpg = mpg;
    }

    /**
     * @return the engine
     */
    public String getEngine() {
        return engine;
    }

    /**
     * @param engine the engine to set
     */
    public void setEngine(String engine) {
        this.engine = engine;
    }
    
    public abstract void output();
    
    
}
