
import java.util.Scanner;

public class MolecularMass{

    //This is the main method for the program. 
    public static void main(String[] args){

        MolecularMass newMass = new MolecularMass();
        newMass.addMolecule(newMass.getMolecule());
    }

    //This method gets the user input needed for MolecularMass. 
    public String getMolecule(){

        Scanner scannerObj = new Scanner(System.in); //Create a new Scanner object.
        System.out.printf("Enter the molecule: "); //Display message to usser for input.

        String usrInput = scannerObj.nextLine();
        //System.out.printf("the molecule you entered is: " + usrInput);
        return usrInput;
    }

    public int addMolecule(String helperVar){

            IntStack stackForYou = new IntStack(); //Create a new stack object to work with.
            int totalMolecularMass = 0; //Variable for the total mass. 

            for(int i = 0; i < helperVar.length(); i++){

                if((helperVar.charAt(i) > 64) || helperVar.charAt(i) == (40)){
                    //You have a character or you have an '('.
                    switch(helperVar.charAt(i)){
                        case 67:
                            stackForYou.push(12);
                            break;

                        case 72:
                            stackForYou.push(1);
                            break;

                        case 79:
                            stackForYou.push(16);
                            break;
                        
                        case 40: 
                            stackForYou.push(40);
                            break;

                        default:
                            System.out.println("oh no... caught up in switch statement #1.");       
                    }
                }
                else if((helperVar.charAt(i) - 41) == 0){
                    //You have a closing ')'!! 
                    int popper;
                    int adder = 0;
                    do{
                        popper = stackForYou.pop();
                        if(popper != 40){
                            adder += popper;
                        }
                    }
                    while(popper != 40);

                    stackForYou.push(adder);

                }
                else{
                    //You have a number.
                    int helperVar00 = stackForYou.pop();
                    int mathVar = (helperVar.charAt(i) - 48) * helperVar00;
                    stackForYou.push(mathVar);
                }        
            }

            boolean flag1 = true; 
            while(flag1){
                int x = stackForYou.pop();

                if(x == -1){
                    flag1 = false;
                   // System.out.println("Empty stack"); 
                }
                else{
                    totalMolecularMass += x;
                }
            }
            System.out.printf("The Molecular Mass of %s is %d\n", helperVar, totalMolecularMass);
            return totalMolecularMass;

        }


    
}
