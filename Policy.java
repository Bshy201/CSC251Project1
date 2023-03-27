public class Policy{
   
   private int policyNumber;
   private String providerName;
      
   public Policy(){
      policyNumber = 0;
      providerName = "";
     }
        
   public Policy(int policyNumber, String providerName){
      this.policyNumber = policyNumber;
      this.providerName = providerName;
        }
   
   /**
   @return the policy number that the user entered
   */
   public int getPolicyNumber(){
      return policyNumber;
   }
   
    /**
   @return the provider name the user entered
   */

    public String getProviderName(){
      return providerName;
   }
      
    /**
   @param the policy number that represents the holder
   */

   
    public void setPolicyNumber(int policyNumber){
      this.policyNumber = policyNumber;
   }
    /**
   @param the provider name that represents the holder
   */

    public void setProviderName(String providerName){
      this.providerName = providerName;
   }
       /**
   @param the age that represents the holder
   @param the smoking status that represents the holder
   @param the BMI that represents the holder
   @return the policy fee that the holder would pay
   */


   
   public double calcPolicyPrice(double BMI){
      final double BASE_FEE = 600.00;
      double totalFee = 0.0; 
      totalFee += BASE_FEE;
      
      if (this.holderAge >  50 ){
         totalFee += 75.00;
      }
      if (this.smokingStatus.toLowerCase().charAt(0) == 's'){
         totalFee += 100.00;
      }
      if (BMI > 35) {
         totalFee += ((BMI - 35) * 20);
      }
      
         return totalFee;
   }
}