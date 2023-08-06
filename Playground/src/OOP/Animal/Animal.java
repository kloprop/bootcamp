package Animal;
public abstract class Animal {
  private String species;
  public double weight;
  private double growthRate;

  public abstract void grow();
  public abstract void respiration();
  public abstract void move();


  public Animal(String species,double weight,double growthRate){
    this.species = species;
    this.weight = weight;
    this.growthRate = growthRate;

  }
  public String getSpecies(){
    return this.species;
  }
  public void setSpecies(String species){
    this.species = species;
  }
  public double getWeight(){
    return this.weight;
  }
  public void setWeight(double weight){
    this.weight = weight;
  }
  public double getGrowRate(){
    return this.growthRate;
  }
  public void setGrowRate(double rate){
  this.growthRate = rate;
  }

  public void shout (){
    System.out.println("I am a "+ this.species); // All subclass perform same action, no need abstract
  }
}
