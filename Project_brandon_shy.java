import java.util.Scanner;
public class Project_brandon_shy{

   public static void main(String[] args){
   Scanner keyboard = new Scanner(System.in); 
      int policyNumber,
          holderAge;
          
      String holderFirstName,
             holderLastName,
             smokingStatus,
             providerName;
             
      double holderHeight,
             holderWeight,
             holderBMI,
             totalPrice;
             
      System.out.print("Please enter the Policy Number: ");
      policyNumber = keyboard.nextInt();
      
      System.out.print("Please enter the Provider Name: ");
      providerName = keyboard.next();
      
      keyboard.nextLine();
      
      System.out.print("Please enter the Policyholder's First Name: ");
      holderFirstName = keyboard.nextLine();
      
   
      System.out.print("Please enter the Policyholder's Last Name: ");
      holderLastName = keyboard.next();
      
      keyboard.nextLine(); 
      
      System.out.print("Please enter the Policyholder's Age: ");
      holderAge = Integer.parseInt(keyboard.nextLine());
       
      System.out.print("Please enter the Policyholder's Smoking Status: ");
      smokingStatus = keyboard.nextLine();
      
      
      System.out.print("Please enter the Policyholder's Height(in inches): ");
      holderHeight = keyboard.nextDouble();
      
      System.out.print("Please enter the Policyholder's Weight(in pounds): ");
      holderWeight = keyboard.nextDouble();
      
      Policy policyHolder1 = new Policy(policyNumber, providerName, holderFirstName, holderLastName, holderAge, smokingStatus, holderHeight, holderWeight);
      
      holderBMI = policyHolder1.calcBMI(holderHeight, holderWeight);
      
      totalPrice = policyHolder1.calcPolicyPrice(holderAge, smokingStatus, holderBMI);
      
      System.out.println();
      System.out.println("Policy Number: " + policyNumber);
      System.out.println("Provider Name: " + providerName);
      System.out.println("Policyholder's First Name: " + holderFirstName);
      System.out.println("Policyholder's Last Name: " + holderLastName);
      System.out.println("Policyholder's Age: " + holderAge);
      System.out.println("Policyholder's Smoking Status: " + smokingStatus);
      System.out.printf("Policyholder's Height: %.2f inches\n", holderHeight);
      System.out.printf("Policyholder's Weight: %.2f pounds\n", holderWeight);
      System.out.printf("Policyholder's BMI: %.2f\n", holderBMI);
      System.out.printf("Policy Price:  $%.2f", totalPrice);
   }
}