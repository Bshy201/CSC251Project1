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
   
   public int getPolicyNumber(){
      return policyNumber;
   }
   
    public String getProviderName(){
      return providerName;
   }
   
    public String getHolderFirstName(){
      return holderFirstName;
   }
   
    public String getHolderLastName(){
      return holderLastName;
   }
   
    public int getHolderAge(){
      return holderAge;
   }
   
    public String getSmokingStatus(){
      return smokingStatus;
   }
   
    public double getHolderHeight(){
      return holderHeight;
   }
   
    public double getHolderWeight(){
      return holderWeight;
   }
   
    public void setPolicyNumber(int policyNumber){
      this.policyNumber = policyNumber;
   }
   
    public void setProviderName(String providerName){
      this.providerName = providerName;
   }
   
    public void setHolderFirstName(String holderFirstName){
      this.holderFirstName = holderFirstName;
   }
   
    public void setHolderLastName(String holderLastName){
      this.holderLastName = holderLastName;
   }
   
    public void setHolderAge(int holderAge){
      this.holderAge = holderAge;
   }
   
    public void setSmokingStatus(String smokingStatus){
      this.smokingStatus = smokingStatus;
   }
   
    public void setHolderHeight(double holderHeight){
      this.holderHeight = holderHeight;
   }
   
    public void setHolderWeight(double holderWeight){
      this.holderWeight = holderWeight;
   }
   
   public double calcBMI(double height, double weight){
      double BMI = 0;
      BMI = (weight * 703)/(height * height);
        return BMI;
   }
   
   public double calcPolicyPrice(int age, String smoker, double BMI){
      final double BASE_FEE = 600.00;
      double totalFee = 0.0; 
      if (age >  50 ){
         totalFee += 75.00;
      }
      if (smoker.toLowerCase().charAt(0) == 's'){
         totalFee += 100.00;
      }
      if (BMI > 35) {
         totalFee += ((BMI - 35) * 20);
      }
      
      totalFee += BASE_FEE;
      
         return totalFee;
   }
}