
package conceptpractice_java_2;


public class Calc {
    private float []numbers;
    private float ans;
    
    public Calc(){
        ans = 0;
    }
    
    public Calc(float []num){
        setNumbers(num);
        ans = 0;
    }

    
    public float[] getNumbers() {
        return numbers;
    }

  
    public void setNumbers(float[] numbers) {
        for(int i = 0; i < numbers.length; i++){
            this.numbers[i] = numbers[i];
        }
    }

    
    public float getAns() {
        return ans;
    }

    public void add(float []numbers){
        ans = numbers[0] + numbers[1];
    }
    
    public void subt(float []numbers){
       ans = numbers[0] - numbers[1];
    }
    
    public void multi(float []numbers){
        ans = numbers[0] * numbers[1];
    }
    
    public void div(float []numbers){
        ans = numbers[0] / numbers[1];
    }
    
}
