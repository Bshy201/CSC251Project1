public class PolicyHolder {

   private String holderFirstName;
   private String holderLastName;
   private int holderAge;
   private String smokingStatus;
   private double holderHeight;
   private double holderWeight;
   
   public PolicyHolder(){
      olderFirstName = "";
      holderLastName = "";
      holderAge = 0;
      smokingStatus = "";
      holderHeight = 0.0;
      holderWeight = 0.0;
   }
   
    public Policy(String holderFirstName, String holderLastName, int holderAge, String smokingStatus, double holderHeight, double holderWeight){
      this.holderFirstName = holderFirstName;
      this.holderLastName = holderLastName;
      this.holderAge = holderAge;
      this.smokingStatus = smokingStatus;
      this.holderHeight = holderHeight;
      this.holderWeight = holderWeight;
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

   
   public double calcBMI(){
      double BMI = 0;
      BMI = (this.holderWeight * 703)/(this.holderHeight * this.holderHeight);
        return BMI;
   }

   
   
   }

}