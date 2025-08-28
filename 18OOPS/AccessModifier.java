public class AccessModifier {

    public static void main(String[] args) {

        BankAccount myAcc = new BankAccount();
    myAcc.username = "sanjjeev";
    myAcc.setPassword("abcdef");
        
    }
    
}


public class  BankAccount {
    public String username;
    private String password;
    public void setPassword(String pwd) {
        password = pwd;
    }
}


//lec18.3 getter & setter

 class Pen {
        String color;
        int tip;

        //getter
        String getColor() {
            return this.color;   // this is special keyword in java means current objects
        }

        int getTip() {
            return this.tip;
        }

        //setter
        void setColor(String newColor) {   //function
            color = newColor;
        }

        void setTip(int tip) {     //2nd function
            this.tip = tip;
        }

        
    }
