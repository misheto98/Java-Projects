public class Calculator {

    float operand1 = 0.00f;
    float operand2 = 0.00f;

    public Calculator(float operand1, float operand2) {
        this.operand1 = operand1;
        this.operand2 = operand2;
    }

    // sum
    public  float sum(){

        return this.operand1+this.operand2;
    }

    public  float subtraction(){
        return this.operand1-this.operand2;
    }

    public  float multiply(){

        return this.operand1*this.operand2;

    }

    public  float div(){
        return this.operand1/this.operand2;
    }



}
