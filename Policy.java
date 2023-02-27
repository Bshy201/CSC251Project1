public class Policy{
   
   private int policyNumber;
   private String providerName;
   private String holderFirstName;
   private String holderLastName;
   private int holderAge;
   private String smokingStatus;
   private double holderHeight;
   private double holderWeight;
   
   public Policy(){
      policyNumber = 0;
      providerName = "";
      holderFirstName = "";
      holderLastName = "";
      holderAge = 0;
      smokingStatus = "";
      holderHeight = 0.0;
      holderWeight = 0.0;
   }
   
   public Policy(int policyNumber, String providerName, String holderFirstName, String holderLastName, int holderAge, String smokingStatus, double holderHeight, double holderWeight){
      this.policyNumber = policyNumber;
      this.providerName = providerName;
      this.holderFirstName = holderFirstName;
      this.holderLastName = holderLastName;
      this.holderAge = holderAge;
      this.smokingStatus = smokingStatus;
      this.holderHeight = holderHeight;
      this.holderWeight = holderWeight;
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
   @return the first name for the holder that the user entered
   */

    public String getHolderFirstName(){
      return holderFirstName;
   }
    /**
   @return the last name of the holder that the user entered
   */

   
    public String getHolderLastName(){
      return holderLastName;
   }
    /**
   @return the age of the holder that the user entered
   */

    public int getHolderAge(){
      return holderAge;
   }
    /**
   @return the smoking status of the holder that the user entered
   */

   
    public String getSmokingStatus(){
      return smokingStatus;
   }
    /**
   @return the height of the holder that the user entered
   */

   
    public double getHolderHeight(){
      return holderHeight;
   }
   
    /**
   @return the the weight of the holder that the user entered
   */

   
    public double getHolderWeight(){
      return holderWeight;
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
   @param the first name that represents the holder
   */

   
    public void setHolderFirstName(String holderFirstName){
      this.holderFirstName = holderFirstName;
   }
    /**
   @param the last name that represents the holder
   */

   
    public void setHolderLastName(String holderLastName){
      this.holderLastName = holderLastName;
   }
    /**
   @param the age that represents the holder
   */

    public void setHolderAge(int holderAge){
      this.holderAge = holderAge;
   }
   /**
   @param the smoking status that represents the holder
   */

   
    public void setSmokingStatus(String smokingStatus){
      this.smokingStatus = smokingStatus;
   }
    /**
   @param the height that represents the holder
   */

   
    public void setHolderHeight(double holderHeight){
      this.holderHeight = holderHeight;
   }
   
    /**
   @param the weight that represents the holder
   */

   
    public void setHolderWeight(double holderWeight){
      this.holderWeight = holderWeight;
   }
    /**
   @param the height that represents the holder
   @param the weight that represents the holder
   @return the BMI that represents the holder
   */

   
   public double calcBMI(double height, double weight){
      double BMI = 0;
      BMI = (weight * 703)/(height * height);
        return BMI;
   }
    /**
   @param the age that represents the holder
   @param the smoking status that represents the holder
   @param the BMI that represents the holder
   @return the policy fee that the holder would pay
   */


   
   public double calcPolicyPrice(int age, String smoker, double BMI){
      final double BASE_FEE = 600.00;
      double totalFee = 0.0; 
      totalFee += BASE_FEE;
      
      if (age >  50 ){
         totalFee += 75.00;
      }
      if (smoker.toLowerCase().charAt(0) == 's'){
         totalFee += 100.00;
      }
      if (BMI > 35) {
         totalFee += ((BMI - 35) * 20);
      }
      
         return totalFee;
   }
}