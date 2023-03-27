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
   
   @Override       
   public String toString(){
      String str = "Policy Number: " + this.policyNumber;
      String str2 = "\nProvider Name: " + this.providerName;
      return str + str2;
   }
}