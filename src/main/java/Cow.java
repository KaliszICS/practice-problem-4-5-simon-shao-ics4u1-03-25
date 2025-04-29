/**
 * stores information of a cow, can be compared to another cow
 * @author Simon Shao
 * @version 1.0.0
 */
public class Cow{

    private String name;
    private int age;
    private double weight;

    /**
     * initializes cow information
     * @param name variable for name of cow
     * @param age variable for cow age
     * @param weight variable for weight of cow
     */
    public Cow(String name, int age, double weight){
        this.name = name;
        this.age = age;
        this.weight = weight;
    }
    /**
     * to access name of cow
     * @return returns the name of the cow
     */
    public String getName(){
        return this.name;
    }
/**
     * to access age of cow
     * @return returns the age of the cow
     */
    public int getAge(){
        return this.age;
    }

    /**
     * to access weight of cow
     * @return returns the weight of cow
     */
    public double getWeight(){
        return this.weight;
    }

/**
     * overrides the toString method to print out all information of cow
     * @return returns a string of all informations of cow
     */
    @Override
    public String toString(){
        return this.name + ", " + this.age + " - " + this.weight;
    }

    /**
 * compares 2 cows to see if they are the same. 
 * @param obj Another cow as an object that is to be compared with the current student
 * @return returns whether they are the same cow or not
 */
    @Override
    public boolean equals(Object obj){
        try{
            Cow cow = (Cow) obj; 

        }
            catch( Exception e){
                return false;
            }

            if (obj==null){
                return false;
            }
            Cow cow = (Cow) obj; 
            if (cow.getName().equals(this.name)&&cow.getAge()==this.age&&cow.getWeight()==this.weight){
                return true;
            }
            else{
                return false;
            }
    }
}